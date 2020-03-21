package typingsJapgolly.gapiClientAnalytics.gapi.client.analytics

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAnalytics.AnonCustomDimensionId
import typingsJapgolly.gapiClientAnalytics.AnonIgnoreCustomDataSourceLinks
import typingsJapgolly.gapiClientAnalytics.AnonPrettyPrint
import typingsJapgolly.gapiClientAnalytics.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomDimensionsResource extends js.Object {
  /** Get a custom dimension to which the user has access. */
  def get(request: AnonCustomDimensionId): Request_[CustomDimension]
  /** Create a new custom dimension. */
  def insert(request: AnonQuotaUser): Request_[CustomDimension]
  /** Lists custom dimensions to which the user has access. */
  def list(request: AnonPrettyPrint): Request_[CustomDimensions]
  /** Updates an existing custom dimension. This method supports patch semantics. */
  def patch(request: AnonIgnoreCustomDataSourceLinks): Request_[CustomDimension]
  /** Updates an existing custom dimension. */
  def update(request: AnonIgnoreCustomDataSourceLinks): Request_[CustomDimension]
}

object CustomDimensionsResource {
  @scala.inline
  def apply(
    get: AnonCustomDimensionId => CallbackTo[Request_[CustomDimension]],
    insert: AnonQuotaUser => CallbackTo[Request_[CustomDimension]],
    list: AnonPrettyPrint => CallbackTo[Request_[CustomDimensions]],
    patch: AnonIgnoreCustomDataSourceLinks => CallbackTo[Request_[CustomDimension]],
    update: AnonIgnoreCustomDataSourceLinks => CallbackTo[Request_[CustomDimension]]
  ): CustomDimensionsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonCustomDimensionId) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonQuotaUser) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonPrettyPrint) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonIgnoreCustomDataSourceLinks) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAnalytics.AnonIgnoreCustomDataSourceLinks) => update(t0).runNow()))
    __obj.asInstanceOf[CustomDimensionsResource]
  }
}

