package typingsJapgolly.sharepoint

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.TransitionEvent
import typingsJapgolly.sharepoint.sharepointStrings.transitionstart
import typingsJapgolly.std.GlobalEventHandlers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AttachEvent")
@js.native
object AttachEvent_transitionstart extends js.Object {
  def apply(
    `type`: transitionstart,
    eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ TransitionEvent, _],
    el: GlobalEventHandlers
  ): js.Any = js.native
}

