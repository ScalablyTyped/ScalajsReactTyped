package typingsJapgolly.sharepoint

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.sharepoint.sharepointStrings.securitypolicyviolation
import typingsJapgolly.std.GlobalEventHandlers
import typingsJapgolly.std.SecurityPolicyViolationEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AttachEvent")
@js.native
object AttachEvent_securitypolicyviolation extends js.Object {
  def apply(
    `type`: securitypolicyviolation,
    eventFunc: js.ThisFunction1[/* this */ HTMLElement, /* ev */ SecurityPolicyViolationEvent, _],
    el: GlobalEventHandlers
  ): js.Any = js.native
}

