package typingsJapgolly.gapiClientDrive.gapi.client.drive

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDrive.AnonAcknowledgeAbuse
import typingsJapgolly.gapiClientDrive.AnonAddParents
import typingsJapgolly.gapiClientDrive.AnonAlt
import typingsJapgolly.gapiClientDrive.AnonCorpora
import typingsJapgolly.gapiClientDrive.AnonCount
import typingsJapgolly.gapiClientDrive.AnonIgnoreDefaultVisibility
import typingsJapgolly.gapiClientDrive.AnonKeepRevisionForever
import typingsJapgolly.gapiClientDrive.AnonOauthtoken
import typingsJapgolly.gapiClientDrive.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilesResource extends js.Object {
  /** Creates a copy of a file and applies any requested updates with patch semantics. */
  def copy(request: AnonIgnoreDefaultVisibility): Request_[File]
  /** Creates a new file. */
  def create(request: AnonKeepRevisionForever): Request_[File]
  /**
    * Permanently deletes a file owned by the user without moving it to the trash. If the file belongs to a Team Drive the user must be an organizer on the
    * parent. If the target is a folder, all descendants owned by the user are also deleted.
    */
  def delete(request: AnonOauthtoken): Request_[Unit]
  /** Permanently deletes all of the user's trashed files. */
  def emptyTrash(request: AnonAlt): Request_[Unit]
  /** Exports a Google Doc to the requested MIME type and returns the exported content. Please note that the exported content is limited to 10MB. */
  def export(request: AnonPrettyPrint): Request_[Unit]
  /** Generates a set of file IDs which can be provided in create requests. */
  def generateIds(request: AnonCount): Request_[GeneratedIds]
  /** Gets a file's metadata or content by ID. */
  def get(request: AnonAcknowledgeAbuse): Request_[File]
  /** Lists or searches files. */
  def list(request: AnonCorpora): Request_[FileList]
  /** Updates a file's metadata and/or content with patch semantics. */
  def update(request: AnonAddParents): Request_[File]
  /** Subscribes to changes to a file */
  def watch(request: AnonAcknowledgeAbuse): Request_[Channel]
}

object FilesResource {
  @scala.inline
  def apply(
    copy: AnonIgnoreDefaultVisibility => CallbackTo[Request_[File]],
    create: AnonKeepRevisionForever => CallbackTo[Request_[File]],
    delete: AnonOauthtoken => CallbackTo[Request_[Unit]],
    emptyTrash: AnonAlt => CallbackTo[Request_[Unit]],
    export: AnonPrettyPrint => CallbackTo[Request_[Unit]],
    generateIds: AnonCount => CallbackTo[Request_[GeneratedIds]],
    get: AnonAcknowledgeAbuse => CallbackTo[Request_[File]],
    list: AnonCorpora => CallbackTo[Request_[FileList]],
    update: AnonAddParents => CallbackTo[Request_[File]],
    watch: AnonAcknowledgeAbuse => CallbackTo[Request_[Channel]]
  ): FilesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("copy")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDrive.AnonIgnoreDefaultVisibility) => copy(t0).runNow()))
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDrive.AnonKeepRevisionForever) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDrive.AnonOauthtoken) => delete(t0).runNow()))
    __obj.updateDynamic("emptyTrash")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDrive.AnonAlt) => emptyTrash(t0).runNow()))
    __obj.updateDynamic("export")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDrive.AnonPrettyPrint) => export(t0).runNow()))
    __obj.updateDynamic("generateIds")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDrive.AnonCount) => generateIds(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDrive.AnonAcknowledgeAbuse) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDrive.AnonCorpora) => list(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDrive.AnonAddParents) => update(t0).runNow()))
    __obj.updateDynamic("watch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDrive.AnonAcknowledgeAbuse) => watch(t0).runNow()))
    __obj.asInstanceOf[FilesResource]
  }
}

