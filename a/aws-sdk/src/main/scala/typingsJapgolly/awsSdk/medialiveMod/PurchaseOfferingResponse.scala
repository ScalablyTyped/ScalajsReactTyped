package typingsJapgolly.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PurchaseOfferingResponse extends js.Object {
  var Reservation: js.UndefOr[typingsJapgolly.awsSdk.medialiveMod.Reservation] = js.native
}

object PurchaseOfferingResponse {
  @scala.inline
  def apply(Reservation: Reservation = null): PurchaseOfferingResponse = {
    val __obj = js.Dynamic.literal()
    if (Reservation != null) __obj.updateDynamic("Reservation")(Reservation.asInstanceOf[js.Any])
    __obj.asInstanceOf[PurchaseOfferingResponse]
  }
}

