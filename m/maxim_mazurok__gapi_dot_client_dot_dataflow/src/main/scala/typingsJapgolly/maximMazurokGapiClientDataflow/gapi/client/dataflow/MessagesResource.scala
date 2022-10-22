package typingsJapgolly.maximMazurokGapiClientDataflow.gapi.client.dataflow

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDataflow.anon.EndTime
import typingsJapgolly.maximMazurokGapiClientDataflow.anon.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessagesResource extends StObject {
  
  /**
    * Request the job status. To request the status of a job, we recommend using `projects.locations.jobs.messages.list` with a [regional endpoint]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints). Using `projects.jobs.messages.list` is not recommended, as you can only request the status of jobs that are
    * running in `us-central1`.
    */
  def list(): Request[ListJobMessagesResponse] = js.native
  def list(request: EndTime): Request[ListJobMessagesResponse] = js.native
  def list(request: Location): Request[ListJobMessagesResponse] = js.native
}
