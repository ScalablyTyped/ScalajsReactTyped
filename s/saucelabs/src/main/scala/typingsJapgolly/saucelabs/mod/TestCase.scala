package typingsJapgolly.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.saucelabs.saucelabsStrings.ABORTED
import typingsJapgolly.saucelabs.saucelabsStrings.CANCELED
import typingsJapgolly.saucelabs.saucelabsStrings.FAILURE
import typingsJapgolly.saucelabs.saucelabsStrings.SKIPPED
import typingsJapgolly.saucelabs.saucelabsStrings.SUCCESS
import typingsJapgolly.saucelabs.saucelabsStrings.UNKNOWN
import typingsJapgolly.saucelabs.saucelabsStrings.WARNING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestCase
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var className: js.UndefOr[String] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var methodName: js.UndefOr[String] = js.undefined
  
  var startTime: js.UndefOr[Double] = js.undefined
  
  var status: js.UndefOr[UNKNOWN | SUCCESS | WARNING | FAILURE | SKIPPED | ABORTED | CANCELED] = js.undefined
  
  var testError: js.UndefOr[TestError] = js.undefined
}
object TestCase {
  
  inline def apply(): TestCase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestCase]
  }
  
  extension [Self <: TestCase](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setMethodName(value: String): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
    
    inline def setMethodNameUndefined: Self = StObject.set(x, "methodName", js.undefined)
    
    inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStatus(value: UNKNOWN | SUCCESS | WARNING | FAILURE | SKIPPED | ABORTED | CANCELED): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTestError(value: TestError): Self = StObject.set(x, "testError", value.asInstanceOf[js.Any])
    
    inline def setTestErrorUndefined: Self = StObject.set(x, "testError", js.undefined)
  }
}
