package typingsJapgolly.maximMazurokGapiClientArea120tables.gapi.client.area120tables

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientArea120tables.anon.Name
import typingsJapgolly.maximMazurokGapiClientArea120tables.anon.PageSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspacesResource extends StObject {
  
  /** Gets a workspace. Returns NOT_FOUND if the workspace does not exist. */
  def get(): Request[Workspace] = js.native
  def get(request: Name): Request[Workspace] = js.native
  
  /** Lists workspaces for the user. */
  def list(): Request[ListWorkspacesResponse] = js.native
  def list(request: PageSize): Request[ListWorkspacesResponse] = js.native
}
