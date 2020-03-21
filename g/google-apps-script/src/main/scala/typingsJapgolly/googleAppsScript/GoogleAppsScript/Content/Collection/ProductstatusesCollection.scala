package typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Collection

import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.ProductStatus
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.ProductstatusesCustomBatchRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.ProductstatusesCustomBatchResponse
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Content.Schema.ProductstatusesListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductstatusesCollection extends js.Object {
  // Gets the statuses of multiple products in a single request.
  def custombatch(resource: ProductstatusesCustomBatchRequest): ProductstatusesCustomBatchResponse = js.native
  // Gets the statuses of multiple products in a single request.
  def custombatch(resource: ProductstatusesCustomBatchRequest, optionalArgs: js.Object): ProductstatusesCustomBatchResponse = js.native
  // Gets the status of a product from your Merchant Center account.
  def get(merchantId: String, productId: String): ProductStatus = js.native
  // Gets the status of a product from your Merchant Center account.
  def get(merchantId: String, productId: String, optionalArgs: js.Object): ProductStatus = js.native
  // Lists the statuses of the products in your Merchant Center account.
  def list(merchantId: String): ProductstatusesListResponse = js.native
  // Lists the statuses of the products in your Merchant Center account.
  def list(merchantId: String, optionalArgs: js.Object): ProductstatusesListResponse = js.native
}

