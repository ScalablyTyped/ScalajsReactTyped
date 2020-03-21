package typingsJapgolly.apolloServerErrors

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.graphql.formatErrorMod.GraphQLFormattedError
import typingsJapgolly.graphql.mod.GraphQLError
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDebug extends js.Object {
  var debug: js.UndefOr[Boolean] = js.undefined
  var formatter: js.UndefOr[js.Function1[/* error */ GraphQLError, GraphQLFormattedError[Record[String, _]]]] = js.undefined
}

object AnonDebug {
  @scala.inline
  def apply(
    debug: js.UndefOr[Boolean] = js.undefined,
    formatter: /* error */ GraphQLError => CallbackTo[GraphQLFormattedError[Record[String, js.Any]]] = null
  ): AnonDebug = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1((t0: /* error */ typingsJapgolly.graphql.mod.GraphQLError) => formatter(t0).runNow()))
    __obj.asInstanceOf[AnonDebug]
  }
}

