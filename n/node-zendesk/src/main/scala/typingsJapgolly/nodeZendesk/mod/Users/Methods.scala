package typingsJapgolly.nodeZendesk.mod.Users

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.nodeZendesk.mod.ZendeskCallback
import typingsJapgolly.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Methods extends js.Object {
  /** User Auth */
  def auth(cb: ZendeskCallback[_, _]): js.Any
  /** Creating Users */
  def create(user: CreatePayload, cb: ZendeskCallback[_, _]): ResponsePayload
  def createMany(users: CreateManyPayload, cb: ZendeskCallback[_, _]): typingsJapgolly.nodeZendesk.mod.JobStatuses.ResponsePayload
  def createOrUpdate(user: CreatePayload, cb: ZendeskCallback[_, _]): ResponsePayload
  def createOrUpdateMany(users: CreateManyPayload, cb: ZendeskCallback[_, _]): typingsJapgolly.nodeZendesk.mod.JobStatuses.ResponsePayload
  /** Deleting Users */
  def delete(userId: ZendeskID, cb: ZendeskCallback[_, _]): js.Any
  def incremental(startTime: Double, cb: ZendeskCallback[_, _]): ListPayload
  /** Users Export */
  def incrementalInclude(startTime: Double, include: js.Any, cb: ZendeskCallback[_, _]): ListPayload
  def incrementalSample(startTime: Double, cb: ZendeskCallback[_, _]): ListPayload
  /** Listing Users */
  def list(cb: ZendeskCallback[_, _]): ListPayload
  def listByGroup(groupId: ZendeskID, cb: ZendeskCallback[_, _]): ListPayload
  def listByOrganization(organizationId: ZendeskID, cb: ZendeskCallback[_, _]): ListPayload
  /** Getting own User */
  def me(cb: ZendeskCallback[_, _]): ResponsePayload
  /** Merging Users */
  def merge(userId: ZendeskID, targetUserId: ZendeskID, cb: ZendeskCallback[_, _]): ResponsePayload
  /** Changing User Password */
  def password(userId: ZendeskID, oldPassword: String, newPassword: String, cb: ZendeskCallback[_, _]): js.Any
  /** Searching Users */
  def search(params: js.Any, cb: ZendeskCallback[_, _]): ListPayload
  /** Showing Users */
  def show(userId: ZendeskID, cb: ZendeskCallback[_, _]): ResponsePayload
  def showMany(userIds: js.Array[ZendeskID], cb: ZendeskCallback[_, _]): ListPayload
  /** Suspending Users */
  def suspend(userId: ZendeskID, cb: ZendeskCallback[_, _]): ResponsePayload
  def unsuspend(userId: ZendeskID, cb: ZendeskCallback[_, _]): ResponsePayload
  /** Updating Users */
  def update(userId: ZendeskID, user: UpdatePayload, cb: ZendeskCallback[_, _]): ResponsePayload
  def updateMany(userIds: UpdateIdPayload, users: UpdateManyPayload, cb: ZendeskCallback[_, _]): typingsJapgolly.nodeZendesk.mod.JobStatuses.ResponsePayload
}

object Methods {
  @scala.inline
  def apply(
    auth: ZendeskCallback[js.Any, js.Any] => CallbackTo[js.Any],
    create: (CreatePayload, ZendeskCallback[js.Any, js.Any]) => CallbackTo[ResponsePayload],
    createMany: (CreateManyPayload, ZendeskCallback[js.Any, js.Any]) => CallbackTo[typingsJapgolly.nodeZendesk.mod.JobStatuses.ResponsePayload],
    createOrUpdate: (CreatePayload, ZendeskCallback[js.Any, js.Any]) => CallbackTo[ResponsePayload],
    createOrUpdateMany: (CreateManyPayload, ZendeskCallback[js.Any, js.Any]) => CallbackTo[typingsJapgolly.nodeZendesk.mod.JobStatuses.ResponsePayload],
    delete: (ZendeskID, ZendeskCallback[js.Any, js.Any]) => CallbackTo[js.Any],
    incremental: (Double, ZendeskCallback[js.Any, js.Any]) => CallbackTo[ListPayload],
    incrementalInclude: (Double, js.Any, ZendeskCallback[js.Any, js.Any]) => CallbackTo[ListPayload],
    incrementalSample: (Double, ZendeskCallback[js.Any, js.Any]) => CallbackTo[ListPayload],
    list: ZendeskCallback[js.Any, js.Any] => CallbackTo[ListPayload],
    listByGroup: (ZendeskID, ZendeskCallback[js.Any, js.Any]) => CallbackTo[ListPayload],
    listByOrganization: (ZendeskID, ZendeskCallback[js.Any, js.Any]) => CallbackTo[ListPayload],
    me: ZendeskCallback[js.Any, js.Any] => CallbackTo[ResponsePayload],
    merge: (ZendeskID, ZendeskID, ZendeskCallback[js.Any, js.Any]) => CallbackTo[ResponsePayload],
    password: (ZendeskID, String, String, ZendeskCallback[js.Any, js.Any]) => CallbackTo[js.Any],
    search: (js.Any, ZendeskCallback[js.Any, js.Any]) => CallbackTo[ListPayload],
    show: (ZendeskID, ZendeskCallback[js.Any, js.Any]) => CallbackTo[ResponsePayload],
    showMany: (js.Array[ZendeskID], ZendeskCallback[js.Any, js.Any]) => CallbackTo[ListPayload],
    suspend: (ZendeskID, ZendeskCallback[js.Any, js.Any]) => CallbackTo[ResponsePayload],
    unsuspend: (ZendeskID, ZendeskCallback[js.Any, js.Any]) => CallbackTo[ResponsePayload],
    update: (ZendeskID, UpdatePayload, ZendeskCallback[js.Any, js.Any]) => CallbackTo[ResponsePayload],
    updateMany: (UpdateIdPayload, UpdateManyPayload, ZendeskCallback[js.Any, js.Any]) => CallbackTo[typingsJapgolly.nodeZendesk.mod.JobStatuses.ResponsePayload]
  ): Methods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("auth")(js.Any.fromFunction1((t0: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => auth(t0).runNow()))
    __obj.updateDynamic("create")(js.Any.fromFunction2((t0: typingsJapgolly.nodeZendesk.mod.Users.CreatePayload, t1: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => create(t0, t1).runNow()))
    __obj.updateDynamic("createMany")(js.Any.fromFunction2((t0: typingsJapgolly.nodeZendesk.mod.Users.CreateManyPayload, t1: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => createMany(t0, t1).runNow()))
    __obj.updateDynamic("createOrUpdate")(js.Any.fromFunction2((t0: typingsJapgolly.nodeZendesk.mod.Users.CreatePayload, t1: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => createOrUpdate(t0, t1).runNow()))
    __obj.updateDynamic("createOrUpdateMany")(js.Any.fromFunction2((t0: typingsJapgolly.nodeZendesk.mod.Users.CreateManyPayload, t1: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => createOrUpdateMany(t0, t1).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction2((t0: typingsJapgolly.nodeZendesk.mod.ZendeskID, t1: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => delete(t0, t1).runNow()))
    __obj.updateDynamic("incremental")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => incremental(t0, t1).runNow()))
    __obj.updateDynamic("incrementalInclude")(js.Any.fromFunction3((t0: scala.Double, t1: js.Any, t2: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => incrementalInclude(t0, t1, t2).runNow()))
    __obj.updateDynamic("incrementalSample")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => incrementalSample(t0, t1).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => list(t0).runNow()))
    __obj.updateDynamic("listByGroup")(js.Any.fromFunction2((t0: typingsJapgolly.nodeZendesk.mod.ZendeskID, t1: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => listByGroup(t0, t1).runNow()))
    __obj.updateDynamic("listByOrganization")(js.Any.fromFunction2((t0: typingsJapgolly.nodeZendesk.mod.ZendeskID, t1: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => listByOrganization(t0, t1).runNow()))
    __obj.updateDynamic("me")(js.Any.fromFunction1((t0: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => me(t0).runNow()))
    __obj.updateDynamic("merge")(js.Any.fromFunction3((t0: typingsJapgolly.nodeZendesk.mod.ZendeskID, t1: typingsJapgolly.nodeZendesk.mod.ZendeskID, t2: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => merge(t0, t1, t2).runNow()))
    __obj.updateDynamic("password")(js.Any.fromFunction4((t0: typingsJapgolly.nodeZendesk.mod.ZendeskID, t1: java.lang.String, t2: java.lang.String, t3: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => password(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("search")(js.Any.fromFunction2((t0: js.Any, t1: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => search(t0, t1).runNow()))
    __obj.updateDynamic("show")(js.Any.fromFunction2((t0: typingsJapgolly.nodeZendesk.mod.ZendeskID, t1: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => show(t0, t1).runNow()))
    __obj.updateDynamic("showMany")(js.Any.fromFunction2((t0: js.Array[typingsJapgolly.nodeZendesk.mod.ZendeskID], t1: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => showMany(t0, t1).runNow()))
    __obj.updateDynamic("suspend")(js.Any.fromFunction2((t0: typingsJapgolly.nodeZendesk.mod.ZendeskID, t1: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => suspend(t0, t1).runNow()))
    __obj.updateDynamic("unsuspend")(js.Any.fromFunction2((t0: typingsJapgolly.nodeZendesk.mod.ZendeskID, t1: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => unsuspend(t0, t1).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction3((t0: typingsJapgolly.nodeZendesk.mod.ZendeskID, t1: typingsJapgolly.nodeZendesk.mod.Users.UpdatePayload, t2: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => update(t0, t1, t2).runNow()))
    __obj.updateDynamic("updateMany")(js.Any.fromFunction3((t0: typingsJapgolly.nodeZendesk.mod.Users.UpdateIdPayload, t1: typingsJapgolly.nodeZendesk.mod.Users.UpdateManyPayload, t2: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => updateMany(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Methods]
  }
}

