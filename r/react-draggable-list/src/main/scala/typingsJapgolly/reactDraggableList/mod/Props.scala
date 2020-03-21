package typingsJapgolly.reactDraggableList.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props[I, C, T] extends js.Object {
  var autoScrollMaxSpeed: js.UndefOr[Double] = js.undefined
  var autoScrollRegionSize: js.UndefOr[Double] = js.undefined
  var commonProps: js.UndefOr[C] = js.undefined
  var constrainDrag: js.UndefOr[Boolean] = js.undefined
  var container: js.UndefOr[js.Function0[js.UndefOr[HTMLElement | Null]]] = js.undefined
  var itemKey: String | (js.Function1[/* item */ I, String])
  var list: js.Array[I]
  var onMoveEnd: js.UndefOr[
    js.Function4[
      /* newList */ js.Array[I], 
      /* movedItem */ I, 
      /* oldIndex */ Double, 
      /* newIndex */ Double, 
      Unit
    ]
  ] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  var springConfig: js.UndefOr[js.Object] = js.undefined
  var template: Instantiable2[/* props */ js.Any, js.UndefOr[/* context */ js.Any], T]
  var unsetZIndex: js.UndefOr[Boolean] = js.undefined
}

object Props {
  @scala.inline
  def apply[I, C, T](
    itemKey: String | (js.Function1[/* item */ I, String]),
    list: js.Array[I],
    template: Instantiable2[/* props */ js.Any, js.UndefOr[/* context */ js.Any], T],
    autoScrollMaxSpeed: Int | Double = null,
    autoScrollRegionSize: Int | Double = null,
    commonProps: C = null,
    constrainDrag: js.UndefOr[Boolean] = js.undefined,
    container: js.UndefOr[CallbackTo[js.UndefOr[HTMLElement | Null]]] = js.undefined,
    onMoveEnd: (/* newList */ js.Array[I], /* movedItem */ I, /* oldIndex */ Double, /* newIndex */ Double) => Callback = null,
    padding: Int | Double = null,
    springConfig: js.Object = null,
    unsetZIndex: js.UndefOr[Boolean] = js.undefined
  ): Props[I, C, T] = {
    val __obj = js.Dynamic.literal(itemKey = itemKey.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    if (autoScrollMaxSpeed != null) __obj.updateDynamic("autoScrollMaxSpeed")(autoScrollMaxSpeed.asInstanceOf[js.Any])
    if (autoScrollRegionSize != null) __obj.updateDynamic("autoScrollRegionSize")(autoScrollRegionSize.asInstanceOf[js.Any])
    if (commonProps != null) __obj.updateDynamic("commonProps")(commonProps.asInstanceOf[js.Any])
    if (!js.isUndefined(constrainDrag)) __obj.updateDynamic("constrainDrag")(constrainDrag.asInstanceOf[js.Any])
    container.foreach(p => __obj.updateDynamic("container")(p.toJsFn))
    if (onMoveEnd != null) __obj.updateDynamic("onMoveEnd")(js.Any.fromFunction4((t0: /* newList */ js.Array[I], t1: /* movedItem */ I, t2: /* oldIndex */ scala.Double, t3: /* newIndex */ scala.Double) => onMoveEnd(t0, t1, t2, t3).runNow()))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (springConfig != null) __obj.updateDynamic("springConfig")(springConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(unsetZIndex)) __obj.updateDynamic("unsetZIndex")(unsetZIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[I, C, T]]
  }
}

