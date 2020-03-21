package typingsJapgolly.semanticUiForm

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-form.SemanticUI.Form.TemplatesSettings._Impl, keyof semantic-ui-form.SemanticUI.Form.TemplatesSettings._Impl>> */
trait PartialPickImplkeyofImplError extends js.Object {
  var error: js.UndefOr[js.Function1[/* errors */ js.Array[String], JQuery]] = js.undefined
  var prompt: js.UndefOr[js.Function1[/* errors */ js.Array[String], JQuery]] = js.undefined
}

object PartialPickImplkeyofImplError {
  @scala.inline
  def apply(
    error: /* errors */ js.Array[String] => CallbackTo[JQuery] = null,
    prompt: /* errors */ js.Array[String] => CallbackTo[JQuery] = null
  ): PartialPickImplkeyofImplError = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* errors */ js.Array[java.lang.String]) => error(t0).runNow()))
    if (prompt != null) __obj.updateDynamic("prompt")(js.Any.fromFunction1((t0: /* errors */ js.Array[java.lang.String]) => prompt(t0).runNow()))
    __obj.asInstanceOf[PartialPickImplkeyofImplError]
  }
}

