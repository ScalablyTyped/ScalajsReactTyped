package typingsJapgolly.libraCore.getWithProofPbMod.UpdateToLatestLedgerRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var clientKnownVersion: String
  var requestedItemsList: js.Array[typingsJapgolly.libraCore.getWithProofPbMod.RequestItem.AsObject]
}

object AsObject {
  @scala.inline
  def apply(
    clientKnownVersion: String,
    requestedItemsList: js.Array[typingsJapgolly.libraCore.getWithProofPbMod.RequestItem.AsObject]
  ): AsObject = {
    val __obj = js.Dynamic.literal(clientKnownVersion = clientKnownVersion.asInstanceOf[js.Any], requestedItemsList = requestedItemsList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AsObject]
  }
}

