package typingsJapgolly.awsSdk.marketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEntitiesRequest extends js.Object {
  /**
    * The catalog related to the request. Fixed value: AWSMarketplace 
    */
  var Catalog: typingsJapgolly.awsSdk.marketplacecatalogMod.Catalog = js.native
  /**
    * The type of entities to retrieve.
    */
  var EntityType: typingsJapgolly.awsSdk.marketplacecatalogMod.EntityType = js.native
  /**
    * An array of filter objects. Each filter object contains two attributes, filterName and filterValues.
    */
  var FilterList: js.UndefOr[typingsJapgolly.awsSdk.marketplacecatalogMod.FilterList] = js.native
  /**
    * Specifies the upper limit of the elements on a single page. If a value isn't provided, the default value is 20.
    */
  var MaxResults: js.UndefOr[MaxResultInteger] = js.native
  /**
    * The value of the next token, if it exists. Null if there are no more results.
    */
  var NextToken: js.UndefOr[typingsJapgolly.awsSdk.marketplacecatalogMod.NextToken] = js.native
  /**
    * An object that contains two attributes, sortBy and sortOrder.
    */
  var Sort: js.UndefOr[typingsJapgolly.awsSdk.marketplacecatalogMod.Sort] = js.native
}

object ListEntitiesRequest {
  @scala.inline
  def apply(
    Catalog: Catalog,
    EntityType: EntityType,
    FilterList: FilterList = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null,
    Sort: Sort = null
  ): ListEntitiesRequest = {
    val __obj = js.Dynamic.literal(Catalog = Catalog.asInstanceOf[js.Any], EntityType = EntityType.asInstanceOf[js.Any])
    if (FilterList != null) __obj.updateDynamic("FilterList")(FilterList.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Sort != null) __obj.updateDynamic("Sort")(Sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEntitiesRequest]
  }
}

