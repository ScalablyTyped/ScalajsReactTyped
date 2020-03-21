package typingsJapgolly.reactScrollbar.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactScrollbar.AnonContainerHeight
import typingsJapgolly.reactScrollbar.ScrollAreaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_ScrollAreaProps_1404720685[ComponentRef] () {
  val componentImport: js.Any
  def apply(
    className: String = null,
    contentClassName: String = null,
    contentStyle: CSSProperties = null,
    contentWindow: js.Any = null,
    focusableTabIndex: Int | Double = null,
    horizontal: js.UndefOr[Boolean] = js.undefined,
    horizontalContainerStyle: CSSProperties = null,
    horizontalScrollbarStyle: CSSProperties = null,
    minScrollSize: Int | Double = null,
    onScroll: /* value */ AnonContainerHeight => Callback = null,
    ownerDocument: js.Any = null,
    smoothScrolling: js.UndefOr[Boolean] = js.undefined,
    speed: Int | Double = null,
    stopScrollPropagation: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    swapWheelAxes: js.UndefOr[Boolean] = js.undefined,
    vertical: js.UndefOr[Boolean] = js.undefined,
    verticalContainerStyle: CSSProperties = null,
    verticalScrollbarStyle: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ScrollAreaProps, ComponentRef, Unit, ScrollAreaProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (contentClassName != null) __obj.updateDynamic("contentClassName")(contentClassName.asInstanceOf[js.Any])
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (contentWindow != null) __obj.updateDynamic("contentWindow")(contentWindow.asInstanceOf[js.Any])
    if (focusableTabIndex != null) __obj.updateDynamic("focusableTabIndex")(focusableTabIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontal)) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (horizontalContainerStyle != null) __obj.updateDynamic("horizontalContainerStyle")(horizontalContainerStyle.asInstanceOf[js.Any])
    if (horizontalScrollbarStyle != null) __obj.updateDynamic("horizontalScrollbarStyle")(horizontalScrollbarStyle.asInstanceOf[js.Any])
    if (minScrollSize != null) __obj.updateDynamic("minScrollSize")(minScrollSize.asInstanceOf[js.Any])
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: /* value */ typingsJapgolly.reactScrollbar.AnonContainerHeight) => onScroll(t0).runNow()))
    if (ownerDocument != null) __obj.updateDynamic("ownerDocument")(ownerDocument.asInstanceOf[js.Any])
    if (!js.isUndefined(smoothScrolling)) __obj.updateDynamic("smoothScrolling")(smoothScrolling.asInstanceOf[js.Any])
    if (speed != null) __obj.updateDynamic("speed")(speed.asInstanceOf[js.Any])
    if (!js.isUndefined(stopScrollPropagation)) __obj.updateDynamic("stopScrollPropagation")(stopScrollPropagation.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(swapWheelAxes)) __obj.updateDynamic("swapWheelAxes")(swapWheelAxes.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    if (verticalContainerStyle != null) __obj.updateDynamic("verticalContainerStyle")(verticalContainerStyle.asInstanceOf[js.Any])
    if (verticalScrollbarStyle != null) __obj.updateDynamic("verticalScrollbarStyle")(verticalScrollbarStyle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactScrollbar.ScrollAreaProps, 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactScrollbar.ScrollAreaProps])(children: _*)
  }
}

