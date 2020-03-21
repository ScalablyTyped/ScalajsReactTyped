package typingsJapgolly.jscodeshift.templateMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Template extends js.Object {
  /** Tagged template function. Parses the string as source and returns an Expression AST node. */
  def expression(args: js.Any*): js.Any
  /** Tagged template function. Parses the string as source and returns an Statement AST node. */
  def statement(args: js.Any*): js.Any
  /** Tagged template function. Parses the string as source and returns an array of Statement AST nodes. */
  def statements(args: js.Any*): js.Any
}

object Template {
  @scala.inline
  def apply(
    expression: /* repeated */ js.Any => CallbackTo[js.Any],
    statement: /* repeated */ js.Any => CallbackTo[js.Any],
    statements: /* repeated */ js.Any => CallbackTo[js.Any]
  ): Template = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("expression")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => expression(t0).runNow()))
    __obj.updateDynamic("statement")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => statement(t0).runNow()))
    __obj.updateDynamic("statements")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => statements(t0).runNow()))
    __obj.asInstanceOf[Template]
  }
}

