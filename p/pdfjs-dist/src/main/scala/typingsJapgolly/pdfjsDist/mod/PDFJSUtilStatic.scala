package typingsJapgolly.pdfjsDist.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFJSUtilStatic extends js.Object {
  /**
    * Normalize rectangle so that (x1,y1) < (x2,y2)
    * @param {number[]} rect - the rectangle with [x1,y1,x2,y2]
    *
    * For coordinate systems whose origin lies in the bottom-left, this
    * means normalization to (BL,TR) ordering. For systems with origin in the
    * top-left, this means (TL,BR) ordering.
    **/
  def normalizeRect(rect: js.Array[Double]): js.Array[Double]
}

object PDFJSUtilStatic {
  @scala.inline
  def apply(normalizeRect: js.Array[Double] => CallbackTo[js.Array[Double]]): PDFJSUtilStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("normalizeRect")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => normalizeRect(t0).runNow()))
    __obj.asInstanceOf[PDFJSUtilStatic]
  }
}

