package typingsJapgolly.gapiClientAdexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArcStatus extends js.Object {
  /** ARC approval status. */
  var arcStatus: js.UndefOr[String] = js.undefined
  /** External deal ID. */
  var dealId: js.UndefOr[String] = js.undefined
  /** Publisher ID. */
  var webPropertyId: js.UndefOr[Double] = js.undefined
}

object AnonArcStatus {
  @scala.inline
  def apply(arcStatus: String = null, dealId: String = null, webPropertyId: Int | Double = null): AnonArcStatus = {
    val __obj = js.Dynamic.literal()
    if (arcStatus != null) __obj.updateDynamic("arcStatus")(arcStatus.asInstanceOf[js.Any])
    if (dealId != null) __obj.updateDynamic("dealId")(dealId.asInstanceOf[js.Any])
    if (webPropertyId != null) __obj.updateDynamic("webPropertyId")(webPropertyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonArcStatus]
  }
}

