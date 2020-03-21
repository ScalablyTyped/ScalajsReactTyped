package typingsJapgolly.stellarSdk.horizonApiMod.Horizon

import typingsJapgolly.node.Buffer
import typingsJapgolly.stellarSdk.horizonApiMod.Horizon.OperationResponseType.manageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManageDataOperationResponse
  extends BaseOperationResponse[
      manageData, 
      typingsJapgolly.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.manageData
    ] {
  var name: String
  var value: Buffer
}

object ManageDataOperationResponse {
  @scala.inline
  def apply(
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typingsJapgolly.stellarSdk.stellarSdkStrings.BaseResponse with js.Any,
    created_at: String,
    id: String,
    name: String,
    paging_token: String,
    source_account: String,
    transaction_hash: String,
    `type`: manageData,
    type_i: typingsJapgolly.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.manageData,
    value: Buffer
  ): ManageDataOperationResponse = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], paging_token = paging_token.asInstanceOf[js.Any], source_account = source_account.asInstanceOf[js.Any], transaction_hash = transaction_hash.asInstanceOf[js.Any], type_i = type_i.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManageDataOperationResponse]
  }
}

