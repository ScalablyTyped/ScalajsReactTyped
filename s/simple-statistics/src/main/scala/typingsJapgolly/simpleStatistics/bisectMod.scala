package typingsJapgolly.simpleStatistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("simple-statistics/src/bisect", JSImport.Namespace)
@js.native
object bisectMod extends js.Object {
  def default(
    func: js.Function1[/* x */ js.Any, Double],
    start: Double,
    end: Double,
    maxIterations: Double,
    errorTolerance: Double
  ): Double = js.native
}

