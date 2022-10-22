package typingsJapgolly.maximMazurokGapiClientOsconfig.gapi.client.osconfig

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientOsconfig.anon.Fields
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceDetailsResource extends StObject {
  
  /** Get a list of instance details for a given patch job. */
  def list(): Request[ListPatchJobInstanceDetailsResponse] = js.native
  def list(request: Fields): Request[ListPatchJobInstanceDetailsResponse] = js.native
}
