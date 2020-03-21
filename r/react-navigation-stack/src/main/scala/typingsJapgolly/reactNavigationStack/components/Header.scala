package typingsJapgolly.reactNavigationStack.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.Animated.Value
import typingsJapgolly.reactNavigation.mod.NavigationParams
import typingsJapgolly.reactNavigation.mod.NavigationRoute
import typingsJapgolly.reactNavigationStack.PickPropsscenenavigationp
import typingsJapgolly.reactNavigationStack.headerMod.default
import typingsJapgolly.reactNavigationStack.typesMod.HeaderLayoutPreset
import typingsJapgolly.reactNavigationStack.typesMod.HeaderMode
import typingsJapgolly.reactNavigationStack.typesMod.HeaderTransitionPreset
import typingsJapgolly.reactNavigationStack.typesMod.NavigationStackProp
import typingsJapgolly.reactNavigationStack.typesMod.Scene
import typingsJapgolly.reactNavigationStack.typesMod.SceneInterpolatorProps
import typingsJapgolly.reactNavigationStack.typesMod.TransitionerLayout
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
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PickPropsscenenavigationp, default, Unit, PickPropsscenenavigationp] = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any], layoutPreset = layoutPreset.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], scenes = scenes.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
  
      __obj.updateDynamic("layoutInterpolator")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactNavigationStack.typesMod.SceneInterpolatorProps) => layoutInterpolator(t0).runNow()))
    __obj.updateDynamic("leftButtonInterpolator")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactNavigationStack.typesMod.SceneInterpolatorProps) => leftButtonInterpolator(t0).runNow()))
    __obj.updateDynamic("leftLabelInterpolator")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactNavigationStack.typesMod.SceneInterpolatorProps) => leftLabelInterpolator(t0).runNow()))
    __obj.updateDynamic("titleFromLeftInterpolator")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactNavigationStack.typesMod.SceneInterpolatorProps) => titleFromLeftInterpolator(t0).runNow()))
    if (!js.isUndefined(backTitleVisible)) __obj.updateDynamic("backTitleVisible")(backTitleVisible.asInstanceOf[js.Any])
    if (backgroundInterpolator != null) __obj.updateDynamic("backgroundInterpolator")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactNavigationStack.typesMod.SceneInterpolatorProps) => backgroundInterpolator(t0).runNow()))
    if (leftInterpolator != null) __obj.updateDynamic("leftInterpolator")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactNavigationStack.typesMod.SceneInterpolatorProps) => leftInterpolator(t0).runNow()))
    if (rightInterpolator != null) __obj.updateDynamic("rightInterpolator")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactNavigationStack.typesMod.SceneInterpolatorProps) => rightInterpolator(t0).runNow()))
    if (titleInterpolator != null) __obj.updateDynamic("titleInterpolator")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactNavigationStack.typesMod.SceneInterpolatorProps) => titleInterpolator(t0).runNow()))
    if (transitionPreset != null) __obj.updateDynamic("transitionPreset")(transitionPreset.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNavigationStack.PickPropsscenenavigationp, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNavigationStack.headerMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNavigationStack.PickPropsscenenavigationp])(children: _*)
  }
  @JSImport("react-navigation-stack/lib/typescript/views/Header/Header", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

