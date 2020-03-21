package typingsJapgolly.gapiClientTagmanager.gapi.client.tagmanager

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientTagmanager.AnonAlt
import typingsJapgolly.gapiClientTagmanager.AnonFields
import typingsJapgolly.gapiClientTagmanager.AnonFingerprint
import typingsJapgolly.gapiClientTagmanager.AnonKey
import typingsJapgolly.gapiClientTagmanager.AnonPageToken
import typingsJapgolly.gapiClientTagmanager.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldersResource extends js.Object {
  /** Creates a GTM Folder. */
  def create(request: AnonAlt): Request_[Folder]
  /** Deletes a GTM Folder. */
  def delete(request: AnonFields): Request_[Unit]
  /** List all entities in a GTM Folder. */
  def entities(request: AnonPageToken): Request_[FolderEntities]
  /** Gets a GTM Folder. */
  def get(request: AnonFields): Request_[Folder]
  /** Lists all GTM Folders of a Container. */
  def list(request: AnonKey): Request_[ListFoldersResponse]
  /** Moves entities to a GTM Folder. */
  def move_entities_to_folder(request: AnonPrettyPrint): Request_[Unit]
  /** Reverts changes to a GTM Folder in a GTM Workspace. */
  def revert(request: AnonFingerprint): Request_[RevertFolderResponse]
  /** Updates a GTM Folder. */
  def update(request: AnonFingerprint): Request_[Folder]
}

object FoldersResource {
  @scala.inline
  def apply(
    create: AnonAlt => CallbackTo[Request_[Folder]],
    delete: AnonFields => CallbackTo[Request_[Unit]],
    entities: AnonPageToken => CallbackTo[Request_[FolderEntities]],
    get: AnonFields => CallbackTo[Request_[Folder]],
    list: AnonKey => CallbackTo[Request_[ListFoldersResponse]],
    move_entities_to_folder: AnonPrettyPrint => CallbackTo[Request_[Unit]],
    revert: AnonFingerprint => CallbackTo[Request_[RevertFolderResponse]],
    update: AnonFingerprint => CallbackTo[Request_[Folder]]
  ): FoldersResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonAlt) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonFields) => delete(t0).runNow()))
    __obj.updateDynamic("entities")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonPageToken) => entities(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonKey) => list(t0).runNow()))
    __obj.updateDynamic("move_entities_to_folder")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonPrettyPrint) => move_entities_to_folder(t0).runNow()))
    __obj.updateDynamic("revert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonFingerprint) => revert(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonFingerprint) => update(t0).runNow()))
    __obj.asInstanceOf[FoldersResource]
  }
}

