package typingsJapgolly.maximMazurokGapiClientDataflow.gapi.client.dataflow

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDataflow.anon.JobId
import typingsJapgolly.maximMazurokGapiClientDataflow.anon.OauthtokenPrettyPrint
import typingsJapgolly.maximMazurokGapiClientDataflow.anon.PrettyPrintProjectId
import typingsJapgolly.maximMazurokGapiClientDataflow.anon.ProjectIdQuotaUser
import typingsJapgolly.maximMazurokGapiClientDataflow.anon.SnapshotId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotsResource extends StObject {
  
  /** Deletes a snapshot. */
  def delete(): Request[js.Object] = js.native
  def delete(request: SnapshotId): Request[js.Object] = js.native
  
  /** Gets information about a snapshot. */
  def get(): Request[Snapshot] = js.native
  def get(request: PrettyPrintProjectId): Request[Snapshot] = js.native
  def get(request: SnapshotId): Request[Snapshot] = js.native
  
  /** Lists snapshots. */
  def list(): Request[ListSnapshotsResponse] = js.native
  def list(request: JobId): Request[ListSnapshotsResponse] = js.native
  def list(request: OauthtokenPrettyPrint): Request[ListSnapshotsResponse] = js.native
  def list(request: ProjectIdQuotaUser): Request[ListSnapshotsResponse] = js.native
}
