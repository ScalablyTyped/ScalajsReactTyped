package typingsJapgolly.chromeApps.anon

import typingsJapgolly.chromeApps.chromeAppsStrings.data_
import typingsJapgolly.chromeApps.chromeAppsStrings.explicitFeedback
import typingsJapgolly.chromeApps.chromeAppsStrings.feedback_
import typingsJapgolly.chromeApps.chromeAppsStrings.notification_
import typingsJapgolly.chromeApps.chromeAppsStrings.periodic_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DATA_ extends StObject {
  
  var DATA: data_
  
  var EXPLICIT_FEEDBACK: explicitFeedback
  
  var FEEDBACK: feedback_
  
  var NOTIFICATION: notification_
  
  var PERIODIC: periodic_
}
object DATA_ {
  
  inline def apply(): DATA_ = {
    val __obj = js.Dynamic.literal(DATA = "data", EXPLICIT_FEEDBACK = "explicitFeedback", FEEDBACK = "feedback", NOTIFICATION = "notification", PERIODIC = "periodic")
    __obj.asInstanceOf[DATA_]
  }
  
  extension [Self <: DATA_](x: Self) {
    
    inline def setDATA(value: data_): Self = StObject.set(x, "DATA", value.asInstanceOf[js.Any])
    
    inline def setEXPLICIT_FEEDBACK(value: explicitFeedback): Self = StObject.set(x, "EXPLICIT_FEEDBACK", value.asInstanceOf[js.Any])
    
    inline def setFEEDBACK(value: feedback_): Self = StObject.set(x, "FEEDBACK", value.asInstanceOf[js.Any])
    
    inline def setNOTIFICATION(value: notification_): Self = StObject.set(x, "NOTIFICATION", value.asInstanceOf[js.Any])
    
    inline def setPERIODIC(value: periodic_): Self = StObject.set(x, "PERIODIC", value.asInstanceOf[js.Any])
  }
}
