package typingsJapgolly.angularGridster

import japgolly.scalajs.react.Callback
import typingsJapgolly.angular.mod.IAngularEvent
import typingsJapgolly.angular.mod.IAugmentedJQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDrag extends js.Object {
  // optional callback fired when item is moved,
  var drag: js.UndefOr[
    js.Function3[/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ js.Any, Unit]
  ] = js.undefined
  // whether the items are resizable
  var enabled: js.UndefOr[Boolean] = js.undefined
  // optional selector for drag handle
  var handle: js.UndefOr[String] = js.undefined
  // Distance in pixels from the edge of the viewport after which the viewport should scroll, relative to pointer
  var scrollSensitivity: js.UndefOr[Double] = js.undefined
  // Speed at which the window should scroll once the mouse pointer gets within scrollSensitivity distance
  var scrollSpeed: js.UndefOr[Double] = js.undefined
  // optional callback fired when drag is started
  var start: js.UndefOr[
    js.Function3[/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ js.Any, Unit]
  ] = js.undefined
  // optional callback fired when item is finished dragging
  var stop: js.UndefOr[
    js.Function3[/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ js.Any, Unit]
  ] = js.undefined
}

object AnonDrag {
  @scala.inline
  def apply(
    drag: (/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ js.Any) => Callback = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    handle: String = null,
    scrollSensitivity: Int | Double = null,
    scrollSpeed: Int | Double = null,
    start: (/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ js.Any) => Callback = null,
    stop: (/* event */ IAngularEvent, /* $element */ IAugmentedJQuery, /* options */ js.Any) => Callback = null
  ): AnonDrag = {
    val __obj = js.Dynamic.literal()
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction3((t0: /* event */ typingsJapgolly.angular.mod.IAngularEvent, t1: /* $element */ typingsJapgolly.angular.mod.IAugmentedJQuery, t2: /* options */ js.Any) => drag(t0, t1, t2).runNow()))
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (scrollSensitivity != null) __obj.updateDynamic("scrollSensitivity")(scrollSensitivity.asInstanceOf[js.Any])
    if (scrollSpeed != null) __obj.updateDynamic("scrollSpeed")(scrollSpeed.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction3((t0: /* event */ typingsJapgolly.angular.mod.IAngularEvent, t1: /* $element */ typingsJapgolly.angular.mod.IAugmentedJQuery, t2: /* options */ js.Any) => start(t0, t1, t2).runNow()))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction3((t0: /* event */ typingsJapgolly.angular.mod.IAngularEvent, t1: /* $element */ typingsJapgolly.angular.mod.IAugmentedJQuery, t2: /* options */ js.Any) => stop(t0, t1, t2).runNow()))
    __obj.asInstanceOf[AnonDrag]
  }
}

