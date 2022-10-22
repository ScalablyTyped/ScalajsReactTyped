package typingsJapgolly.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientArtifactregistry.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientArtifactregistry.anon.Filter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilesResource extends StObject {
  
  /** Gets a file. */
  def get(): Request[GoogleDevtoolsArtifactregistryV1File] = js.native
  def get(request: Accesstoken): Request[GoogleDevtoolsArtifactregistryV1File] = js.native
  
  /** Lists files. */
  def list(): Request[ListFilesResponse] = js.native
  def list(request: Filter): Request[ListFilesResponse] = js.native
}
