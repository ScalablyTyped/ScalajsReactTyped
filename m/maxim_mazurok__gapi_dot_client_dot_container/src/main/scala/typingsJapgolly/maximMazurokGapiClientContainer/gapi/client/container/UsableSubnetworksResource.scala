package typingsJapgolly.maximMazurokGapiClientContainer.gapi.client.container

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientContainer.anon.Accesstoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsableSubnetworksResource extends StObject {
  
  /** Lists subnetworks that are usable for creating clusters in a project. */
  def list(): Request[ListUsableSubnetworksResponse] = js.native
  def list(request: Accesstoken): Request[ListUsableSubnetworksResponse] = js.native
}
