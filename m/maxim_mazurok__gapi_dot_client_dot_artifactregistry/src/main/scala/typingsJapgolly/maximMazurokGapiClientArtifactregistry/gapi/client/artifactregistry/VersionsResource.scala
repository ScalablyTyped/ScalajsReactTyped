package typingsJapgolly.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientArtifactregistry.anon.Force
import typingsJapgolly.maximMazurokGapiClientArtifactregistry.anon.OrderBy
import typingsJapgolly.maximMazurokGapiClientArtifactregistry.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VersionsResource extends StObject {
  
  /** Deletes a version and all of its content. The returned operation will complete once the version has been deleted. */
  def delete(): Request[Operation] = js.native
  def delete(request: Force): Request[Operation] = js.native
  
  /** Gets a version */
  def get(): Request[Version] = js.native
  def get(request: UploadType): Request[Version] = js.native
  
  /** Lists versions. */
  def list(): Request[ListVersionsResponse] = js.native
  def list(request: OrderBy): Request[ListVersionsResponse] = js.native
}
