package typingsJapgolly.tinymce.mod.ui

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.jquery.JQuery_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tinymce", "ui.Control")
@js.native
class Control () extends js.Object {
  @JSName("$el")
  var $el: JQuery_[HTMLElement] = js.native
  var settings: ControlSettings = js.native
  def active(state: Boolean): Unit = js.native
  def disabled(state: Boolean): Unit = js.native
  def on(name: String, callback: String): Control = js.native
  def tooltip(): Control = js.native
}

