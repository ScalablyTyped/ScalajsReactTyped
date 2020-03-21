package typingsJapgolly.sharepoint

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.sharepoint.sharepointStrings.mouseenter
import typingsJapgolly.std.GlobalEventHandlers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AttachEvent")
@js.native
object AttachEvent_mouseenter extends js.Object {
  def apply(
    `type`: mouseenter,
    eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    el: GlobalEventHandlers
  ): js.Any = js.native
}

