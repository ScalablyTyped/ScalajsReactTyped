package typingsJapgolly.dojo.dojox.dgauges.components

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.dojo.dojox.dgauges.IndicatorBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dgauges/components/utils.html
  *
  *
  */
trait utils extends js.Object {
  /**
    * Adjusts the brightness of a color.
    *
    * @param col The base color
    * @param b A positive or negative value to adjust the brightness
    */
  def brightness(col: Double, b: Double): Double
  /**
    * Creates a gradient object
    *
    * @param entries An array of numbers representing colors
    */
  def createGradient(entries: js.Array[_]): Double
  /**
    * A helper method for configuring a circular gauge.
    *
    * @param scale A circular scale
    * @param indicator A circular indicator
    * @param originX The x-coordinate of the center of the scale (in pixels)
    * @param originY The y-coordinate of the center of the scale (in pixels)
    * @param radius The radius of the scale (in pixels)
    * @param startAngle The start angle of the scale (in degrees)
    * @param endAngle The end angle of the scale (in degrees)
    * @param orientation               OptionalThe orientation of the scale, can be "clockwise" or "cclockwise"
    * @param font               OptionalThe font used for the gauge
    * @param labelPosition               OptionalThe position of the labels regarding
    * @param tickShapeFunc               OptionalA drawing function for the ticks
    */
  def genericCircularGauge(
    scale: Double,
    indicator: IndicatorBase,
    originX: Double,
    originY: Double,
    radius: Double,
    startAngle: Double,
    endAngle: Double,
    orientation: String,
    font: js.Object,
    labelPosition: String,
    tickShapeFunc: js.Object
  ): Double
}

object utils {
  @scala.inline
  def apply(
    brightness: (Double, Double) => CallbackTo[Double],
    createGradient: js.Array[js.Any] => CallbackTo[Double],
    genericCircularGauge: (Double, IndicatorBase, Double, Double, Double, Double, Double, String, js.Object, String, js.Object) => CallbackTo[Double]
  ): utils = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("brightness")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => brightness(t0, t1).runNow()))
    __obj.updateDynamic("createGradient")(js.Any.fromFunction1((t0: js.Array[js.Any]) => createGradient(t0).runNow()))
    __obj.updateDynamic("genericCircularGauge")(js.Any.fromFunction11((t0: scala.Double, t1: typingsJapgolly.dojo.dojox.dgauges.IndicatorBase, t2: scala.Double, t3: scala.Double, t4: scala.Double, t5: scala.Double, t6: scala.Double, t7: java.lang.String, t8: js.Object, t9: java.lang.String, t10: js.Object) => genericCircularGauge(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10).runNow()))
    __obj.asInstanceOf[utils]
  }
}

