package typingsJapgolly.reactNativeElements.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeElements.mod.ButtonInformation
import typingsJapgolly.reactNativeElements.mod.PricingCardProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PricingCard {
  def apply(
    button: ButtonInformation,
    price: String,
    color: String = null,
    containerStyle: StyleProp[ViewStyle] = null,
    info: js.Array[String] = null,
    infoStyle: StyleProp[TextStyle] = null,
    onButtonPress: js.UndefOr[Callback] = js.undefined,
    pricingStyle: StyleProp[TextStyle] = null,
    title: String = null,
    titleStyle: StyleProp[TextStyle] = null,
    wrapperStyle: StyleProp[ViewStyle] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    PricingCardProps, 
    typingsJapgolly.reactNativeElements.mod.PricingCard, 
    Unit, 
    PricingCardProps
  ] = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any])
  
      if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (infoStyle != null) __obj.updateDynamic("infoStyle")(infoStyle.asInstanceOf[js.Any])
    onButtonPress.foreach(p => __obj.updateDynamic("onButtonPress")(p.toJsFn))
    if (pricingStyle != null) __obj.updateDynamic("pricingStyle")(pricingStyle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (wrapperStyle != null) __obj.updateDynamic("wrapperStyle")(wrapperStyle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeElements.mod.PricingCardProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeElements.mod.PricingCard](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeElements.mod.PricingCardProps])(children: _*)
  }
  @JSImport("react-native-elements", "PricingCard")
  @js.native
  object componentImport extends js.Object
  
}

