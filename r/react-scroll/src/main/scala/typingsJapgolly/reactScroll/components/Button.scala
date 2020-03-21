package typingsJapgolly.reactScroll.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLButtonElement
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.reactScroll.buttonMod.ButtonProps
import typingsJapgolly.reactScroll.buttonMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Button {
  def apply(
    to: String,
    AllHTMLAttributes: AllHTMLAttributes[HTMLButtonElement] = null,
    ClassAttributes: ClassAttributes[HTMLButtonElement] = null,
    absolute: js.UndefOr[Boolean] = js.undefined,
    activeClass: String = null,
    containerId: String = null,
    delay: Int | Double = null,
    duration: Double | String = null,
    hashSpy: js.UndefOr[Boolean] = js.undefined,
    ignoreCancelEvents: js.UndefOr[Boolean] = js.undefined,
    isDynamic: js.UndefOr[Boolean] = js.undefined,
    offset: Int | Double = null,
    onClick: js.UndefOr[Callback] = js.undefined,
    onSetActive: /* to */ String => Callback = null,
    onSetInactive: js.UndefOr[Callback] = js.undefined,
    smooth: Boolean | String = null,
    spy: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ButtonProps, default, Unit, ButtonProps] = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
  
      if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (!js.isUndefined(absolute)) __obj.updateDynamic("absolute")(absolute.asInstanceOf[js.Any])
    if (activeClass != null) __obj.updateDynamic("activeClass")(activeClass.asInstanceOf[js.Any])
    if (containerId != null) __obj.updateDynamic("containerId")(containerId.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(hashSpy)) __obj.updateDynamic("hashSpy")(hashSpy.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreCancelEvents)) __obj.updateDynamic("ignoreCancelEvents")(ignoreCancelEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(isDynamic)) __obj.updateDynamic("isDynamic")(isDynamic.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    onClick.foreach(p => __obj.updateDynamic("onClick")(p.toJsFn))
    if (onSetActive != null) __obj.updateDynamic("onSetActive")(js.Any.fromFunction1((t0: /* to */ java.lang.String) => onSetActive(t0).runNow()))
    onSetInactive.foreach(p => __obj.updateDynamic("onSetInactive")(p.toJsFn))
    if (smooth != null) __obj.updateDynamic("smooth")(smooth.asInstanceOf[js.Any])
    if (!js.isUndefined(spy)) __obj.updateDynamic("spy")(spy.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactScroll.buttonMod.ButtonProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactScroll.buttonMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactScroll.buttonMod.ButtonProps])(children: _*)
  }
  @JSImport("react-scroll/modules/components/Button", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

