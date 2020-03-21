package typingsJapgolly.reactNavigationStack

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTransitionSpec extends js.Object {
  var containerStyleDark: AnonBackgroundColor
  var containerStyleLight: AnonBackgroundColor
  var transitionSpec: AnonTiming
  def screenInterpolator(): js.Object
}

object AnonTransitionSpec {
  @scala.inline
  def apply(
    containerStyleDark: AnonBackgroundColor,
    containerStyleLight: AnonBackgroundColor,
    screenInterpolator: CallbackTo[js.Object],
    transitionSpec: AnonTiming
  ): AnonTransitionSpec = {
    val __obj = js.Dynamic.literal(containerStyleDark = containerStyleDark.asInstanceOf[js.Any], containerStyleLight = containerStyleLight.asInstanceOf[js.Any], transitionSpec = transitionSpec.asInstanceOf[js.Any])
    __obj.updateDynamic("screenInterpolator")(screenInterpolator.toJsFn)
    __obj.asInstanceOf[AnonTransitionSpec]
  }
}

