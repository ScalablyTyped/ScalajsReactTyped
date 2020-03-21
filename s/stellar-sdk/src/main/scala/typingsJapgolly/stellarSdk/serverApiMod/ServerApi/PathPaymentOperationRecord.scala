package typingsJapgolly.stellarSdk.serverApiMod.ServerApi

import typingsJapgolly.stellarBase.mod.AssetType
import typingsJapgolly.stellarSdk.horizonApiMod.Horizon.OperationResponseType.pathPayment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.stellarSdk.horizonApiMod.Horizon.BaseResponse because Already inherited
- typingsJapgolly.stellarSdk.horizonApiMod.Horizon.BaseOperationResponse because Already inherited
- typingsJapgolly.stellarSdk.horizonApiMod.Horizon.PathPaymentOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined from, to, asset_type, asset_code, asset_issuer, amount, source_asset_type, source_asset_code, source_asset_issuer, source_max, source_amount */ @js.native
trait PathPaymentOperationRecord
  extends BaseOperationRecord[
      pathPayment, 
      typingsJapgolly.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.pathPayment
    ]
     with OperationRecord {
  var amount: String = js.native
  var asset_code: js.UndefOr[String] = js.native
  var asset_issuer: js.UndefOr[String] = js.native
  var asset_type: AssetType = js.native
  var from: String = js.native
  var source_amount: String = js.native
  var source_asset_code: js.UndefOr[String] = js.native
  var source_asset_issuer: js.UndefOr[String] = js.native
  var source_asset_type: AssetType = js.native
  var source_max: String = js.native
  var to: String = js.native
}

