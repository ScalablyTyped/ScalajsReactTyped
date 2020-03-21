package typingsJapgolly.cordovaPluginDeviceName

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaPlugins extends js.Object {
  /**
    * cordova-plugin-device-name interface
    */
  var deviceName: typingsJapgolly.cordovaPluginDeviceName.CordovaPluginDeviceName.CordovaPluginDeviceName
}

object CordovaPlugins {
  @scala.inline
  def apply(
    deviceName: typingsJapgolly.cordovaPluginDeviceName.CordovaPluginDeviceName.CordovaPluginDeviceName
  ): CordovaPlugins = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CordovaPlugins]
  }
}

