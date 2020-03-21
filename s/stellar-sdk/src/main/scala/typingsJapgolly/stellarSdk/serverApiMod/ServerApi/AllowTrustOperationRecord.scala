package typingsJapgolly.stellarSdk.serverApiMod.ServerApi

import typingsJapgolly.stellarBase.mod.AssetType
import typingsJapgolly.stellarSdk.horizonApiMod.Horizon.OperationResponseType.allowTrust
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.stellarSdk.horizonApiMod.Horizon.BaseResponse because Already inherited
- typingsJapgolly.stellarSdk.horizonApiMod.Horizon.BaseOperationResponse because Already inherited
- typingsJapgolly.stellarSdk.horizonApiMod.Horizon.AllowTrustOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined asset_type, asset_code, asset_issuer, authorize, trustee, trustor */ @js.native
trait AllowTrustOperationRecord
  extends BaseOperationRecord[
      allowTrust, 
      typingsJapgolly.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.allowTrust
    ]
     with OperationRecord {
  var asset_code: String = js.native
  var asset_issuer: String = js.native
  var asset_type: AssetType = js.native
  var authorize: Boolean = js.native
  var trustee: String = js.native
  var trustor: String = js.native
}

