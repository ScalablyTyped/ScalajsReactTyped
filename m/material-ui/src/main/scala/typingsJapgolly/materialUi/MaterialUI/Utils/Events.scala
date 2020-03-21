package typingsJapgolly.materialUi.MaterialUI.Utils

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.Element
import typingsJapgolly.std.EventListener
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Events extends js.Object {
  def isKeyboard(e: Event_): Boolean
  def off(el: Element, `type`: String, callback: EventListener): Unit
  def on(el: Element, `type`: String, callback: EventListener): Unit
  def once(el: Element, `type`: String, callback: EventListener): Unit
}

@JSGlobal("__MaterialUI.Utils.Events")
@js.native
object Events extends TopLevel[Events]

