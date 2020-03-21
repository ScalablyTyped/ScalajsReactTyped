package typingsJapgolly.awsSdk.marketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListChangeSetsRequest extends js.Object {
  /**
    * The catalog related to the request. Fixed value: AWSMarketplace 
    */
  var Catalog: typingsJapgolly.awsSdk.marketplacecatalogMod.Catalog = js.native
  /**
    * An array of filter objects.
    */
  var FilterList: js.UndefOr[typingsJapgolly.awsSdk.marketplacecatalogMod.FilterList] = js.native
  /**
    * The maximum number of results returned by a single call. This value must be provided in the next call to retrieve the next set of results. By default, this value is 20.
    */
  var MaxResults: js.UndefOr[MaxResultInteger] = js.native
  /**
    * The token value retrieved from a previous call to access the next page of results.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.marketplacecatalogMod.NextToken] = js.native
  /**
    * An object that contains two attributes, sortBy and sortOrder.
    */
  var Sort: js.UndefOr[typingsJapgolly.awsSdk.marketplacecatalogMod.Sort] = js.native
}

object ListChangeSetsRequest {
  @scala.inline
  def apply(
    Catalog: Catalog,
    FilterList: FilterList = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null,
    Sort: Sort = null
  ): ListChangeSetsRequest = {
    val __obj = js.Dynamic.literal(Catalog = Catalog.asInstanceOf[js.Any])
    if (FilterList != null) __obj.updateDynamic("FilterList")(FilterList.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Sort != null) __obj.updateDynamic("Sort")(Sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChangeSetsRequest]
  }
}

