package typingsJapgolly.sharepoint

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.UIEvent
import typingsJapgolly.sharepoint.sharepointStrings.resize
import typingsJapgolly.std.GlobalEventHandlers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AttachEvent")
@js.native
object AttachEvent_resize extends js.Object {
  def apply(
    `type`: resize,
    eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ UIEvent, _],
    el: GlobalEventHandlers
  ): js.Any = js.native
}

