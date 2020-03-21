package typingsJapgolly.reactNativeElements.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.ImageSourcePropType
import typingsJapgolly.reactNative.mod.ImageStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeElements.PartialIconProps
import typingsJapgolly.reactNativeElements.PartialImageProps
import typingsJapgolly.reactNativeElements.mod.AvatarIcon
import typingsJapgolly.reactNativeElements.mod.AvatarProps
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.large
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.medium
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.small
import typingsJapgolly.reactNativeElements.reactNativeElementsStrings.xlarge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Avatar {
  def apply(
    Component: ComponentClassP[js.Object] = null,
    ImageComponent: ComponentClassP[js.Object] = null,
    activeOpacity: Int | Double = null,
    avatarStyle: ImageStyle = null,
    containerStyle: StyleProp[ViewStyle] = null,
    editButton: PartialIconProps = null,
    icon: AvatarIcon = null,
    iconStyle: StyleProp[TextStyle] = null,
    imageProps: PartialImageProps = null,
    onEditPress: js.UndefOr[Callback] = js.undefined,
    onLongPress: js.UndefOr[Callback] = js.undefined,
    onPress: js.UndefOr[Callback] = js.undefined,
    overlayContainerStyle: StyleProp[ViewStyle] = null,
    placeholderStyle: StyleProp[ViewStyle] = null,
    renderPlaceholderContent: VdomElement = null,
    rounded: js.UndefOr[Boolean] = js.undefined,
    showEditButton: js.UndefOr[Boolean] = js.undefined,
    size: small | medium | large | xlarge | Double = null,
    source: ImageSourcePropType = null,
    title: String = null,
    titleStyle: StyleProp[TextStyle] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[AvatarProps, typingsJapgolly.reactNativeElements.mod.Avatar, Unit, AvatarProps] = {
    val __obj = js.Dynamic.literal()
  
      if (Component != null) __obj.updateDynamic("Component")(Component.asInstanceOf[js.Any])
    if (ImageComponent != null) __obj.updateDynamic("ImageComponent")(ImageComponent.asInstanceOf[js.Any])
    if (activeOpacity != null) __obj.updateDynamic("activeOpacity")(activeOpacity.asInstanceOf[js.Any])
    if (avatarStyle != null) __obj.updateDynamic("avatarStyle")(avatarStyle.asInstanceOf[js.Any])
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (editButton != null) __obj.updateDynamic("editButton")(editButton.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle.asInstanceOf[js.Any])
    if (imageProps != null) __obj.updateDynamic("imageProps")(imageProps.asInstanceOf[js.Any])
    onEditPress.foreach(p => __obj.updateDynamic("onEditPress")(p.toJsFn))
    onLongPress.foreach(p => __obj.updateDynamic("onLongPress")(p.toJsFn))
    onPress.foreach(p => __obj.updateDynamic("onPress")(p.toJsFn))
    if (overlayContainerStyle != null) __obj.updateDynamic("overlayContainerStyle")(overlayContainerStyle.asInstanceOf[js.Any])
    if (placeholderStyle != null) __obj.updateDynamic("placeholderStyle")(placeholderStyle.asInstanceOf[js.Any])
    if (renderPlaceholderContent != null) __obj.updateDynamic("renderPlaceholderContent")(renderPlaceholderContent.rawElement.asInstanceOf[js.Any])
    if (!js.isUndefined(rounded)) __obj.updateDynamic("rounded")(rounded.asInstanceOf[js.Any])
    if (!js.isUndefined(showEditButton)) __obj.updateDynamic("showEditButton")(showEditButton.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeElements.mod.AvatarProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeElements.mod.Avatar](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeElements.mod.AvatarProps])(children: _*)
  }
  @JSImport("react-native-elements", "Avatar")
  @js.native
  object componentImport extends js.Object
  
}

