package typingsJapgolly.detox.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppNotReady extends StObject {
  
  var appNotReady: js.UndefOr[Boolean] = js.undefined
  
  var testDone: js.UndefOr[Boolean] = js.undefined
  
  var testFailure: js.UndefOr[Boolean] = js.undefined
  
  var testStart: js.UndefOr[Boolean] = js.undefined
}
object AppNotReady {
  
  inline def apply(): AppNotReady = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppNotReady]
  }
  
  extension [Self <: AppNotReady](x: Self) {
    
    inline def setAppNotReady(value: Boolean): Self = StObject.set(x, "appNotReady", value.asInstanceOf[js.Any])
    
    inline def setAppNotReadyUndefined: Self = StObject.set(x, "appNotReady", js.undefined)
    
    inline def setTestDone(value: Boolean): Self = StObject.set(x, "testDone", value.asInstanceOf[js.Any])
    
    inline def setTestDoneUndefined: Self = StObject.set(x, "testDone", js.undefined)
    
    inline def setTestFailure(value: Boolean): Self = StObject.set(x, "testFailure", value.asInstanceOf[js.Any])
    
    inline def setTestFailureUndefined: Self = StObject.set(x, "testFailure", js.undefined)
    
    inline def setTestStart(value: Boolean): Self = StObject.set(x, "testStart", value.asInstanceOf[js.Any])
    
    inline def setTestStartUndefined: Self = StObject.set(x, "testStart", js.undefined)
  }
}
