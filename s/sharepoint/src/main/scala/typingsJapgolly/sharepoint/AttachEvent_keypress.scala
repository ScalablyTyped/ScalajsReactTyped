package typingsJapgolly.sharepoint

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.KeyboardEvent
import typingsJapgolly.sharepoint.sharepointStrings.keypress
import typingsJapgolly.std.GlobalEventHandlers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AttachEvent")
@js.native
object AttachEvent_keypress extends js.Object {
  def apply(
    `type`: keypress,
    eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ KeyboardEvent, _],
    el: GlobalEventHandlers
  ): js.Any = js.native
}

