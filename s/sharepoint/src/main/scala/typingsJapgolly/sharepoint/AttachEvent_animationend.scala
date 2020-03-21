package typingsJapgolly.sharepoint

import org.scalajs.dom.raw.AnimationEvent
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.sharepoint.sharepointStrings.animationend
import typingsJapgolly.std.GlobalEventHandlers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AttachEvent")
@js.native
object AttachEvent_animationend extends js.Object {
  def apply(
    `type`: animationend,
    eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ AnimationEvent, _],
    el: GlobalEventHandlers
  ): js.Any = js.native
}

