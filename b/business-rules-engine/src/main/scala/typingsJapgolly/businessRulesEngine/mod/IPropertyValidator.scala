package typingsJapgolly.businessRulesEngine.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyValidator extends js.Object {
  var customMessage: js.UndefOr[IErrorCustomMessage] = js.undefined
  var tagName: js.UndefOr[String] = js.undefined
  def isAcceptable(s: js.Any): Boolean
}

object IPropertyValidator {
  @scala.inline
  def apply(
    isAcceptable: js.Any => CallbackTo[Boolean],
    customMessage: (/* config */ js.Any, /* args */ js.Any) => CallbackTo[String] = null,
    tagName: String = null
  ): IPropertyValidator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isAcceptable")(js.Any.fromFunction1((t0: js.Any) => isAcceptable(t0).runNow()))
    if (customMessage != null) __obj.updateDynamic("customMessage")(js.Any.fromFunction2((t0: /* config */ js.Any, t1: /* args */ js.Any) => customMessage(t0, t1).runNow()))
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyValidator]
  }
}

