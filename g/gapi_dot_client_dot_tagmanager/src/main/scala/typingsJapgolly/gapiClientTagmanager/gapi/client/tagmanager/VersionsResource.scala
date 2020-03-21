package typingsJapgolly.gapiClientTagmanager.gapi.client.tagmanager

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientTagmanager.AnonAlt
import typingsJapgolly.gapiClientTagmanager.AnonContainerVersionId
import typingsJapgolly.gapiClientTagmanager.AnonFields
import typingsJapgolly.gapiClientTagmanager.AnonFingerprint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionsResource extends js.Object {
  /** Deletes a Container Version. */
  def delete(request: AnonFields): Request_[Unit]
  /** Gets a Container Version. */
  def get(request: AnonContainerVersionId): Request_[ContainerVersion]
  /** Gets the live (i.e. published) container version */
  def live(request: AnonAlt): Request_[ContainerVersion]
  /** Publishes a Container Version. */
  def publish(request: AnonFingerprint): Request_[PublishContainerVersionResponse]
  /** Sets the latest version used for synchronization of workspaces when detecting conflicts and errors. */
  def set_latest(request: AnonFields): Request_[ContainerVersion]
  /** Undeletes a Container Version. */
  def undelete(request: AnonFields): Request_[ContainerVersion]
  /** Updates a Container Version. */
  def update(request: AnonFingerprint): Request_[ContainerVersion]
}

object VersionsResource {
  @scala.inline
  def apply(
    delete: AnonFields => CallbackTo[Request_[Unit]],
    get: AnonContainerVersionId => CallbackTo[Request_[ContainerVersion]],
    live: AnonAlt => CallbackTo[Request_[ContainerVersion]],
    publish: AnonFingerprint => CallbackTo[Request_[PublishContainerVersionResponse]],
    set_latest: AnonFields => CallbackTo[Request_[ContainerVersion]],
    undelete: AnonFields => CallbackTo[Request_[ContainerVersion]],
    update: AnonFingerprint => CallbackTo[Request_[ContainerVersion]]
  ): VersionsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonFields) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonContainerVersionId) => get(t0).runNow()))
    __obj.updateDynamic("live")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonAlt) => live(t0).runNow()))
    __obj.updateDynamic("publish")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonFingerprint) => publish(t0).runNow()))
    __obj.updateDynamic("set_latest")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonFields) => set_latest(t0).runNow()))
    __obj.updateDynamic("undelete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonFields) => undelete(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonFingerprint) => update(t0).runNow()))
    __obj.asInstanceOf[VersionsResource]
  }
}

