package typingsJapgolly.rcDashMenu

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ManualRefMode extends js.Object {
  var manualRef: js.Function0[Unit]
  var mode: String
  var onMouseEnter: js.Function0[Unit]
  var onMouseLeave: js.Function0[Unit]
  var onTitleClick: js.Function0[Unit]
  var onTitleMouseEnter: js.Function0[Unit]
  var onTitleMouseLeave: js.Function0[Unit]
  var title: String
}

object Anon_ManualRefMode {
  @scala.inline
  def apply(
    manualRef: Callback,
    mode: String,
    onMouseEnter: Callback,
    onMouseLeave: Callback,
    onTitleClick: Callback,
    onTitleMouseEnter: Callback,
    onTitleMouseLeave: Callback,
    title: String
  ): Anon_ManualRefMode = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("manualRef")(manualRef.toJsFn)
    __obj.updateDynamic("onMouseEnter")(onMouseEnter.toJsFn)
    __obj.updateDynamic("onMouseLeave")(onMouseLeave.toJsFn)
    __obj.updateDynamic("onTitleClick")(onTitleClick.toJsFn)
    __obj.updateDynamic("onTitleMouseEnter")(onTitleMouseEnter.toJsFn)
    __obj.updateDynamic("onTitleMouseLeave")(onTitleMouseLeave.toJsFn)
    __obj.asInstanceOf[Anon_ManualRefMode]
  }
}

