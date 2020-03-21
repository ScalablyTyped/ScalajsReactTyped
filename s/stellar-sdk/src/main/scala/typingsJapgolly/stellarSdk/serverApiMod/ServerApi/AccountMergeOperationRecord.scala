package typingsJapgolly.stellarSdk.serverApiMod.ServerApi

import typingsJapgolly.stellarSdk.horizonApiMod.Horizon.OperationResponseType.accountMerge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.stellarSdk.horizonApiMod.Horizon.BaseResponse because Already inherited
- typingsJapgolly.stellarSdk.horizonApiMod.Horizon.BaseOperationResponse because Already inherited
- typingsJapgolly.stellarSdk.horizonApiMod.Horizon.AccountMergeOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined into */ @js.native
trait AccountMergeOperationRecord
  extends BaseOperationRecord[
      accountMerge, 
      typingsJapgolly.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.accountMerge
    ]
     with OperationRecord {
  var into: String = js.native
}

