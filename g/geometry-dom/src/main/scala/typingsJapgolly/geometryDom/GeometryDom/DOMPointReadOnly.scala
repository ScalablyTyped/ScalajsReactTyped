package typingsJapgolly.geometryDom.GeometryDom

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMPointReadOnly extends js.Object {
  /**
    * w coordinate / readonly
    */
  var w: Double
  /**
    * x coordinate / readonly
    */
  var x: Double
  /**
    * y coordinate / readonly
    */
  var y: Double
  /**
    * z coordinate / readonly
    */
  var z: Double
  /**
    * Post-multiply point with matrix.
    * @param matrix
    */
  def matrixTransform(matrix: DOMMatrixReadOnly): DOMPoint
}

object DOMPointReadOnly {
  @scala.inline
  def apply(
    matrixTransform: DOMMatrixReadOnly => CallbackTo[DOMPoint],
    w: Double,
    x: Double,
    y: Double,
    z: Double
  ): DOMPointReadOnly = {
    val __obj = js.Dynamic.literal(w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.updateDynamic("matrixTransform")(js.Any.fromFunction1((t0: typingsJapgolly.geometryDom.GeometryDom.DOMMatrixReadOnly) => matrixTransform(t0).runNow()))
    __obj.asInstanceOf[DOMPointReadOnly]
  }
}

