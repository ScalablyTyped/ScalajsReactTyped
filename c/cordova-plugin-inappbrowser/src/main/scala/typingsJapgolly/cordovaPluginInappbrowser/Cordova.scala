package typingsJapgolly.cordovaPluginInappbrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cordova extends js.Object {
  var InAppBrowser: typingsJapgolly.cordovaPluginInappbrowser.InAppBrowser
}

object Cordova {
  @scala.inline
  def apply(InAppBrowser: InAppBrowser): Cordova = {
    val __obj = js.Dynamic.literal(InAppBrowser = InAppBrowser.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Cordova]
  }
}

