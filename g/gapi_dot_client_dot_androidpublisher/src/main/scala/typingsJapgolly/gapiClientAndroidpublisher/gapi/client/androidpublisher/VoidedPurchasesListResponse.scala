package typingsJapgolly.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoidedPurchasesListResponse extends js.Object {
  var pageInfo: js.UndefOr[PageInfo] = js.undefined
  var tokenPagination: js.UndefOr[TokenPagination] = js.undefined
  var voidedPurchases: js.UndefOr[js.Array[VoidedPurchase]] = js.undefined
}

object VoidedPurchasesListResponse {
  @scala.inline
  def apply(
    pageInfo: PageInfo = null,
    tokenPagination: TokenPagination = null,
    voidedPurchases: js.Array[VoidedPurchase] = null
  ): VoidedPurchasesListResponse = {
    val __obj = js.Dynamic.literal()
    if (pageInfo != null) __obj.updateDynamic("pageInfo")(pageInfo.asInstanceOf[js.Any])
    if (tokenPagination != null) __obj.updateDynamic("tokenPagination")(tokenPagination.asInstanceOf[js.Any])
    if (voidedPurchases != null) __obj.updateDynamic("voidedPurchases")(voidedPurchases.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoidedPurchasesListResponse]
  }
}

