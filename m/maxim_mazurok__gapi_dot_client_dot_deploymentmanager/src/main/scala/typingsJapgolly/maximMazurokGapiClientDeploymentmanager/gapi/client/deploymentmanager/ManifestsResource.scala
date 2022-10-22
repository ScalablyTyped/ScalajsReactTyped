package typingsJapgolly.maximMazurokGapiClientDeploymentmanager.gapi.client.deploymentmanager

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientDeploymentmanager.anon.MaxResults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManifestsResource extends StObject {
  
  /** Gets information about a specific manifest. */
  def get(): Request[Manifest] = js.native
  def get(request: typingsJapgolly.maximMazurokGapiClientDeploymentmanager.anon.Manifest): Request[Manifest] = js.native
  
  /** Lists all manifests for a given deployment. */
  def list(): Request[ManifestsListResponse] = js.native
  def list(request: MaxResults): Request[ManifestsListResponse] = js.native
}
