package typingsJapgolly.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTapeRecoveryPointsInput extends js.Object {
  var GatewayARN: typingsJapgolly.awsSdk.storagegatewayMod.GatewayARN = js.native
  /**
    * Specifies that the number of virtual tape recovery points that are described be limited to the specified number.
    */
  var Limit: js.UndefOr[PositiveIntObject] = js.native
  /**
    * An opaque string that indicates the position at which to begin describing the virtual tape recovery points.
    */
  var Marker: js.UndefOr[typingsJapgolly.awsSdk.storagegatewayMod.Marker] = js.native
}

object DescribeTapeRecoveryPointsInput {
  @scala.inline
  def apply(GatewayARN: GatewayARN, Limit: Int | Double = null, Marker: Marker = null): DescribeTapeRecoveryPointsInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTapeRecoveryPointsInput]
  }
}

