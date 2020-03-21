package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.blueprintjsCore.boundaryMod.Boundary
import typingsJapgolly.blueprintjsCore.overflowListMod.IOverflowListProps
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ReactChild
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object OverflowList {
  def apply[T](
    items: js.Array[T],
    overflowRenderer: js.Array[T] => CallbackTo[Node],
    visibleItemRenderer: (T, Double) => CallbackTo[ReactChild],
    className: String = null,
    collapseFrom: Boundary = null,
    minVisibleItems: Int | Double = null,
    observeParents: js.UndefOr[Boolean] = js.undefined,
    onOverflow: /* overflowItems */ js.Array[T] => Callback = null,
    style: CSSProperties = null,
    tagName: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IOverflowListProps[T], 
    typingsJapgolly.blueprintjsCore.mod.OverflowList[T], 
    Unit, 
    IOverflowListProps[T]
  ] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
  
      __obj.updateDynamic("overflowRenderer")(js.Any.fromFunction1((t0: js.Array[T]) => overflowRenderer(t0).runNow()))
    __obj.updateDynamic("visibleItemRenderer")(js.Any.fromFunction2((t0: T, t1: scala.Double) => visibleItemRenderer(t0, t1).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (collapseFrom != null) __obj.updateDynamic("collapseFrom")(collapseFrom.asInstanceOf[js.Any])
    if (minVisibleItems != null) __obj.updateDynamic("minVisibleItems")(minVisibleItems.asInstanceOf[js.Any])
    if (!js.isUndefined(observeParents)) __obj.updateDynamic("observeParents")(observeParents.asInstanceOf[js.Any])
    if (onOverflow != null) __obj.updateDynamic("onOverflow")(js.Any.fromFunction1((t0: /* overflowItems */ js.Array[T]) => onOverflow(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsCore.overflowListMod.IOverflowListProps[T], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsCore.mod.OverflowList[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsCore.overflowListMod.IOverflowListProps[T]])(children: _*)
  }
  @JSImport("@blueprintjs/core", "OverflowList")
  @js.native
  object componentImport extends js.Object
  
}

