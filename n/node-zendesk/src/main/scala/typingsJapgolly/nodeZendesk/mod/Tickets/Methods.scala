package typingsJapgolly.nodeZendesk.mod.Tickets

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.nodeZendesk.mod.ZendeskCallback
import typingsJapgolly.nodeZendesk.mod.ZendeskID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Methods extends js.Object {
  /** Adding Tags */
  def addTags(ticketId: ZendeskID, tags: js.Array[String], cb: ZendeskCallback[_, _]): TagsPayload
  /** Creating Tickets */
  def create(ticket: CreatePayload, cb: ZendeskCallback[_, _]): ResponsePayload
  def createMany(tickets: CreateManyPayload, cb: ZendeskCallback[_, _]): typingsJapgolly.nodeZendesk.mod.JobStatuses.ResponsePayload
  /** Deleting Tickets */
  def delete(ticketId: ZendeskID, cb: ZendeskCallback[_, _]): js.Any
  def deleteMany(ticketIds: js.Array[ZendeskID], cb: ZendeskCallback[_, _]): js.Any
  /** Ticket Exports */
  def export(startTime: Double, cb: ZendeskCallback[_, _]): js.Any
  /** Listing Audits */
  def exportAudit(ticketId: ZendeskID, cb: ZendeskCallback[_, _]): AuditsListPayload
  def exportSample(startTime: Double, options: js.Any): js.Any
  /** Listing Comments */
  def getComments(requestId: ZendeskID, cb: ZendeskCallback[_, _]): typingsJapgolly.nodeZendesk.mod.Tickets.Comments.ListPayload
  def incremental(startTime: Double, cb: ZendeskCallback[_, _]): js.Any
  def incrementalInclude(startTime: Double, include: js.Any, cb: ZendeskCallback[_, _]): js.Any
  def incrementalSample(startTime: Double, cb: ZendeskCallback[_, _]): js.Any
  /** Listing Tickets */
  def list(cb: ZendeskCallback[_, _]): ListPayload
  def listAssigned(userId: ZendeskID, cb: ZendeskCallback[_, _]): ListPayload
  def listByOrganization(organizationId: ZendeskID, cb: ZendeskCallback[_, _]): ListPayload
  def listByUserCCD(userId: ZendeskID, cb: ZendeskCallback[_, _]): ListPayload
  def listByUserRequested(userId: ZendeskID, cb: ZendeskCallback[_, _]): ListPayload
  def listCollaborators(ticketId: ZendeskID, cb: ZendeskCallback[_, _]): typingsJapgolly.nodeZendesk.mod.Users.ListPayload
  def listIncidents(ticketId: ZendeskID, cb: ZendeskCallback[_, _]): ListPayload
  def listMetrics(ticketId: ZendeskID, cb: ZendeskCallback[_, _]): typingsJapgolly.nodeZendesk.mod.Tickets.Metrics.ResponsePayload
  def listRecent(cb: ZendeskCallback[_, _]): ListPayload
  def listWithFilter(`type`: String, value: js.Any, cb: ZendeskCallback[_, _]): ListPayload
  /** Merging Tickets */
  def merge(ticketId: ZendeskID, mergingTickets: MergePayload, cb: ZendeskCallback[_, _]): typingsJapgolly.nodeZendesk.mod.JobStatuses.ResponsePayload
  /** Viewing Tickets */
  def show(ticketId: ZendeskID, cb: ZendeskCallback[_, _]): ResponsePayload
  def showMany(ticketIds: js.Array[ZendeskID], cb: ZendeskCallback[_, _]): ListPayload
  /** Updating Tickets */
  def update(ticketId: ZendeskID, ticket: UpdatePayload, cb: ZendeskCallback[_, _]): ResponsePayload
  def updateMany(tickets: UpdateManyPayload, cb: ZendeskCallback[_, _]): typingsJapgolly.nodeZendesk.mod.JobStatuses.ResponsePayload
}

object Methods {
  @scala.inline
  def apply(
    addTags: (ZendeskID, js.Array[String], ZendeskCallback[js.Any, js.Any]) => CallbackTo[TagsPayload],
    create: (CreatePayload, ZendeskCallback[js.Any, js.Any]) => CallbackTo[ResponsePayload],
    createMany: (CreateManyPayload, ZendeskCallback[js.Any, js.Any]) => CallbackTo[typingsJapgolly.nodeZendesk.mod.JobStatuses.ResponsePayload],
    delete: (ZendeskID, ZendeskCallback[js.Any, js.Any]) => CallbackTo[js.Any],
    deleteMany: (js.Array[ZendeskID], ZendeskCallback[js.Any, js.Any]) => CallbackTo[js.Any],
    export: (Double, ZendeskCallback[js.Any, js.Any]) => CallbackTo[js.Any],
    exportAudit: (ZendeskID, ZendeskCallback[js.Any, js.Any]) => CallbackTo[AuditsListPayload],
    exportSample: (Double, js.Any) => CallbackTo[js.Any],
    getComments: (ZendeskID, ZendeskCallback[js.Any, js.Any]) => CallbackTo[typingsJapgolly.nodeZendesk.mod.Tickets.Comments.ListPayload],
    incremental: (Double, ZendeskCallback[js.Any, js.Any]) => CallbackTo[js.Any],
    incrementalInclude: (Double, js.Any, ZendeskCallback[js.Any, js.Any]) => CallbackTo[js.Any],
    incrementalSample: (Double, ZendeskCallback[js.Any, js.Any]) => CallbackTo[js.Any],
    list: ZendeskCallback[js.Any, js.Any] => CallbackTo[ListPayload],
    listAssigned: (ZendeskID, ZendeskCallback[js.Any, js.Any]) => CallbackTo[ListPayload],
    listByOrganization: (ZendeskID, ZendeskCallback[js.Any, js.Any]) => CallbackTo[ListPayload],
    listByUserCCD: (ZendeskID, ZendeskCallback[js.Any, js.Any]) => CallbackTo[ListPayload],
    listByUserRequested: (ZendeskID, ZendeskCallback[js.Any, js.Any]) => CallbackTo[ListPayload],
    listCollaborators: (ZendeskID, ZendeskCallback[js.Any, js.Any]) => CallbackTo[typingsJapgolly.nodeZendesk.mod.Users.ListPayload],
    listIncidents: (ZendeskID, ZendeskCallback[js.Any, js.Any]) => CallbackTo[ListPayload],
    listMetrics: (ZendeskID, ZendeskCallback[js.Any, js.Any]) => CallbackTo[typingsJapgolly.nodeZendesk.mod.Tickets.Metrics.ResponsePayload],
    listRecent: ZendeskCallback[js.Any, js.Any] => CallbackTo[ListPayload],
    listWithFilter: (String, js.Any, ZendeskCallback[js.Any, js.Any]) => CallbackTo[ListPayload],
    merge: (ZendeskID, MergePayload, ZendeskCallback[js.Any, js.Any]) => CallbackTo[typingsJapgolly.nodeZendesk.mod.JobStatuses.ResponsePayload],
    show: (ZendeskID, ZendeskCallback[js.Any, js.Any]) => CallbackTo[ResponsePayload],
    showMany: (js.Array[ZendeskID], ZendeskCallback[js.Any, js.Any]) => CallbackTo[ListPayload],
    update: (ZendeskID, UpdatePayload, ZendeskCallback[js.Any, js.Any]) => CallbackTo[ResponsePayload],
    updateMany: (UpdateManyPayload, ZendeskCallback[js.Any, js.Any]) => CallbackTo[typingsJapgolly.nodeZendesk.mod.JobStatuses.ResponsePayload]
  ): Methods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addTags")(js.Any.fromFunction3((t0: typingsJapgolly.nodeZendesk.mod.ZendeskID, t1: js.Array[java.lang.String], t2: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => addTags(t0, t1, t2).runNow()))
    __obj.updateDynamic("create")(js.Any.fromFunction2((t0: typingsJapgolly.nodeZendesk.mod.Tickets.CreatePayload, t1: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => create(t0, t1).runNow()))
    __obj.updateDynamic("createMany")(js.Any.fromFunction2((t0: typingsJapgolly.nodeZendesk.mod.Tickets.CreateManyPayload, t1: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => createMany(t0, t1).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction2((t0: typingsJapgolly.nodeZendesk.mod.ZendeskID, t1: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => delete(t0, t1).runNow()))
    __obj.updateDynamic("deleteMany")(js.Any.fromFunction2((t0: js.Array[typingsJapgolly.nodeZendesk.mod.ZendeskID], t1: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => deleteMany(t0, t1).runNow()))
    __obj.updateDynamic("export")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => export(t0, t1).runNow()))
    __obj.updateDynamic("exportAudit")(js.Any.fromFunction2((t0: typingsJapgolly.nodeZendesk.mod.ZendeskID, t1: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => exportAudit(t0, t1).runNow()))
    __obj.updateDynamic("exportSample")(js.Any.fromFunction2((t0: scala.Double, t1: js.Any) => exportSample(t0, t1).runNow()))
    __obj.updateDynamic("getComments")(js.Any.fromFunction2((t0: typingsJapgolly.nodeZendesk.mod.ZendeskID, t1: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => getComments(t0, t1).runNow()))
    __obj.updateDynamic("incremental")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => incremental(t0, t1).runNow()))
    __obj.updateDynamic("incrementalInclude")(js.Any.fromFunction3((t0: scala.Double, t1: js.Any, t2: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => incrementalInclude(t0, t1, t2).runNow()))
    __obj.updateDynamic("incrementalSample")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => incrementalSample(t0, t1).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => list(t0).runNow()))
    __obj.updateDynamic("listAssigned")(js.Any.fromFunction2((t0: typingsJapgolly.nodeZendesk.mod.ZendeskID, t1: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => listAssigned(t0, t1).runNow()))
    __obj.updateDynamic("listByOrganization")(js.Any.fromFunction2((t0: typingsJapgolly.nodeZendesk.mod.ZendeskID, t1: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => listByOrganization(t0, t1).runNow()))
    __obj.updateDynamic("listByUserCCD")(js.Any.fromFunction2((t0: typingsJapgolly.nodeZendesk.mod.ZendeskID, t1: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => listByUserCCD(t0, t1).runNow()))
    __obj.updateDynamic("listByUserRequested")(js.Any.fromFunction2((t0: typingsJapgolly.nodeZendesk.mod.ZendeskID, t1: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => listByUserRequested(t0, t1).runNow()))
    __obj.updateDynamic("listCollaborators")(js.Any.fromFunction2((t0: typingsJapgolly.nodeZendesk.mod.ZendeskID, t1: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => listCollaborators(t0, t1).runNow()))
    __obj.updateDynamic("listIncidents")(js.Any.fromFunction2((t0: typingsJapgolly.nodeZendesk.mod.ZendeskID, t1: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => listIncidents(t0, t1).runNow()))
    __obj.updateDynamic("listMetrics")(js.Any.fromFunction2((t0: typingsJapgolly.nodeZendesk.mod.ZendeskID, t1: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => listMetrics(t0, t1).runNow()))
    __obj.updateDynamic("listRecent")(js.Any.fromFunction1((t0: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => listRecent(t0).runNow()))
    __obj.updateDynamic("listWithFilter")(js.Any.fromFunction3((t0: java.lang.String, t1: js.Any, t2: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => listWithFilter(t0, t1, t2).runNow()))
    __obj.updateDynamic("merge")(js.Any.fromFunction3((t0: typingsJapgolly.nodeZendesk.mod.ZendeskID, t1: typingsJapgolly.nodeZendesk.mod.Tickets.MergePayload, t2: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => merge(t0, t1, t2).runNow()))
    __obj.updateDynamic("show")(js.Any.fromFunction2((t0: typingsJapgolly.nodeZendesk.mod.ZendeskID, t1: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => show(t0, t1).runNow()))
    __obj.updateDynamic("showMany")(js.Any.fromFunction2((t0: js.Array[typingsJapgolly.nodeZendesk.mod.ZendeskID], t1: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => showMany(t0, t1).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction3((t0: typingsJapgolly.nodeZendesk.mod.ZendeskID, t1: typingsJapgolly.nodeZendesk.mod.Tickets.UpdatePayload, t2: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => update(t0, t1, t2).runNow()))
    __obj.updateDynamic("updateMany")(js.Any.fromFunction2((t0: typingsJapgolly.nodeZendesk.mod.Tickets.UpdateManyPayload, t1: typingsJapgolly.nodeZendesk.mod.ZendeskCallback[js.Any, js.Any]) => updateMany(t0, t1).runNow()))
    __obj.asInstanceOf[Methods]
  }
}

