package typingsJapgolly.maximMazurokGapiClientDlp.gapi.client.dlp

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDlp.anon.Fields
import typingsJapgolly.maximMazurokGapiClientDlp.anon.Filter
import typingsJapgolly.maximMazurokGapiClientDlp.anon.Key
import typingsJapgolly.maximMazurokGapiClientDlp.anon.Parent
import typingsJapgolly.maximMazurokGapiClientDlp.anon.QuotaUser
import typingsJapgolly.maximMazurokGapiClientDlp.anon.Resource
import typingsJapgolly.maximMazurokGapiClientDlp.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DlpJobsResource extends StObject {
  
  def cancel(request: Key, body: GooglePrivacyDlpV2CancelDlpJobRequest): Request[js.Object] = js.native
  /**
    * Starts asynchronous cancellation on a long-running DlpJob. The server makes a best effort to cancel the DlpJob, but success is not guaranteed. See
    * https://cloud.google.com/dlp/docs/inspecting-storage and https://cloud.google.com/dlp/docs/compute-risk-analysis to learn more.
    */
  def cancel(request: QuotaUser): Request[js.Object] = js.native
  
  def create(request: Fields, body: GooglePrivacyDlpV2CreateDlpJobRequest): Request[GooglePrivacyDlpV2DlpJob] = js.native
  /**
    * Creates a new job to inspect storage or calculate risk metrics. See https://cloud.google.com/dlp/docs/inspecting-storage and https://cloud.google.com/dlp/docs/compute-risk-analysis
    * to learn more. When no InfoTypes or CustomInfoTypes are specified in inspect jobs, the system will automatically choose what detectors to run. By default this may be all types, but
    * may change over time as detectors are updated.
    */
  def create(request: Parent): Request[GooglePrivacyDlpV2DlpJob] = js.native
  
  /**
    * Deletes a long-running DlpJob. This method indicates that the client is no longer interested in the DlpJob result. The job will be canceled if possible. See
    * https://cloud.google.com/dlp/docs/inspecting-storage and https://cloud.google.com/dlp/docs/compute-risk-analysis to learn more.
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: Key): Request[js.Object] = js.native
  
  def finish(request: Key, body: GooglePrivacyDlpV2FinishDlpJobRequest): Request[js.Object] = js.native
  /** Finish a running hybrid DlpJob. Triggers the finalization steps and running of any enabled actions that have not yet run. */
  def finish(request: Resource): Request[js.Object] = js.native
  
  /** Gets the latest state of a long-running DlpJob. See https://cloud.google.com/dlp/docs/inspecting-storage and https://cloud.google.com/dlp/docs/compute-risk-analysis to learn more. */
  def get(): Request[GooglePrivacyDlpV2DlpJob] = js.native
  def get(request: Key): Request[GooglePrivacyDlpV2DlpJob] = js.native
  
  def hybridInspect(request: Key, body: GooglePrivacyDlpV2HybridInspectDlpJobRequest): Request[js.Object] = js.native
  /** Inspect hybrid content and store findings to a job. To review the findings, inspect the job. Inspection will occur asynchronously. */
  def hybridInspect(request: UploadType): Request[js.Object] = js.native
  
  /**
    * Lists DlpJobs that match the specified filter in the request. See https://cloud.google.com/dlp/docs/inspecting-storage and https://cloud.google.com/dlp/docs/compute-risk-analysis to
    * learn more.
    */
  def list(): Request[GooglePrivacyDlpV2ListDlpJobsResponse] = js.native
  def list(request: Filter): Request[GooglePrivacyDlpV2ListDlpJobsResponse] = js.native
}
