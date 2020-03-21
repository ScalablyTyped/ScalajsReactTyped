package typingsJapgolly.reactNavigationStack.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNavigationStack.AnonTintColor
import typingsJapgolly.reactNavigationStack.modularHeaderBackButtonMod.Props
import typingsJapgolly.reactNavigationStack.modularHeaderBackButtonMod.default
import typingsJapgolly.reactNavigationStack.typesMod.HeaderLayoutPreset
import typingsJapgolly.reactNavigationStack.typesMod.Scene
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
    backImage: /* props */ AnonTintColor => CallbackTo[Node] = null,
    backTitleVisible: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    pressColorAndroid: String = null,
    tintColor: String = null,
    title: String = null,
    titleStyle: StyleProp[TextStyle] = null,
    truncatedTitle: String = null,
    width: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal(ButtonContainerComponent = ButtonContainerComponent.asInstanceOf[js.Any], LabelContainerComponent = LabelContainerComponent.asInstanceOf[js.Any], layoutPreset = layoutPreset.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onPress")(onPress.toJsFn)
    if (!js.isUndefined(allowFontScaling)) __obj.updateDynamic("allowFontScaling")(allowFontScaling.asInstanceOf[js.Any])
    if (backImage != null) __obj.updateDynamic("backImage")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactNavigationStack.AnonTintColor) => backImage(t0).runNow()))
    if (!js.isUndefined(backTitleVisible)) __obj.updateDynamic("backTitleVisible")(backTitleVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (pressColorAndroid != null) __obj.updateDynamic("pressColorAndroid")(pressColorAndroid.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleStyle != null) __obj.updateDynamic("titleStyle")(titleStyle.asInstanceOf[js.Any])
    if (truncatedTitle != null) __obj.updateDynamic("truncatedTitle")(truncatedTitle.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNavigationStack.modularHeaderBackButtonMod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNavigationStack.modularHeaderBackButtonMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNavigationStack.modularHeaderBackButtonMod.Props])(children: _*)
  }
  @JSImport("react-navigation-stack/lib/typescript/views/Header/ModularHeaderBackButton", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

