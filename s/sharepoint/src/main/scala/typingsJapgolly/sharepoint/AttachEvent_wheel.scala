package typingsJapgolly.sharepoint

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.WheelEvent
import typingsJapgolly.sharepoint.sharepointStrings.wheel
import typingsJapgolly.std.GlobalEventHandlers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AttachEvent")
@js.native
object AttachEvent_wheel extends js.Object {
  def apply(
    `type`: wheel,
    eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ WheelEvent, _],
    el: GlobalEventHandlers
  ): js.Any = js.native
}

