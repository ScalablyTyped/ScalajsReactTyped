package typingsJapgolly.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamSelection extends js.Object {
  /**
    * The maximum video bitrate (bps) to include in output.
    */
  var MaxVideoBitsPerSecond: js.UndefOr[integer] = js.native
  /**
    * The minimum video bitrate (bps) to include in output.
    */
  var MinVideoBitsPerSecond: js.UndefOr[integer] = js.native
  /**
    * A directive that determines the order of streams in the output.
    */
  var StreamOrder: js.UndefOr[typingsJapgolly.awsSdk.mediapackageMod.StreamOrder] = js.native
}

object StreamSelection {
  @scala.inline
  def apply(
    MaxVideoBitsPerSecond: Int | Double = null,
    MinVideoBitsPerSecond: Int | Double = null,
    StreamOrder: StreamOrder = null
  ): StreamSelection = {
    val __obj = js.Dynamic.literal()
    if (MaxVideoBitsPerSecond != null) __obj.updateDynamic("MaxVideoBitsPerSecond")(MaxVideoBitsPerSecond.asInstanceOf[js.Any])
    if (MinVideoBitsPerSecond != null) __obj.updateDynamic("MinVideoBitsPerSecond")(MinVideoBitsPerSecond.asInstanceOf[js.Any])
    if (StreamOrder != null) __obj.updateDynamic("StreamOrder")(StreamOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamSelection]
  }
}

