package typingsJapgolly.reactNavigationStack

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactNavigationStack.typesMod.SceneInterpolatorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonScreenInterpolator extends js.Object {
  var transitionSpec: AnonEasing
  def screenInterpolator(props: SceneInterpolatorProps): AnonOpacityNumber | AnonOpacityTransform | Anon1
}

object AnonScreenInterpolator {
  @scala.inline
  def apply(
    screenInterpolator: SceneInterpolatorProps => CallbackTo[AnonOpacityNumber | AnonOpacityTransform | Anon1],
    transitionSpec: AnonEasing
  ): AnonScreenInterpolator = {
    val __obj = js.Dynamic.literal(transitionSpec = transitionSpec.asInstanceOf[js.Any])
    __obj.updateDynamic("screenInterpolator")(js.Any.fromFunction1((t0: typingsJapgolly.reactNavigationStack.typesMod.SceneInterpolatorProps) => screenInterpolator(t0).runNow()))
    __obj.asInstanceOf[AnonScreenInterpolator]
  }
}

