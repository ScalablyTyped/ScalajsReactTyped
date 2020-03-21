package typingsJapgolly.ranjs.mod

import typingsJapgolly.ranjs.AnonDim
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ranjs", "mc")
@js.native
object mc extends js.Object {
  @js.native
  class RWM protected ()
    extends typingsJapgolly.ranjs.mod._mc.MCMC {
    def this(logDensity: js.Function1[/* x */ js.Array[Double], Double]) = this()
    def this(logDensity: js.Function1[/* x */ js.Array[Double], Double], config: AnonDim) = this()
    def this(logDensity: js.Function1[/* x */ js.Array[Double], Double], config: AnonDim, initialState: State) = this()
  }
  
  def gr(samples: js.Array[js.Array[js.Array[Double]]]): js.Array[js.Array[Double]] = js.native
  def gr(samples: js.Array[js.Array[js.Array[Double]]], maxLength: Double): js.Array[js.Array[Double]] = js.native
  type MCMC = typingsJapgolly.ranjs.mod._mc.MCMC
  type State = typingsJapgolly.ranjs.mod._mc.State
}

