package typingsJapgolly.reactDashNavigationDashStack.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.NavigationStackConfig
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.NavigationStackProp
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.SceneDescriptorMap
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsStackViewStackViewMod.Props
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsStackViewStackViewMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StackView {
  def apply(
    descriptors: SceneDescriptorMap,
    navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams],
    navigationConfig: NavigationStackConfig,
    onGestureBegin: js.UndefOr[Callback] = js.undefined,
    onGestureCanceled: js.UndefOr[Callback] = js.undefined,
    onGestureEnd: js.UndefOr[Callback] = js.undefined,
    onTransitionStart: js.UndefOr[Callback] = js.undefined,
    screenProps: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[Props, default, Unit, Props] = {
    val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], navigationConfig = navigationConfig.asInstanceOf[js.Any])
  
      onGestureBegin.foreach(p => __obj.updateDynamic("onGestureBegin")(p.toJsFn))
    onGestureCanceled.foreach(p => __obj.updateDynamic("onGestureCanceled")(p.toJsFn))
    onGestureEnd.foreach(p => __obj.updateDynamic("onGestureEnd")(p.toJsFn))
    onTransitionStart.foreach(p => __obj.updateDynamic("onTransitionStart")(p.toJsFn))
    if (screenProps != null) __obj.updateDynamic("screenProps")(screenProps.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsStackViewStackViewMod.Props, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsStackViewStackViewMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsStackViewStackViewMod.Props])(children: _*)
  }
  @JSImport("react-navigation-stack/lib/typescript/views/StackView/StackView", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

