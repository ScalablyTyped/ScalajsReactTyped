package typingsJapgolly.reactDashNavigationDashStack.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.reactMod.ComponentType
import typingsJapgolly.reactDashNative.reactDashNativeMod.StyleProp
import typingsJapgolly.reactDashNative.reactDashNativeMod.TextStyle
import typingsJapgolly.reactDashNavigationDashStack.Anon_TintColor
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.HeaderLayoutPreset
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.Scene
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsHeaderModularHeaderBackButtonMod.Props
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsHeaderModularHeaderBackButtonMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ModularHeaderBackButton {
  def apply(
    ButtonContainerComponent: ComponentType[js.Object],
    LabelContainerComponent: ComponentType[js.Object],
    layoutPreset: HeaderLayoutPreset,
    scene: Scene,
    onPress: Callback,
    allowFontScaling: js.UndefOr[Boolean] = js.undefined,
    backImage: /* props */ Anon_TintColor => CallbackTo[Node] = null,
    backTitleVisible: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    pressColorAndroid: String = null,
    tintColor: String = null,
    title: String = null,
    titleStyle: StyleProp[TextStyle] = null,
    truncatedTitle: String = null,
    width: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal(ButtonContainerComponent = ButtonContainerComponent.asInstanceOf[js.Any], LabelContainerComponent = LabelContainerComponent.asInstanceOf[js.Any], layoutPreset = layoutPreset.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onPress")(onPress.toJsFn)
    if (!js.isUndefined(allowFontScaling)) __obj.updateDynamic("allowFontScaling")(allowFontScaling.asInstanceOf[js.Any])
    if (backImage != null) __obj.updateDynamic("backImage")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactDashNavigationDashStack.Anon_TintColor) => backImage(t0).runNow()))
    if (!js.isUndefined(backTitleVisible)) __obj.updateDynamic("backTitleVisible")(backTitleVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (pressColorAndroid != null) __obj.updateDynamic("pressColorAndroid")(pressColorAndroid.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (truncatedTitle != null) __obj.updateDynamic("truncatedTitle")(truncatedTitle.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsHeaderModularHeaderBackButtonMod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsHeaderModularHeaderBackButtonMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsHeaderModularHeaderBackButtonMod.Props])(children: _*)
  }
  @JSImport("react-navigation-stack/lib/typescript/views/Header/ModularHeaderBackButton", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

