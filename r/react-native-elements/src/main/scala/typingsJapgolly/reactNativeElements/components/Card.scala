package typingsJapgolly.reactNativeElements.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.ImageSourcePropType
import typingsJapgolly.reactNative.mod.ImageStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeElements.PartialImageProps
import typingsJapgolly.reactNativeElements.mod.CardProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Card {
  def apply(
    containerStyle: StyleProp[ViewStyle] = null,
    dividerStyle: StyleProp[ViewStyle] = null,
    featuredSubtitle: String = null,
    featuredSubtitleStyle: StyleProp[TextStyle] = null,
    featuredTitle: String = null,
    featuredTitleStyle: StyleProp[TextStyle] = null,
    image: ImageSourcePropType = null,
    imageProps: PartialImageProps = null,
    imageStyle: ImageStyle = null,
    imageWrapperStyle: StyleProp[ViewStyle] = null,
    title: String | Element = null,
    titleStyle: StyleProp[TextStyle] = null,
    wrapperStyle: StyleProp[ViewStyle] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CardProps, typingsJapgolly.reactNativeElements.mod.Card, Unit, CardProps] = {
    val __obj = js.Dynamic.literal()
  
      if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (dividerStyle != null) __obj.updateDynamic("dividerStyle")(dividerStyle.asInstanceOf[js.Any])
    if (featuredSubtitle != null) __obj.updateDynamic("featuredSubtitle")(featuredSubtitle.asInstanceOf[js.Any])
    if (featuredSubtitleStyle != null) __obj.updateDynamic("featuredSubtitleStyle")(featuredSubtitleStyle.asInstanceOf[js.Any])
    if (featuredTitle != null) __obj.updateDynamic("featuredTitle")(featuredTitle.asInstanceOf[js.Any])
    if (featuredTitleStyle != null) __obj.updateDynamic("featuredTitleStyle")(featuredTitleStyle.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (imageProps != null) __obj.updateDynamic("imageProps")(imageProps.asInstanceOf[js.Any])
    if (imageStyle != null) __obj.updateDynamic("imageStyle")(imageStyle.asInstanceOf[js.Any])
    if (imageWrapperStyle != null) __obj.updateDynamic("imageWrapperStyle")(imageWrapperStyle.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (wrapperStyle != null) __obj.updateDynamic("wrapperStyle")(wrapperStyle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeElements.mod.CardProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeElements.mod.Card](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeElements.mod.CardProps])(children: _*)
  }
  @JSImport("react-native-elements", "Card")
  @js.native
  object componentImport extends js.Object
  
}

