package typingsJapgolly.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchProvisionedProductsOutput extends js.Object {
  /**
    * The page token to use to retrieve the next set of results. If there are no additional results, this value is null.
    */
  var NextPageToken: js.UndefOr[PageToken] = js.native
  /**
    * Information about the provisioned products.
    */
  var ProvisionedProducts: js.UndefOr[ProvisionedProductAttributes] = js.native
  /**
    * The number of provisioned products found.
    */
  var TotalResultsCount: js.UndefOr[typingsJapgolly.awsSdk.servicecatalogMod.TotalResultsCount] = js.native
}

object SearchProvisionedProductsOutput {
  @scala.inline
  def apply(
    NextPageToken: PageToken = null,
    ProvisionedProducts: ProvisionedProductAttributes = null,
    TotalResultsCount: Int | Double = null
  ): SearchProvisionedProductsOutput = {
    val __obj = js.Dynamic.literal()
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken.asInstanceOf[js.Any])
    if (ProvisionedProducts != null) __obj.updateDynamic("ProvisionedProducts")(ProvisionedProducts.asInstanceOf[js.Any])
    if (TotalResultsCount != null) __obj.updateDynamic("TotalResultsCount")(TotalResultsCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchProvisionedProductsOutput]
  }
}

