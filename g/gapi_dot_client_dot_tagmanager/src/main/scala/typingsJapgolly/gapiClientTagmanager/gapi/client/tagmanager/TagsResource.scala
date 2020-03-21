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

trait TagsResource extends js.Object {
  /** Creates a GTM Tag. */
  def create(request: AnonAlt): Request_[Tag]
  /** Deletes a GTM Tag. */
  def delete(request: AnonFields): Request_[Unit]
  /** Gets a GTM Tag. */
  def get(request: AnonFields): Request_[Tag]
  /** Lists all GTM Tags of a Container. */
  def list(request: AnonKey): Request_[ListTagsResponse]
  /** Reverts changes to a GTM Tag in a GTM Workspace. */
  def revert(request: AnonFingerprint): Request_[RevertTagResponse]
  /** Updates a GTM Tag. */
  def update(request: AnonFingerprint): Request_[Tag]
}

object TagsResource {
  @scala.inline
  def apply(
    create: AnonAlt => CallbackTo[Request_[Tag]],
    delete: AnonFields => CallbackTo[Request_[Unit]],
    get: AnonFields => CallbackTo[Request_[Tag]],
    list: AnonKey => CallbackTo[Request_[ListTagsResponse]],
    revert: AnonFingerprint => CallbackTo[Request_[RevertTagResponse]],
    update: AnonFingerprint => CallbackTo[Request_[Tag]]
  ): TagsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonAlt) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonFields) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonFields) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonKey) => list(t0).runNow()))
    __obj.updateDynamic("revert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonFingerprint) => revert(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientTagmanager.AnonFingerprint) => update(t0).runNow()))
    __obj.asInstanceOf[TagsResource]
  }
}

