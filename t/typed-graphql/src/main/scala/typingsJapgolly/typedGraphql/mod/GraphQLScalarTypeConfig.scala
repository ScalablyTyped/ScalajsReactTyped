package typingsJapgolly.typedGraphql.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLScalarTypeConfig extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var name: String
  var parseLiteral: js.UndefOr[js.Function1[/* valueAST */ Value, _]] = js.undefined
  var parseValue: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.undefined
  def serialize(value: js.Any): js.Any
}

object GraphQLScalarTypeConfig {
  @scala.inline
  def apply(
    name: String,
    serialize: js.Any => CallbackTo[js.Any],
    description: String = null,
    parseLiteral: /* valueAST */ Value => CallbackTo[js.Any] = null,
    parseValue: /* value */ js.Any => CallbackTo[js.Any] = null
  ): GraphQLScalarTypeConfig = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("serialize")(js.Any.fromFunction1((t0: js.Any) => serialize(t0).runNow()))
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (parseLiteral != null) __obj.updateDynamic("parseLiteral")(js.Any.fromFunction1((t0: /* valueAST */ typingsJapgolly.typedGraphql.mod.Value) => parseLiteral(t0).runNow()))
    if (parseValue != null) __obj.updateDynamic("parseValue")(js.Any.fromFunction1((t0: /* value */ js.Any) => parseValue(t0).runNow()))
    __obj.asInstanceOf[GraphQLScalarTypeConfig]
  }
}

