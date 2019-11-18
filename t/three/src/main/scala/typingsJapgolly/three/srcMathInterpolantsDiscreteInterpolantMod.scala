package typingsJapgolly.three

import typingsJapgolly.three.srcMathInterpolantMod.Interpolant
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/math/interpolants/DiscreteInterpolant", JSImport.Namespace)
@js.native
object srcMathInterpolantsDiscreteInterpolantMod extends js.Object {
  @js.native
  class DiscreteInterpolant protected () extends Interpolant {
    def this(parameterPositions: js.Any, samplesValues: js.Any, sampleSize: Double) = this()
    def this(parameterPositions: js.Any, samplesValues: js.Any, sampleSize: Double, resultBuffer: js.Any) = this()
    def interpolate_(i1: Double, t0: Double, t: Double, t1: Double): js.Any = js.native
  }
  
}

