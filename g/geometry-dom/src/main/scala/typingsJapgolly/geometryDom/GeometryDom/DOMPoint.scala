package typingsJapgolly.geometryDom.GeometryDom

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMPoint extends DOMPointReadOnly

object DOMPoint {
  @scala.inline
  def apply(
    matrixTransform: DOMMatrixReadOnly => CallbackTo[DOMPoint],
    w: Double,
    x: Double,
    y: Double,
    z: Double
  ): DOMPoint = {
    val __obj = js.Dynamic.literal(w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.updateDynamic("matrixTransform")(js.Any.fromFunction1((t0: typingsJapgolly.geometryDom.GeometryDom.DOMMatrixReadOnly) => matrixTransform(t0).runNow()))
    __obj.asInstanceOf[DOMPoint]
  }
}

