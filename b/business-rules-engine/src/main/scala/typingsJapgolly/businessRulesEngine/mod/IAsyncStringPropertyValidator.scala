package typingsJapgolly.businessRulesEngine.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAsyncStringPropertyValidator extends IAsyncPropertyValidator {
  def isAcceptable(s: String): Promise[Boolean]
}

object IAsyncStringPropertyValidator {
  @scala.inline
  def apply(
    isAcceptable: String => CallbackTo[Promise[Boolean]],
    isAsync: Boolean,
    customMessage: (/* config */ js.Any, /* args */ js.Any) => CallbackTo[String] = null,
    tagName: String = null
  ): IAsyncStringPropertyValidator = {
    val __obj = js.Dynamic.literal(isAsync = isAsync.asInstanceOf[js.Any])
    __obj.updateDynamic("isAcceptable")(js.Any.fromFunction1((t0: java.lang.String) => isAcceptable(t0).runNow()))
    if (customMessage != null) __obj.updateDynamic("customMessage")(js.Any.fromFunction2((t0: /* config */ js.Any, t1: /* args */ js.Any) => customMessage(t0, t1).runNow()))
    if (tagName != null) __obj.updateDynamic("tagName")(tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAsyncStringPropertyValidator]
  }
}

