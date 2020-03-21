package typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Collection

import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.InventoryCustomBatchRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.InventoryCustomBatchResponse
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.InventorySetRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.InventorySetResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InventoryCollection extends js.Object {
  // Updates price and availability for multiple products or stores in a single request. This operation does not update the expiration date of the products.
  def custombatch(resource: InventoryCustomBatchRequest): InventoryCustomBatchResponse = js.native
  // Updates price and availability for multiple products or stores in a single request. This operation does not update the expiration date of the products.
  def custombatch(resource: InventoryCustomBatchRequest, optionalArgs: js.Object): InventoryCustomBatchResponse = js.native
  // Updates price and availability of a product in your Merchant Center account.
  def set(resource: InventorySetRequest, merchantId: String, storeCode: String, productId: String): InventorySetResponse = js.native
  // Updates price and availability of a product in your Merchant Center account.
  def set(
    resource: InventorySetRequest,
    merchantId: String,
    storeCode: String,
    productId: String,
    optionalArgs: js.Object
  ): InventorySetResponse = js.native
}

