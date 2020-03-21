package typingsJapgolly.libraCore.getWithProofPbMod.GetEventsByEventAccessPathResponse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var eventsWithProofList: js.Array[typingsJapgolly.libraCore.eventsPbMod.EventWithProof.AsObject]
  var proofOfLatestEvent: js.UndefOr[typingsJapgolly.libraCore.accountStateBlobPbMod.AccountStateWithProof.AsObject] = js.undefined
}

object AsObject {
  @scala.inline
  def apply(
    eventsWithProofList: js.Array[typingsJapgolly.libraCore.eventsPbMod.EventWithProof.AsObject],
    proofOfLatestEvent: typingsJapgolly.libraCore.accountStateBlobPbMod.AccountStateWithProof.AsObject = null
  ): AsObject = {
    val __obj = js.Dynamic.literal(eventsWithProofList = eventsWithProofList.asInstanceOf[js.Any])
    if (proofOfLatestEvent != null) __obj.updateDynamic("proofOfLatestEvent")(proofOfLatestEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

