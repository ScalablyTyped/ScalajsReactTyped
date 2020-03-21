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

trait ContainersResource extends js.Object {
  var environments: EnvironmentsResource
  var version_headers: VersionHeadersResource
  var versions: VersionsResource
  var workspaces: WorkspacesResource
  /** Creates a Container. */
  def create(request: AnonAlt): Request_[Container]
  /** Deletes a Container. */
  def delete(request: AnonFields): Request_[Unit]
  /** Gets a Container. */
  def get(request: AnonFields): Request_[Container]
  /** Lists all Containers that belongs to a GTM Account. */
  def list(request: AnonKey): Request_[ListContainersResponse]
  /** Updates a Container. */
  def update(request: AnonFingerprint): Request_[Container]
}

object ContainersResource {
  @scala.inline
  def apply(
    create: AnonAlt => CallbackTo[Request_[Container]],
    delete: AnonFields => CallbackTo[Request_[Unit]],
    environments: EnvironmentsResource,
    get: AnonFields => CallbackTo[Request_[Container]],
    list: AnonKey => CallbackTo[Request_[ListContainersResponse]],
    update: AnonFingerprint => CallbackTo[Request_[Container]],
    version_headers: VersionHeadersResource,
    versions: VersionsResource,
    workspaces: WorkspacesResource
  ): ContainersResource = {
    val __obj = js.Dynamic.literal(environments = environments.asInstanceOf[js.Any], version_headers = version_headers.asInstanceOf[js.Any], versions = versions.asInstanceOf[js.Any], workspaces = workspaces.asInstanceOf[js.Any])
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonAlt) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonFields) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonKey) => list(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonFingerprint) => update(t0).runNow()))
    __obj.asInstanceOf[ContainersResource]
  }
}

