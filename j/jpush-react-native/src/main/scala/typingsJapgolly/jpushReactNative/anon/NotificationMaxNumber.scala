package typingsJapgolly.jpushReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationMaxNumber extends StObject {
  
  var notificationMaxNumber: Double
}
object NotificationMaxNumber {
  
  inline def apply(notificationMaxNumber: Double): NotificationMaxNumber = {
    val __obj = js.Dynamic.literal(notificationMaxNumber = notificationMaxNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationMaxNumber]
  }
  
  extension [Self <: NotificationMaxNumber](x: Self) {
    
    inline def setNotificationMaxNumber(value: Double): Self = StObject.set(x, "notificationMaxNumber", value.asInstanceOf[js.Any])
  }
}
