package typingsJapgolly.noisejs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Noise extends js.Object {
  /**
    * 2D Perlin Noise
    * @param  {number} x
    * @param  {number} y
    * @return {number} noise value
    */
  def perlin2(x: Double, y: Double): Double
  /**
    * 3D Perlin Noise
    * @param  {number} x
    * @param  {number} y
    * @param  {number} z
    * @return {number} noise value
    */
  def perlin3(x: Double, y: Double, z: Double): Double
  /**
    * This isn't a very good seeding function, but it works ok. It supports 2^16
    * different seed values. Write something better if you need more seeds.
    * @param {number} seed [description]
    */
  def seed(seed: Double): Unit
  /**
    * 2D simplex noise
    * @param  {number} x
    * @param  {number} y
    * @return {number} noise value
    */
  def simplex2(x: Double, y: Double): Double
  /**
    * 3D simplex noise
    * @param  {number} x
    * @param  {number} y
    * @param  {number} z
    * @return {number} noise value
    */
  def simplex3(x: Double, y: Double, z: Double): Double
}

object Noise {
  @scala.inline
  def apply(
    perlin2: (Double, Double) => CallbackTo[Double],
    perlin3: (Double, Double, Double) => CallbackTo[Double],
    seed: Double => Callback,
    simplex2: (Double, Double) => CallbackTo[Double],
    simplex3: (Double, Double, Double) => CallbackTo[Double]
  ): Noise = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("perlin2")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => perlin2(t0, t1).runNow()))
    __obj.updateDynamic("perlin3")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => perlin3(t0, t1, t2).runNow()))
    __obj.updateDynamic("seed")(js.Any.fromFunction1((t0: scala.Double) => seed(t0).runNow()))
    __obj.updateDynamic("simplex2")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => simplex2(t0, t1).runNow()))
    __obj.updateDynamic("simplex3")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => simplex3(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Noise]
  }
}

