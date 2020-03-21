package typingsJapgolly.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "RetrieveInventoryAdjustmentResponse")
@js.native
class RetrieveInventoryAdjustmentResponse () extends js.Object {
  /**
    * The requested [InventoryAdjustment](#type-inventoryadjustment).
    */
  var adjustment: js.UndefOr[InventoryAdjustment] = js.native
  /**
    * Any errors that occurred during the request.
    */
  var errors: js.UndefOr[js.Array[js.Error]] = js.native
}

