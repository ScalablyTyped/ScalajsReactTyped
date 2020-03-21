package typingsJapgolly.nodeZendesk.mod.JobStatuses

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.nodeZendesk.mod.ZendeskCallback
import typingsJapgolly.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Methods extends js.Object {
  def show(jobStatusId: ZendeskID, cb: ZendeskCallback[_, _]): ResponsePayload
  def watch(jobStatusId: ZendeskID, interval: Double, maxAttempts: Double, cb: ZendeskCallback[_, _]): js.Any
}

object Methods {
  @scala.inline
  def apply(
    show: (ZendeskID, ZendeskCallback[js.Any, js.Any]) => CallbackTo[ResponsePayload],
    watch: (ZendeskID, Double, Double, ZendeskCallback[js.Any, js.Any]) => CallbackTo[js.Any]
  ): Methods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("show")(js.Any.fromFunction2((t0: typingsJapgolly.nodeZendesk.mod.ZendeskID, t1: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => show(t0, t1).runNow()))
    __obj.updateDynamic("watch")(js.Any.fromFunction4((t0: typingsJapgolly.nodeZendesk.mod.ZendeskID, t1: scala.Double, t2: scala.Double, t3: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => watch(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[Methods]
  }
}

