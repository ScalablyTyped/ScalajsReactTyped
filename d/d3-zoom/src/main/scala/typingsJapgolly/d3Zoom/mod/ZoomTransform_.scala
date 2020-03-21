package typingsJapgolly.d3Zoom.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZoomTransform_ extends js.Object {
  /**
    * The scale factor k.
    * This property should be considered read-only; instead of mutating a transform,
    * use transform.scale and transform.translate to derive a new transform.
    * Also see zoom.scaleBy, zoom.scaleTo and zoom.translateBy for convenience methods on the zoom behavior.
    */
  val k: Double
  /**
    * The translation amount tx along the x-axis.
    * This property should be considered read-only; instead of mutating a transform,
    * use transform.scale and transform.translate to derive a new transform.
    * Also see zoom.scaleBy, zoom.scaleTo and zoom.translateBy for convenience methods on the zoom behavior.
    */
  val x: Double
  /**
    * The translation amount ty along the y-axis
    * This property should be considered read-only; instead of mutating a transform,
    * use transform.scale and transform.translate to derive a new transform.
    * Also see zoom.scaleBy, zoom.scaleTo and zoom.translateBy for convenience methods on the zoom behavior.
    */
  val y: Double
  /**
    * Return the transformation of the specified point which is a two-element array of numbers [x, y].
    * The returned point is equal to [xk + tx, yk + ty].
    *
    * @param point Point coordinates [x, y]
    */
  @JSName("apply")
  def apply(point: js.Tuple2[Double, Double]): js.Tuple2[Double, Double]
  /**
    * Return the transformation of the specified x-coordinate, xk + tx.
    *
    * @param x Value of x-coordinate.
    */
  def applyX(x: Double): Double
  /**
    * Return the transformation of the specified y-coordinate, yk + ty.
    *
    * @param y Value of y-coordinate.
    */
  def applyY(y: Double): Double
  /**
    * Return the inverse transformation of the specified point which is a two-element array of numbers [x, y].
    * The returned point is equal to [(x - tx) / k, (y - ty) / k].
    *
    * @param point Point coordinates [x, y]
    */
  def invert(point: js.Tuple2[Double, Double]): js.Tuple2[Double, Double]
  /**
    * Return the inverse transformation of the specified x-coordinate, (x - tx) / k.
    *
    * @param x Value of x-coordinate.
    */
  def invertX(x: Double): Double
  /**
    * Return the inverse transformation of the specified y-coordinate, (y - ty) / k.
    *
    * @param y Value of y-coordinate.
    */
  def invertY(y: Double): Double
  /**
    * Returns a copy of the continuous scale x whose domain is transformed.
    * This is implemented by first applying the inverse x-transform on the scale’s range,
    * and then applying the inverse scale to compute the corresponding domain
    *
    * The scale x must use d3.interpolateNumber; do not use continuous.rangeRound as this
    * reduces the accuracy of continuous.invert and can lead to an inaccurate rescaled domain.
    * This method does not modify the input scale x; x thus represents the untransformed scale,
    * while the returned scale represents its transformed view.
    *
    * @param xScale A continuous scale for x-dimension.
    */
  def rescaleX[S /* <: ZoomScale */](xScale: S): S
  /**
    * Returns a copy of the continuous scale y whose domain is transformed.
    * This is implemented by first applying the inverse y-transform on the scale’s range,
    * and then applying the inverse scale to compute the corresponding domain
    *
    * The scale y must use d3.interpolateNumber; do not use continuous.rangeRound as this
    * reduces the accuracy of continuous.invert and can lead to an inaccurate rescaled domain.
    * This method does not modify the input scale x; x thus represents the untransformed scale,
    * while the returned scale represents its transformed view.
    *
    * @param yScale A continuous scale for y-dimension.
    */
  def rescaleY[S /* <: ZoomScale */](yScale: S): S
  /**
    * Return a transform whose scale k1 is equal to k0 × k, where k0 is this transform’s scale.
    *
    * @param k A scale factor.
    */
  def scale(k: Double): ZoomTransform_
  /**
    * Return a transform whose translation tx1 and ty1 is equal to tx0 + x and ty0 + y,
    * where tx0 and ty0 is this transform’s translation.
    *
    * @param x Amount of translation in x-direction.
    * @param y Amount of translation in y-direction.
    */
  def translate(x: Double, y: Double): ZoomTransform_
}

object ZoomTransform_ {
  @scala.inline
  def apply(
    apply: js.Tuple2[Double, Double] => CallbackTo[js.Tuple2[Double, Double]],
    applyX: Double => CallbackTo[Double],
    applyY: Double => CallbackTo[Double],
    invert: js.Tuple2[Double, Double] => CallbackTo[js.Tuple2[Double, Double]],
    invertX: Double => CallbackTo[Double],
    invertY: Double => CallbackTo[Double],
    k: Double,
    rescaleX: js.Any => CallbackTo[js.Any],
    rescaleY: js.Any => CallbackTo[js.Any],
    scale: Double => CallbackTo[ZoomTransform_],
    translate: (Double, Double) => CallbackTo[ZoomTransform_],
    x: Double,
    y: Double
  ): ZoomTransform_ = {
    val __obj = js.Dynamic.literal(k = k.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("apply")(js.Any.fromFunction1((t0: js.Tuple2[scala.Double, scala.Double]) => apply(t0).runNow()))
    __obj.updateDynamic("applyX")(js.Any.fromFunction1((t0: scala.Double) => applyX(t0).runNow()))
    __obj.updateDynamic("applyY")(js.Any.fromFunction1((t0: scala.Double) => applyY(t0).runNow()))
    __obj.updateDynamic("invert")(js.Any.fromFunction1((t0: js.Tuple2[scala.Double, scala.Double]) => invert(t0).runNow()))
    __obj.updateDynamic("invertX")(js.Any.fromFunction1((t0: scala.Double) => invertX(t0).runNow()))
    __obj.updateDynamic("invertY")(js.Any.fromFunction1((t0: scala.Double) => invertY(t0).runNow()))
    __obj.updateDynamic("rescaleX")(js.Any.fromFunction1((t0: js.Any) => rescaleX(t0).runNow()))
    __obj.updateDynamic("rescaleY")(js.Any.fromFunction1((t0: js.Any) => rescaleY(t0).runNow()))
    __obj.updateDynamic("scale")(js.Any.fromFunction1((t0: scala.Double) => scale(t0).runNow()))
    __obj.updateDynamic("translate")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => translate(t0, t1).runNow()))
    __obj.asInstanceOf[ZoomTransform_]
  }
}

