package typingsJapgolly.stellarSdk.horizonApiMod.Horizon

import typingsJapgolly.stellarSdk.horizonApiMod.Horizon.OperationResponseType.createAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAccountOperationResponse
  extends BaseOperationResponse[
      createAccount, 
      typingsJapgolly.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.createAccount
    ] {
  var account: String
  var funder: String
  var starting_balance: String
}

object CreateAccountOperationResponse {
  @scala.inline
  def apply(
    _links: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in T | 'self' ]: stellar-sdk.stellar-sdk/lib/horizon_api.Horizon.ResponseLink}
    */ typingsJapgolly.stellarSdk.stellarSdkStrings.BaseResponse with js.Any,
    account: String,
    created_at: String,
    funder: String,
    id: String,
    paging_token: String,
    source_account: String,
    starting_balance: String,
    transaction_hash: String,
    `type`: createAccount,
    type_i: typingsJapgolly.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.createAccount
  ): CreateAccountOperationResponse = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], account = account.asInstanceOf[js.Any], created_at = created_at.asInstanceOf[js.Any], funder = funder.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], paging_token = paging_token.asInstanceOf[js.Any], source_account = source_account.asInstanceOf[js.Any], starting_balance = starting_balance.asInstanceOf[js.Any], transaction_hash = transaction_hash.asInstanceOf[js.Any], type_i = type_i.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccountOperationResponse]
  }
}

