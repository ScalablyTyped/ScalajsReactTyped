package typingsJapgolly.plottable.scalesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransformableScale extends js.Object {
  /**
    * Returns the current transformed domain of the scale. This must be a
    * numerical range in the same coordinate space used for
    * `scaleTransformation`.
    */
  def getTransformationDomain(): js.Tuple2[Double, Double]
  /**
    * Gets the full extent of the transformation domain.
    */
  def getTransformationExtent(): js.Tuple2[Double, Double]
  /**
    * Returns value in *Transformation Space* for the provided *screen space*.
    */
  def invertedTransformation(value: Double): Double
  /**
    * Translates the scale by a number of pixels.
    *
    * @param {number} [translateAmount] The translation amount in screen space
    */
  def pan(translateAmount: Double): Unit
  /**
    * Returns value in *screen space* for the given domain value.
    */
  def scaleTransformation(value: Double): Double
  /**
    * Directly set the transformation domain. Instead of calling `.zoom` or
    * `.pan` perform calculations relative to the current domain, this can but
    * used to pan/zoom to an exact domain interval (in transformation space).
    */
  def setTransformationDomain(domain: js.Tuple2[Double, Double]): Unit
  /**
    * Apply the magnification with the floating point `magnifyAmount` centered
    * at the `centerValue` coordinate.
    *
    * @param {number} [magnifyAmount] The floating point zoom amount. `1.0` is
    * no zoom change.
    * @param {number} [centerValue] The coordinate of the mouse in screen
    * space.
    */
  def zoom(magnifyAmount: Double, centerValue: Double): Unit
}

object ITransformableScale {
  @scala.inline
  def apply(
    getTransformationDomain: CallbackTo[js.Tuple2[Double, Double]],
    getTransformationExtent: CallbackTo[js.Tuple2[Double, Double]],
    invertedTransformation: Double => CallbackTo[Double],
    pan: Double => Callback,
    scaleTransformation: Double => CallbackTo[Double],
    setTransformationDomain: js.Tuple2[Double, Double] => Callback,
    zoom: (Double, Double) => Callback
  ): ITransformableScale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getTransformationDomain")(getTransformationDomain.toJsFn)
    __obj.updateDynamic("getTransformationExtent")(getTransformationExtent.toJsFn)
    __obj.updateDynamic("invertedTransformation")(js.Any.fromFunction1((t0: scala.Double) => invertedTransformation(t0).runNow()))
    __obj.updateDynamic("pan")(js.Any.fromFunction1((t0: scala.Double) => pan(t0).runNow()))
    __obj.updateDynamic("scaleTransformation")(js.Any.fromFunction1((t0: scala.Double) => scaleTransformation(t0).runNow()))
    __obj.updateDynamic("setTransformationDomain")(js.Any.fromFunction1((t0: js.Tuple2[scala.Double, scala.Double]) => setTransformationDomain(t0).runNow()))
    __obj.updateDynamic("zoom")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => zoom(t0, t1).runNow()))
    __obj.asInstanceOf[ITransformableScale]
  }
}

