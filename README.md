
# Servicenow Extension Android
![Alt](https://netrixllcdemo2.service-now.com/images/logos/logo_service-now_light.png)
[![Download](https://jitpack.io/v/beingentangled/ServiceNowExtensionAndroid.svg)](https://jitpack.io/#beingentangled/ServiceNowExtensionAndroid) 

This is an android library for incident creation in servicenow
Please create issues if any. 

## Usage

  
```groovy
//SPECIFY IN YOUR gradle.properties
BASE_URL_SERVICE_NOW = "{Path to your servicenow URL}"
```
```groovy
//Specify in your app level gradle under build types
buildConfigField("String", "BASE_URL", project.property('BASE_URL_SERVICE_NOW'))
```


### 1.Import to your project
```java
implementation 'com.github.beingentangled:ServiceNowExtensionAndroid:1.0.1'
```
    
### 2.Initialize the Manager
```java 
serviceNowManager = new ServiceNowManager("{UserName}", "{Password}", {Activity});
```
		
### 3.Use the choose file option to upload
```java
serviceNowManager.chooseFile({Pass an Activity Instance});
   ```
### 4. Remember implement and set listeners
```java
public class MainActivity extends AppCompatActivity implements ServiceNowManager.uploadSuccessListener {
@Override  
protected void onCreate(Bundle savedInstanceState) {  
  super.onCreate(savedInstanceState);  
  setContentView(R.layout.activity_main);  
  //Provide Permission[MUST INCLUDE]
  checkPermissionReadStorage(this);  
  mTextMessage = findViewById(R.id.message);  
  mDescription = findViewById(R.id.description_edittext);  
  mComments = findViewById(R.id.comment_edit_text);  
  mCreateIncidentButton = findViewById(R.id.create_incident_button);  
  navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);  
  serviceNowManager = new ServiceNowManager("{UserName}", "{Password}", MainActivity.this);  
  mCreateIncidentButton.setOnClickListener(new View.OnClickListener() {  
        @Override  
  public void onClick(View v) {  
            if (validate()) {  
                serviceNowManager.createIncident(mDescription.getText().toString(), mComments.getText().toString(), mIncidentFile);  
  }  
        }  
    });  
    //MANDATORY
  serviceNowManager.setListener(this);  
}
}
   ```
### 4.Get the success Callback at onUploadSuccess()
```java
serviceNowManager.chooseFile({Pass an Activity Instance});
   ```
   
## Version Log
1.0.0 ----    Initial Version
1.0.1  ----  Upload Callback Addition

## License
```
MIT License
Copyright (c) 2019 Binoy Balu

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:
The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.
THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```