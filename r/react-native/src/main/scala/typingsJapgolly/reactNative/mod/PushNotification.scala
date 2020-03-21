package typingsJapgolly.reactNative.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushNotification extends js.Object {
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
  @scala.inline
  def apply(
    finish: String => Callback,
    getAlert: CallbackTo[String | js.Object],
    getBadgeCount: CallbackTo[Double],
    getCategory: CallbackTo[String],
    getContentAvailable: CallbackTo[Double],
    getData: CallbackTo[js.Object],
    getMessage: CallbackTo[String | js.Object],
    getSound: CallbackTo[String]
  ): PushNotification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("finish")(js.Any.fromFunction1((t0: java.lang.String) => finish(t0).runNow()))
    __obj.updateDynamic("getAlert")(getAlert.toJsFn)
    __obj.updateDynamic("getBadgeCount")(getBadgeCount.toJsFn)
    __obj.updateDynamic("getCategory")(getCategory.toJsFn)
    __obj.updateDynamic("getContentAvailable")(getContentAvailable.toJsFn)
    __obj.updateDynamic("getData")(getData.toJsFn)
    __obj.updateDynamic("getMessage")(getMessage.toJsFn)
    __obj.updateDynamic("getSound")(getSound.toJsFn)
    __obj.asInstanceOf[PushNotification]
  }
}

