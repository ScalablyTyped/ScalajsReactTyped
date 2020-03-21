package typingsJapgolly.cordovaPluginInappbrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.cordovaPluginInappbrowser.cordovaPluginInappbrowserStrings.loadstart
  - typingsJapgolly.cordovaPluginInappbrowser.cordovaPluginInappbrowserStrings.loadstop
  - typingsJapgolly.cordovaPluginInappbrowser.cordovaPluginInappbrowserStrings.loaderror
  - typingsJapgolly.cordovaPluginInappbrowser.cordovaPluginInappbrowserStrings.exit
  - typingsJapgolly.cordovaPluginInappbrowser.cordovaPluginInappbrowserStrings.message
*/
trait channel extends js.Object

object channel {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def exit: typingsJapgolly.cordovaPluginInappbrowser.cordovaPluginInappbrowserStrings.exit = this.cast("exit")
  @scala.inline
  def loaderror: typingsJapgolly.cordovaPluginInappbrowser.cordovaPluginInappbrowserStrings.loaderror = this.cast("loaderror")
  @scala.inline
  def loadstart: typingsJapgolly.cordovaPluginInappbrowser.cordovaPluginInappbrowserStrings.loadstart = this.cast("loadstart")
  @scala.inline
  def loadstop: typingsJapgolly.cordovaPluginInappbrowser.cordovaPluginInappbrowserStrings.loadstop = this.cast("loadstop")
  @scala.inline
  def message: typingsJapgolly.cordovaPluginInappbrowser.cordovaPluginInappbrowserStrings.message = this.cast("message")
}

