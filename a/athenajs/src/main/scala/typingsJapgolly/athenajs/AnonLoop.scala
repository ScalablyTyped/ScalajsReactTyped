package typingsJapgolly.athenajs

import typingsJapgolly.athenajs.athenajsBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLoop extends js.Object {
  var loop: js.UndefOr[`false`] = js.undefined
  var pan: js.UndefOr[Boolean] = js.undefined
}

object AnonLoop {
  @scala.inline
  def apply(loop: `false` = null, pan: js.UndefOr[Boolean] = js.undefined): AnonLoop = {
    val __obj = js.Dynamic.literal()
    if (loop != null) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (!js.isUndefined(pan)) __obj.updateDynamic("pan")(pan.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLoop]
  }
}

