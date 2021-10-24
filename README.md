# CovidTracker

# Machine Round Question- Backend

# COVID TRACKER

Build an application to calculate covid risk for users where users can register and tell if they have any symptoms, travel history, or come in contact with any positive patient. Based on which application will calculate and return the risk percentage of the user.

USER:
You need to provide following options for User:
Register: A user can register by providing his name, mobile number and pin code.
Self Assessment: Users can enter:
Any symptoms (cough, cold, fever etc).
Any travel history in the last 15 days.
Any contact with covide positive patient.
Covid Risk: Users can see the risk of being affected by covid based on self assessment.

Risk Calculation:
No symptoms, No travel history, No contact with covid positive patient - Risk = 5%
Any one symptom, travel history or contact with covid positive patient is true - Risk = 50%
Any two symptoms, travel history or contact with covid positive patient is true - Risk = 75%
Greater than 2 symptoms, travel history or contact with covid positive patient is true - Risk = 95%

APIs:
registerUser: 
Sample request - {"name":"A","phoneNumber":"9999999999","pinCode":"111111"}
Sample response - {"userId": "1"}
selfAssessment:
Sample request - {"userId":"1","symptoms":["fever","cold","cough"],"travelHistory":true,"contactWithCovidPatient":true}
Sample response - {"riskPercentage": 95}


ADMIN:
You need to provide admin options for the covid health workers:
Register: Covid health workers can register by providing their name, mobile number and pin code.
Covid Result: Health workers can enter the result of covid tests for patients.
Health workers can also mark already registered users as recovered.

APIs:
registerAdmin:
Sample request - {"name":"X","phoneNumber":"9999999999","pinCode":"111111"}
Sample response - {"adminId": "2"}
updateCovidResult:
Sample request - {"userId":"1","adminId":"2","result":"positive"}
Sample response - {"updated":true}


ZONES:
Mark zones (pin codes) as green, orange and red based on positive covid cases.
Default zone - GREEN
<5 cases in a zone - ORANGE
>5 cases in a zone - RED

APIs
getZoneInfo:
Sample request - {"pinCode":"111111"}
Sample response - {"numCases":"1","zoneType":"ORANGE"}
                                                         
Expectations:
Use an in-memory or an external database like HSQLDB, SQLite, Postgres etc for performing operations on the data.
Write a few Unit Tests as a demonstration.
Try to be as close as possible to production quality coding conventions
Handle failures wherever applicable
Since time is limited, please prioritize tasks in the order they have been mentioned in the problem.

Guidelines:        
Please do not access the internet for anything EXCEPT for the syntax corrections.
You are free to use the language and IDE of your choice.
