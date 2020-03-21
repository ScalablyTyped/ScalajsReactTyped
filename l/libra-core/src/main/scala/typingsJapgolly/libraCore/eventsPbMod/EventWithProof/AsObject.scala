package typingsJapgolly.libraCore.eventsPbMod.EventWithProof

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var event: js.UndefOr[typingsJapgolly.libraCore.eventsPbMod.Event.AsObject] = js.undefined
  var eventIndex: String
  var proof: js.UndefOr[typingsJapgolly.libraCore.proofPbMod.EventProof.AsObject] = js.undefined
  var transactionVersion: String
}

object AsObject {
  @scala.inline
  def apply(
    eventIndex: String,
    transactionVersion: String,
    event: typingsJapgolly.libraCore.eventsPbMod.Event.AsObject = null,
    proof: typingsJapgolly.libraCore.proofPbMod.EventProof.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(eventIndex = eventIndex.asInstanceOf[js.Any], transactionVersion = transactionVersion.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (proof != null) __obj.updateDynamic("proof")(proof.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

