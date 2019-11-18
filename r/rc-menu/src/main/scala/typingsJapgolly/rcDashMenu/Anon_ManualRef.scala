package typingsJapgolly.rcDashMenu

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ManualRef extends js.Object {
  var manualRef: js.Function0[Unit]
  var onMouseEnter: js.Function0[Unit]
  var onMouseLeave: js.Function0[Unit]
  var onSelect: js.Function0[Unit]
}

object Anon_ManualRef {
  @scala.inline
  def apply(manualRef: Callback, onMouseEnter: Callback, onMouseLeave: Callback, onSelect: Callback): Anon_ManualRef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("manualRef")(manualRef.toJsFn)
    __obj.updateDynamic("onMouseEnter")(onMouseEnter.toJsFn)
    __obj.updateDynamic("onMouseLeave")(onMouseLeave.toJsFn)
    __obj.updateDynamic("onSelect")(onSelect.toJsFn)
    __obj.asInstanceOf[Anon_ManualRef]
  }
}

