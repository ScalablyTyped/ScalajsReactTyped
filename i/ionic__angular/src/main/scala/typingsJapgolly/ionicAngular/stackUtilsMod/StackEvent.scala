package typingsJapgolly.ionicAngular.stackUtilsMod

import typingsJapgolly.ionicCore.interfaceMod.RouterDirection
import typingsJapgolly.ionicCore.navInterfaceMod.NavDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackEvent extends js.Object {
  var animation: js.UndefOr[NavDirection] = js.undefined
  var direction: RouterDirection
  var enteringView: RouteView
  var tabSwitch: Boolean
}

object StackEvent {
  @scala.inline
  def apply(
    direction: RouterDirection,
    enteringView: RouteView,
    tabSwitch: Boolean,
    animation: NavDirection = null
  ): StackEvent = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], enteringView = enteringView.asInstanceOf[js.Any], tabSwitch = tabSwitch.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackEvent]
  }
}

