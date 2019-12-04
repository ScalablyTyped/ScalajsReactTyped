package typingsJapgolly.reactDashNavigationDashStack

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactDashNative.reactDashNativeMod.StyleProp
import typingsJapgolly.reactDashNative.reactDashNativeMod.ViewStyle
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.SceneInterpolator
import typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.SceneInterpolatorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react-navigation-stack.react-navigation-stack/lib/typescript/types.TransitionConfig & react-navigation-stack.react-navigation-stack/lib/typescript/types.HeaderTransitionConfig */
trait TransitionConfigHeaderTransitionConfig extends js.Object {
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var containerStyleDark: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var containerStyleLight: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var headerBackgroundInterpolator: js.UndefOr[SceneInterpolator] = js.undefined
  var headerLayoutInterpolator: js.UndefOr[SceneInterpolator] = js.undefined
  var headerLeftButtonInterpolator: js.UndefOr[SceneInterpolator] = js.undefined
  var headerLeftInterpolator: js.UndefOr[SceneInterpolator] = js.undefined
  var headerLeftLabelInterpolator: js.UndefOr[SceneInterpolator] = js.undefined
  var headerRightInterpolator: js.UndefOr[SceneInterpolator] = js.undefined
  var headerTitleFromLeftInterpolator: js.UndefOr[SceneInterpolator] = js.undefined
  var headerTitleInterpolator: js.UndefOr[SceneInterpolator] = js.undefined
  var screenInterpolator: SceneInterpolator
  var transitionSpec: Anon_Timing
}

object TransitionConfigHeaderTransitionConfig {
  @scala.inline
  def apply(
    screenInterpolator: /* props */ SceneInterpolatorProps => CallbackTo[js.Any],
    transitionSpec: Anon_Timing,
    containerStyle: StyleProp[ViewStyle] = null,
    containerStyleDark: StyleProp[ViewStyle] = null,
    containerStyleLight: StyleProp[ViewStyle] = null,
    headerBackgroundInterpolator: /* props */ SceneInterpolatorProps => CallbackTo[js.Any] = null,
    headerLayoutInterpolator: /* props */ SceneInterpolatorProps => CallbackTo[js.Any] = null,
    headerLeftButtonInterpolator: /* props */ SceneInterpolatorProps => CallbackTo[js.Any] = null,
    headerLeftInterpolator: /* props */ SceneInterpolatorProps => CallbackTo[js.Any] = null,
    headerLeftLabelInterpolator: /* props */ SceneInterpolatorProps => CallbackTo[js.Any] = null,
    headerRightInterpolator: /* props */ SceneInterpolatorProps => CallbackTo[js.Any] = null,
    headerTitleFromLeftInterpolator: /* props */ SceneInterpolatorProps => CallbackTo[js.Any] = null,
    headerTitleInterpolator: /* props */ SceneInterpolatorProps => CallbackTo[js.Any] = null
  ): TransitionConfigHeaderTransitionConfig = {
    val __obj = js.Dynamic.literal(transitionSpec = transitionSpec.asInstanceOf[js.Any])
    __obj.updateDynamic("screenInterpolator")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.SceneInterpolatorProps) => screenInterpolator(t0).runNow()))
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (containerStyleDark != null) __obj.updateDynamic("containerStyleDark")(containerStyleDark.asInstanceOf[js.Any])
    if (containerStyleLight != null) __obj.updateDynamic("containerStyleLight")(containerStyleLight.asInstanceOf[js.Any])
    if (headerBackgroundInterpolator != null) __obj.updateDynamic("headerBackgroundInterpolator")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.SceneInterpolatorProps) => headerBackgroundInterpolator(t0).runNow()))
    if (headerLayoutInterpolator != null) __obj.updateDynamic("headerLayoutInterpolator")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.SceneInterpolatorProps) => headerLayoutInterpolator(t0).runNow()))
    if (headerLeftButtonInterpolator != null) __obj.updateDynamic("headerLeftButtonInterpolator")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.SceneInterpolatorProps) => headerLeftButtonInterpolator(t0).runNow()))
    if (headerLeftInterpolator != null) __obj.updateDynamic("headerLeftInterpolator")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.SceneInterpolatorProps) => headerLeftInterpolator(t0).runNow()))
    if (headerLeftLabelInterpolator != null) __obj.updateDynamic("headerLeftLabelInterpolator")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.SceneInterpolatorProps) => headerLeftLabelInterpolator(t0).runNow()))
    if (headerRightInterpolator != null) __obj.updateDynamic("headerRightInterpolator")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.SceneInterpolatorProps) => headerRightInterpolator(t0).runNow()))
    if (headerTitleFromLeftInterpolator != null) __obj.updateDynamic("headerTitleFromLeftInterpolator")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.SceneInterpolatorProps) => headerTitleFromLeftInterpolator(t0).runNow()))
    if (headerTitleInterpolator != null) __obj.updateDynamic("headerTitleInterpolator")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.SceneInterpolatorProps) => headerTitleInterpolator(t0).runNow()))
    __obj.asInstanceOf[TransitionConfigHeaderTransitionConfig]
  }
}

