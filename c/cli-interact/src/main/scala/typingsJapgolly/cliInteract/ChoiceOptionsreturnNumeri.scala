package typingsJapgolly.cliInteract

import typingsJapgolly.cliInteract.cliInteractBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined cli-interact.cli-interact.ChoiceOptions & {  returnNumeric  :true} */
trait ChoiceOptionsreturnNumeri extends js.Object {
  var allowNoAnswer: js.UndefOr[Boolean] = js.undefined
  var returnNumeric: js.UndefOr[Boolean with `true`] = js.undefined
}

object ChoiceOptionsreturnNumeri {
  @scala.inline
  def apply(
    allowNoAnswer: js.UndefOr[Boolean] = js.undefined,
    returnNumeric: js.UndefOr[Boolean with `true`] = js.undefined
  ): ChoiceOptionsreturnNumeri = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowNoAnswer)) __obj.updateDynamic("allowNoAnswer")(allowNoAnswer.asInstanceOf[js.Any])
    if (!js.isUndefined(returnNumeric)) __obj.updateDynamic("returnNumeric")(returnNumeric.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChoiceOptionsreturnNumeri]
  }
}

