package typingsJapgolly.maximMazurokGapiClientDataflow.gapi.client.dataflow

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDataflow.anon.LocationOauthtoken
import typingsJapgolly.maximMazurokGapiClientDataflow.anon.ResourceUploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends StObject {
  
  var flexTemplates: FlexTemplatesResource = js.native
  
  var jobs: JobsResource = js.native
  
  var snapshots: SnapshotsResource = js.native
  
  var sql: SqlResource = js.native
  
  var templates: TemplatesResource = js.native
  
  def workerMessages(request: LocationOauthtoken, body: SendWorkerMessagesRequest): Request[SendWorkerMessagesResponse] = js.native
  /** Send a worker_message to the service. */
  def workerMessages(request: ResourceUploadType): Request[SendWorkerMessagesResponse] = js.native
}
