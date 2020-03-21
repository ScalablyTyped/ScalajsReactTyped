package typingsJapgolly.reactNavigationMaterialBottomTabs.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNavigation.mod.NavigationDescriptor
import typingsJapgolly.reactNavigation.mod.NavigationParams
import typingsJapgolly.reactNavigation.mod.NavigationProp
import typingsJapgolly.reactNavigation.mod.NavigationRoute
import typingsJapgolly.reactNavigation.mod.NavigationScreenProp
import typingsJapgolly.reactNavigationMaterialBottomTabs.AnonTintColor
import typingsJapgolly.reactNavigationMaterialBottomTabs.materialBottomTabViewMod.Options
import typingsJapgolly.reactNavigationMaterialBottomTabs.materialBottomTabViewMod.Props
import typingsJapgolly.reactNavigationMaterialBottomTabs.materialBottomTabViewMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object MaterialBottomTabView {
  def apply(
    descriptors: StringDictionary[
      NavigationDescriptor[
        _, 
        Options, 
        NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
      ]
    ],
    navigation: NavigationProp[_],
    renderIcon: AnonTintColor => CallbackTo[Node],
    activeColorDark: String = null,
    activeColorLight: String = null,
    barStyleDark: StyleProp[ViewStyle] = null,
    barStyleLight: StyleProp[ViewStyle] = null,
    inactiveColorDark: String = null,
    inactiveColorLight: String = null,
    screenProps: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any])
  
      __obj.updateDynamic("renderIcon")(js.Any.fromFunction1((t0: typingsJapgolly.reactNavigationMaterialBottomTabs.AnonTintColor) => renderIcon(t0).runNow()))
    if (activeColorDark != null) __obj.updateDynamic("activeColorDark")(activeColorDark.asInstanceOf[js.Any])
    if (activeColorLight != null) __obj.updateDynamic("activeColorLight")(activeColorLight.asInstanceOf[js.Any])
    if (barStyleDark != null) __obj.updateDynamic("barStyleDark")(barStyleDark.asInstanceOf[js.Any])
    if (barStyleLight != null) __obj.updateDynamic("barStyleLight")(barStyleLight.asInstanceOf[js.Any])
    if (inactiveColorDark != null) __obj.updateDynamic("inactiveColorDark")(inactiveColorDark.asInstanceOf[js.Any])
    if (inactiveColorLight != null) __obj.updateDynamic("inactiveColorLight")(inactiveColorLight.asInstanceOf[js.Any])
    if (screenProps != null) __obj.updateDynamic("screenProps")(screenProps.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNavigationMaterialBottomTabs.materialBottomTabViewMod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNavigationMaterialBottomTabs.materialBottomTabViewMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNavigationMaterialBottomTabs.materialBottomTabViewMod.Props])(children: _*)
  }
  @JSImport("react-navigation-material-bottom-tabs/lib/typescript/src/views/MaterialBottomTabView", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

