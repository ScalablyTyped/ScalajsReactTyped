package typingsJapgolly.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The status of a product, i.e., information about a product computed
  * asynchronously.
  */
@js.native
trait SchemaProductStatus extends js.Object {
  /**
    * Date on which the item has been created, in ISO 8601 format.
    */
  var creationDate: js.UndefOr[String] = js.native
  /**
    * DEPRECATED - never populated
    */
  var dataQualityIssues: js.UndefOr[js.Array[SchemaProductStatusDataQualityIssue]] = js.native
  /**
    * The intended destinations for the product.
    */
  var destinationStatuses: js.UndefOr[js.Array[SchemaProductStatusDestinationStatus]] = js.native
  /**
    * Date on which the item expires in Google Shopping, in ISO 8601 format.
    */
  var googleExpirationDate: js.UndefOr[String] = js.native
  /**
    * A list of all issues associated with the product.
    */
  var itemLevelIssues: js.UndefOr[js.Array[SchemaProductStatusItemLevelIssue]] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#productStatus&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Date on which the item has been last updated, in ISO 8601 format.
    */
  var lastUpdateDate: js.UndefOr[String] = js.native
  /**
    * The link to the product.
    */
  var link: js.UndefOr[String] = js.native
  /**
    * Product data after applying all the join inputs.
    */
  var product: js.UndefOr[SchemaProduct] = js.native
  /**
    * The ID of the product for which status is reported.
    */
  var productId: js.UndefOr[String] = js.native
  /**
    * The title of the product.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaProductStatus {
  @scala.inline
  def apply(
    creationDate: String = null,
    dataQualityIssues: js.Array[SchemaProductStatusDataQualityIssue] = null,
    destinationStatuses: js.Array[SchemaProductStatusDestinationStatus] = null,
    googleExpirationDate: String = null,
    itemLevelIssues: js.Array[SchemaProductStatusItemLevelIssue] = null,
    kind: String = null,
    lastUpdateDate: String = null,
    link: String = null,
    product: SchemaProduct = null,
    productId: String = null,
    title: String = null
  ): SchemaProductStatus = {
    val __obj = js.Dynamic.literal()
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (dataQualityIssues != null) __obj.updateDynamic("dataQualityIssues")(dataQualityIssues.asInstanceOf[js.Any])
    if (destinationStatuses != null) __obj.updateDynamic("destinationStatuses")(destinationStatuses.asInstanceOf[js.Any])
    if (googleExpirationDate != null) __obj.updateDynamic("googleExpirationDate")(googleExpirationDate.asInstanceOf[js.Any])
    if (itemLevelIssues != null) __obj.updateDynamic("itemLevelIssues")(itemLevelIssues.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lastUpdateDate != null) __obj.updateDynamic("lastUpdateDate")(lastUpdateDate.asInstanceOf[js.Any])
    if (link != null) __obj.updateDynamic("link")(link.asInstanceOf[js.Any])
    if (product != null) __obj.updateDynamic("product")(product.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProductStatus]
  }
}

