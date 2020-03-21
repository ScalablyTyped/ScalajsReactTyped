package typingsJapgolly.jsqubits.mod.jsqubits

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Measurement extends js.Object {
  var newState: QState
  var numBits: Double
  var result: Double
  def asBitString(): String
}

object Measurement {
  @scala.inline
  def apply(asBitString: CallbackTo[String], newState: QState, numBits: Double, result: Double): Measurement = {
    val __obj = js.Dynamic.literal(newState = newState.asInstanceOf[js.Any], numBits = numBits.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.updateDynamic("asBitString")(asBitString.toJsFn)
    __obj.asInstanceOf[Measurement]
  }
}

