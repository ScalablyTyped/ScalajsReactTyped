package typingsJapgolly.jsfl

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashMath extends js.Object {
  /** Method; performs a matrix concatenation and returns the result. */
  def concatMatrix(mat1: FlashMatrix, mat2: FlashMatrix): FlashMatrix
  /** A Matrix object that is the inverse of the original matrix. */
  def invertMatrix(mat: FlashMatrix): FlashMatrix
  /** A floating-point value that represents the distance between the points. */
  def pointDistance(pt1: FlashPoint, pt2: FlashPoint): Double
}

object FlashMath {
  @scala.inline
  def apply(
    concatMatrix: (FlashMatrix, FlashMatrix) => CallbackTo[FlashMatrix],
    invertMatrix: FlashMatrix => CallbackTo[FlashMatrix],
    pointDistance: (FlashPoint, FlashPoint) => CallbackTo[Double]
  ): FlashMath = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("concatMatrix")(js.Any.fromFunction2((t0: typingsJapgolly.jsfl.FlashMatrix, t1: typingsJapgolly.jsfl.FlashMatrix) => concatMatrix(t0, t1).runNow()))
    __obj.updateDynamic("invertMatrix")(js.Any.fromFunction1((t0: typingsJapgolly.jsfl.FlashMatrix) => invertMatrix(t0).runNow()))
    __obj.updateDynamic("pointDistance")(js.Any.fromFunction2((t0: typingsJapgolly.jsfl.FlashPoint, t1: typingsJapgolly.jsfl.FlashPoint) => pointDistance(t0, t1).runNow()))
    __obj.asInstanceOf[FlashMath]
  }
}

