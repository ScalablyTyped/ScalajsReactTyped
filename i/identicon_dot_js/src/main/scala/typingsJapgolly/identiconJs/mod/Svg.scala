package typingsJapgolly.identiconJs.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.identiconJs.AnonColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Svg extends js.Object {
  var background: Color
  var foreground: Color
  var rectangles: js.Array[AnonColor]
  var size: Double
  /**
    * Returns a string with the structure 'rgb(r, g, b, a)'.
    * @param red
    * @param green
    * @param blue
    * @param alpha
    */
  def color(red: Double, green: Double, blue: Double, alpha: Double): String
  /**
    * Returns the Svg as a base64 encoded string.
    */
  def getBase64(): String
  /**
    * Returns the Svg as string.
    */
  def getDump(): String
}

object Svg {
  @scala.inline
  def apply(
    background: Color,
    color: (Double, Double, Double, Double) => CallbackTo[String],
    foreground: Color,
    getBase64: CallbackTo[String],
    getDump: CallbackTo[String],
    rectangles: js.Array[AnonColor],
    size: Double
  ): Svg = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], foreground = foreground.asInstanceOf[js.Any], rectangles = rectangles.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("color")(js.Any.fromFunction4((t0: scala.Double, t1: scala.Double, t2: scala.Double, t3: scala.Double) => color(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("getBase64")(getBase64.toJsFn)
    __obj.updateDynamic("getDump")(getDump.toJsFn)
    __obj.asInstanceOf[Svg]
  }
}

