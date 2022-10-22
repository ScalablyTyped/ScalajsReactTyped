package typingsJapgolly.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientArtifactregistry.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientArtifactregistry.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NpmPackagesResource extends StObject {
  
  /** Gets a npm package. */
  def get(): Request[NpmPackage] = js.native
  def get(request: Accesstoken): Request[NpmPackage] = js.native
  
  /** Lists npm packages. */
  def list(): Request[ListNpmPackagesResponse] = js.native
  def list(request: Oauthtoken): Request[ListNpmPackagesResponse] = js.native
}
