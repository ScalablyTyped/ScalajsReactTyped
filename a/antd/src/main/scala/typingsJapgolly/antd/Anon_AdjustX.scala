package typingsJapgolly.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AdjustX extends js.Object {
  var adjustX: js.UndefOr[Boolean] = js.undefined
  var adjustY: js.UndefOr[Boolean] = js.undefined
}

object Anon_AdjustX {
  @scala.inline
  def apply(adjustX: js.UndefOr[Boolean] = js.undefined, adjustY: js.UndefOr[Boolean] = js.undefined): Anon_AdjustX = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(adjustX)) __obj.updateDynamic("adjustX")(adjustX.asInstanceOf[js.Any])
    if (!js.isUndefined(adjustY)) __obj.updateDynamic("adjustY")(adjustY.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AdjustX]
  }
}

