package typingsJapgolly.maximMazurokGapiClientDataflow.gapi.client.dataflow

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDataflow.anon.Alt
import typingsJapgolly.maximMazurokGapiClientDataflow.anon.JobId
import typingsJapgolly.maximMazurokGapiClientDataflow.anon.Oauthtoken
import typingsJapgolly.maximMazurokGapiClientDataflow.anon.PrettyPrint
import typingsJapgolly.maximMazurokGapiClientDataflow.anon.ProjectId
import typingsJapgolly.maximMazurokGapiClientDataflow.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItemsResource extends StObject {
  
  def lease(request: Alt, body: LeaseWorkItemRequest): Request[LeaseWorkItemResponse] = js.native
  def lease(request: JobId, body: LeaseWorkItemRequest): Request[LeaseWorkItemResponse] = js.native
  /** Leases a dataflow WorkItem to run. */
  def lease(request: Oauthtoken): Request[LeaseWorkItemResponse] = js.native
  /** Leases a dataflow WorkItem to run. */
  def lease(request: ProjectId): Request[LeaseWorkItemResponse] = js.native
  
  def reportStatus(request: Alt, body: ReportWorkItemStatusRequest): Request[ReportWorkItemStatusResponse] = js.native
  def reportStatus(request: JobId, body: ReportWorkItemStatusRequest): Request[ReportWorkItemStatusResponse] = js.native
  /** Reports the status of dataflow WorkItems leased by a worker. */
  def reportStatus(request: PrettyPrint): Request[ReportWorkItemStatusResponse] = js.native
  /** Reports the status of dataflow WorkItems leased by a worker. */
  def reportStatus(request: QuotaUser): Request[ReportWorkItemStatusResponse] = js.native
}
