package typingsJapgolly.sharepoint

import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.ProgressEvent
import typingsJapgolly.sharepoint.sharepointStrings.progress
import typingsJapgolly.std.GlobalEventHandlers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AttachEvent")
@js.native
object AttachEvent_progress extends js.Object {
  def apply(
    `type`: progress,
    eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ ProgressEvent, _],
    el: GlobalEventHandlers
  ): js.Any = js.native
}

