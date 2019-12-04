package typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactDashNative.reactDashNativeMod.StyleProp
import typingsJapgolly.reactDashNative.reactDashNativeMod.ViewStyle
import typingsJapgolly.reactDashNavigationDashStack.Anon_Timing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionConfig extends js.Object {
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var containerStyleDark: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var containerStyleLight: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var screenInterpolator: SceneInterpolator
  var transitionSpec: Anon_Timing
}

object TransitionConfig {
  @scala.inline
  def apply(
    screenInterpolator: /* props */ SceneInterpolatorProps => CallbackTo[js.Any],
    transitionSpec: Anon_Timing,
    containerStyle: StyleProp[ViewStyle] = null,
    containerStyleDark: StyleProp[ViewStyle] = null,
    containerStyleLight: StyleProp[ViewStyle] = null
  ): TransitionConfig = {
    val __obj = js.Dynamic.literal(transitionSpec = transitionSpec.asInstanceOf[js.Any])
    __obj.updateDynamic("screenInterpolator")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactDashNavigationDashStack.libTypescriptTypesMod.SceneInterpolatorProps) => screenInterpolator(t0).runNow()))
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (containerStyleDark != null) __obj.updateDynamic("containerStyleDark")(containerStyleDark.asInstanceOf[js.Any])
    if (containerStyleLight != null) __obj.updateDynamic("containerStyleLight")(containerStyleLight.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionConfig]
  }
}

