package typingsJapgolly.stellarSdk.horizonApiMod.Horizon

import typingsJapgolly.stellarBase.mod.AssetType.credit12
import typingsJapgolly.stellarBase.mod.AssetType.credit4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BalanceLineAsset[T /* <: credit4 | credit12 */] extends js.Object {
  var asset_code: String
  var asset_issuer: String
  var asset_type: T
  var balance: String
  var buying_liabilities: String
  var last_modified_ledger: Double
  var limit: String
  var selling_liabilities: String
}

object BalanceLineAsset {
  @scala.inline
  def apply[T /* <: credit4 | credit12 */](
    asset_code: String,
    asset_issuer: String,
    asset_type: T,
    balance: String,
    buying_liabilities: String,
    last_modified_ledger: Double,
    limit: String,
    selling_liabilities: String
  ): BalanceLineAsset[T] = {
    val __obj = js.Dynamic.literal(asset_code = asset_code.asInstanceOf[js.Any], asset_issuer = asset_issuer.asInstanceOf[js.Any], asset_type = asset_type.asInstanceOf[js.Any], balance = balance.asInstanceOf[js.Any], buying_liabilities = buying_liabilities.asInstanceOf[js.Any], last_modified_ledger = last_modified_ledger.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], selling_liabilities = selling_liabilities.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BalanceLineAsset[T]]
  }
}

