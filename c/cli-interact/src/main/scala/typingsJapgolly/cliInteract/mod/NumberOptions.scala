package typingsJapgolly.cliInteract.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberOptions extends js.Object {
  var allowNoAnswer: js.UndefOr[Boolean] = js.undefined
  var requireInteger: js.UndefOr[Boolean] = js.undefined
}

object NumberOptions {
  @scala.inline
  def apply(
    allowNoAnswer: js.UndefOr[Boolean] = js.undefined,
    requireInteger: js.UndefOr[Boolean] = js.undefined
  ): NumberOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowNoAnswer)) __obj.updateDynamic("allowNoAnswer")(allowNoAnswer.asInstanceOf[js.Any])
    if (!js.isUndefined(requireInteger)) __obj.updateDynamic("requireInteger")(requireInteger.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberOptions]
  }
}

