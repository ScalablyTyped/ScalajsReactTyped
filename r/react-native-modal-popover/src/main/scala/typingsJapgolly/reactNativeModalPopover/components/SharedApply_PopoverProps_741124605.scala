package typingsJapgolly.reactNativeModalPopover.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeModalPopover.popoverGeometryMod.Placement
import typingsJapgolly.reactNativeModalPopover.popoverGeometryMod.Rect
import typingsJapgolly.reactNativeModalPopover.popoverGeometryMod.Size
import typingsJapgolly.reactNativeModalPopover.popoverMod.Orientation
import typingsJapgolly.reactNativeModalPopover.popoverMod.PopoverProps
import typingsJapgolly.reactNativeModalPopover.reactNativeModalPopoverStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_PopoverProps_741124605[ComponentRef] () {
  val componentImport: js.Any
  def apply(
    fromRect: Rect,
    arrowSize: Size = null,
    arrowStyle: StyleProp[ViewStyle] = null,
    backgroundStyle: StyleProp[ViewStyle] = null,
    contentStyle: StyleProp[ViewStyle] = null,
    displayArea: Rect = null,
    duration: Int | Double = null,
    easing: /* show */ Boolean => CallbackTo[js.Function1[/* value */ Double, Double]] = null,
    onClose: js.UndefOr[Callback] = js.undefined,
    onDismiss: js.UndefOr[Callback] = js.undefined,
    placement: Placement | auto = null,
    popoverStyle: StyleProp[ViewStyle] = null,
    supportedOrientations: js.Array[Orientation] = null,
    useNativeDriver: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PopoverProps, ComponentRef, Unit, PopoverProps] = {
    val __obj = js.Dynamic.literal(fromRect = fromRect.asInstanceOf[js.Any])
  
      if (arrowSize != null) __obj.updateDynamic("arrowSize")(arrowSize.asInstanceOf[js.Any])
    if (arrowStyle != null) __obj.updateDynamic("arrowStyle")(arrowStyle.asInstanceOf[js.Any])
    if (backgroundStyle != null) __obj.updateDynamic("backgroundStyle")(backgroundStyle.asInstanceOf[js.Any])
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (displayArea != null) __obj.updateDynamic("displayArea")(displayArea.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(js.Any.fromFunction1((t0: /* show */ scala.Boolean) => easing(t0).runNow()))
    onClose.foreach(p => __obj.updateDynamic("onClose")(p.toJsFn))
    onDismiss.foreach(p => __obj.updateDynamic("onDismiss")(p.toJsFn))
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (popoverStyle != null) __obj.updateDynamic("popoverStyle")(popoverStyle.asInstanceOf[js.Any])
    if (supportedOrientations != null) __obj.updateDynamic("supportedOrientations")(supportedOrientations.asInstanceOf[js.Any])
    if (!js.isUndefined(useNativeDriver)) __obj.updateDynamic("useNativeDriver")(useNativeDriver.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeModalPopover.popoverMod.PopoverProps, 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeModalPopover.popoverMod.PopoverProps])(children: _*)
  }
}

