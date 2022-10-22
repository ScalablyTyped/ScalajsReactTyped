package typingsJapgolly.maximMazurokGapiClientYoutube.gapi.client.youtube

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientYoutube.anon.CallbackFields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoAbuseReportReasonsResource extends StObject {
  
  /** Retrieves a list of resources, possibly filtered. */
  def list(): Request[VideoAbuseReportReasonListResponse] = js.native
  def list(request: CallbackFields): Request[VideoAbuseReportReasonListResponse] = js.native
}
