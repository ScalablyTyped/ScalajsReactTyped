package typingsJapgolly.stellarSdk.serverApiMod.ServerApi

import typingsJapgolly.stellarSdk.horizonApiMod.Horizon.OperationResponseType.createAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.stellarSdk.horizonApiMod.Horizon.BaseResponse because Already inherited
- typingsJapgolly.stellarSdk.horizonApiMod.Horizon.BaseOperationResponse because Already inherited
- typingsJapgolly.stellarSdk.horizonApiMod.Horizon.CreateAccountOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined account, funder, starting_balance */ @js.native
trait CreateAccountOperationRecord
  extends BaseOperationRecord[
      createAccount, 
      typingsJapgolly.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.createAccount
    ]
     with OperationRecord {
  var account: String = js.native
  var funder: String = js.native
  var starting_balance: String = js.native
}

