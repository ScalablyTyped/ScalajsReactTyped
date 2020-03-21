package typingsJapgolly.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "TridiagonalSystemSolver")
@js.native
object TridiagonalSystemSolver extends js.Object {
  def solve(
    diagonal: js.Array[Double],
    lower: js.Array[Double],
    upper: js.Array[Double],
    right: js.Array[Cartesian3]
  ): js.Array[Cartesian3] = js.native
}

