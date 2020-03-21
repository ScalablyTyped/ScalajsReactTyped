package typingsJapgolly.nodeZendesk.mod.Macros

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.nodeZendesk.mod.ZendeskCallback
import typingsJapgolly.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Methods extends js.Object {
  def applyTicket(ticketId: ZendeskID, macroId: Double, cb: ZendeskCallback[_, _]): ApplyTicketResponsePayload
}

object Methods {
  @scala.inline
  def apply(
    applyTicket: (ZendeskID, Double, ZendeskCallback[js.Any, js.Any]) => CallbackTo[ApplyTicketResponsePayload]
  ): Methods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("applyTicket")(js.Any.fromFunction3((t0: typingsJapgolly.nodeZendesk.mod.ZendeskID, t1: scala.Double, t2: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => applyTicket(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Methods]
  }
}

