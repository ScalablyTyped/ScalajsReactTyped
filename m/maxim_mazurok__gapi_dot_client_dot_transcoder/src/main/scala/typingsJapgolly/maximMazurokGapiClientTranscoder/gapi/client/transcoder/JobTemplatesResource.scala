package typingsJapgolly.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientTranscoder.anon.AllowMissing
import typingsJapgolly.maximMazurokGapiClientTranscoder.anon.Callback
import typingsJapgolly.maximMazurokGapiClientTranscoder.anon.Fields
import typingsJapgolly.maximMazurokGapiClientTranscoder.anon.JobTemplateId
import typingsJapgolly.maximMazurokGapiClientTranscoder.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobTemplatesResource extends StObject {
  
  /** Creates a job template in the specified region. */
  def create(request: JobTemplateId): Request[JobTemplate] = js.native
  def create(request: Key, body: JobTemplate): Request[JobTemplate] = js.native
  
  /** Deletes a job template. */
  def delete(): Request[js.Object] = js.native
  def delete(request: AllowMissing): Request[js.Object] = js.native
  
  /** Returns the job template data. */
  def get(): Request[JobTemplate] = js.native
  def get(request: Callback): Request[JobTemplate] = js.native
  
  /** Lists job templates in the specified region. */
  def list(): Request[ListJobTemplatesResponse] = js.native
  def list(request: Fields): Request[ListJobTemplatesResponse] = js.native
}
