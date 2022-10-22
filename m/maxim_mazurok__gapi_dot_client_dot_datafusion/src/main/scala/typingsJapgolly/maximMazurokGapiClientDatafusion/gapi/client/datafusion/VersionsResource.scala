package typingsJapgolly.maximMazurokGapiClientDatafusion.gapi.client.datafusion

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDatafusion.anon.LatestPatchOnly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VersionsResource extends StObject {
  
  /** Lists possible versions for Data Fusion instances in the specified project and location. */
  def list(): Request[ListAvailableVersionsResponse] = js.native
  def list(request: LatestPatchOnly): Request[ListAvailableVersionsResponse] = js.native
}
