package typingsJapgolly.awsSdk.lambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListLayersRequest extends js.Object {
  /**
    * A runtime identifier. For example, go1.x.
    */
  var CompatibleRuntime: js.UndefOr[Runtime] = js.native
  /**
    * A pagination token returned by a previous call.
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * The maximum number of layers to return.
    */
  var MaxItems: js.UndefOr[MaxLayerListItems] = js.native
}

object ListLayersRequest {
  @scala.inline
  def apply(CompatibleRuntime: Runtime = null, Marker: String = null, MaxItems: Int | Double = null): ListLayersRequest = {
    val __obj = js.Dynamic.literal()
    if (CompatibleRuntime != null) __obj.updateDynamic("CompatibleRuntime")(CompatibleRuntime.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (MaxItems != null) __obj.updateDynamic("MaxItems")(MaxItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLayersRequest]
  }
}

