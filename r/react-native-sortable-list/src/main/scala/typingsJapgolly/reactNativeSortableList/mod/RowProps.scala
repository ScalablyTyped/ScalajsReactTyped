package typingsJapgolly.reactNativeSortableList.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.Element
import typingsJapgolly.reactNative.mod.NodeHandle
import typingsJapgolly.reactNative.mod.PanResponderGestureState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowProps[T, K] extends js.Object {
  var active: Boolean
  var data: T
  var disabled: js.UndefOr[Boolean] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var key: js.UndefOr[K] = js.undefined
  var toggleRowActive: js.UndefOr[
    js.Function2[
      ReactEventFrom[NodeHandle with Element], 
      /* gestureState */ js.UndefOr[PanResponderGestureState], 
      Unit
    ]
  ] = js.undefined
}

object RowProps {
  @scala.inline
  def apply[T, K](
    active: Boolean,
    data: T,
    disabled: js.UndefOr[Boolean] = js.undefined,
    index: Int | Double = null,
    key: K = null,
    toggleRowActive: (ReactEventFrom[NodeHandle with Element], /* gestureState */ js.UndefOr[PanResponderGestureState]) => Callback = null
  ): RowProps[T, K] = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (toggleRowActive != null) __obj.updateDynamic("toggleRowActive")(js.Any.fromFunction2((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element], t1: /* gestureState */ js.UndefOr[typingsJapgolly.reactNative.mod.PanResponderGestureState]) => toggleRowActive(t0, t1).runNow()))
    __obj.asInstanceOf[RowProps[T, K]]
  }
}

