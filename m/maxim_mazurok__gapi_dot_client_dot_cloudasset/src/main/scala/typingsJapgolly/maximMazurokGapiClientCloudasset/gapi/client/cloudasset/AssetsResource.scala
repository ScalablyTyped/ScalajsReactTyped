package typingsJapgolly.maximMazurokGapiClientCloudasset.gapi.client.cloudasset

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientCloudasset.anon.Accesstoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetsResource extends StObject {
  
  /** Lists assets with time and resource types and returns paged results in response. */
  def list(): Request[ListAssetsResponse] = js.native
  def list(request: Accesstoken): Request[ListAssetsResponse] = js.native
}
