package typingsJapgolly.reactDashNavigationDashStack.libTypescriptViewsHeaderHeaderMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactDashNative.reactDashNativeMod.Animated.Value
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationParams
import typingsJapgolly.reactDashNavigation.reactDashNavigationMod.NavigationRoute
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.HeaderLayoutPreset
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.HeaderMode
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.HeaderTransitionPreset
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.NavigationStackProp
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.Scene
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.SceneInterpolatorProps
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.TransitionerLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-navigation-stack.react-navigation-stack/lib/typescript/types.HeaderProps & {leftLabelInterpolator (props : react-navigation-stack.react-navigation-stack/lib/typescript/types.SceneInterpolatorProps): any, leftButtonInterpolator (props : react-navigation-stack.react-navigation-stack/lib/typescript/types.SceneInterpolatorProps): any, titleFromLeftInterpolator (props : react-navigation-stack.react-navigation-stack/lib/typescript/types.SceneInterpolatorProps): any, layoutInterpolator (props : react-navigation-stack.react-navigation-stack/lib/typescript/types.SceneInterpolatorProps): any,   theme  :string} */
trait Props extends js.Object {
  var backTitleVisible: js.UndefOr[Boolean] = js.undefined
  var backgroundInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.undefined
  var isLandscape: Boolean
  var layout: TransitionerLayout
  var layoutPreset: HeaderLayoutPreset
  var leftInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.undefined
  var mode: HeaderMode
  var navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams]
  var position: Value
  var rightInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.undefined
  var scene: Scene
  var scenes: js.Array[Scene]
  var theme: String
  var titleInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.undefined
  var transitionPreset: js.UndefOr[HeaderTransitionPreset] = js.undefined
  def layoutInterpolator(props: SceneInterpolatorProps): js.Any
  def leftButtonInterpolator(props: SceneInterpolatorProps): js.Any
  def leftLabelInterpolator(props: SceneInterpolatorProps): js.Any
  def titleFromLeftInterpolator(props: SceneInterpolatorProps): js.Any
}

object Props {
  @scala.inline
  def apply(
    isLandscape: Boolean,
    layout: TransitionerLayout,
    layoutInterpolator: SceneInterpolatorProps => CallbackTo[js.Any],
    layoutPreset: HeaderLayoutPreset,
    leftButtonInterpolator: SceneInterpolatorProps => CallbackTo[js.Any],
    leftLabelInterpolator: SceneInterpolatorProps => CallbackTo[js.Any],
    mode: HeaderMode,
    navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams],
    position: Value,
    scene: Scene,
    scenes: js.Array[Scene],
    theme: String,
    titleFromLeftInterpolator: SceneInterpolatorProps => CallbackTo[js.Any],
    backTitleVisible: js.UndefOr[Boolean] = js.undefined,
    backgroundInterpolator: /* props */ SceneInterpolatorProps => CallbackTo[js.Any] = null,
    leftInterpolator: /* props */ SceneInterpolatorProps => CallbackTo[js.Any] = null,
    rightInterpolator: /* props */ SceneInterpolatorProps => CallbackTo[js.Any] = null,
    titleInterpolator: /* props */ SceneInterpolatorProps => CallbackTo[js.Any] = null,
    transitionPreset: HeaderTransitionPreset = null
  ): Props = {
    val __obj = js.Dynamic.literal(isLandscape = isLandscape.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], layoutPreset = layoutPreset.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], scenes = scenes.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.updateDynamic("layoutInterpolator")(js.Any.fromFunction1((t0: typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.SceneInterpolatorProps) => layoutInterpolator(t0).runNow()))
    __obj.updateDynamic("leftButtonInterpolator")(js.Any.fromFunction1((t0: typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.SceneInterpolatorProps) => leftButtonInterpolator(t0).runNow()))
    __obj.updateDynamic("leftLabelInterpolator")(js.Any.fromFunction1((t0: typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.SceneInterpolatorProps) => leftLabelInterpolator(t0).runNow()))
    __obj.updateDynamic("titleFromLeftInterpolator")(js.Any.fromFunction1((t0: typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.SceneInterpolatorProps) => titleFromLeftInterpolator(t0).runNow()))
    if (!js.isUndefined(backTitleVisible)) __obj.updateDynamic("backTitleVisible")(backTitleVisible.asInstanceOf[js.Any])
    if (backgroundInterpolator != null) __obj.updateDynamic("backgroundInterpolator")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.SceneInterpolatorProps) => backgroundInterpolator(t0).runNow()))
    if (leftInterpolator != null) __obj.updateDynamic("leftInterpolator")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.SceneInterpolatorProps) => leftInterpolator(t0).runNow()))
    if (rightInterpolator != null) __obj.updateDynamic("rightInterpolator")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.SceneInterpolatorProps) => rightInterpolator(t0).runNow()))
    if (titleInterpolator != null) __obj.updateDynamic("titleInterpolator")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.SceneInterpolatorProps) => titleInterpolator(t0).runNow()))
    if (transitionPreset != null) __obj.updateDynamic("transitionPreset")(transitionPreset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

