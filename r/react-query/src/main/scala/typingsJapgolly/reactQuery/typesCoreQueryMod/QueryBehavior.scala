package typingsJapgolly.reactQuery.typesCoreQueryMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactQuery.typesCoreTypesMod.QueryKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryBehavior[TQueryFnData, TError, TData, TQueryKey /* <: QueryKey */] extends StObject {
  
  def onFetch(context: FetchContext[TQueryFnData, TError, TData, TQueryKey]): Unit
}
object QueryBehavior {
  
  inline def apply[TQueryFnData, TError, TData, TQueryKey /* <: QueryKey */](onFetch: FetchContext[TQueryFnData, TError, TData, TQueryKey] => Callback): QueryBehavior[TQueryFnData, TError, TData, TQueryKey] = {
    val __obj = js.Dynamic.literal(onFetch = js.Any.fromFunction1((t0: FetchContext[TQueryFnData, TError, TData, TQueryKey]) => onFetch(t0).runNow()))
    __obj.asInstanceOf[QueryBehavior[TQueryFnData, TError, TData, TQueryKey]]
  }
  
  extension [Self <: QueryBehavior[?, ?, ?, ?], TQueryFnData, TError, TData, TQueryKey /* <: QueryKey */](x: Self & (QueryBehavior[TQueryFnData, TError, TData, TQueryKey])) {
    
    inline def setOnFetch(value: FetchContext[TQueryFnData, TError, TData, TQueryKey] => Callback): Self = StObject.set(x, "onFetch", js.Any.fromFunction1((t0: FetchContext[TQueryFnData, TError, TData, TQueryKey]) => value(t0).runNow()))
  }
}
