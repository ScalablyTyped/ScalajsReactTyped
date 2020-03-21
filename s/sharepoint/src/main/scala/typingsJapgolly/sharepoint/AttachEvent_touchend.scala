package typingsJapgolly.sharepoint

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.TouchEvent
import typingsJapgolly.sharepoint.sharepointStrings.touchend
import typingsJapgolly.std.GlobalEventHandlers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AttachEvent")
@js.native
object AttachEvent_touchend extends js.Object {
  def apply(
    `type`: touchend,
    eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TouchEvent, _],
    el: GlobalEventHandlers
  ): js.Any = js.native
}

