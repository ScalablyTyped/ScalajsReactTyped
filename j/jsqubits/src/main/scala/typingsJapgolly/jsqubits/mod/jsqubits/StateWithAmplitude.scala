package typingsJapgolly.jsqubits.mod.jsqubits

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateWithAmplitude extends js.Object {
  var amplitude: Complex
  var index: Double
  var numBits: Double
  def asBitString(): String
  def asNumber(): Double
}

object StateWithAmplitude {
  @scala.inline
  def apply(
    amplitude: Complex,
    asBitString: CallbackTo[String],
    asNumber: CallbackTo[Double],
    index: Double,
    numBits: Double
  ): StateWithAmplitude = {
    val __obj = js.Dynamic.literal(amplitude = amplitude.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], numBits = numBits.asInstanceOf[js.Any])
    __obj.updateDynamic("asBitString")(asBitString.toJsFn)
    __obj.updateDynamic("asNumber")(asNumber.toJsFn)
    __obj.asInstanceOf[StateWithAmplitude]
  }
}

