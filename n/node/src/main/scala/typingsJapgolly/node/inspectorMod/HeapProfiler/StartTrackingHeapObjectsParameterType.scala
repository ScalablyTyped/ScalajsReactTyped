package typingsJapgolly.node.inspectorMod.HeapProfiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartTrackingHeapObjectsParameterType extends js.Object {
  var trackAllocations: js.UndefOr[Boolean] = js.undefined
}

object StartTrackingHeapObjectsParameterType {
  @scala.inline
  def apply(trackAllocations: js.UndefOr[Boolean] = js.undefined): StartTrackingHeapObjectsParameterType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(trackAllocations)) __obj.updateDynamic("trackAllocations")(trackAllocations.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTrackingHeapObjectsParameterType]
  }
}

