package typingsJapgolly.sharepoint

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.sharepoint.sharepointStrings.contextmenu
import typingsJapgolly.std.GlobalEventHandlers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AttachEvent")
@js.native
object AttachEvent_contextmenu extends js.Object {
  def apply(
    `type`: contextmenu,
    eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ MouseEvent, _],
    el: GlobalEventHandlers
  ): js.Any = js.native
}

