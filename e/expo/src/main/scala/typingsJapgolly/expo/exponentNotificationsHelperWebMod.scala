package typingsJapgolly.expo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo/build/Notifications/ExponentNotificationsHelper.web", JSImport.Namespace)
@js.native
object exponentNotificationsHelperWebMod extends js.Object {
  def getDevicePushTokenAsync(): js.Promise[AnonDataType] = js.native
  def getExponentPushTokenAsync(): js.Promise[String] = js.native
  def guardPermission(): Unit = js.native
}

