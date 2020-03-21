package typingsJapgolly.jqueryAjaxfile

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBindingRewriteValidators extends js.Object {
  var bindingRewriteValidators: js.Any
  def parseObjectLiteral(objectLiteralString: String): js.Array[_]
}

object AnonBindingRewriteValidators {
  @scala.inline
  def apply(bindingRewriteValidators: js.Any, parseObjectLiteral: String => CallbackTo[js.Array[js.Any]]): AnonBindingRewriteValidators = {
    val __obj = js.Dynamic.literal(bindingRewriteValidators = bindingRewriteValidators.asInstanceOf[js.Any])
    __obj.updateDynamic("parseObjectLiteral")(js.Any.fromFunction1((t0: java.lang.String) => parseObjectLiteral(t0).runNow()))
    __obj.asInstanceOf[AnonBindingRewriteValidators]
  }
}

