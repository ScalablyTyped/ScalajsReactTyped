package typingsJapgolly.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientTranscoder.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientTranscoder.anon.AllowMissing
import typingsJapgolly.maximMazurokGapiClientTranscoder.anon.Alt
import typingsJapgolly.maximMazurokGapiClientTranscoder.anon.Callback
import typingsJapgolly.maximMazurokGapiClientTranscoder.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobsResource extends StObject {
  
  /** Creates a job in the specified region. */
  def create(request: Accesstoken): Request[Job] = js.native
  def create(request: Alt, body: Job): Request[Job] = js.native
  
  /** Deletes a job. */
  def delete(): Request[js.Object] = js.native
  def delete(request: AllowMissing): Request[js.Object] = js.native
  
  /** Returns the job data. */
  def get(): Request[Job] = js.native
  def get(request: Callback): Request[Job] = js.native
  
  /** Lists jobs in the specified region. */
  def list(): Request[ListJobsResponse] = js.native
  def list(request: Fields): Request[ListJobsResponse] = js.native
}
