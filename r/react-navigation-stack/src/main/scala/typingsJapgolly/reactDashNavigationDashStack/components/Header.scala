package typingsJapgolly.reactDashNavigationDashStack.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactDashNative.reactDashNativeMod.Animated.Value
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typingsJapgolly.reactDashNavigationDashStack.PickPropsscenenavigationpositionlayoutPresetbackTi
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.HeaderLayoutPreset
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.HeaderMode
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.HeaderTransitionPreset
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.NavigationStackProp
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.Scene
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.SceneInterpolatorProps
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.TransitionerLayout
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsHeaderHeaderMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Header {
  def apply(
    layout: TransitionerLayout,
    layoutPreset: HeaderLayoutPreset,
    mode: HeaderMode,
    navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams],
    position: Value,
    scene: Scene,
    scenes: js.Array[Scene],
    theme: String,
    layoutInterpolator: /* props */ SceneInterpolatorProps => CallbackTo[js.Any],
    leftButtonInterpolator: /* props */ SceneInterpolatorProps => CallbackTo[js.Any],
    leftLabelInterpolator: /* props */ SceneInterpolatorProps => CallbackTo[js.Any],
    titleFromLeftInterpolator: /* props */ SceneInterpolatorProps => CallbackTo[js.Any],
    backTitleVisible: js.UndefOr[Boolean] = js.undefined,
    backgroundInterpolator: /* props */ SceneInterpolatorProps => CallbackTo[js.Any] = null,
    leftInterpolator: /* props */ SceneInterpolatorProps => CallbackTo[js.Any] = null,
    rightInterpolator: /* props */ SceneInterpolatorProps => CallbackTo[js.Any] = null,
    titleInterpolator: /* props */ SceneInterpolatorProps => CallbackTo[js.Any] = null,
    transitionPreset: HeaderTransitionPreset = null,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    PickPropsscenenavigationpositionlayoutPresetbackTi, 
    default, 
    Unit, 
    PickPropsscenenavigationpositionlayoutPresetbackTi
  ] = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any], layoutPreset = layoutPreset.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], scenes = scenes.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
  
      __obj.updateDynamic("layoutInterpolator")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.SceneInterpolatorProps) => layoutInterpolator(t0).runNow()))
    __obj.updateDynamic("leftButtonInterpolator")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.SceneInterpolatorProps) => leftButtonInterpolator(t0).runNow()))
    __obj.updateDynamic("leftLabelInterpolator")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.SceneInterpolatorProps) => leftLabelInterpolator(t0).runNow()))
    __obj.updateDynamic("titleFromLeftInterpolator")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.SceneInterpolatorProps) => titleFromLeftInterpolator(t0).runNow()))
    if (!js.isUndefined(backTitleVisible)) __obj.updateDynamic("backTitleVisible")(backTitleVisible.asInstanceOf[js.Any])
    if (backgroundInterpolator != null) __obj.updateDynamic("backgroundInterpolator")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.SceneInterpolatorProps) => backgroundInterpolator(t0).runNow()))
    if (leftInterpolator != null) __obj.updateDynamic("leftInterpolator")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.SceneInterpolatorProps) => leftInterpolator(t0).runNow()))
    if (rightInterpolator != null) __obj.updateDynamic("rightInterpolator")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.SceneInterpolatorProps) => rightInterpolator(t0).runNow()))
    if (titleInterpolator != null) __obj.updateDynamic("titleInterpolator")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.SceneInterpolatorProps) => titleInterpolator(t0).runNow()))
    if (transitionPreset != null) __obj.updateDynamic("transitionPreset")(transitionPreset.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDashNavigationDashStack.PickPropsscenenavigationpositionlayoutPresetbackTi, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsHeaderHeaderMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDashNavigationDashStack.PickPropsscenenavigationpositionlayoutPresetbackTi])(children: _*)
  }
  @JSImport("react-navigation-stack/lib/typescript/views/Header/Header", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

