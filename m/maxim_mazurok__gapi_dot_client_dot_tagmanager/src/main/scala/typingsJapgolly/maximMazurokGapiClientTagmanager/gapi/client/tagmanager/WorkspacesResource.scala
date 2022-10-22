package typingsJapgolly.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import typingsJapgolly.gapiClient.gapi.client.Request
import typingsJapgolly.maximMazurokGapiClientTagmanager.anon.Alt
import typingsJapgolly.maximMazurokGapiClientTagmanager.anon.Callback
import typingsJapgolly.maximMazurokGapiClientTagmanager.anon.Fields
import typingsJapgolly.maximMazurokGapiClientTagmanager.anon.Oauthtoken
import typingsJapgolly.maximMazurokGapiClientTagmanager.anon.ParentPrettyPrint
import typingsJapgolly.maximMazurokGapiClientTagmanager.anon.PrettyPrintQuotaUser
import typingsJapgolly.maximMazurokGapiClientTagmanager.anon.QuotaUserResource
import typingsJapgolly.maximMazurokGapiClientTagmanager.anon.ResourceUploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspacesResource extends StObject {
  
  var built_in_variables: BuiltInVariablesResource = js.native
  
  var clients: ClientsResource = js.native
  
  def create(request: Alt, body: Workspace): Request[Workspace] = js.native
  /** Creates a Workspace. */
  def create(request: ParentPrettyPrint): Request[Workspace] = js.native
  
  def create_version(request: Callback, body: CreateContainerVersionRequestVersionOptions): Request[CreateContainerVersionResponse] = js.native
  /** Creates a Container Version from the entities present in the workspace, deletes the workspace, and sets the base container version to the newly created version. */
  def create_version(request: PrettyPrintQuotaUser): Request[CreateContainerVersionResponse] = js.native
  
  /** Deletes a Workspace. */
  def delete(): Request[Unit] = js.native
  def delete(request: Callback): Request[Unit] = js.native
  
  var folders: FoldersResource = js.native
  
  /** Gets a Workspace. */
  def get(): Request[Workspace] = js.native
  def get(request: Callback): Request[Workspace] = js.native
  
  /** Finds conflicting and modified entities in the workspace. */
  def getStatus(): Request[GetWorkspaceStatusResponse] = js.native
  def getStatus(request: Callback): Request[GetWorkspaceStatusResponse] = js.native
  
  /** Lists all Workspaces that belong to a GTM Container. */
  def list(): Request[ListWorkspacesResponse] = js.native
  def list(request: Fields): Request[ListWorkspacesResponse] = js.native
  
  /** Quick previews a workspace by creating a fake container version from all entities in the provided workspace. */
  def quick_preview(): Request[QuickPreviewResponse] = js.native
  def quick_preview(request: Callback): Request[QuickPreviewResponse] = js.native
  
  def resolve_conflict(request: Oauthtoken, body: Entity): Request[Unit] = js.native
  /** Resolves a merge conflict for a workspace entity by updating it to the resolved entity passed in the request. */
  def resolve_conflict(request: QuotaUserResource): Request[Unit] = js.native
  
  /** Syncs a workspace to the latest container version by updating all unmodified workspace entities and displaying conflicts for modified entities. */
  def sync(): Request[SyncWorkspaceResponse] = js.native
  def sync(request: Callback): Request[SyncWorkspaceResponse] = js.native
  
  var tags: TagsResource = js.native
  
  var templates: TemplatesResource = js.native
  
  var triggers: TriggersResource = js.native
  
  def update(request: Oauthtoken, body: Workspace): Request[Workspace] = js.native
  /** Updates a Workspace. */
  def update(request: ResourceUploadType): Request[Workspace] = js.native
  
  var variables: VariablesResource = js.native
  
  var zones: ZonesResource = js.native
}
