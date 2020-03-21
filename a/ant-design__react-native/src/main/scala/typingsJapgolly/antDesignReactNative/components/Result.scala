package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.ghost
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.primary
import typingsJapgolly.antDesignReactNative.resultMod.ResultNativeProps
import typingsJapgolly.antDesignReactNative.resultMod.default
import typingsJapgolly.antDesignReactNative.resultStyleMod.ResultStyle
import typingsJapgolly.reactNative.mod.ImagePropertiesSourceOptions
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Result {
  def apply(
    buttonText: String = null,
    buttonType: primary | ghost = null,
    img: VdomNode = null,
    imgUrl: ImagePropertiesSourceOptions = null,
    message: VdomNode = null,
    onButtonClick: /* e */ js.Any => Callback = null,
    style: StyleProp[ViewStyle] = null,
    styles: Partial[ResultStyle] = null,
    title: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ResultNativeProps, default, Unit, ResultNativeProps] = {
    val __obj = js.Dynamic.literal()
  
      if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText.asInstanceOf[js.Any])
    if (buttonType != null) __obj.updateDynamic("buttonType")(buttonType.asInstanceOf[js.Any])
    if (img != null) __obj.updateDynamic("img")(img.rawNode.asInstanceOf[js.Any])
    if (imgUrl != null) __obj.updateDynamic("imgUrl")(imgUrl.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.rawNode.asInstanceOf[js.Any])
    if (onButtonClick != null) __obj.updateDynamic("onButtonClick")(js.Any.fromFunction1((t0: /* e */ js.Any) => onButtonClick(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignReactNative.resultMod.ResultNativeProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignReactNative.resultMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignReactNative.resultMod.ResultNativeProps])(children: _*)
  }
  @JSImport("@ant-design/react-native/lib/result", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

