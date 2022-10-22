package typingsJapgolly.limeJs.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait INotificationChannel extends StObject {
  
  def onNotification(notification: Notification): Any
  
  def sendNotification(notification: Notification): Unit
}
object INotificationChannel {
  
  inline def apply(onNotification: Notification => Any, sendNotification: Notification => Callback): INotificationChannel = {
    val __obj = js.Dynamic.literal(onNotification = js.Any.fromFunction1(onNotification), sendNotification = js.Any.fromFunction1((t0: Notification) => sendNotification(t0).runNow()))
    __obj.asInstanceOf[INotificationChannel]
  }
  
  extension [Self <: INotificationChannel](x: Self) {
    
    inline def setOnNotification(value: Notification => Any): Self = StObject.set(x, "onNotification", js.Any.fromFunction1(value))
    
    inline def setSendNotification(value: Notification => Callback): Self = StObject.set(x, "sendNotification", js.Any.fromFunction1((t0: Notification) => value(t0).runNow()))
  }
}
