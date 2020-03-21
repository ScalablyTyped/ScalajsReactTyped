package typingsJapgolly.stellarSdk.serverApiMod.ServerApi

import typingsJapgolly.stellarSdk.horizonApiMod.Horizon.OperationResponseType.bumpSequence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.stellarSdk.horizonApiMod.Horizon.BaseResponse because Already inherited
- typingsJapgolly.stellarSdk.horizonApiMod.Horizon.BaseOperationResponse because Already inherited
- typingsJapgolly.stellarSdk.horizonApiMod.Horizon.BumpSequenceOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined bump_to */ @js.native
trait BumpSequenceOperationRecord
  extends BaseOperationRecord[
      bumpSequence, 
      typingsJapgolly.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.bumpSequence
    ]
     with OperationRecord {
  var bump_to: String = js.native
}

