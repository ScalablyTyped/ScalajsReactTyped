package typingsJapgolly.rrc.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithScrollOptions extends js.Object {
  var alignToTop: js.UndefOr[Boolean] = js.undefined
  var propId: js.UndefOr[PropIdCallback] = js.undefined
}

object WithScrollOptions {
  @scala.inline
  def apply(
    alignToTop: js.UndefOr[Boolean] = js.undefined,
    propId: js.UndefOr[CallbackTo[String]] = js.undefined
  ): WithScrollOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alignToTop)) __obj.updateDynamic("alignToTop")(alignToTop.asInstanceOf[js.Any])
    propId.foreach(p => __obj.updateDynamic("propId")(p.toJsFn))
    __obj.asInstanceOf[WithScrollOptions]
  }
}

