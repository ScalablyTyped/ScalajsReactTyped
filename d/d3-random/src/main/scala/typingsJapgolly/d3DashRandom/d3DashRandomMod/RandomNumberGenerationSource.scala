package typingsJapgolly.d3DashRandom.d3DashRandomMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RandomNumberGenerationSource extends js.Object {
  /**
    * Returns the same type of function for generating random numbers but where the given random number
    * generator source is used as the source of randomness instead of Math.random.
    * This is useful when a seeded random number generator is preferable to Math.random.
    *
    * @param source Source (pseudo-)random number generator implementing the Math.random interface.
    * The given random number generator must implement the same interface as Math.random and
    * only return values in the range [0, 1).
    */
  def source(source: js.Function0[Double]): this.type
}

object RandomNumberGenerationSource {
  @scala.inline
  def apply(source: js.Function0[Double] => CallbackTo[RandomNumberGenerationSource]): RandomNumberGenerationSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("source")(js.Any.fromFunction1((t0: js.Function0[scala.Double]) => source(t0).runNow()))
    __obj.asInstanceOf[RandomNumberGenerationSource]
  }
}

