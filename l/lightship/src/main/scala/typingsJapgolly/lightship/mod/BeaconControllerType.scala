package typingsJapgolly.lightship.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeaconControllerType extends js.Object {
  def die(): js.Promise[Unit]
}

object BeaconControllerType {
  @scala.inline
  def apply(die: CallbackTo[js.Promise[Unit]]): BeaconControllerType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("die")(die.toJsFn)
    __obj.asInstanceOf[BeaconControllerType]
  }
}

