package typingsJapgolly.sharepoint

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.PointerEvent
import typingsJapgolly.sharepoint.sharepointStrings.pointercancel
import typingsJapgolly.std.GlobalEventHandlers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AttachEvent")
@js.native
object AttachEvent_pointercancel extends js.Object {
  def apply(
    `type`: pointercancel,
    eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    el: GlobalEventHandlers
  ): js.Any = js.native
}

