package typingsJapgolly.reservoir

import typingsJapgolly.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("reservoir", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait ReservoirArray[T] extends Array[T] {
    /**
      * datum: one or more elements to consider for inclusion into the reservoir.
      * Returns the current length of the reservoir.
      */
    def pushSome(datum: T*): Double = js.native
  }
  
  /**
    * Create a new reservoir sampler.
    *
    * @param reservoirSize is the maximum size of the reservoir. This is the number of elements
    *   to be randomly chosen from the input provided to it using pushSome. Default is 1.
    * @param randomNumberGenerator is an optional random number generating function to use in
    *   place of the default Math.random.
    */
  def apply[T](): ReservoirArray[T] = js.native
  def apply[T](reservoirSize: Double): ReservoirArray[T] = js.native
  def apply[T](reservoirSize: Double, randomNumberGenerator: js.Function0[Double]): ReservoirArray[T] = js.native
}

