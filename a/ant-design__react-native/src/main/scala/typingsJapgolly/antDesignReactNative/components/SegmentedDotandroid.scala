package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignReactNative.segmentedAndroidMod.SegmentControlProps
import typingsJapgolly.antDesignReactNative.segmentedAndroidMod.default
import typingsJapgolly.antDesignReactNative.segmentedControlStyleMod.SegmentControlStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SegmentedDotandroid {
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    onChange: /* e */ js.Any => Callback = null,
    onValueChange: /* value */ String => Callback = null,
    selectedIndex: Int | Double = null,
    selectedTextColor: String = null,
    style: StyleProp[ViewStyle] = null,
    styles: Partial[SegmentControlStyle] = null,
    tintColor: String = null,
    values: js.Array[String] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SegmentControlProps, default, Unit, SegmentControlProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* e */ js.Any) => onChange(t0).runNow()))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => onValueChange(t0).runNow()))
    if (selectedIndex != null) __obj.updateDynamic("selectedIndex")(selectedIndex.asInstanceOf[js.Any])
    if (selectedTextColor != null) __obj.updateDynamic("selectedTextColor")(selectedTextColor.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignReactNative.segmentedAndroidMod.SegmentControlProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignReactNative.segmentedAndroidMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignReactNative.segmentedAndroidMod.SegmentControlProps])(children: _*)
  }
  @JSImport("@ant-design/react-native/lib/segmented-control/segmented.android", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

