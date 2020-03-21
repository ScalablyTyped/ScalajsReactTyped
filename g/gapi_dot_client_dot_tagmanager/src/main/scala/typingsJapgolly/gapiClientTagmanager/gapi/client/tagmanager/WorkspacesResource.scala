package typingsJapgolly.gapiClientTagmanager.gapi.client.tagmanager

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientTagmanager.AnonAlt
import typingsJapgolly.gapiClientTagmanager.AnonFields
import typingsJapgolly.gapiClientTagmanager.AnonFingerprint
import typingsJapgolly.gapiClientTagmanager.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspacesResource extends js.Object {
  var built_in_variables: BuiltInVariablesResource
  var folders: FoldersResource
  var proposal: ProposalResource
  var tags: TagsResource
  var triggers: TriggersResource
  var variables: VariablesResource
  /** Creates a Workspace. */
  def create(request: AnonAlt): Request_[Workspace]
  /**
    * Creates a Container Version from the entities present in the workspace, deletes the workspace, and sets the base container version to the newly created
    * version.
    */
  def create_version(request: AnonFields): Request_[CreateContainerVersionResponse]
  /** Deletes a Workspace. */
  def delete(request: AnonFields): Request_[Unit]
  /** Gets a Workspace. */
  def get(request: AnonFields): Request_[Workspace]
  /** Gets a GTM Workspace Proposal. */
  def getProposal(request: AnonFields): Request_[WorkspaceProposal]
  /** Finds conflicting and modified entities in the workspace. */
  def getStatus(request: AnonFields): Request_[GetWorkspaceStatusResponse]
  /** Lists all Workspaces that belong to a GTM Container. */
  def list(request: AnonKey): Request_[ListWorkspacesResponse]
  /** Quick previews a workspace by creating a fake container version from all entities in the provided workspace. */
  def quick_preview(request: AnonFields): Request_[QuickPreviewResponse]
  /** Resolves a merge conflict for a workspace entity by updating it to the resolved entity passed in the request. */
  def resolve_conflict(request: AnonFingerprint): Request_[Unit]
  /** Syncs a workspace to the latest container version by updating all unmodified workspace entities and displaying conflicts for modified entities. */
  def sync(request: AnonFields): Request_[SyncWorkspaceResponse]
  /** Updates a Workspace. */
  def update(request: AnonFingerprint): Request_[Workspace]
  /** Updates a GTM Workspace Proposal. */
  def updateProposal(request: AnonFields): Request_[WorkspaceProposal]
}

object WorkspacesResource {
  @scala.inline
  def apply(
    built_in_variables: BuiltInVariablesResource,
    create: AnonAlt => CallbackTo[Request_[Workspace]],
    create_version: AnonFields => CallbackTo[Request_[CreateContainerVersionResponse]],
    delete: AnonFields => CallbackTo[Request_[Unit]],
    folders: FoldersResource,
    get: AnonFields => CallbackTo[Request_[Workspace]],
    getProposal: AnonFields => CallbackTo[Request_[WorkspaceProposal]],
    getStatus: AnonFields => CallbackTo[Request_[GetWorkspaceStatusResponse]],
    list: AnonKey => CallbackTo[Request_[ListWorkspacesResponse]],
    proposal: ProposalResource,
    quick_preview: AnonFields => CallbackTo[Request_[QuickPreviewResponse]],
    resolve_conflict: AnonFingerprint => CallbackTo[Request_[Unit]],
    sync: AnonFields => CallbackTo[Request_[SyncWorkspaceResponse]],
    tags: TagsResource,
    triggers: TriggersResource,
    update: AnonFingerprint => CallbackTo[Request_[Workspace]],
    updateProposal: AnonFields => CallbackTo[Request_[WorkspaceProposal]],
    variables: VariablesResource
  ): WorkspacesResource = {
    val __obj = js.Dynamic.literal(built_in_variables = built_in_variables.asInstanceOf[js.Any], folders = folders.asInstanceOf[js.Any], proposal = proposal.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], triggers = triggers.asInstanceOf[js.Any], variables = variables.asInstanceOf[js.Any])
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonAlt) => create(t0).runNow()))
    __obj.updateDynamic("create_version")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonFields) => create_version(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonFields) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("getProposal")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonFields) => getProposal(t0).runNow()))
    __obj.updateDynamic("getStatus")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonFields) => getStatus(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonKey) => list(t0).runNow()))
    __obj.updateDynamic("quick_preview")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonFields) => quick_preview(t0).runNow()))
    __obj.updateDynamic("resolve_conflict")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonFingerprint) => resolve_conflict(t0).runNow()))
    __obj.updateDynamic("sync")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonFields) => sync(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonFingerprint) => update(t0).runNow()))
    __obj.updateDynamic("updateProposal")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonFields) => updateProposal(t0).runNow()))
    __obj.asInstanceOf[WorkspacesResource]
  }
}

