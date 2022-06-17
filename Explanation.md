# Kayak_Sofiia_test
Web UI tests for https://www.kayak.ch/ 

TASK:
- Create Web UI test which proves that https://www.kayak.ch/ always return a roundtrip flight below certain price. 
 
PARAMETERS:
- From and To airports
- Date range
- Max price
 
REQUIRED:
- access to a git repository with a project 
- gradle build file for execution

SOLUTION:
1. The simplest and trivial -> Playback and Record actions via tool or browser-extention (for eg. Selenium IDE)
2. Semi-coding tool for Inspection and defining Object location then writing code to combine into a project (for eg. Katalon Studio)
3. Web UI tests via code (Visual Studio Code or IntelliJ IDEA)

TEST CASES MATRIX:
- Cove Happy Path scenarios
- Cover negative scenarious (empty field, missing data, uncorrect data)
- Cover basic tests via Checklists

TEST RESULTS: (I tried to automate via multiple ways and tool)
1. via Python and WebDriver: python automation1.py
2. via Katalon Studio: TC2
3. via C#: c#_kayak.cs
4. via Java: java_kayak.java

All files are attached
