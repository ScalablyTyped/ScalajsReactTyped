package typingsJapgolly.identiconJs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PNGlib extends js.Object {
  var depth: Double
  var height: Double
  var width: Double
  /**
    * Returns the image as a base64 encoded string.
    */
  def getBase64(): String
  /**
    * Returns the png as a string.
    */
  def getDump(): String
  /**
    * Returns the index of a given pixel in the image data array.
    * @param x The given x coordinate of the pixel.
    * @param y The given y coordinate of the pixel.
    */
  def index(x: Double, y: Double): Double
}

object PNGlib {
  @scala.inline
  def apply(
    depth: Double,
    getBase64: CallbackTo[String],
    getDump: CallbackTo[String],
    height: Double,
    index: (Double, Double) => CallbackTo[Double],
    width: Double
  ): PNGlib = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("getBase64")(getBase64.toJsFn)
    __obj.updateDynamic("getDump")(getDump.toJsFn)
    __obj.updateDynamic("index")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => index(t0, t1).runNow()))
    __obj.asInstanceOf[PNGlib]
  }
}

