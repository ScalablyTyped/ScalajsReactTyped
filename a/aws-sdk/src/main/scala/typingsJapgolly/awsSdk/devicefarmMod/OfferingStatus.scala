package typingsJapgolly.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OfferingStatus extends js.Object {
  /**
    * The date on which the offering is effective.
    */
  var effectiveOn: js.UndefOr[js.Date] = js.native
  /**
    * Represents the metadata of an offering status.
    */
  var offering: js.UndefOr[Offering] = js.native
  /**
    * The number of available devices in the offering.
    */
  var quantity: js.UndefOr[Integer] = js.native
  /**
    * The type specified for the offering status.
    */
  var `type`: js.UndefOr[OfferingTransactionType] = js.native
}

object OfferingStatus {
  @scala.inline
  def apply(
    effectiveOn: js.Date = null,
    offering: Offering = null,
    quantity: Int | scala.Double = null,
    `type`: OfferingTransactionType = null
  ): OfferingStatus = {
    val __obj = js.Dynamic.literal()
    if (effectiveOn != null) __obj.updateDynamic("effectiveOn")(effectiveOn.asInstanceOf[js.Any])
    if (offering != null) __obj.updateDynamic("offering")(offering.asInstanceOf[js.Any])
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OfferingStatus]
  }
}

