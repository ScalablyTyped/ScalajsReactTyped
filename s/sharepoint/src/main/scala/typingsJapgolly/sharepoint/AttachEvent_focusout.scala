package typingsJapgolly.sharepoint

import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.sharepoint.sharepointStrings.focusout
import typingsJapgolly.std.GlobalEventHandlers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AttachEvent")
@js.native
object AttachEvent_focusout extends js.Object {
  def apply(
    `type`: focusout,
    eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ FocusEvent, _],
    el: GlobalEventHandlers
  ): js.Any = js.native
}

