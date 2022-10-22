package typingsJapgolly.maximMazurokGapiClientArtifactregistry.gapi.client.artifactregistry

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientArtifactregistry.anon.Accesstoken
import typingsJapgolly.maximMazurokGapiClientArtifactregistry.anon.AltCallback
import typingsJapgolly.maximMazurokGapiClientArtifactregistry.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectsResource extends StObject {
  
  /** Retrieves the Settings for the Project. */
  def getProjectSettings(): Request[ProjectSettings] = js.native
  def getProjectSettings(request: Accesstoken): Request[ProjectSettings] = js.native
  
  var locations: LocationsResource = js.native
  
  /** Updates the Settings for the Project. */
  def updateProjectSettings(request: AltCallback): Request[ProjectSettings] = js.native
  def updateProjectSettings(request: QuotaUser, body: ProjectSettings): Request[ProjectSettings] = js.native
}
