package typingsJapgolly.stellarSdk.serverApiMod.ServerApi

import typingsJapgolly.node.Buffer
import typingsJapgolly.stellarSdk.horizonApiMod.Horizon.OperationResponseType.manageData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.stellarSdk.horizonApiMod.Horizon.BaseResponse because Already inherited
- typingsJapgolly.stellarSdk.horizonApiMod.Horizon.BaseOperationResponse because Already inherited
- typingsJapgolly.stellarSdk.horizonApiMod.Horizon.ManageDataOperationResponse because var conflicts: _links, created_at, id, paging_token, source_account, transaction_hash, `type`, type_i. Inlined name, value */ @js.native
trait ManageDataOperationRecord
  extends BaseOperationRecord[
      manageData, 
      typingsJapgolly.stellarSdk.horizonApiMod.Horizon.OperationResponseTypeI.manageData
    ]
     with OperationRecord {
  var name: String = js.native
  var value: Buffer = js.native
}

