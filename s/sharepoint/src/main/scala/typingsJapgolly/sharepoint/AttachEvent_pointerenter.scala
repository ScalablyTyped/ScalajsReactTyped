package typingsJapgolly.sharepoint

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.PointerEvent
import typingsJapgolly.sharepoint.sharepointStrings.pointerenter
import typingsJapgolly.std.GlobalEventHandlers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AttachEvent")
@js.native
object AttachEvent_pointerenter extends js.Object {
  def apply(
    `type`: pointerenter,
    eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ PointerEvent, _],
    el: GlobalEventHandlers
  ): js.Any = js.native
}

