package typingsJapgolly.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchProductsAsAdminInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typingsJapgolly.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  /**
    * The search filters. If no search filters are specified, the output includes all products to which the administrator has access.
    */
  var Filters: js.UndefOr[ProductViewFilters] = js.native
  /**
    * The maximum number of items to return with this call.
    */
  var PageSize: js.UndefOr[typingsJapgolly.awsSdk.servicecatalogMod.PageSize] = js.native
  /**
    * The page token for the next set of results. To retrieve the first set of results, use null.
    */
  var PageToken: js.UndefOr[typingsJapgolly.awsSdk.servicecatalogMod.PageToken] = js.native
  /**
    * The portfolio identifier.
    */
  var PortfolioId: js.UndefOr[Id] = js.native
  /**
    * Access level of the source of the product.
    */
  var ProductSource: js.UndefOr[typingsJapgolly.awsSdk.servicecatalogMod.ProductSource] = js.native
  /**
    * The sort field. If no value is specified, the results are not sorted.
    */
  var SortBy: js.UndefOr[ProductViewSortBy] = js.native
  /**
    * The sort order. If no value is specified, the results are not sorted.
    */
  var SortOrder: js.UndefOr[typingsJapgolly.awsSdk.servicecatalogMod.SortOrder] = js.native
}

object SearchProductsAsAdminInput {
  @scala.inline
  def apply(
    AcceptLanguage: AcceptLanguage = null,
    Filters: ProductViewFilters = null,
    PageSize: Int | Double = null,
    PageToken: PageToken = null,
    PortfolioId: Id = null,
    ProductSource: ProductSource = null,
    SortBy: ProductViewSortBy = null,
    SortOrder: SortOrder = null
  ): SearchProductsAsAdminInput = {
    val __obj = js.Dynamic.literal()
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (PageSize != null) __obj.updateDynamic("PageSize")(PageSize.asInstanceOf[js.Any])
    if (PageToken != null) __obj.updateDynamic("PageToken")(PageToken.asInstanceOf[js.Any])
    if (PortfolioId != null) __obj.updateDynamic("PortfolioId")(PortfolioId.asInstanceOf[js.Any])
    if (ProductSource != null) __obj.updateDynamic("ProductSource")(ProductSource.asInstanceOf[js.Any])
    if (SortBy != null) __obj.updateDynamic("SortBy")(SortBy.asInstanceOf[js.Any])
    if (SortOrder != null) __obj.updateDynamic("SortOrder")(SortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchProductsAsAdminInput]
  }
}

