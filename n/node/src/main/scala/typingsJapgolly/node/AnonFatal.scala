package typingsJapgolly.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFatal extends js.Object {
  var fatal: js.UndefOr[Boolean] = js.undefined
  var ignoreBOM: js.UndefOr[Boolean] = js.undefined
}

object AnonFatal {
  @scala.inline
  def apply(fatal: js.UndefOr[Boolean] = js.undefined, ignoreBOM: js.UndefOr[Boolean] = js.undefined): AnonFatal = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fatal)) __obj.updateDynamic("fatal")(fatal.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreBOM)) __obj.updateDynamic("ignoreBOM")(ignoreBOM.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFatal]
  }
}

