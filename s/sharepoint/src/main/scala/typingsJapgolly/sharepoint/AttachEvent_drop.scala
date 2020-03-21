package typingsJapgolly.sharepoint

import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.sharepoint.sharepointStrings.drop
import typingsJapgolly.std.GlobalEventHandlers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AttachEvent")
@js.native
object AttachEvent_drop extends js.Object {
  def apply(
    `type`: drop,
    eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ DragEvent, _],
    el: GlobalEventHandlers
  ): js.Any = js.native
}

