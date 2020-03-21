package typingsJapgolly.rcDrawer

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSwitchScrollingEffect extends js.Object {
  def switchScrollingEffect(): Unit
}

object AnonSwitchScrollingEffect {
  @scala.inline
  def apply(switchScrollingEffect: Callback): AnonSwitchScrollingEffect = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("switchScrollingEffect")(switchScrollingEffect.toJsFn)
    __obj.asInstanceOf[AnonSwitchScrollingEffect]
  }
}

