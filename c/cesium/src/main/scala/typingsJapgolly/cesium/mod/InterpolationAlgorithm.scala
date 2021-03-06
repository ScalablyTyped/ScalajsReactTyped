package typingsJapgolly.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line no-unnecessary-class
@JSImport("cesium", "InterpolationAlgorithm")
@js.native
class InterpolationAlgorithm () extends js.Object

/* static members */
@JSImport("cesium", "InterpolationAlgorithm")
@js.native
object InterpolationAlgorithm extends js.Object {
  var `type`: String = js.native
  def getRequiredDataPoints(degree: Double): Double = js.native
  def interpolate(
    x: Double,
    xTable: js.Array[Double],
    yTable: js.Array[Double],
    yStride: Double,
    inputOrder: Double,
    outputOrder: Double
  ): js.Array[Double] = js.native
  def interpolate(
    x: Double,
    xTable: js.Array[Double],
    yTable: js.Array[Double],
    yStride: Double,
    inputOrder: Double,
    outputOrder: Double,
    result: js.Array[Double]
  ): js.Array[Double] = js.native
  def interpolateOrderZero(x: Double, xTable: js.Array[Double], yTable: js.Array[Double], yStride: Double): js.Array[Double] = js.native
  def interpolateOrderZero(
    x: Double,
    xTable: js.Array[Double],
    yTable: js.Array[Double],
    yStride: Double,
    result: js.Array[Double]
  ): js.Array[Double] = js.native
}

