package typingsJapgolly.apolloEngineReporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.graphql.mod.GraphQLError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRewriteError extends js.Object {
  var rewriteError: js.UndefOr[js.Function1[/* err */ GraphQLError, GraphQLError | Null]] = js.undefined
}

object AnonRewriteError {
  @scala.inline
  def apply(rewriteError: /* err */ GraphQLError => CallbackTo[GraphQLError | Null] = null): AnonRewriteError = {
    val __obj = js.Dynamic.literal()
    if (rewriteError != null) __obj.updateDynamic("rewriteError")(js.Any.fromFunction1((t0: /* err */ typingsJapgolly.graphql.mod.GraphQLError) => rewriteError(t0).runNow()))
    __obj.asInstanceOf[AnonRewriteError]
  }
}

