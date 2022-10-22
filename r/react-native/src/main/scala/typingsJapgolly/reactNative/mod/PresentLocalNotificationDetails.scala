package typingsJapgolly.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PresentLocalNotificationDetails extends StObject {
  
  var alertAction: String
  
  var alertBody: String
  
  var alertTitle: js.UndefOr[String] = js.undefined
  
  var applicationIconBadgeNumber: js.UndefOr[Double] = js.undefined
  
  var category: js.UndefOr[String] = js.undefined
  
  var soundName: js.UndefOr[String] = js.undefined
  
  var userInfo: js.UndefOr[js.Object] = js.undefined
}
object PresentLocalNotificationDetails {
  
  inline def apply(alertAction: String, alertBody: String): PresentLocalNotificationDetails = {
    val __obj = js.Dynamic.literal(alertAction = alertAction.asInstanceOf[js.Any], alertBody = alertBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[PresentLocalNotificationDetails]
  }
  
  extension [Self <: PresentLocalNotificationDetails](x: Self) {
    
    inline def setAlertAction(value: String): Self = StObject.set(x, "alertAction", value.asInstanceOf[js.Any])
    
    inline def setAlertBody(value: String): Self = StObject.set(x, "alertBody", value.asInstanceOf[js.Any])
    
    inline def setAlertTitle(value: String): Self = StObject.set(x, "alertTitle", value.asInstanceOf[js.Any])
    
    inline def setAlertTitleUndefined: Self = StObject.set(x, "alertTitle", js.undefined)
    
    inline def setApplicationIconBadgeNumber(value: Double): Self = StObject.set(x, "applicationIconBadgeNumber", value.asInstanceOf[js.Any])
    
    inline def setApplicationIconBadgeNumberUndefined: Self = StObject.set(x, "applicationIconBadgeNumber", js.undefined)
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setSoundName(value: String): Self = StObject.set(x, "soundName", value.asInstanceOf[js.Any])
    
    inline def setSoundNameUndefined: Self = StObject.set(x, "soundName", js.undefined)
    
    inline def setUserInfo(value: js.Object): Self = StObject.set(x, "userInfo", value.asInstanceOf[js.Any])
    
    inline def setUserInfoUndefined: Self = StObject.set(x, "userInfo", js.undefined)
  }
}
