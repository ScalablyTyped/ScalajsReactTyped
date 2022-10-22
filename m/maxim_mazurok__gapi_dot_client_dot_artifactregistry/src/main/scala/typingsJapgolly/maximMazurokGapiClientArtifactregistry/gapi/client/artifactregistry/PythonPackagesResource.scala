package typingsJapgolly.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientArtifactregistry.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientArtifactregistry.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PythonPackagesResource extends StObject {
  
  /** Gets a python package. */
  def get(): Request[PythonPackage] = js.native
  def get(request: Accesstoken): Request[PythonPackage] = js.native
  
  /** Lists python packages. */
  def list(): Request[ListPythonPackagesResponse] = js.native
  def list(request: Oauthtoken): Request[ListPythonPackagesResponse] = js.native
}
