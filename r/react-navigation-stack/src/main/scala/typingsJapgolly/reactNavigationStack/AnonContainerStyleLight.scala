package typingsJapgolly.reactNavigationStack

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactNavigationStack.typesMod.SceneInterpolatorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContainerStyleLight extends js.Object {
  var containerStyleDark: AnonBackgroundColor
  var containerStyleLight: AnonBackgroundColor
  var transitionSpec: AnonDamping | AnonDuration
  def screenInterpolator(props: SceneInterpolatorProps): AnonOpacityNumber | AnonOpacityTransform | AnonOpacityUndefinedTransformArray
}

object AnonContainerStyleLight {
  @scala.inline
  def apply(
    containerStyleDark: AnonBackgroundColor,
    containerStyleLight: AnonBackgroundColor,
    screenInterpolator: SceneInterpolatorProps => CallbackTo[AnonOpacityNumber | AnonOpacityTransform | AnonOpacityUndefinedTransformArray],
    transitionSpec: AnonDamping | AnonDuration
  ): AnonContainerStyleLight = {
    val __obj = js.Dynamic.literal(containerStyleDark = containerStyleDark.asInstanceOf[js.Any], containerStyleLight = containerStyleLight.asInstanceOf[js.Any], transitionSpec = transitionSpec.asInstanceOf[js.Any])
    __obj.updateDynamic("screenInterpolator")(js.Any.fromFunction1((t0: typingsJapgolly.reactNavigationStack.typesMod.SceneInterpolatorProps) => screenInterpolator(t0).runNow()))
    __obj.asInstanceOf[AnonContainerStyleLight]
  }
}

