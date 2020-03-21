package typingsJapgolly.semanticUiForm.SemanticUI.Form.TemplatesSettings

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.semanticUiForm.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
  def error(errors: js.Array[String]): JQuery
  def prompt(errors: js.Array[String]): JQuery
}

object Impl {
  @scala.inline
  def apply(error: js.Array[String] => CallbackTo[JQuery], prompt: js.Array[String] => CallbackTo[JQuery]): Impl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => error(t0).runNow()))
    __obj.updateDynamic("prompt")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => prompt(t0).runNow()))
    __obj.asInstanceOf[Impl]
  }
}

