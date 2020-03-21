package typingsJapgolly.pdfjsDist.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFPageViewport extends js.Object {
  var height: Double
  var scale: Double
  var transforms: js.Array[Double]
  var width: Double
  def clone(options: PDFPageViewportOptions): PDFPageViewport
   // [x1, y1, x2, y2]
  def convertToPdfPoint(x: Double, y: Double): js.Array[Double]
  def convertToViewportPoint(x: Double, y: Double): js.Array[Double]
   // [x, y]
  def convertToViewportRectangle(rect: js.Array[Double]): js.Array[Double]
}

object PDFPageViewport {
  @scala.inline
  def apply(
    clone: PDFPageViewportOptions => CallbackTo[PDFPageViewport],
    convertToPdfPoint: (Double, Double) => CallbackTo[js.Array[Double]],
    convertToViewportPoint: (Double, Double) => CallbackTo[js.Array[Double]],
    convertToViewportRectangle: js.Array[Double] => CallbackTo[js.Array[Double]],
    height: Double,
    scale: Double,
    transforms: js.Array[Double],
    width: Double
  ): PDFPageViewport = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], transforms = transforms.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("clone")(js.Any.fromFunction1((t0: typingsJapgolly.pdfjsDist.mod.PDFPageViewportOptions) => clone(t0).runNow()))
    __obj.updateDynamic("convertToPdfPoint")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => convertToPdfPoint(t0, t1).runNow()))
    __obj.updateDynamic("convertToViewportPoint")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => convertToViewportPoint(t0, t1).runNow()))
    __obj.updateDynamic("convertToViewportRectangle")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => convertToViewportRectangle(t0).runNow()))
    __obj.asInstanceOf[PDFPageViewport]
  }
}

