package typingsJapgolly.onesignalCordovaPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaPlugins extends js.Object {
  var OneSignal: typingsJapgolly.onesignalCordovaPlugin.OneSignalCordovaPlugin.OneSignalCordovaPlugin
}

object CordovaPlugins {
  @scala.inline
  def apply(OneSignal: typingsJapgolly.onesignalCordovaPlugin.OneSignalCordovaPlugin.OneSignalCordovaPlugin): CordovaPlugins = {
    val __obj = js.Dynamic.literal(OneSignal = OneSignal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CordovaPlugins]
  }
}

