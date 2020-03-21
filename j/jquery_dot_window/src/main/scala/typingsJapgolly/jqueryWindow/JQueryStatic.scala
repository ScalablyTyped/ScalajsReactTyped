package typingsJapgolly.jqueryWindow

import typingsJapgolly.jqueryWindow.JQueryWindow.Static
import typingsJapgolly.jqueryWindow.JQueryWindow.Window
import typingsJapgolly.jqueryWindow.JQueryWindow.WindowOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Register with JQuery static
@js.native
trait JQueryStatic extends js.Object {
  @JSName("window")
  var window_Original: Static = js.native
  def window(options: WindowOptions): Window = js.native
}

