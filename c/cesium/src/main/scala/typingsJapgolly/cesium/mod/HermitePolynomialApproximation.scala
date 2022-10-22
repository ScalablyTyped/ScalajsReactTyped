package typingsJapgolly.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HermitePolynomialApproximation {
  
  @JSImport("cesium", "HermitePolynomialApproximation")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Given the desired degree, returns the number of data points required for interpolation.
    * @param degree - The desired degree of interpolation.
    * @param [inputOrder = 0] - The order of the inputs (0 means just the data, 1 means the data and its derivative, etc).
    * @returns The number of required data points needed for the desired degree of interpolation.
    */
  inline def getRequiredDataPoints(degree: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getRequiredDataPoints")(degree.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getRequiredDataPoints(degree: Double, inputOrder: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getRequiredDataPoints")(degree.asInstanceOf[js.Any], inputOrder.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Interpolates values using Hermite Polynomial Approximation.
    * @param x - The independent variable for which the dependent variables will be interpolated.
    * @param xTable - The array of independent variables to use to interpolate.  The values
    * in this array must be in increasing order and the same value must not occur twice in the array.
    * @param yTable - The array of dependent variables to use to interpolate.  For a set of three
    * dependent values (p,q,w) at time 1 and time 2 this should be as follows: {p1, q1, w1, p2, q2, w2}.
    * @param yStride - The number of dependent variable values in yTable corresponding to
    * each independent variable value in xTable.
    * @param inputOrder - The number of derivatives supplied for input.
    * @param outputOrder - The number of derivatives desired for output.
    * @param [result] - An existing array into which to store the result.
    * @returns The array of interpolated values, or the result parameter if one was provided.
    */
  inline def interpolate(
    x: Double,
    xTable: js.Array[Double],
    yTable: js.Array[Double],
    yStride: Double,
    inputOrder: Double,
    outputOrder: Double
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(x.asInstanceOf[js.Any], xTable.asInstanceOf[js.Any], yTable.asInstanceOf[js.Any], yStride.asInstanceOf[js.Any], inputOrder.asInstanceOf[js.Any], outputOrder.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def interpolate(
    x: Double,
    xTable: js.Array[Double],
    yTable: js.Array[Double],
    yStride: Double,
    inputOrder: Double,
    outputOrder: Double,
    result: js.Array[Double]
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(x.asInstanceOf[js.Any], xTable.asInstanceOf[js.Any], yTable.asInstanceOf[js.Any], yStride.asInstanceOf[js.Any], inputOrder.asInstanceOf[js.Any], outputOrder.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  /**
    * Interpolates values using Hermite Polynomial Approximation.
    * @param x - The independent variable for which the dependent variables will be interpolated.
    * @param xTable - The array of independent variables to use to interpolate.  The values
    * in this array must be in increasing order and the same value must not occur twice in the array.
    * @param yTable - The array of dependent variables to use to interpolate.  For a set of three
    * dependent values (p,q,w) at time 1 and time 2 this should be as follows: {p1, q1, w1, p2, q2, w2}.
    * @param yStride - The number of dependent variable values in yTable corresponding to
    * each independent variable value in xTable.
    * @param [result] - An existing array into which to store the result.
    * @returns The array of interpolated values, or the result parameter if one was provided.
    */
  inline def interpolateOrderZero(x: Double, xTable: js.Array[Double], yTable: js.Array[Double], yStride: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateOrderZero")(x.asInstanceOf[js.Any], xTable.asInstanceOf[js.Any], yTable.asInstanceOf[js.Any], yStride.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def interpolateOrderZero(
    x: Double,
    xTable: js.Array[Double],
    yTable: js.Array[Double],
    yStride: Double,
    result: js.Array[Double]
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateOrderZero")(x.asInstanceOf[js.Any], xTable.asInstanceOf[js.Any], yTable.asInstanceOf[js.Any], yStride.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
