package typingsJapgolly.go

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRandom extends js.Object {
  def random(): Double
}

object AnonRandom {
  @scala.inline
  def apply(random: CallbackTo[Double]): AnonRandom = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("random")(random.toJsFn)
    __obj.asInstanceOf[AnonRandom]
  }
}

