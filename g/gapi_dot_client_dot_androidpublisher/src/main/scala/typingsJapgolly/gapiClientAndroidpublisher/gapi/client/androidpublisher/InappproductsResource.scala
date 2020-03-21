package typingsJapgolly.gapiClientAndroidpublisher.gapi.client.androidpublisher

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAndroidpublisher.AnonAutoConvertMissingPrices
import typingsJapgolly.gapiClientAndroidpublisher.AnonPrettyPrint
import typingsJapgolly.gapiClientAndroidpublisher.AnonQuotaUser
import typingsJapgolly.gapiClientAndroidpublisher.AnonSku
import typingsJapgolly.gapiClientAndroidpublisher.AnonStartIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InappproductsResource extends js.Object {
  def batch(request: AnonPrettyPrint): Request_[InappproductsBatchResponse]
  /** Delete an in-app product for an app. */
  def delete(request: AnonQuotaUser): Request_[Unit]
  /** Returns information about the in-app product specified. */
  def get(request: AnonQuotaUser): Request_[InAppProduct]
  /** Creates a new in-app product for an app. */
  def insert(request: AnonAutoConvertMissingPrices): Request_[InAppProduct]
  /** List all the in-app products for an Android app, both subscriptions and managed in-app products.. */
  def list(request: AnonStartIndex): Request_[InappproductsListResponse]
  /** Updates the details of an in-app product. This method supports patch semantics. */
  def patch(request: AnonSku): Request_[InAppProduct]
  /** Updates the details of an in-app product. */
  def update(request: AnonSku): Request_[InAppProduct]
}

object InappproductsResource {
  @scala.inline
  def apply(
    batch: AnonPrettyPrint => CallbackTo[Request_[InappproductsBatchResponse]],
    delete: AnonQuotaUser => CallbackTo[Request_[Unit]],
    get: AnonQuotaUser => CallbackTo[Request_[InAppProduct]],
    insert: AnonAutoConvertMissingPrices => CallbackTo[Request_[InAppProduct]],
    list: AnonStartIndex => CallbackTo[Request_[InappproductsListResponse]],
    patch: AnonSku => CallbackTo[Request_[InAppProduct]],
    update: AnonSku => CallbackTo[Request_[InAppProduct]]
  ): InappproductsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("batch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonPrettyPrint) => batch(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonQuotaUser) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonQuotaUser) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonAutoConvertMissingPrices) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonStartIndex) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonSku) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidpublisher.AnonSku) => update(t0).runNow()))
    __obj.asInstanceOf[InappproductsResource]
  }
}

