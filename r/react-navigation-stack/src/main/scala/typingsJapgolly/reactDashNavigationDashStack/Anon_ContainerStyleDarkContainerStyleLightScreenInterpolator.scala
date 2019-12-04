package typingsJapgolly.reactDashNavigationDashStack

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainerStyleDarkContainerStyleLightScreenInterpolator extends js.Object {
  var containerStyleDark: Anon_BackgroundColor
  var containerStyleLight: Anon_BackgroundColor
  var transitionSpec: Anon_ConfigDurationTiming
  def screenInterpolator(): js.Object
}

object Anon_ContainerStyleDarkContainerStyleLightScreenInterpolator {
  @scala.inline
  def apply(
    containerStyleDark: Anon_BackgroundColor,
    containerStyleLight: Anon_BackgroundColor,
    screenInterpolator: CallbackTo[js.Object],
    transitionSpec: Anon_ConfigDurationTiming
  ): Anon_ContainerStyleDarkContainerStyleLightScreenInterpolator = {
    val __obj = js.Dynamic.literal(containerStyleDark = containerStyleDark.asInstanceOf[js.Any], containerStyleLight = containerStyleLight.asInstanceOf[js.Any], transitionSpec = transitionSpec.asInstanceOf[js.Any])
    __obj.updateDynamic("screenInterpolator")(screenInterpolator.toJsFn)
    __obj.asInstanceOf[Anon_ContainerStyleDarkContainerStyleLightScreenInterpolator]
  }
}

