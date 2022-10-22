package typingsJapgolly.reactNative.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PushNotification extends StObject {
  
  /**
    * iOS Only
    * Signifies remote notification handling is complete
    */
  def finish(result: String): Unit
  
  /**
    * Gets the notification's main message from the `aps` object
    */
  def getAlert(): String | js.Object
  
  /**
    * Gets the badge count number from the `aps` object
    */
  def getBadgeCount(): Double
  
  /**
    * Gets the category string from the `aps` object
    */
  def getCategory(): String
  
  /**
    * Gets the content-available number from the `aps` object
    */
  def getContentAvailable(): Double
  
  /**
    * Gets the data object on the notif
    */
  def getData(): js.Object
  
  /**
    * An alias for `getAlert` to get the notification's main message string
    */
  def getMessage(): String | js.Object
  
  /**
    * Gets the sound string from the `aps` object
    */
  def getSound(): String
}
object PushNotification {
  
  inline def apply(
    finish: String => Callback,
    getAlert: CallbackTo[String | js.Object],
    getBadgeCount: CallbackTo[Double],
    getCategory: CallbackTo[String],
    getContentAvailable: CallbackTo[Double],
    getData: CallbackTo[js.Object],
    getMessage: CallbackTo[String | js.Object],
    getSound: CallbackTo[String]
  ): PushNotification = {
    val __obj = js.Dynamic.literal(finish = js.Any.fromFunction1((t0: String) => finish(t0).runNow()), getAlert = getAlert.toJsFn, getBadgeCount = getBadgeCount.toJsFn, getCategory = getCategory.toJsFn, getContentAvailable = getContentAvailable.toJsFn, getData = getData.toJsFn, getMessage = getMessage.toJsFn, getSound = getSound.toJsFn)
    __obj.asInstanceOf[PushNotification]
  }
  
  extension [Self <: PushNotification](x: Self) {
    
    inline def setFinish(value: String => Callback): Self = StObject.set(x, "finish", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setGetAlert(value: CallbackTo[String | js.Object]): Self = StObject.set(x, "getAlert", value.toJsFn)
    
    inline def setGetBadgeCount(value: CallbackTo[Double]): Self = StObject.set(x, "getBadgeCount", value.toJsFn)
    
    inline def setGetCategory(value: CallbackTo[String]): Self = StObject.set(x, "getCategory", value.toJsFn)
    
    inline def setGetContentAvailable(value: CallbackTo[Double]): Self = StObject.set(x, "getContentAvailable", value.toJsFn)
    
    inline def setGetData(value: CallbackTo[js.Object]): Self = StObject.set(x, "getData", value.toJsFn)
    
    inline def setGetMessage(value: CallbackTo[String | js.Object]): Self = StObject.set(x, "getMessage", value.toJsFn)
    
    inline def setGetSound(value: CallbackTo[String]): Self = StObject.set(x, "getSound", value.toJsFn)
  }
}
