package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.ghost
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.primary
import typingsJapgolly.antdMobileRn.resultIndexNativeMod.ResultNativeProps
import typingsJapgolly.antdMobileRn.resultStyleIndexNativeMod.IResultStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Result {
  def apply(
    buttonText: String = null,
    buttonType: primary | ghost = null,
    img: VdomNode = null,
    imgUrl: String = null,
    message: VdomNode = null,
    onButtonClick: js.UndefOr[Callback] = js.undefined,
    style: StyleProp[ViewStyle] = null,
    styles: IResultStyle = null,
    title: VdomNode = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ResultNativeProps, typingsJapgolly.antdMobileRn.mod.Result, Unit, ResultNativeProps] = {
    val __obj = js.Dynamic.literal()
  
      if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText.asInstanceOf[js.Any])
    if (buttonType != null) __obj.updateDynamic("buttonType")(buttonType.asInstanceOf[js.Any])
    if (img != null) __obj.updateDynamic("img")(img.rawNode.asInstanceOf[js.Any])
    if (imgUrl != null) __obj.updateDynamic("imgUrl")(imgUrl.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.rawNode.asInstanceOf[js.Any])
    onButtonClick.foreach(p => __obj.updateDynamic("onButtonClick")(p.toJsFn))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobileRn.resultIndexNativeMod.ResultNativeProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobileRn.mod.Result](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobileRn.resultIndexNativeMod.ResultNativeProps])(children: _*)
  }
  @JSImport("antd-mobile-rn", "Result")
  @js.native
  object componentImport extends js.Object
  
}

