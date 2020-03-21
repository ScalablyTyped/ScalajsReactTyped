package typingsJapgolly.apolloServerCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.graphql.formatErrorMod.GraphQLFormattedError
import typingsJapgolly.graphql.mod.GraphQLError
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<apollo-server-core.apollo-server-core/dist/graphqlOptions.default<std.Record<string, any>, any>, 'debug' | 'formatError'> */
trait PickdefaultRecordstringan extends js.Object {
  var debug: js.UndefOr[Boolean] = js.undefined
  var formatError: js.UndefOr[js.Function1[/* error */ GraphQLError, GraphQLFormattedError[Record[String, _]]]] = js.undefined
}

object PickdefaultRecordstringan {
  @scala.inline
  def apply(
    debug: js.UndefOr[Boolean] = js.undefined,
    formatError: /* error */ GraphQLError => CallbackTo[GraphQLFormattedError[Record[String, js.Any]]] = null
  ): PickdefaultRecordstringan = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (formatError != null) __obj.updateDynamic("formatError")(js.Any.fromFunction1((t0: /* error */ typingsJapgolly.graphql.mod.GraphQLError) => formatError(t0).runNow()))
    __obj.asInstanceOf[PickdefaultRecordstringan]
  }
}

