package typingsJapgolly.sharepoint

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.TouchEvent
import typingsJapgolly.sharepoint.sharepointStrings.touchcancel
import typingsJapgolly.std.GlobalEventHandlers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AttachEvent")
@js.native
object AttachEvent_touchcancel extends js.Object {
  def apply(
    `type`: touchcancel,
    eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _],
    el: GlobalEventHandlers
  ): js.Any = js.native
}

