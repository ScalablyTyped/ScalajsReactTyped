package typingsJapgolly.angularGridster

import japgolly.scalajs.react.Callback
import typingsJapgolly.angular.mod.IAngularEvent
import typingsJapgolly.angular.mod.IAugmentedJQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEnabled extends js.Object {
  // whether the items are resizable
  var enabled: js.UndefOr[Boolean] = js.undefined
  // location of the resize handles
  // e.g // ['s', 'e', 'n', 'w', 'se', 'ne', 'sw', 'nw']
  var handles: js.UndefOr[js.Array[String]] = js.undefined
  // optional callback fired when item is resized
  var resize: js.UndefOr[
    js.Function3[/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ js.Any, Unit]
  ] = js.undefined
  // optional callback fired when drag is started
  var start: js.UndefOr[
    js.Function3[/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ js.Any, Unit]
  ] = js.undefined
  // optional callback fired when item is finished dragging
  var stop: js.UndefOr[
    js.Function3[/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ js.Any, Unit]
  ] = js.undefined
}

object AnonEnabled {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    handles: js.Array[String] = null,
    resize: (/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ js.Any) => Callback = null,
    start: (/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ js.Any) => Callback = null,
    stop: (/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ js.Any) => Callback = null
  ): AnonEnabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (handles != null) __obj.updateDynamic("handles")(handles.asInstanceOf[js.Any])
    if (resize != null) __obj.updateDynamic("resize")(js.Any.fromFunction3((t0: /* event */ typingsJapgolly.angular.mod.IAngularEvent, t1: /* $element */ typingsJapgolly.angular.mod.IAugmentedJQuery, t2: /* options */ js.Any) => resize(t0, t1, t2).runNow()))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction3((t0: /* event */ typingsJapgolly.angular.mod.IAngularEvent, t1: /* $element */ typingsJapgolly.angular.mod.IAugmentedJQuery, t2: /* options */ js.Any) => start(t0, t1, t2).runNow()))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction3((t0: /* event */ typingsJapgolly.angular.mod.IAngularEvent, t1: /* $element */ typingsJapgolly.angular.mod.IAugmentedJQuery, t2: /* options */ js.Any) => stop(t0, t1, t2).runNow()))
    __obj.asInstanceOf[AnonEnabled]
  }
}

