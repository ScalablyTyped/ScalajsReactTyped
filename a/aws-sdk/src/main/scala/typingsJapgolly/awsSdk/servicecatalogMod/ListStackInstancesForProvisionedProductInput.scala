package typingsJapgolly.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStackInstancesForProvisionedProductInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typingsJapgolly.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  /**
    * The maximum number of items to return with this call.
    */
  var PageSize: js.UndefOr[typingsJapgolly.awsSdk.servicecatalogMod.PageSize] = js.native
  /**
    * The page token for the next set of results. To retrieve the first set of results, use null.
    */
  var PageToken: js.UndefOr[typingsJapgolly.awsSdk.servicecatalogMod.PageToken] = js.native
  /**
    * The identifier of the provisioned product.
    */
  var ProvisionedProductId: Id = js.native
}

object ListStackInstancesForProvisionedProductInput {
  @scala.inline
  def apply(
    ProvisionedProductId: Id,
    AcceptLanguage: AcceptLanguage = null,
    PageSize: Int | Double = null,
    PageToken: PageToken = null
  ): ListStackInstancesForProvisionedProductInput = {
    val __obj = js.Dynamic.literal(ProvisionedProductId = ProvisionedProductId.asInstanceOf[js.Any])
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage.asInstanceOf[js.Any])
    if (PageSize != null) __obj.updateDynamic("PageSize")(PageSize.asInstanceOf[js.Any])
    if (PageToken != null) __obj.updateDynamic("PageToken")(PageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStackInstancesForProvisionedProductInput]
  }
}

