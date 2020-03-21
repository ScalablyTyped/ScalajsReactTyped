package typingsJapgolly.threeTdsLoader

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofCurveUtils extends js.Object {
  def interpolate(p0: Double, p1: Double, p2: Double, p3: Double, t: Double): Double
  def tangentCubicBezier(t: Double, p0: Double, p1: Double, p2: Double, p3: Double): Double
  def tangentQuadraticBezier(t: Double, p0: Double, p1: Double, p2: Double): Double
  def tangentSpline(t: Double, p0: Double, p1: Double, p2: Double, p3: Double): Double
}

object TypeofCurveUtils {
  @scala.inline
  def apply(
    interpolate: (Double, Double, Double, Double, Double) => CallbackTo[Double],
    tangentCubicBezier: (Double, Double, Double, Double, Double) => CallbackTo[Double],
    tangentQuadraticBezier: (Double, Double, Double, Double) => CallbackTo[Double],
    tangentSpline: (Double, Double, Double, Double, Double) => CallbackTo[Double]
  ): TypeofCurveUtils = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("interpolate")(js.Any.fromFunction5((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double, t4: scala.Double) => interpolate(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("tangentCubicBezier")(js.Any.fromFunction5((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double, t4: scala.Double) => tangentCubicBezier(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("tangentQuadraticBezier")(js.Any.fromFunction4((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double) => tangentQuadraticBezier(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("tangentSpline")(js.Any.fromFunction5((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double, t4: scala.Double) => tangentSpline(t0, t1, t2, t3, t4).runNow()))
    __obj.asInstanceOf[TypeofCurveUtils]
  }
}

