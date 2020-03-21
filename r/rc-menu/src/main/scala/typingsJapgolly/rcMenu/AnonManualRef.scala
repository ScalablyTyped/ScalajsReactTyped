package typingsJapgolly.rcMenu

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonManualRef extends js.Object {
  var manualRef: js.Function0[Unit]
  var onMouseEnter: js.Function0[Unit]
  var onMouseLeave: js.Function0[Unit]
  var onSelect: js.Function0[Unit]
}

object AnonManualRef {
  @scala.inline
  def apply(manualRef: Callback, onMouseEnter: Callback, onMouseLeave: Callback, onSelect: Callback): AnonManualRef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("manualRef")(manualRef.toJsFn)
    __obj.updateDynamic("onMouseEnter")(onMouseEnter.toJsFn)
    __obj.updateDynamic("onMouseLeave")(onMouseLeave.toJsFn)
    __obj.updateDynamic("onSelect")(onSelect.toJsFn)
    __obj.asInstanceOf[AnonManualRef]
  }
}

