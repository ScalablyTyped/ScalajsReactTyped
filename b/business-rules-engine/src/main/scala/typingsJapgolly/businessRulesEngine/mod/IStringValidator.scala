package typingsJapgolly.businessRulesEngine.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStringValidator extends IPropertyValidator {
  def isAcceptable(s: String): Boolean
}

object IStringValidator {
  @scala.inline
  def apply(
    isAcceptable: String => CallbackTo[Boolean],
    customMessage: (/* config */ js.Any, /* args */ js.Any) => CallbackTo[String] = null,
    tagName: String = null
  ): IStringValidator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isAcceptable")(js.Any.fromFunction1((t0: java.lang.String) => isAcceptable(t0).runNow()))
    if (customMessage != null) __obj.updateDynamic("customMessage")(js.Any.fromFunction2((t0: /* config */ js.Any, t1: /* args */ js.Any) => customMessage(t0, t1).runNow()))
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStringValidator]
  }
}

