package typingsJapgolly.apolloServerPluginBase.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.apolloServerPluginBase.apolloServerPluginBaseStrings.document
import typingsJapgolly.apolloServerPluginBase.apolloServerPluginBaseStrings.errors
import typingsJapgolly.apolloServerPluginBase.apolloServerPluginBaseStrings.metrics
import typingsJapgolly.apolloServerPluginBase.apolloServerPluginBaseStrings.operation
import typingsJapgolly.apolloServerPluginBase.apolloServerPluginBaseStrings.operationName
import typingsJapgolly.apolloServerPluginBase.apolloServerPluginBaseStrings.response
import typingsJapgolly.apolloServerPluginBase.apolloServerPluginBaseStrings.source
import typingsJapgolly.apolloServerTypes.mod.GraphQLRequestContext
import typingsJapgolly.apolloServerTypes.mod.GraphQLResponse
import typingsJapgolly.apolloServerTypes.mod.ValueOrPromise
import typingsJapgolly.apolloServerTypes.mod.WithRequired
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLRequestListener[TContext] extends js.Object {
  var didEncounterErrors: js.UndefOr[
    js.Function1[
      /* requestContext */ WithRequired[GraphQLRequestContext[TContext], metrics | source | errors], 
      ValueOrPromise[Unit]
    ]
  ] = js.undefined
  var didResolveOperation: js.UndefOr[
    js.Function1[
      /* requestContext */ WithRequired[
        GraphQLRequestContext[TContext], 
        metrics | source | document | operationName | operation
      ], 
      ValueOrPromise[Unit]
    ]
  ] = js.undefined
  var executionDidStart: js.UndefOr[
    js.Function1[
      /* requestContext */ WithRequired[
        GraphQLRequestContext[TContext], 
        metrics | source | document | operationName | operation
      ], 
      (js.Function1[/* err */ js.UndefOr[js.Error], Unit]) | Unit
    ]
  ] = js.undefined
  var parsingDidStart: js.UndefOr[
    js.Function1[
      /* requestContext */ WithRequired[GraphQLRequestContext[TContext], metrics | source], 
      (js.Function1[/* err */ js.UndefOr[js.Error], Unit]) | Unit
    ]
  ] = js.undefined
  var responseForOperation: js.UndefOr[
    js.Function1[
      /* requestContext */ WithRequired[
        GraphQLRequestContext[TContext], 
        metrics | source | document | operationName | operation
      ], 
      ValueOrPromise[GraphQLResponse | Null]
    ]
  ] = js.undefined
  var validationDidStart: js.UndefOr[
    js.Function1[
      /* requestContext */ WithRequired[GraphQLRequestContext[TContext], metrics | source | document], 
      (js.Function1[/* err */ js.UndefOr[js.Array[js.Error]], Unit]) | Unit
    ]
  ] = js.undefined
  var willSendResponse: js.UndefOr[
    js.Function1[
      /* requestContext */ WithRequired[GraphQLRequestContext[TContext], metrics | response], 
      ValueOrPromise[Unit]
    ]
  ] = js.undefined
}

object GraphQLRequestListener {
  @scala.inline
  def apply[TContext](
    didEncounterErrors: /* requestContext */ WithRequired[GraphQLRequestContext[TContext], metrics | source | errors] => CallbackTo[ValueOrPromise[Unit]] = null,
    didResolveOperation: /* requestContext */ WithRequired[
      GraphQLRequestContext[TContext], 
      metrics | source | document | operationName | operation
    ] => CallbackTo[ValueOrPromise[Unit]] = null,
    executionDidStart: /* requestContext */ WithRequired[
      GraphQLRequestContext[TContext], 
      metrics | source | document | operationName | operation
    ] => CallbackTo[(js.Function1[/* err */ js.UndefOr[js.Error], Unit]) | Unit] = null,
    parsingDidStart: /* requestContext */ WithRequired[GraphQLRequestContext[TContext], metrics | source] => CallbackTo[(js.Function1[/* err */ js.UndefOr[js.Error], Unit]) | Unit] = null,
    responseForOperation: /* requestContext */ WithRequired[
      GraphQLRequestContext[TContext], 
      metrics | source | document | operationName | operation
    ] => CallbackTo[ValueOrPromise[GraphQLResponse | Null]] = null,
    validationDidStart: /* requestContext */ WithRequired[GraphQLRequestContext[TContext], metrics | source | document] => CallbackTo[(js.Function1[/* err */ js.UndefOr[js.Array[js.Error]], Unit]) | Unit] = null,
    willSendResponse: /* requestContext */ WithRequired[GraphQLRequestContext[TContext], metrics | response] => CallbackTo[ValueOrPromise[Unit]] = null
  ): GraphQLRequestListener[TContext] = {
    val __obj = js.Dynamic.literal()
    if (didEncounterErrors != null) __obj.updateDynamic("didEncounterErrors")(js.Any.fromFunction1((t0: /* requestContext */ typingsJapgolly.apolloServerTypes.mod.WithRequired[
  typingsJapgolly.apolloServerTypes.mod.GraphQLRequestContext[TContext], 
  typingsJapgolly.apolloServerPluginBase.apolloServerPluginBaseStrings.metrics | typingsJapgolly.apolloServerPluginBase.apolloServerPluginBaseStrings.source | typingsJapgolly.apolloServerPluginBase.apolloServerPluginBaseStrings.errors]) => didEncounterErrors(t0).runNow()))
    if (didResolveOperation != null) __obj.updateDynamic("didResolveOperation")(js.Any.fromFunction1((t0: /* requestContext */ typingsJapgolly.apolloServerTypes.mod.WithRequired[
  typingsJapgolly.apolloServerTypes.mod.GraphQLRequestContext[TContext], 
  typingsJapgolly.apolloServerPluginBase.apolloServerPluginBaseStrings.metrics | typingsJapgolly.apolloServerPluginBase.apolloServerPluginBaseStrings.source | typingsJapgolly.apolloServerPluginBase.apolloServerPluginBaseStrings.document | typingsJapgolly.apolloServerPluginBase.apolloServerPluginBaseStrings.operationName | typingsJapgolly.apolloServerPluginBase.apolloServerPluginBaseStrings.operation]) => didResolveOperation(t0).runNow()))
    if (executionDidStart != null) __obj.updateDynamic("executionDidStart")(js.Any.fromFunction1((t0: /* requestContext */ typingsJapgolly.apolloServerTypes.mod.WithRequired[
  typingsJapgolly.apolloServerTypes.mod.GraphQLRequestContext[TContext], 
  typingsJapgolly.apolloServerPluginBase.apolloServerPluginBaseStrings.metrics | typingsJapgolly.apolloServerPluginBase.apolloServerPluginBaseStrings.source | typingsJapgolly.apolloServerPluginBase.apolloServerPluginBaseStrings.document | typingsJapgolly.apolloServerPluginBase.apolloServerPluginBaseStrings.operationName | typingsJapgolly.apolloServerPluginBase.apolloServerPluginBaseStrings.operation]) => executionDidStart(t0).runNow()))
    if (parsingDidStart != null) __obj.updateDynamic("parsingDidStart")(js.Any.fromFunction1((t0: /* requestContext */ typingsJapgolly.apolloServerTypes.mod.WithRequired[
  typingsJapgolly.apolloServerTypes.mod.GraphQLRequestContext[TContext], 
  typingsJapgolly.apolloServerPluginBase.apolloServerPluginBaseStrings.metrics | typingsJapgolly.apolloServerPluginBase.apolloServerPluginBaseStrings.source]) => parsingDidStart(t0).runNow()))
    if (responseForOperation != null) __obj.updateDynamic("responseForOperation")(js.Any.fromFunction1((t0: /* requestContext */ typingsJapgolly.apolloServerTypes.mod.WithRequired[
  typingsJapgolly.apolloServerTypes.mod.GraphQLRequestContext[TContext], 
  typingsJapgolly.apolloServerPluginBase.apolloServerPluginBaseStrings.metrics | typingsJapgolly.apolloServerPluginBase.apolloServerPluginBaseStrings.source | typingsJapgolly.apolloServerPluginBase.apolloServerPluginBaseStrings.document | typingsJapgolly.apolloServerPluginBase.apolloServerPluginBaseStrings.operationName | typingsJapgolly.apolloServerPluginBase.apolloServerPluginBaseStrings.operation]) => responseForOperation(t0).runNow()))
    if (validationDidStart != null) __obj.updateDynamic("validationDidStart")(js.Any.fromFunction1((t0: /* requestContext */ typingsJapgolly.apolloServerTypes.mod.WithRequired[
  typingsJapgolly.apolloServerTypes.mod.GraphQLRequestContext[TContext], 
  typingsJapgolly.apolloServerPluginBase.apolloServerPluginBaseStrings.metrics | typingsJapgolly.apolloServerPluginBase.apolloServerPluginBaseStrings.source | typingsJapgolly.apolloServerPluginBase.apolloServerPluginBaseStrings.document]) => validationDidStart(t0).runNow()))
    if (willSendResponse != null) __obj.updateDynamic("willSendResponse")(js.Any.fromFunction1((t0: /* requestContext */ typingsJapgolly.apolloServerTypes.mod.WithRequired[
  typingsJapgolly.apolloServerTypes.mod.GraphQLRequestContext[TContext], 
  typingsJapgolly.apolloServerPluginBase.apolloServerPluginBaseStrings.metrics | typingsJapgolly.apolloServerPluginBase.apolloServerPluginBaseStrings.response]) => willSendResponse(t0).runNow()))
    __obj.asInstanceOf[GraphQLRequestListener[TContext]]
  }
}

