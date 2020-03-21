package typingsJapgolly.semanticUiSearch

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<semantic-ui-search.SemanticUI.Search.TemplatesSettings._Impl, keyof semantic-ui-search.SemanticUI.Search.TemplatesSettings._Impl>> */
trait PartialPickImplkeyofImplCategory extends js.Object {
  var category: js.UndefOr[js.Function1[/* response */ js.Any, String]] = js.undefined
  var escape: js.UndefOr[js.Function1[/* string */ String, String]] = js.undefined
  var message: js.UndefOr[js.Function2[/* message */ String, /* type */ String, String]] = js.undefined
  var standard: js.UndefOr[js.Function1[/* response */ js.Any, String]] = js.undefined
}

object PartialPickImplkeyofImplCategory {
  @scala.inline
  def apply(
    category: /* response */ js.Any => CallbackTo[String] = null,
    escape: /* string */ String => CallbackTo[String] = null,
    message: (/* message */ String, /* type */ String) => CallbackTo[String] = null,
    standard: /* response */ js.Any => CallbackTo[String] = null
  ): PartialPickImplkeyofImplCategory = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(js.Any.fromFunction1((t0: /* response */ js.Any) => category(t0).runNow()))
    if (escape != null) __obj.updateDynamic("escape")(js.Any.fromFunction1((t0: /* string */ java.lang.String) => escape(t0).runNow()))
    if (message != null) __obj.updateDynamic("message")(js.Any.fromFunction2((t0: /* message */ java.lang.String, t1: /* type */ java.lang.String) => message(t0, t1).runNow()))
    if (standard != null) __obj.updateDynamic("standard")(js.Any.fromFunction1((t0: /* response */ js.Any) => standard(t0).runNow()))
    __obj.asInstanceOf[PartialPickImplkeyofImplCategory]
  }
}

