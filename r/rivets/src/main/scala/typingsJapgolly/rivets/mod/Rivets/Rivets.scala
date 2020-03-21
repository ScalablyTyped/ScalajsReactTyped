package typingsJapgolly.rivets.mod.Rivets

import typingsJapgolly.jquery.JQuery_
import typingsJapgolly.rivets.AnonHandler
import typingsJapgolly.std.Event_
import typingsJapgolly.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rivets extends js.Object {
  // Global sightglass adapters.
  var adapters: js.Object = js.native
  // Global binders.
  var binders: js.Object = js.native
  // Global components.
  var components: js.Object = js.native
  // Global formatters.
  var formatters: js.Object = js.native
  // Default attribute prefix.
  var prefix: String = js.native
  // Preload data by default.
  var preloadData: Boolean = js.native
  // Default sightglass root interface.
  var rootInterface: String = js.native
  // Default template delimiters.
  var templateDelimiters: js.Array[String] = js.native
  def bind(element: js.Array[HTMLElement], models: js.Object): View = js.native
  def bind(element: js.Array[HTMLElement], models: js.Object, options: js.Object): View = js.native
  def bind(element: JQuery_[HTMLElement], models: js.Object): View = js.native
  def bind(element: JQuery_[HTMLElement], models: js.Object, options: js.Object): View = js.native
  def bind(element: HTMLElement, models: js.Object): View = js.native
  def bind(element: HTMLElement, models: js.Object, options: js.Object): View = js.native
  def configure(): Unit = js.native
  def configure(options: AnonHandler): Unit = js.native
  def handler(context: js.Any, ev: Event_, biding: js.Any): Unit = js.native
}

