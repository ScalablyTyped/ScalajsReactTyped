package typingsJapgolly.reactDraggableList.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Component
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.reactDraggableList.mod.Props
import typingsJapgolly.reactDraggableList.mod.TemplateProps
import typingsJapgolly.reactDraggableList.mod.default
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDraggableList {
  def apply[I, C, T /* <: Component[(Partial[TemplateProps[I, C]]) with js.Object, js.Object] */](
    itemKey: String | (js.Function1[I, String]),
    list: js.Array[I],
    template: Instantiable2[/* props */ js.Any, js.UndefOr[/* context */ js.Any], T],
    autoScrollMaxSpeed: Int | Double = null,
    autoScrollRegionSize: Int | Double = null,
    commonProps: C = null,
    constrainDrag: js.UndefOr[Boolean] = js.undefined,
    container: js.UndefOr[CallbackTo[js.UndefOr[HTMLElement | Null]]] = js.undefined,
    onMoveEnd: (/* newList */ js.Array[I], I, /* oldIndex */ Double, /* newIndex */ Double) => Callback = null,
    padding: Int | Double = null,
    springConfig: js.Object = null,
    unsetZIndex: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props[I, C, T], default[I, C, T], Unit, Props[I, C, T]] = {
    val __obj = js.Dynamic.literal(itemKey = itemKey.asInstanceOf[js.Any], list = list.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
  
      if (autoScrollMaxSpeed != null) __obj.updateDynamic("autoScrollMaxSpeed")(autoScrollMaxSpeed.asInstanceOf[js.Any])
    if (autoScrollRegionSize != null) __obj.updateDynamic("autoScrollRegionSize")(autoScrollRegionSize.asInstanceOf[js.Any])
    if (commonProps != null) __obj.updateDynamic("commonProps")(commonProps.asInstanceOf[js.Any])
    if (!js.isUndefined(constrainDrag)) __obj.updateDynamic("constrainDrag")(constrainDrag.asInstanceOf[js.Any])
    container.foreach(p => __obj.updateDynamic("container")(p.toJsFn))
    if (onMoveEnd != null) __obj.updateDynamic("onMoveEnd")(js.Any.fromFunction4((t0: /* newList */ js.Array[I], t1: I, t2: /* oldIndex */ scala.Double, t3: /* newIndex */ scala.Double) => onMoveEnd(t0, t1, t2, t3).runNow()))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (springConfig != null) __obj.updateDynamic("springConfig")(springConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(unsetZIndex)) __obj.updateDynamic("unsetZIndex")(unsetZIndex.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDraggableList.mod.Props[I, C, T], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDraggableList.mod.default[I, C, T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDraggableList.mod.Props[I, C, T]])(children: _*)
  }
  @JSImport("react-draggable-list", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

