package typingsJapgolly.nodeZendesk.mod.Users.Identities

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.nodeZendesk.mod.ZendeskCallback
import typingsJapgolly.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Methods extends js.Object {
  /** Creating Identities */
  def create(userId: ZendeskID, identity: CreatePayload, cb: ZendeskCallback[_, _]): ResponseModel
  /** Deleting Identities */
  def delete(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[_, _]): js.Any
  /** Listing Identities */
  def list(userId: ZendeskID, cb: ZendeskCallback[_, _]): ListPayload
  def makePrimary(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[_, _]): ListPayload
  def requestVerification(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[_, _]): js.Any
  /** Viewing Identities */
  def show(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[_, _]): ResponsePayload
  /** Updating Identities */
  def update(userId: ZendeskID, identityId: ZendeskID, identity: UpdatePayload, cb: ZendeskCallback[_, _]): ResponsePayload
  def verify(userId: ZendeskID, identityId: ZendeskID, cb: ZendeskCallback[_, _]): ResponsePayload
}

object Methods {
  @scala.inline
  def apply(
    create: (ZendeskID, CreatePayload, ZendeskCallback[js.Any, js.Any]) => CallbackTo[ResponseModel],
    delete: (ZendeskID, ZendeskID, ZendeskCallback[js.Any, js.Any]) => CallbackTo[js.Any],
    list: (ZendeskID, ZendeskCallback[js.Any, js.Any]) => CallbackTo[ListPayload],
    makePrimary: (ZendeskID, ZendeskID, ZendeskCallback[js.Any, js.Any]) => CallbackTo[ListPayload],
    requestVerification: (ZendeskID, ZendeskID, ZendeskCallback[js.Any, js.Any]) => CallbackTo[js.Any],
    show: (ZendeskID, ZendeskID, ZendeskCallback[js.Any, js.Any]) => CallbackTo[ResponsePayload],
    update: (ZendeskID, ZendeskID, UpdatePayload, ZendeskCallback[js.Any, js.Any]) => CallbackTo[ResponsePayload],
    verify: (ZendeskID, ZendeskID, ZendeskCallback[js.Any, js.Any]) => CallbackTo[ResponsePayload]
  ): Methods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction3((t0: typingsJapgolly.nodeZendesk.mod.ZendeskID, t1: typingsJapgolly.nodeZendesk.mod.Users.Identities.CreatePayload, t2: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => create(t0, t1, t2).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction3((t0: typingsJapgolly.nodeZendesk.mod.ZendeskID, t1: typingsJapgolly.nodeZendesk.mod.ZendeskID, t2: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => delete(t0, t1, t2).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction2((t0: typingsJapgolly.nodeZendesk.mod.ZendeskID, t1: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => list(t0, t1).runNow()))
    __obj.updateDynamic("makePrimary")(js.Any.fromFunction3((t0: typingsJapgolly.nodeZendesk.mod.ZendeskID, t1: typingsJapgolly.nodeZendesk.mod.ZendeskID, t2: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => makePrimary(t0, t1, t2).runNow()))
    __obj.updateDynamic("requestVerification")(js.Any.fromFunction3((t0: typingsJapgolly.nodeZendesk.mod.ZendeskID, t1: typingsJapgolly.nodeZendesk.mod.ZendeskID, t2: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => requestVerification(t0, t1, t2).runNow()))
    __obj.updateDynamic("show")(js.Any.fromFunction3((t0: typingsJapgolly.nodeZendesk.mod.ZendeskID, t1: typingsJapgolly.nodeZendesk.mod.ZendeskID, t2: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => show(t0, t1, t2).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction4((t0: typingsJapgolly.nodeZendesk.mod.ZendeskID, t1: typingsJapgolly.nodeZendesk.mod.ZendeskID, t2: typingsJapgolly.nodeZendesk.mod.Users.Identities.UpdatePayload, t3: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => update(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("verify")(js.Any.fromFunction3((t0: typingsJapgolly.nodeZendesk.mod.ZendeskID, t1: typingsJapgolly.nodeZendesk.mod.ZendeskID, t2: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => verify(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Methods]
  }
}

