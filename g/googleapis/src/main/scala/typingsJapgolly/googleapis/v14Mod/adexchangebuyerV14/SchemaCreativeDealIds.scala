package typingsJapgolly.googleapis.v14Mod.adexchangebuyerV14

import typingsJapgolly.googleapis.AnonArcStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The external deal ids associated with a creative.
  */
@js.native
trait SchemaCreativeDealIds extends js.Object {
  /**
    * A list of external deal ids and ARC approval status.
    */
  var dealStatuses: js.UndefOr[js.Array[AnonArcStatus]] = js.native
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaCreativeDealIds {
  @scala.inline
  def apply(dealStatuses: js.Array[AnonArcStatus] = null, kind: String = null): SchemaCreativeDealIds = {
    val __obj = js.Dynamic.literal()
    if (dealStatuses != null) __obj.updateDynamic("dealStatuses")(dealStatuses.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreativeDealIds]
  }
}

