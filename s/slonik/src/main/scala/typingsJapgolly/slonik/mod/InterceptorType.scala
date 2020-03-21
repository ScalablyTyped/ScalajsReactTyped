package typingsJapgolly.slonik.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InterceptorType extends js.Object {
  var afterPoolConnection: js.UndefOr[
    js.Function2[
      /* connectionContext */ ConnectionContextType, 
      /* connection */ DatabasePoolConnectionType, 
      MaybePromiseType[Null]
    ]
  ] = js.undefined
  var afterQueryExecution: js.UndefOr[
    js.Function3[
      /* queryContext */ QueryContextType, 
      /* query */ QueryType, 
      /* result */ QueryResultType[QueryResultRowType[String]], 
      MaybePromiseType[Null]
    ]
  ] = js.undefined
  var beforePoolConnection: js.UndefOr[
    js.Function1[
      /* connectionContext */ PoolContextType, 
      MaybePromiseType[js.UndefOr[DatabasePoolType | Null]]
    ]
  ] = js.undefined
  var beforePoolConnectionRelease: js.UndefOr[
    js.Function2[
      /* connectionContext */ ConnectionContextType, 
      /* connection */ DatabasePoolConnectionType, 
      MaybePromiseType[Null]
    ]
  ] = js.undefined
  var beforeQueryExecution: js.UndefOr[
    js.Function2[
      /* queryContext */ QueryContextType, 
      /* query */ QueryType, 
      MaybePromiseType[QueryResultType[QueryResultRowType[String]] | Null]
    ]
  ] = js.undefined
  var beforeQueryResult: js.UndefOr[
    js.Function3[
      /* queryContext */ QueryContextType, 
      /* query */ QueryType, 
      /* result */ QueryResultType[QueryResultRowType[String]], 
      MaybePromiseType[Null]
    ]
  ] = js.undefined
  var beforeTransformQuery: js.UndefOr[
    js.Function2[/* queryContext */ QueryContextType, /* query */ QueryType, MaybePromiseType[Null]]
  ] = js.undefined
  var queryExecutionError: js.UndefOr[
    js.Function3[
      /* queryContext */ QueryContextType, 
      /* query */ QueryType, 
      /* error */ SlonikError, 
      MaybePromiseType[Null]
    ]
  ] = js.undefined
  var transformQuery: js.UndefOr[
    js.Function2[/* queryContext */ QueryContextType, /* query */ QueryType, QueryType]
  ] = js.undefined
  var transformRow: js.UndefOr[
    js.Function4[
      /* queryContext */ QueryContextType, 
      /* query */ QueryType, 
      /* row */ QueryResultRowType[String], 
      /* fields */ js.Array[FieldType], 
      QueryResultRowType[String]
    ]
  ] = js.undefined
}

object InterceptorType {
  @scala.inline
  def apply(
    afterPoolConnection: (/* connectionContext */ ConnectionContextType, /* connection */ DatabasePoolConnectionType) => CallbackTo[MaybePromiseType[Null]] = null,
    afterQueryExecution: (/* queryContext */ QueryContextType, /* query */ QueryType, /* result */ QueryResultType[QueryResultRowType[String]]) => CallbackTo[MaybePromiseType[Null]] = null,
    beforePoolConnection: /* connectionContext */ PoolContextType => CallbackTo[MaybePromiseType[js.UndefOr[DatabasePoolType | Null]]] = null,
    beforePoolConnectionRelease: (/* connectionContext */ ConnectionContextType, /* connection */ DatabasePoolConnectionType) => CallbackTo[MaybePromiseType[Null]] = null,
    beforeQueryExecution: (/* queryContext */ QueryContextType, /* query */ QueryType) => CallbackTo[MaybePromiseType[QueryResultType[QueryResultRowType[String]] | Null]] = null,
    beforeQueryResult: (/* queryContext */ QueryContextType, /* query */ QueryType, /* result */ QueryResultType[QueryResultRowType[String]]) => CallbackTo[MaybePromiseType[Null]] = null,
    beforeTransformQuery: (/* queryContext */ QueryContextType, /* query */ QueryType) => CallbackTo[MaybePromiseType[Null]] = null,
    queryExecutionError: (/* queryContext */ QueryContextType, /* query */ QueryType, /* error */ SlonikError) => CallbackTo[MaybePromiseType[Null]] = null,
    transformQuery: (/* queryContext */ QueryContextType, /* query */ QueryType) => CallbackTo[QueryType] = null,
    transformRow: (/* queryContext */ QueryContextType, /* query */ QueryType, /* row */ QueryResultRowType[String], /* fields */ js.Array[FieldType]) => CallbackTo[QueryResultRowType[String]] = null
  ): InterceptorType = {
    val __obj = js.Dynamic.literal()
    if (afterPoolConnection != null) __obj.updateDynamic("afterPoolConnection")(js.Any.fromFunction2((t0: /* connectionContext */ typingsJapgolly.slonik.mod.ConnectionContextType, t1: /* connection */ typingsJapgolly.slonik.mod.DatabasePoolConnectionType) => afterPoolConnection(t0, t1).runNow()))
    if (afterQueryExecution != null) __obj.updateDynamic("afterQueryExecution")(js.Any.fromFunction3((t0: /* queryContext */ typingsJapgolly.slonik.mod.QueryContextType, t1: /* query */ typingsJapgolly.slonik.mod.QueryType, t2: /* result */ typingsJapgolly.slonik.mod.QueryResultType[typingsJapgolly.slonik.mod.QueryResultRowType[java.lang.String]]) => afterQueryExecution(t0, t1, t2).runNow()))
    if (beforePoolConnection != null) __obj.updateDynamic("beforePoolConnection")(js.Any.fromFunction1((t0: /* connectionContext */ typingsJapgolly.slonik.mod.PoolContextType) => beforePoolConnection(t0).runNow()))
    if (beforePoolConnectionRelease != null) __obj.updateDynamic("beforePoolConnectionRelease")(js.Any.fromFunction2((t0: /* connectionContext */ typingsJapgolly.slonik.mod.ConnectionContextType, t1: /* connection */ typingsJapgolly.slonik.mod.DatabasePoolConnectionType) => beforePoolConnectionRelease(t0, t1).runNow()))
    if (beforeQueryExecution != null) __obj.updateDynamic("beforeQueryExecution")(js.Any.fromFunction2((t0: /* queryContext */ typingsJapgolly.slonik.mod.QueryContextType, t1: /* query */ typingsJapgolly.slonik.mod.QueryType) => beforeQueryExecution(t0, t1).runNow()))
    if (beforeQueryResult != null) __obj.updateDynamic("beforeQueryResult")(js.Any.fromFunction3((t0: /* queryContext */ typingsJapgolly.slonik.mod.QueryContextType, t1: /* query */ typingsJapgolly.slonik.mod.QueryType, t2: /* result */ typingsJapgolly.slonik.mod.QueryResultType[typingsJapgolly.slonik.mod.QueryResultRowType[java.lang.String]]) => beforeQueryResult(t0, t1, t2).runNow()))
    if (beforeTransformQuery != null) __obj.updateDynamic("beforeTransformQuery")(js.Any.fromFunction2((t0: /* queryContext */ typingsJapgolly.slonik.mod.QueryContextType, t1: /* query */ typingsJapgolly.slonik.mod.QueryType) => beforeTransformQuery(t0, t1).runNow()))
    if (queryExecutionError != null) __obj.updateDynamic("queryExecutionError")(js.Any.fromFunction3((t0: /* queryContext */ typingsJapgolly.slonik.mod.QueryContextType, t1: /* query */ typingsJapgolly.slonik.mod.QueryType, t2: /* error */ typingsJapgolly.slonik.mod.SlonikError) => queryExecutionError(t0, t1, t2).runNow()))
    if (transformQuery != null) __obj.updateDynamic("transformQuery")(js.Any.fromFunction2((t0: /* queryContext */ typingsJapgolly.slonik.mod.QueryContextType, t1: /* query */ typingsJapgolly.slonik.mod.QueryType) => transformQuery(t0, t1).runNow()))
    if (transformRow != null) __obj.updateDynamic("transformRow")(js.Any.fromFunction4((t0: /* queryContext */ typingsJapgolly.slonik.mod.QueryContextType, t1: /* query */ typingsJapgolly.slonik.mod.QueryType, t2: /* row */ typingsJapgolly.slonik.mod.QueryResultRowType[java.lang.String], t3: /* fields */ js.Array[typingsJapgolly.slonik.mod.FieldType]) => transformRow(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[InterceptorType]
  }
}

