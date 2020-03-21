package typingsJapgolly.fabric

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOpaque extends js.Object {
  /** Filter matrix */
  var matrix: js.UndefOr[js.Array[Double]] = js.undefined
  var opaque: js.UndefOr[Boolean] = js.undefined
}

object AnonOpaque {
  @scala.inline
  def apply(matrix: js.Array[Double] = null, opaque: js.UndefOr[Boolean] = js.undefined): AnonOpaque = {
    val __obj = js.Dynamic.literal()
    if (matrix != null) __obj.updateDynamic("matrix")(matrix.asInstanceOf[js.Any])
    if (!js.isUndefined(opaque)) __obj.updateDynamic("opaque")(opaque.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOpaque]
  }
}

