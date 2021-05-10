Java.perform(function () {
  // we create a javascript wrapper for MainActivity
  var Activity = Java.use('com.example.jni_project.MainActivity');
  // replace the randomize implementation
  Activity.randomize.implementation = function () {
    // console.log is used to report information back to us
    console.log("Inside randomize now");
    // return this number of our choice
    return 80085;
  }
});