package typingsJapgolly.gapiClientCloudresourcemanager.gapi.client.cloudresourcemanager

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCloudresourcemanager.AnonAlt
import typingsJapgolly.gapiClientCloudresourcemanager.AnonBearertoken
import typingsJapgolly.gapiClientCloudresourcemanager.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiensResource extends js.Object {
  /**
    * Create a Lien which applies to the resource denoted by the `parent` field.
    *
    * Callers of this method will require permission on the `parent` resource.
    * For example, applying to `projects/1234` requires permission
    * `resourcemanager.projects.updateLiens`.
    *
    * NOTE: Some resources may limit the number of Liens which may be applied.
    */
  def create(request: AnonAlt): Request_[Lien]
  /**
    * Delete a Lien by `name`.
    *
    * Callers of this method will require permission on the `parent` resource.
    * For example, a Lien with a `parent` of `projects/1234` requires permission
    * `resourcemanager.projects.updateLiens`.
    */
  def delete(request: AnonBearertoken): Request_[js.Object]
  /**
    * List all Liens applied to the `parent` resource.
    *
    * Callers of this method will require permission on the `parent` resource.
    * For example, a Lien with a `parent` of `projects/1234` requires permission
    * `resourcemanager.projects.get`.
    */
  def list(request: AnonCallback): Request_[ListLiensResponse]
}

object LiensResource {
  @scala.inline
  def apply(
    create: AnonAlt => CallbackTo[Request_[Lien]],
    delete: AnonBearertoken => CallbackTo[Request_[js.Object]],
    list: AnonCallback => CallbackTo[Request_[ListLiensResponse]]
  ): LiensResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudresourcemanager.AnonAlt) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudresourcemanager.AnonBearertoken) => delete(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCloudresourcemanager.AnonCallback) => list(t0).runNow()))
    __obj.asInstanceOf[LiensResource]
  }
}

