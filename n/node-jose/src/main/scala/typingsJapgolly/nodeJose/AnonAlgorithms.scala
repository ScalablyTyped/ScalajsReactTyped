package typingsJapgolly.nodeJose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlgorithms extends js.Object {
  var algorithms: js.UndefOr[js.Array[String]] = js.undefined
  var allowEmbeddedKey: js.UndefOr[Boolean] = js.undefined
  var handlers: js.UndefOr[js.Any] = js.undefined
}

object AnonAlgorithms {
  @scala.inline
  def apply(
    algorithms: js.Array[String] = null,
    allowEmbeddedKey: js.UndefOr[Boolean] = js.undefined,
    handlers: js.Any = null
  ): AnonAlgorithms = {
    val __obj = js.Dynamic.literal()
    if (algorithms != null) __obj.updateDynamic("algorithms")(algorithms.asInstanceOf[js.Any])
    if (!js.isUndefined(allowEmbeddedKey)) __obj.updateDynamic("allowEmbeddedKey")(allowEmbeddedKey.asInstanceOf[js.Any])
    if (handlers != null) __obj.updateDynamic("handlers")(handlers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlgorithms]
  }
}

