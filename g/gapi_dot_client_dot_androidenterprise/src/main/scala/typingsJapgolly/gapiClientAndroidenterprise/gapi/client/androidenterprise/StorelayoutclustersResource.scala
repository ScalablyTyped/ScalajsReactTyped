package typingsJapgolly.gapiClientAndroidenterprise.gapi.client.androidenterprise

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAndroidenterprise.AnonClusterId
import typingsJapgolly.gapiClientAndroidenterprise.AnonPageId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorelayoutclustersResource extends js.Object {
  /** Deletes a cluster. */
  def delete(request: AnonClusterId): Request_[Unit]
  /** Retrieves details of a cluster. */
  def get(request: AnonClusterId): Request_[StoreCluster]
  /** Inserts a new cluster in a page. */
  def insert(request: AnonPageId): Request_[StoreCluster]
  /** Retrieves the details of all clusters on the specified page. */
  def list(request: AnonPageId): Request_[StoreLayoutClustersListResponse]
  /** Updates a cluster. This method supports patch semantics. */
  def patch(request: AnonClusterId): Request_[StoreCluster]
  /** Updates a cluster. */
  def update(request: AnonClusterId): Request_[StoreCluster]
}

object StorelayoutclustersResource {
  @scala.inline
  def apply(
    delete: AnonClusterId => CallbackTo[Request_[Unit]],
    get: AnonClusterId => CallbackTo[Request_[StoreCluster]],
    insert: AnonPageId => CallbackTo[Request_[StoreCluster]],
    list: AnonPageId => CallbackTo[Request_[StoreLayoutClustersListResponse]],
    patch: AnonClusterId => CallbackTo[Request_[StoreCluster]],
    update: AnonClusterId => CallbackTo[Request_[StoreCluster]]
  ): StorelayoutclustersResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonClusterId) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonClusterId) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonPageId) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonPageId) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonClusterId) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonClusterId) => update(t0).runNow()))
    __obj.asInstanceOf[StorelayoutclustersResource]
  }
}

