package typingsJapgolly.cordovaAppVersionPlugin.CordovaAppVersionPlugin

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CordovaAppVersionPlugin extends js.Object {
  /**
    * App version from config.xml's version (e.g. <widget id="my.app.id" version="1.5.0">)
    * @example window.cordova.plugins.version.getAppVersion() // e.g: "1.5.0"
    */
  def getAppVersion(): String
}

object CordovaAppVersionPlugin {
  @scala.inline
  def apply(getAppVersion: CallbackTo[String]): CordovaAppVersionPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getAppVersion")(getAppVersion.toJsFn)
    __obj.asInstanceOf[CordovaAppVersionPlugin]
  }
}

