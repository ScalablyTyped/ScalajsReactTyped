package typingsJapgolly.semanticUiSearch.SemanticUI.Search.TemplatesSettings

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  def category(response: js.Any): String
  def escape(string: String): String
  def message(message: String, `type`: String): String
  def standard(response: js.Any): String
}

object Impl {
  @scala.inline
  def apply(
    category: js.Any => CallbackTo[String],
    escape: String => CallbackTo[String],
    message: (String, String) => CallbackTo[String],
    standard: js.Any => CallbackTo[String]
  ): Impl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("category")(js.Any.fromFunction1((t0: js.Any) => category(t0).runNow()))
    __obj.updateDynamic("escape")(js.Any.fromFunction1((t0: java.lang.String) => escape(t0).runNow()))
    __obj.updateDynamic("message")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => message(t0, t1).runNow()))
    __obj.updateDynamic("standard")(js.Any.fromFunction1((t0: js.Any) => standard(t0).runNow()))
    __obj.asInstanceOf[Impl]
  }
}

