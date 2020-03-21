package typingsJapgolly.gapiClientDfareporting.gapi.client.dfareporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileCarriersListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#mobileCarriersListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** Mobile carrier collection. */
  var mobileCarriers: js.UndefOr[js.Array[MobileCarrier]] = js.undefined
}

object MobileCarriersListResponse {
  @scala.inline
  def apply(kind: String = null, mobileCarriers: js.Array[MobileCarrier] = null): MobileCarriersListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (mobileCarriers != null) __obj.updateDynamic("mobileCarriers")(mobileCarriers.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileCarriersListResponse]
  }
}

