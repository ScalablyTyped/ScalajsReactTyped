package typingsJapgolly.nodeZendesk.mod.Requests

import typingsJapgolly.nodeZendesk.mod.ZendeskCallback
import typingsJapgolly.nodeZendesk.mod.ZendeskID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Methods extends StObject {
  
  def create(request: CreatePayload): js.Promise[ResponsePayload] = js.native
  /** Creating Requests */
  def create(request: CreatePayload, cb: ZendeskCallback[Any, Any]): ResponsePayload = js.native
  
  def getComment(requestId: ZendeskID, commentId: ZendeskID): js.Promise[typingsJapgolly.nodeZendesk.mod.Requests.Comments.ResponsePayload] = js.native
  /** Get Comment */
  def getComment(requestId: ZendeskID, commentId: ZendeskID, cb: ZendeskCallback[Any, Any]): typingsJapgolly.nodeZendesk.mod.Requests.Comments.ResponsePayload = js.native
  
  def getRequest(requestId: ZendeskID): js.Promise[ResponsePayload] = js.native
  /** Viewing Requests */
  def getRequest(requestId: ZendeskID, cb: ZendeskCallback[Any, Any]): ResponsePayload = js.native
  
  def list(): js.Promise[ListPayload] = js.native
  /** Listing Requests */
  def list(cb: ZendeskCallback[Any, Any]): ListPayload = js.native
  
  def listByOrganization(organizationId: ZendeskID): js.Promise[ListPayload] = js.native
  def listByOrganization(organizationId: ZendeskID, cb: ZendeskCallback[Any, Any]): ListPayload = js.native
  
  def listByUser(userId: ZendeskID): js.Promise[ListPayload] = js.native
  def listByUser(userId: ZendeskID, cb: ZendeskCallback[Any, Any]): ListPayload = js.native
  
  def listCCD(organizationId: ZendeskID): js.Promise[ListPayload] = js.native
  def listCCD(organizationId: ZendeskID, cb: ZendeskCallback[Any, Any]): ListPayload = js.native
  
  def listComments(requestId: ZendeskID): js.Promise[typingsJapgolly.nodeZendesk.mod.Requests.Comments.ListPayload] = js.native
  /** Listing Comments */
  def listComments(requestId: ZendeskID, cb: ZendeskCallback[Any, Any]): typingsJapgolly.nodeZendesk.mod.Requests.Comments.ListPayload = js.native
  
  def listOpen(): js.Promise[ListPayload] = js.native
  def listOpen(cb: ZendeskCallback[Any, Any]): ListPayload = js.native
  
  def listSolved(): js.Promise[ListPayload] = js.native
  def listSolved(cb: ZendeskCallback[Any, Any]): ListPayload = js.native
  
  def requestAll(httpMethod: String, fields: Any): js.Promise[ListPayload] = js.native
  /** Inherited */
  def requestAll(httpMethod: String, fields: Any, cb: ZendeskCallback[Any, Any]): ListPayload = js.native
  
  def update(requestId: ZendeskID, request: UpdatePayload): js.Promise[ResponsePayload] = js.native
  /** Updating Requests */
  def update(requestId: ZendeskID, request: UpdatePayload, cb: ZendeskCallback[Any, Any]): ResponsePayload = js.native
}
