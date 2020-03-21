package typingsJapgolly.syntaxError

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.SyntaxError & {  line  :number,   column  :number,   annotated  :string, inspect (): string} */
trait SyntaxErrorlinenumbercolu extends js.Object {
  var annotated: String
  var column: Double
  var line: Double
  var message: String
  var name: String
  var stack: js.UndefOr[String] = js.undefined
  def inspect(): String
}

object SyntaxErrorlinenumbercolu {
  @scala.inline
  def apply(
    annotated: String,
    column: Double,
    inspect: CallbackTo[String],
    line: Double,
    message: String,
    name: String,
    stack: String = null
  ): SyntaxErrorlinenumbercolu = {
    val __obj = js.Dynamic.literal(annotated = annotated.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("inspect")(inspect.toJsFn)
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyntaxErrorlinenumbercolu]
  }
}

