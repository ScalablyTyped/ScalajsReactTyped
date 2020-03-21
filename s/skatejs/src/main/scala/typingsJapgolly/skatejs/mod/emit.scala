package typingsJapgolly.skatejs.mod

import typingsJapgolly.skatejs.typesMod.EventOptions
import typingsJapgolly.skatejs.typesMod.HTMLElementClass
import typingsJapgolly.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("skatejs", "emit")
@js.native
object emit extends js.Object {
  def apply(elem: HTMLElementClass, eventName: String): Boolean = js.native
  def apply(elem: HTMLElementClass, eventName: String, eventOptions: EventOptions): Boolean = js.native
  def apply(elem: EventTarget, eventName: String): Boolean = js.native
  def apply(elem: EventTarget, eventName: String, eventOptions: EventOptions): Boolean = js.native
}

