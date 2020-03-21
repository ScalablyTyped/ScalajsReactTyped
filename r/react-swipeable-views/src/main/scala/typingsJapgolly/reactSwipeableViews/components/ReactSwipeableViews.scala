package typingsJapgolly.reactSwipeableViews.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.reactSwipeableViews.mod.AxisType
import typingsJapgolly.reactSwipeableViews.mod.OnSwitchingCallbackTypeDescriptor
import typingsJapgolly.reactSwipeableViews.mod.SpringConfig
import typingsJapgolly.reactSwipeableViews.mod.SwipeableViewsProps
import typingsJapgolly.reactSwipeableViews.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactSwipeableViews {
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[HTMLDivElement] = null,
    ClassAttributes: ClassAttributes[HTMLDivElement] = null,
    animateHeight: js.UndefOr[Boolean] = js.undefined,
    animateTransitions: js.UndefOr[Boolean] = js.undefined,
    axis: AxisType = null,
    containerStyle: CSSProperties = null,
    disableLazyLoading: js.UndefOr[Boolean] = js.undefined,
    enableMouseEvents: js.UndefOr[Boolean] = js.undefined,
    hysteresis: Int | Double = null,
    ignoreNativeScroll: js.UndefOr[Boolean] = js.undefined,
    index: Int | Double = null,
    onChangeIndex: (/* index */ Double, /* indexLatest */ Double) => Callback = null,
    onSwitching: (/* index */ Double, /* type */ OnSwitchingCallbackTypeDescriptor) => Callback = null,
    onTransitionEnd: js.UndefOr[Callback] = js.undefined,
    resistance: js.UndefOr[Boolean] = js.undefined,
    slideClassName: String = null,
    slideStyle: CSSProperties = null,
    springConfig: SpringConfig = null,
    threshold: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SwipeableViewsProps, default, Unit, SwipeableViewsProps] = {
    val __obj = js.Dynamic.literal()
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(animateHeight)) __obj.updateDynamic("animateHeight")(animateHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(animateTransitions)) __obj.updateDynamic("animateTransitions")(animateTransitions.asInstanceOf[js.Any])
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(disableLazyLoading)) __obj.updateDynamic("disableLazyLoading")(disableLazyLoading.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMouseEvents)) __obj.updateDynamic("enableMouseEvents")(enableMouseEvents.asInstanceOf[js.Any])
    if (hysteresis != null) __obj.updateDynamic("hysteresis")(hysteresis.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreNativeScroll)) __obj.updateDynamic("ignoreNativeScroll")(ignoreNativeScroll.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (onChangeIndex != null) __obj.updateDynamic("onChangeIndex")(js.Any.fromFunction2((t0: /* index */ scala.Double, t1: /* indexLatest */ scala.Double) => onChangeIndex(t0, t1).runNow()))
    if (onSwitching != null) __obj.updateDynamic("onSwitching")(js.Any.fromFunction2((t0: /* index */ scala.Double, t1: /* type */ typingsJapgolly.reactSwipeableViews.mod.OnSwitchingCallbackTypeDescriptor) => onSwitching(t0, t1).runNow()))
    onTransitionEnd.foreach(p => __obj.updateDynamic("onTransitionEnd")(p.toJsFn))
    if (!js.isUndefined(resistance)) __obj.updateDynamic("resistance")(resistance.asInstanceOf[js.Any])
    if (slideClassName != null) __obj.updateDynamic("slideClassName")(slideClassName.asInstanceOf[js.Any])
    if (slideStyle != null) __obj.updateDynamic("slideStyle")(slideStyle.asInstanceOf[js.Any])
    if (springConfig != null) __obj.updateDynamic("springConfig")(springConfig.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactSwipeableViews.mod.SwipeableViewsProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactSwipeableViews.mod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactSwipeableViews.mod.SwipeableViewsProps])(children: _*)
  }
  @JSImport("react-swipeable-views", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

