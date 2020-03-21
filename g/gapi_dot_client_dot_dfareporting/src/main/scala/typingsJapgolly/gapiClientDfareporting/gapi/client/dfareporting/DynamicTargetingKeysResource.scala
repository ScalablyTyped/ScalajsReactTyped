package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDfareporting.AnonKey
import typingsJapgolly.gapiClientDfareporting.AnonName
import typingsJapgolly.gapiClientDfareporting.AnonNames
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicTargetingKeysResource extends js.Object {
  /** Deletes an existing dynamic targeting key. */
  def delete(request: AnonName): Request_[Unit]
  /**
    * Inserts a new dynamic targeting key. Keys must be created at the advertiser level before being assigned to the advertiser's ads, creatives, or
    * placements. There is a maximum of 1000 keys per advertiser, out of which a maximum of 20 keys can be assigned per ad, creative, or placement.
    */
  def insert(request: AnonKey): Request_[DynamicTargetingKey]
  /** Retrieves a list of dynamic targeting keys. */
  def list(request: AnonNames): Request_[DynamicTargetingKeysListResponse]
}

object DynamicTargetingKeysResource {
  @scala.inline
  def apply(
    delete: AnonName => CallbackTo[Request_[Unit]],
    insert: AnonKey => CallbackTo[Request_[DynamicTargetingKey]],
    list: AnonNames => CallbackTo[Request_[DynamicTargetingKeysListResponse]]
  ): DynamicTargetingKeysResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonName) => delete(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonKey) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDfareporting.AnonNames) => list(t0).runNow()))
    __obj.asInstanceOf[DynamicTargetingKeysResource]
  }
}

