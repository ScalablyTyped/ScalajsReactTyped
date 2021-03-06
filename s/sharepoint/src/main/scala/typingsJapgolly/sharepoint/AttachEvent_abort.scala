package typingsJapgolly.sharepoint

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.UIEvent
import typingsJapgolly.sharepoint.sharepointStrings.abort
import typingsJapgolly.std.GlobalEventHandlers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AttachEvent")
@js.native
object AttachEvent_abort extends js.Object {
  def apply(
    `type`: abort,
    eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, _],
    el: GlobalEventHandlers
  ): js.Any = js.native
}

