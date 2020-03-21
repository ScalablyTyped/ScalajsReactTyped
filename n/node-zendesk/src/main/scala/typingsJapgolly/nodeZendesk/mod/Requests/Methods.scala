package typingsJapgolly.nodeZendesk.mod.Requests

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.nodeZendesk.mod.ZendeskCallback
import typingsJapgolly.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Methods extends js.Object {
  /** Creating Requests */
  def create(request: CreatePayload, cb: ZendeskCallback[_, _]): ResponsePayload
  /** Get Comment */
  def getComment(requestId: ZendeskID, commentId: ZendeskID, cb: ZendeskCallback[_, _]): typingsJapgolly.nodeZendesk.mod.Requests.Comments.ResponsePayload
  /** Viewing Requests */
  def getRequest(requestId: ZendeskID, cb: ZendeskCallback[_, _]): ResponsePayload
  /** Listing Requests */
  def list(cb: ZendeskCallback[_, _]): ListPayload
  def listByOrganization(organizationId: ZendeskID, cb: ZendeskCallback[_, _]): ListPayload
  def listByUser(userId: ZendeskID, cb: ZendeskCallback[_, _]): ListPayload
  def listCCD(organizationId: ZendeskID, cb: ZendeskCallback[_, _]): ListPayload
  /** Listing Comments */
  def listComments(requestId: ZendeskID, cb: ZendeskCallback[_, _]): typingsJapgolly.nodeZendesk.mod.Requests.Comments.ListPayload
  def listOpen(cb: ZendeskCallback[_, _]): ListPayload
  def listSolved(cb: ZendeskCallback[_, _]): ListPayload
  /** Inherited */
  def requestAll(httpMethod: String, fields: js.Any, cb: ZendeskCallback[_, _]): ListPayload
  /** Updating Requests */
  def update(requestId: ZendeskID, request: UpdatePayload, cb: ZendeskCallback[_, _]): ResponsePayload
}

object Methods {
  @scala.inline
  def apply(
    create: (CreatePayload, ZendeskCallback[js.Any, js.Any]) => CallbackTo[ResponsePayload],
    getComment: (ZendeskID, ZendeskID, ZendeskCallback[js.Any, js.Any]) => CallbackTo[typingsJapgolly.nodeZendesk.mod.Requests.Comments.ResponsePayload],
    getRequest: (ZendeskID, ZendeskCallback[js.Any, js.Any]) => CallbackTo[ResponsePayload],
    list: ZendeskCallback[js.Any, js.Any] => CallbackTo[ListPayload],
    listByOrganization: (ZendeskID, ZendeskCallback[js.Any, js.Any]) => CallbackTo[ListPayload],
    listByUser: (ZendeskID, ZendeskCallback[js.Any, js.Any]) => CallbackTo[ListPayload],
    listCCD: (ZendeskID, ZendeskCallback[js.Any, js.Any]) => CallbackTo[ListPayload],
    listComments: (ZendeskID, ZendeskCallback[js.Any, js.Any]) => CallbackTo[typingsJapgolly.nodeZendesk.mod.Requests.Comments.ListPayload],
    listOpen: ZendeskCallback[js.Any, js.Any] => CallbackTo[ListPayload],
    listSolved: ZendeskCallback[js.Any, js.Any] => CallbackTo[ListPayload],
    requestAll: (String, js.Any, ZendeskCallback[js.Any, js.Any]) => CallbackTo[ListPayload],
    update: (ZendeskID, UpdatePayload, ZendeskCallback[js.Any, js.Any]) => CallbackTo[ResponsePayload]
  ): Methods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction2((t0: typingsJapgolly.nodeZendesk.mod.Requests.CreatePayload, t1: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => create(t0, t1).runNow()))
    __obj.updateDynamic("getComment")(js.Any.fromFunction3((t0: typingsJapgolly.nodeZendesk.mod.ZendeskID, t1: typingsJapgolly.nodeZendesk.mod.ZendeskID, t2: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => getComment(t0, t1, t2).runNow()))
    __obj.updateDynamic("getRequest")(js.Any.fromFunction2((t0: typingsJapgolly.nodeZendesk.mod.ZendeskID, t1: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => getRequest(t0, t1).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => list(t0).runNow()))
    __obj.updateDynamic("listByOrganization")(js.Any.fromFunction2((t0: typingsJapgolly.nodeZendesk.mod.ZendeskID, t1: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => listByOrganization(t0, t1).runNow()))
    __obj.updateDynamic("listByUser")(js.Any.fromFunction2((t0: typingsJapgolly.nodeZendesk.mod.ZendeskID, t1: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => listByUser(t0, t1).runNow()))
    __obj.updateDynamic("listCCD")(js.Any.fromFunction2((t0: typingsJapgolly.nodeZendesk.mod.ZendeskID, t1: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => listCCD(t0, t1).runNow()))
    __obj.updateDynamic("listComments")(js.Any.fromFunction2((t0: typingsJapgolly.nodeZendesk.mod.ZendeskID, t1: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => listComments(t0, t1).runNow()))
    __obj.updateDynamic("listOpen")(js.Any.fromFunction1((t0: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => listOpen(t0).runNow()))
    __obj.updateDynamic("listSolved")(js.Any.fromFunction1((t0: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => listSolved(t0).runNow()))
    __obj.updateDynamic("requestAll")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Any, t2: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => requestAll(t0, t1, t2).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction3((t0: typingsJapgolly.nodeZendesk.mod.ZendeskID, t1: typingsJapgolly.nodeZendesk.mod.Requests.UpdatePayload, t2: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => update(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Methods]
  }
}

