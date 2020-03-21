package typingsJapgolly.reactNavigationStack.typesMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNavigationStack.AnonTimingFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionConfig extends js.Object {
  var containerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var containerStyleDark: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var containerStyleLight: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var screenInterpolator: SceneInterpolator
  var transitionSpec: AnonTimingFunction
}

object TransitionConfig {
  @scala.inline
  def apply(
    screenInterpolator: /* props */ SceneInterpolatorProps => CallbackTo[js.Any],
    transitionSpec: AnonTimingFunction,
    containerStyle: StyleProp[ViewStyle] = null,
    containerStyleDark: StyleProp[ViewStyle] = null,
    containerStyleLight: StyleProp[ViewStyle] = null
  ): TransitionConfig = {
    val __obj = js.Dynamic.literal(transitionSpec = transitionSpec.asInstanceOf[js.Any])
    __obj.updateDynamic("screenInterpolator")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactNavigationStack.typesMod.SceneInterpolatorProps) => screenInterpolator(t0).runNow()))
    if (containerStyle != null) __obj.updateDynamic("containerStyle")(containerStyle.asInstanceOf[js.Any])
    if (containerStyleDark != null) __obj.updateDynamic("containerStyleDark")(containerStyleDark.asInstanceOf[js.Any])
    if (containerStyleLight != null) __obj.updateDynamic("containerStyleLight")(containerStyleLight.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitionConfig]
  }
}

