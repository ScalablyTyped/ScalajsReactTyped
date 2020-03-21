package typingsJapgolly.rotJs.simplexMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.rotJs.noiseNoiseMod.Noise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Simplex extends Noise {
  var _gradients: js.Array[js.Array[Double]]
  var _indexes: js.Array[Double]
  var _perms: js.Array[Double]
}

object Simplex {
  @scala.inline
  def apply(
    _gradients: js.Array[js.Array[Double]],
    _indexes: js.Array[Double],
    _perms: js.Array[Double],
    get: (Double, Double) => CallbackTo[Double]
  ): Simplex = {
    val __obj = js.Dynamic.literal(_gradients = _gradients.asInstanceOf[js.Any], _indexes = _indexes.asInstanceOf[js.Any], _perms = _perms.asInstanceOf[js.Any])
    __obj.updateDynamic("get")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => get(t0, t1).runNow()))
    __obj.asInstanceOf[Simplex]
  }
}

