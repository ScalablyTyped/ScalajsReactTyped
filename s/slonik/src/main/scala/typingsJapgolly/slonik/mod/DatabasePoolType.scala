package typingsJapgolly.slonik.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatabasePoolType
  extends StObject
     with CommonQueryMethodsType {
  
  def connect[T](connectionRoutine: ConnectionRoutineType[T]): js.Promise[T]
  
  def end(): js.Promise[Unit]
  
  def getPoolState(): PoolStateType
  
  def stream(
    sql: TaggedTemplateLiteralInvocationType[QueryResultRowType[String]],
    streamHandler: StreamHandlerType
  ): js.Promise[Null]
  
  def transaction[T](handler: TransactionFunctionType[T]): js.Promise[T]
}
object DatabasePoolType {
  
  inline def apply(
    any: /* args */ QueryMethodParams[Any] => js.Promise[js.Array[Any]],
    anyFirst: QueryAnyFirstFunctionType,
    connect: ConnectionRoutineType[Any] => js.Promise[Any],
    end: CallbackTo[js.Promise[Unit]],
    exists: /* args */ QueryMethodParams[Any] => js.Promise[Boolean],
    getPoolState: CallbackTo[PoolStateType],
    many: QueryManyFunctionType,
    manyFirst: QueryManyFirstFunctionType,
    maybeOne: /* args */ QueryMethodParams[Any] => js.Promise[Any | Null],
    maybeOneFirst: /* args */ QueryMethodParams[Any] => js.Promise[
      (/* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any) | Null
    ],
    one: /* args */ QueryMethodParams[Any] => js.Promise[Any],
    oneFirst: /* args */ QueryMethodParams[Any] => js.Promise[
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
    ],
    query: /* args */ QueryMethodParams[Any] => js.Promise[QueryResultType[Any]],
    stream: (TaggedTemplateLiteralInvocationType[QueryResultRowType[String]], StreamHandlerType) => js.Promise[Null],
    transaction: TransactionFunctionType[Any] => js.Promise[Any]
  ): DatabasePoolType = {
    val __obj = js.Dynamic.literal(any = js.Any.fromFunction1(any), anyFirst = anyFirst.asInstanceOf[js.Any], connect = js.Any.fromFunction1(connect), end = end.toJsFn, exists = js.Any.fromFunction1(exists), getPoolState = getPoolState.toJsFn, many = many.asInstanceOf[js.Any], manyFirst = manyFirst.asInstanceOf[js.Any], maybeOne = js.Any.fromFunction1(maybeOne), maybeOneFirst = js.Any.fromFunction1(maybeOneFirst), one = js.Any.fromFunction1(one), oneFirst = js.Any.fromFunction1(oneFirst), query = js.Any.fromFunction1(query), stream = js.Any.fromFunction2(stream), transaction = js.Any.fromFunction1(transaction))
    __obj.asInstanceOf[DatabasePoolType]
  }
  
  extension [Self <: DatabasePoolType](x: Self) {
    
    inline def setConnect(value: ConnectionRoutineType[Any] => js.Promise[Any]): Self = StObject.set(x, "connect", js.Any.fromFunction1(value))
    
    inline def setEnd(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "end", value.toJsFn)
    
    inline def setGetPoolState(value: CallbackTo[PoolStateType]): Self = StObject.set(x, "getPoolState", value.toJsFn)
    
    inline def setStream(
      value: (TaggedTemplateLiteralInvocationType[QueryResultRowType[String]], StreamHandlerType) => js.Promise[Null]
    ): Self = StObject.set(x, "stream", js.Any.fromFunction2(value))
    
    inline def setTransaction(value: TransactionFunctionType[Any] => js.Promise[Any]): Self = StObject.set(x, "transaction", js.Any.fromFunction1(value))
  }
}
