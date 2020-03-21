package typingsJapgolly.gapiClientAndroidenterprise.gapi.client.androidenterprise

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientAndroidenterprise.AnonApproved
import typingsJapgolly.gapiClientAndroidenterprise.AnonLanguageCode
import typingsJapgolly.gapiClientAndroidenterprise.AnonProductId
import typingsJapgolly.gapiClientAndroidenterprise.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductsResource extends js.Object {
  /**
    * Approves the specified product and the relevant app permissions, if any. The maximum number of products that you can approve per enterprise customer is
    * 1,000.
    *
    * To learn how to use managed Google Play to design and create a store layout to display approved products to your users, see Store Layout Design.
    */
  def approve(request: AnonProductId): Request_[Unit]
  /**
    * Generates a URL that can be rendered in an iframe to display the permissions (if any) of a product. An enterprise admin must view these permissions and
    * accept them on behalf of their organization in order to approve that product.
    *
    * Admins should accept the displayed permissions by interacting with a separate UI element in the EMM console, which in turn should trigger the use of
    * this URL as the approvalUrlInfo.approvalUrl property in a Products.approve call to approve the product. This URL can only be used to display
    * permissions for up to 1 day.
    */
  def generateApprovalUrl(request: AnonLanguageCode): Request_[ProductsGenerateApprovalUrlResponse]
  /** Retrieves details of a product for display to an enterprise admin. */
  def get(request: AnonQuotaUser): Request_[Product]
  /**
    * Retrieves the schema that defines the configurable properties for this product. All products have a schema, but this schema may be empty if no managed
    * configurations have been defined. This schema can be used to populate a UI that allows an admin to configure the product. To apply a managed
    * configuration based on the schema obtained using this API, see Managed Configurations through Play.
    */
  def getAppRestrictionsSchema(request: AnonQuotaUser): Request_[AppRestrictionsSchema]
  /** Retrieves the Android app permissions required by this app. */
  def getPermissions(request: AnonProductId): Request_[ProductPermissions]
  /** Finds approved products that match a query, or all approved products if there is no query. */
  def list(request: AnonApproved): Request_[ProductsListResponse]
  /** Unapproves the specified product (and the relevant app permissions, if any) */
  def unapprove(request: AnonProductId): Request_[Unit]
}

object ProductsResource {
  @scala.inline
  def apply(
    approve: AnonProductId => CallbackTo[Request_[Unit]],
    generateApprovalUrl: AnonLanguageCode => CallbackTo[Request_[ProductsGenerateApprovalUrlResponse]],
    get: AnonQuotaUser => CallbackTo[Request_[Product]],
    getAppRestrictionsSchema: AnonQuotaUser => CallbackTo[Request_[AppRestrictionsSchema]],
    getPermissions: AnonProductId => CallbackTo[Request_[ProductPermissions]],
    list: AnonApproved => CallbackTo[Request_[ProductsListResponse]],
    unapprove: AnonProductId => CallbackTo[Request_[Unit]]
  ): ProductsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("approve")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonProductId) => approve(t0).runNow()))
    __obj.updateDynamic("generateApprovalUrl")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonLanguageCode) => generateApprovalUrl(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonQuotaUser) => get(t0).runNow()))
    __obj.updateDynamic("getAppRestrictionsSchema")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonQuotaUser) => getAppRestrictionsSchema(t0).runNow()))
    __obj.updateDynamic("getPermissions")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonProductId) => getPermissions(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonApproved) => list(t0).runNow()))
    __obj.updateDynamic("unapprove")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientAndroidenterprise.AnonProductId) => unapprove(t0).runNow()))
    __obj.asInstanceOf[ProductsResource]
  }
}

