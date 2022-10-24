# Snapshot
Snapshot/Screenshot test example code using 
- Showkase (https://github.com/airbnb/Showkase) 
- Paparazzi (https://github.com/cashapp/paparazzi)
- TestParameterInjector (https://github.com/google/TestParameterInjector)  

to automate screenshot testing for Compose previews and layout xmls.

**recordSnapshot.sh usage:**

`./scripts/recordSnapshots.sh -r` - Delete previous snapshots and record all previews and layout xmls

`./scripts/recordSnapshots.sh -p Welcome` - Record snapshots for all previews with names starting with "Welcome"

`./scripts/recordSnapshots.sh -p view_button` - Record snapshots for all xml layouts starting with "view_button": 
