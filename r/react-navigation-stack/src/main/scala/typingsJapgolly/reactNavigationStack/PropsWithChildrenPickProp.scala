package typingsJapgolly.reactNavigationStack

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactNative.mod.Animated.Value
import typingsJapgolly.reactNavigation.mod.NavigationParams
import typingsJapgolly.reactNavigation.mod.NavigationRoute
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

/* Inlined react.react.PropsWithChildren<std.Pick<react-navigation-stack.react-navigation-stack/lib/typescript/views/Header/Header.Props, 'scene' | 'navigation' | 'position' | 'layoutPreset' | 'backTitleVisible' | 'scenes' | 'layout' | 'mode' | 'transitionPreset' | 'leftInterpolator' | 'titleInterpolator' | 'rightInterpolator' | 'backgroundInterpolator' | 'leftLabelInterpolator' | 'leftButtonInterpolator' | 'titleFromLeftInterpolator' | 'layoutInterpolator' | 'theme'>> */
trait PropsWithChildrenPickProp extends js.Object {
  var backTitleVisible: js.UndefOr[Boolean] = js.undefined
  var backgroundInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.undefined
  var children: js.UndefOr[Node] = js.undefined
  var layout: TransitionerLayout
  var layoutInterpolator: js.Function1[/* props */ SceneInterpolatorProps, _]
  var layoutPreset: HeaderLayoutPreset
  var leftButtonInterpolator: js.Function1[/* props */ SceneInterpolatorProps, _]
  var leftInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.undefined
  var leftLabelInterpolator: js.Function1[/* props */ SceneInterpolatorProps, _]
  var mode: HeaderMode
  var navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams]
  var position: Value
  var rightInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.undefined
  var scene: Scene
  var scenes: js.Array[Scene]
  var theme: String
  var titleFromLeftInterpolator: js.Function1[/* props */ SceneInterpolatorProps, _]
  var titleInterpolator: js.UndefOr[js.Function1[/* props */ SceneInterpolatorProps, _]] = js.undefined
  var transitionPreset: js.UndefOr[HeaderTransitionPreset] = js.undefined
}

object PropsWithChildrenPickProp {
  @scala.inline
  def apply(
    layout: TransitionerLayout,
    layoutInterpolator: /* props */ SceneInterpolatorProps => CallbackTo[js.Any],
    layoutPreset: HeaderLayoutPreset,
    leftButtonInterpolator: /* props */ SceneInterpolatorProps => CallbackTo[js.Any],
    leftLabelInterpolator: /* props */ SceneInterpolatorProps => CallbackTo[js.Any],
    mode: HeaderMode,
    navigation: NavigationStackProp[NavigationRoute[NavigationParams], NavigationParams],
    position: Value,
    scene: Scene,
    scenes: js.Array[Scene],
    theme: String,
    titleFromLeftInterpolator: /* props */ SceneInterpolatorProps => CallbackTo[js.Any],
    backTitleVisible: js.UndefOr[Boolean] = js.undefined,
    backgroundInterpolator: /* props */ SceneInterpolatorProps => CallbackTo[js.Any] = null,
    children: VdomNode = null,
    leftInterpolator: /* props */ SceneInterpolatorProps => CallbackTo[js.Any] = null,
    rightInterpolator: /* props */ SceneInterpolatorProps => CallbackTo[js.Any] = null,
    titleInterpolator: /* props */ SceneInterpolatorProps => CallbackTo[js.Any] = null,
    transitionPreset: HeaderTransitionPreset = null
  ): PropsWithChildrenPickProp = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any], layoutPreset = layoutPreset.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], scenes = scenes.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.updateDynamic("layoutInterpolator")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactNavigationStack.typesMod.SceneInterpolatorProps) => layoutInterpolator(t0).runNow()))
    __obj.updateDynamic("leftButtonInterpolator")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactNavigationStack.typesMod.SceneInterpolatorProps) => leftButtonInterpolator(t0).runNow()))
    __obj.updateDynamic("leftLabelInterpolator")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactNavigationStack.typesMod.SceneInterpolatorProps) => leftLabelInterpolator(t0).runNow()))
    __obj.updateDynamic("titleFromLeftInterpolator")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactNavigationStack.typesMod.SceneInterpolatorProps) => titleFromLeftInterpolator(t0).runNow()))
    if (!js.isUndefined(backTitleVisible)) __obj.updateDynamic("backTitleVisible")(backTitleVisible.asInstanceOf[js.Any])
    if (backgroundInterpolator != null) __obj.updateDynamic("backgroundInterpolator")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactNavigationStack.typesMod.SceneInterpolatorProps) => backgroundInterpolator(t0).runNow()))
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (leftInterpolator != null) __obj.updateDynamic("leftInterpolator")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactNavigationStack.typesMod.SceneInterpolatorProps) => leftInterpolator(t0).runNow()))
    if (rightInterpolator != null) __obj.updateDynamic("rightInterpolator")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactNavigationStack.typesMod.SceneInterpolatorProps) => rightInterpolator(t0).runNow()))
    if (titleInterpolator != null) __obj.updateDynamic("titleInterpolator")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactNavigationStack.typesMod.SceneInterpolatorProps) => titleInterpolator(t0).runNow()))
    if (transitionPreset != null) __obj.updateDynamic("transitionPreset")(transitionPreset.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsWithChildrenPickProp]
  }
}

