package typingsJapgolly.onesignalCordovaPlugin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var plugins: CordovaPlugins
}

object Window {
  @scala.inline
  def apply(plugins: CordovaPlugins): Window = {
    val __obj = js.Dynamic.literal(plugins = plugins.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Window]
  }
}

