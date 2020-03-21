package typingsJapgolly.mersenneTwister.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MersenneTwister extends js.Object {
  /**
    * initializes mt with a number
    */
  def init_seed(seed: Double): Unit
  /**
    * generates a random number on [0,1)-real-interval
    */
  def random(): Double
  /**
    * generates a random number on (0,1)-real-interval
    */
  def random_excl(): Double
  /**
    * generates a random number on [0,1]-real-interval
    */
  def random_incl(): Double
  /**
    * generates a random number on [0,0xffffffff]-interval
    */
  def random_int(): Double
  /**
    * generates a random number on [0,0x7fffffff]-interval
    */
  def random_int31(): Double
  /**
    * generates a random number on [0,1) with 53-bit resolution
    */
  def random_long(): Double
}

object MersenneTwister {
  @scala.inline
  def apply(
    init_seed: Double => Callback,
    random: CallbackTo[Double],
    random_excl: CallbackTo[Double],
    random_incl: CallbackTo[Double],
    random_int: CallbackTo[Double],
    random_int31: CallbackTo[Double],
    random_long: CallbackTo[Double]
  ): MersenneTwister = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("init_seed")(js.Any.fromFunction1((t0: scala.Double) => init_seed(t0).runNow()))
    __obj.updateDynamic("random")(random.toJsFn)
    __obj.updateDynamic("random_excl")(random_excl.toJsFn)
    __obj.updateDynamic("random_incl")(random_incl.toJsFn)
    __obj.updateDynamic("random_int")(random_int.toJsFn)
    __obj.updateDynamic("random_int31")(random_int31.toJsFn)
    __obj.updateDynamic("random_long")(random_long.toJsFn)
    __obj.asInstanceOf[MersenneTwister]
  }
}

