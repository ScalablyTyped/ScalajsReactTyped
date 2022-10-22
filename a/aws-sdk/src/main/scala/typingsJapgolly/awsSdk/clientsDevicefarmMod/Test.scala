package typingsJapgolly.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Test extends StObject {
  
  /**
    * The test's ARN.
    */
  var arn: js.UndefOr[AmazonResourceName] = js.undefined
  
  /**
    * The test's result counters.
    */
  var counters: js.UndefOr[Counters] = js.undefined
  
  /**
    * When the test was created.
    */
  var created: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Represents the total (metered or unmetered) minutes used by the test.
    */
  var deviceMinutes: js.UndefOr[DeviceMinutes] = js.undefined
  
  /**
    * A message about the test's result.
    */
  var message: js.UndefOr[Message] = js.undefined
  
  /**
    * The test's name.
    */
  var name: js.UndefOr[Name] = js.undefined
  
  /**
    * The test's result. Allowed values include:   PENDING   PASSED   WARNED   FAILED   SKIPPED   ERRORED   STOPPED  
    */
  var result: js.UndefOr[ExecutionResult] = js.undefined
  
  /**
    * The test's start time.
    */
  var started: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The test's status. Allowed values include:   PENDING   PENDING_CONCURRENCY   PENDING_DEVICE   PROCESSING   SCHEDULING   PREPARING   RUNNING   COMPLETED   STOPPING  
    */
  var status: js.UndefOr[ExecutionStatus] = js.undefined
  
  /**
    * The test's stop time.
    */
  var stopped: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The test's type. Must be one of the following values:   BUILTIN_FUZZ   BUILTIN_EXPLORER  For Android, an app explorer that traverses an Android app, interacting with it and capturing screenshots at the same time.    APPIUM_JAVA_JUNIT   APPIUM_JAVA_TESTNG   APPIUM_PYTHON   APPIUM_NODE   APPIUM_RUBY   APPIUM_WEB_JAVA_JUNIT   APPIUM_WEB_JAVA_TESTNG   APPIUM_WEB_PYTHON   APPIUM_WEB_NODE   APPIUM_WEB_RUBY   CALABASH   INSTRUMENTATION   UIAUTOMATION   UIAUTOMATOR   XCTEST   XCTEST_UI  
    */
  var `type`: js.UndefOr[TestType] = js.undefined
}
object Test {
  
  inline def apply(): Test = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Test]
  }
  
  extension [Self <: Test](x: Self) {
    
    inline def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCounters(value: Counters): Self = StObject.set(x, "counters", value.asInstanceOf[js.Any])
    
    inline def setCountersUndefined: Self = StObject.set(x, "counters", js.undefined)
    
    inline def setCreated(value: js.Date): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    inline def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    inline def setDeviceMinutes(value: DeviceMinutes): Self = StObject.set(x, "deviceMinutes", value.asInstanceOf[js.Any])
    
    inline def setDeviceMinutesUndefined: Self = StObject.set(x, "deviceMinutes", js.undefined)
    
    inline def setMessage(value: Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResult(value: ExecutionResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    
    inline def setStarted(value: js.Date): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
    
    inline def setStartedUndefined: Self = StObject.set(x, "started", js.undefined)
    
    inline def setStatus(value: ExecutionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setStopped(value: js.Date): Self = StObject.set(x, "stopped", value.asInstanceOf[js.Any])
    
    inline def setStoppedUndefined: Self = StObject.set(x, "stopped", js.undefined)
    
    inline def setType(value: TestType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
