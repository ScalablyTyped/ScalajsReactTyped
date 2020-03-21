package typingsJapgolly.apolloServerPluginBase.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.apolloServerTypes.mod.GraphQLRequestContext
import typingsJapgolly.apolloServerTypes.mod.GraphQLServiceContext
import typingsJapgolly.apolloServerTypes.mod.ValueOrPromise
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApolloServerPlugin[TContext /* <: Record[String, _] */] extends js.Object {
  var requestDidStart: js.UndefOr[
    js.Function1[
      /* requestContext */ GraphQLRequestContext[TContext], 
      GraphQLRequestListener[TContext] | Unit
    ]
  ] = js.undefined
  var serverWillStart: js.UndefOr[js.Function1[/* service */ GraphQLServiceContext, ValueOrPromise[Unit]]] = js.undefined
}

object ApolloServerPlugin {
  @scala.inline
  def apply[TContext /* <: Record[String, _] */](
    requestDidStart: /* requestContext */ GraphQLRequestContext[TContext] => CallbackTo[GraphQLRequestListener[TContext] | Unit] = null,
    serverWillStart: /* service */ GraphQLServiceContext => CallbackTo[ValueOrPromise[Unit]] = null
  ): ApolloServerPlugin[TContext] = {
    val __obj = js.Dynamic.literal()
    if (requestDidStart != null) __obj.updateDynamic("requestDidStart")(js.Any.fromFunction1((t0: /* requestContext */ typingsJapgolly.apolloServerTypes.mod.GraphQLRequestContext[TContext]) => requestDidStart(t0).runNow()))
    if (serverWillStart != null) __obj.updateDynamic("serverWillStart")(js.Any.fromFunction1((t0: /* service */ typingsJapgolly.apolloServerTypes.mod.GraphQLServiceContext) => serverWillStart(t0).runNow()))
    __obj.asInstanceOf[ApolloServerPlugin[TContext]]
  }
}

