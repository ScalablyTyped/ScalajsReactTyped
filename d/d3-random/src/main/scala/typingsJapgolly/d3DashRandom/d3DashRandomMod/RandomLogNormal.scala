package typingsJapgolly.d3DashRandom.d3DashRandomMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RandomLogNormal extends RandomNumberGenerationSource {
  /**
    * Returns a function for generating random numbers with a log-normal distribution. The expected value of the random variable’s natural logarithm is mu,
    * with the given standard deviation sigma. If mu is not specified, it defaults to 0; if sigma is not specified, it defaults to 1.
    *
    * @param mu Expected value, defaults to 0.
    * @param sigma Standard deviation, defaults to 1.
    */
  def apply(): js.Function0[Double] = js.native
  def apply(mu: Double): js.Function0[Double] = js.native
  def apply(mu: Double, sigma: Double): js.Function0[Double] = js.native
}

@JSImport("d3-random", "randomLogNormal")
@js.native
object randomLogNormal extends TopLevel[RandomLogNormal]

