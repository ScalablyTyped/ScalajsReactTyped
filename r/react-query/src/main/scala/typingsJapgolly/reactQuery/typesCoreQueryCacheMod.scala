package typingsJapgolly.reactQuery

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactQuery.reactQueryStrings.observerAdded
import typingsJapgolly.reactQuery.reactQueryStrings.observerRemoved
import typingsJapgolly.reactQuery.reactQueryStrings.observerResultsUpdated
import typingsJapgolly.reactQuery.reactQueryStrings.queryAdded
import typingsJapgolly.reactQuery.reactQueryStrings.queryRemoved
import typingsJapgolly.reactQuery.reactQueryStrings.queryUpdated
import typingsJapgolly.reactQuery.typesCoreQueryClientMod.QueryClient
import typingsJapgolly.reactQuery.typesCoreQueryMod.Action
import typingsJapgolly.reactQuery.typesCoreQueryMod.Query
import typingsJapgolly.reactQuery.typesCoreQueryMod.QueryState
import typingsJapgolly.reactQuery.typesCoreQueryObserverMod.QueryObserver
import typingsJapgolly.reactQuery.typesCoreSubscribableMod.Subscribable
import typingsJapgolly.reactQuery.typesCoreTypesMod.QueryKey
import typingsJapgolly.reactQuery.typesCoreTypesMod.QueryOptions
import typingsJapgolly.reactQuery.typesCoreUtilsMod.QueryFilters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCoreQueryCacheMod {
  
  @JSImport("react-query/types/core/queryCache", "QueryCache")
  @js.native
  open class QueryCache () extends Subscribable[QueryCacheListener] {
    def this(config: QueryCacheConfig) = this()
    
    def add(query: Query[Any, Any, Any, Any]): Unit = js.native
    
    def build[TQueryFnData, TError, TData, TQueryKey /* <: QueryKey */](client: QueryClient, options: QueryOptions[TQueryFnData, TError, TData, TQueryKey]): Query[TQueryFnData, TError, TData, TQueryKey] = js.native
    def build[TQueryFnData, TError, TData, TQueryKey /* <: QueryKey */](
      client: QueryClient,
      options: QueryOptions[TQueryFnData, TError, TData, TQueryKey],
      state: QueryState[TData, TError]
    ): Query[TQueryFnData, TError, TData, TQueryKey] = js.native
    
    def clear(): Unit = js.native
    
    var config: QueryCacheConfig = js.native
    
    def find[TQueryFnData, TError, TData](arg1: QueryKey): js.UndefOr[Query[TQueryFnData, TError, TData, QueryKey]] = js.native
    def find[TQueryFnData, TError, TData](arg1: QueryKey, arg2: QueryFilters): js.UndefOr[Query[TQueryFnData, TError, TData, QueryKey]] = js.native
    
    def findAll(): js.Array[Query[Any, Any, Any, QueryKey]] = js.native
    def findAll(arg1: QueryFilters, arg2: QueryFilters): js.Array[Query[Any, Any, Any, QueryKey]] = js.native
    def findAll(filters: QueryFilters): js.Array[Query[Any, Any, Any, QueryKey]] = js.native
    def findAll(queryKey: Unit, filters: QueryFilters): js.Array[Query[Any, Any, Any, QueryKey]] = js.native
    def findAll(queryKey: QueryKey): js.Array[Query[Any, Any, Any, QueryKey]] = js.native
    def findAll(queryKey: QueryKey, filters: QueryFilters): js.Array[Query[Any, Any, Any, QueryKey]] = js.native
    
    def get[TQueryFnData, TError, TData, TQueyKey /* <: QueryKey */](queryHash: String): js.UndefOr[Query[TQueryFnData, TError, TData, TQueyKey]] = js.native
    
    def getAll(): js.Array[Query[Any, Any, Any, QueryKey]] = js.native
    
    def notify(event: QueryCacheNotifyEvent): Unit = js.native
    
    def onFocus(): Unit = js.native
    
    def onOnline(): Unit = js.native
    
    /* private */ var queries: Any = js.native
    
    /* private */ var queriesMap: Any = js.native
    
    def remove(query: Query[Any, Any, Any, Any]): Unit = js.native
  }
  
  trait NotifyEventObserverAdded
    extends StObject
       with QueryCacheNotifyEvent {
    
    var observer: QueryObserver[Any, Any, Any, Any, Any]
    
    var query: Query[Any, Any, Any, Any]
    
    var `type`: observerAdded
  }
  object NotifyEventObserverAdded {
    
    inline def apply(observer: QueryObserver[Any, Any, Any, Any, Any], query: Query[Any, Any, Any, Any]): NotifyEventObserverAdded = {
      val __obj = js.Dynamic.literal(observer = observer.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("observerAdded")
      __obj.asInstanceOf[NotifyEventObserverAdded]
    }
    
    extension [Self <: NotifyEventObserverAdded](x: Self) {
      
      inline def setObserver(value: QueryObserver[Any, Any, Any, Any, Any]): Self = StObject.set(x, "observer", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: Query[Any, Any, Any, Any]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setType(value: observerAdded): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait NotifyEventObserverRemoved
    extends StObject
       with QueryCacheNotifyEvent {
    
    var observer: QueryObserver[Any, Any, Any, Any, Any]
    
    var query: Query[Any, Any, Any, Any]
    
    var `type`: observerRemoved
  }
  object NotifyEventObserverRemoved {
    
    inline def apply(observer: QueryObserver[Any, Any, Any, Any, Any], query: Query[Any, Any, Any, Any]): NotifyEventObserverRemoved = {
      val __obj = js.Dynamic.literal(observer = observer.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("observerRemoved")
      __obj.asInstanceOf[NotifyEventObserverRemoved]
    }
    
    extension [Self <: NotifyEventObserverRemoved](x: Self) {
      
      inline def setObserver(value: QueryObserver[Any, Any, Any, Any, Any]): Self = StObject.set(x, "observer", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: Query[Any, Any, Any, Any]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setType(value: observerRemoved): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait NotifyEventObserverResultsUpdated
    extends StObject
       with QueryCacheNotifyEvent {
    
    var query: Query[Any, Any, Any, Any]
    
    var `type`: observerResultsUpdated
  }
  object NotifyEventObserverResultsUpdated {
    
    inline def apply(query: Query[Any, Any, Any, Any]): NotifyEventObserverResultsUpdated = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("observerResultsUpdated")
      __obj.asInstanceOf[NotifyEventObserverResultsUpdated]
    }
    
    extension [Self <: NotifyEventObserverResultsUpdated](x: Self) {
      
      inline def setQuery(value: Query[Any, Any, Any, Any]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setType(value: observerResultsUpdated): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait NotifyEventQueryAdded
    extends StObject
       with QueryCacheNotifyEvent {
    
    var query: Query[Any, Any, Any, Any]
    
    var `type`: queryAdded
  }
  object NotifyEventQueryAdded {
    
    inline def apply(query: Query[Any, Any, Any, Any]): NotifyEventQueryAdded = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("queryAdded")
      __obj.asInstanceOf[NotifyEventQueryAdded]
    }
    
    extension [Self <: NotifyEventQueryAdded](x: Self) {
      
      inline def setQuery(value: Query[Any, Any, Any, Any]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setType(value: queryAdded): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait NotifyEventQueryRemoved
    extends StObject
       with QueryCacheNotifyEvent {
    
    var query: Query[Any, Any, Any, Any]
    
    var `type`: queryRemoved
  }
  object NotifyEventQueryRemoved {
    
    inline def apply(query: Query[Any, Any, Any, Any]): NotifyEventQueryRemoved = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("queryRemoved")
      __obj.asInstanceOf[NotifyEventQueryRemoved]
    }
    
    extension [Self <: NotifyEventQueryRemoved](x: Self) {
      
      inline def setQuery(value: Query[Any, Any, Any, Any]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setType(value: queryRemoved): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait NotifyEventQueryUpdated
    extends StObject
       with QueryCacheNotifyEvent {
    
    var action: Action[Any, Any]
    
    var query: Query[Any, Any, Any, Any]
    
    var `type`: queryUpdated
  }
  object NotifyEventQueryUpdated {
    
    inline def apply(action: Action[Any, Any], query: Query[Any, Any, Any, Any]): NotifyEventQueryUpdated = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("queryUpdated")
      __obj.asInstanceOf[NotifyEventQueryUpdated]
    }
    
    extension [Self <: NotifyEventQueryUpdated](x: Self) {
      
      inline def setAction(value: Action[Any, Any]): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: Query[Any, Any, Any, Any]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setType(value: queryUpdated): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait QueryCacheConfig extends StObject {
    
    var onError: js.UndefOr[js.Function2[/* error */ Any, /* query */ Query[Any, Any, Any, QueryKey], Unit]] = js.undefined
    
    var onSuccess: js.UndefOr[js.Function2[/* data */ Any, /* query */ Query[Any, Any, Any, QueryKey], Unit]] = js.undefined
  }
  object QueryCacheConfig {
    
    inline def apply(): QueryCacheConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryCacheConfig]
    }
    
    extension [Self <: QueryCacheConfig](x: Self) {
      
      inline def setOnError(value: (/* error */ Any, /* query */ Query[Any, Any, Any, QueryKey]) => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction2((t0: /* error */ Any, t1: /* query */ Query[Any, Any, Any, QueryKey]) => (value(t0, t1)).runNow()))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnSuccess(value: (/* data */ Any, /* query */ Query[Any, Any, Any, QueryKey]) => Callback): Self = StObject.set(x, "onSuccess", js.Any.fromFunction2((t0: /* data */ Any, t1: /* query */ Query[Any, Any, Any, QueryKey]) => (value(t0, t1)).runNow()))
      
      inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
    }
  }
  
  type QueryCacheListener = js.Function1[/* event */ js.UndefOr[QueryCacheNotifyEvent], Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactQuery.typesCoreQueryCacheMod.NotifyEventQueryAdded
    - typingsJapgolly.reactQuery.typesCoreQueryCacheMod.NotifyEventQueryRemoved
    - typingsJapgolly.reactQuery.typesCoreQueryCacheMod.NotifyEventQueryUpdated
    - typingsJapgolly.reactQuery.typesCoreQueryCacheMod.NotifyEventObserverAdded
    - typingsJapgolly.reactQuery.typesCoreQueryCacheMod.NotifyEventObserverRemoved
    - typingsJapgolly.reactQuery.typesCoreQueryCacheMod.NotifyEventObserverResultsUpdated
  */
  trait QueryCacheNotifyEvent extends StObject
  object QueryCacheNotifyEvent {
    
    inline def NotifyEventObserverAdded(observer: QueryObserver[Any, Any, Any, Any, Any], query: Query[Any, Any, Any, Any]): typingsJapgolly.reactQuery.typesCoreQueryCacheMod.NotifyEventObserverAdded = {
      val __obj = js.Dynamic.literal(observer = observer.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("observerAdded")
      __obj.asInstanceOf[typingsJapgolly.reactQuery.typesCoreQueryCacheMod.NotifyEventObserverAdded]
    }
    
    inline def NotifyEventObserverRemoved(observer: QueryObserver[Any, Any, Any, Any, Any], query: Query[Any, Any, Any, Any]): typingsJapgolly.reactQuery.typesCoreQueryCacheMod.NotifyEventObserverRemoved = {
      val __obj = js.Dynamic.literal(observer = observer.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("observerRemoved")
      __obj.asInstanceOf[typingsJapgolly.reactQuery.typesCoreQueryCacheMod.NotifyEventObserverRemoved]
    }
    
    inline def NotifyEventObserverResultsUpdated(query: Query[Any, Any, Any, Any]): typingsJapgolly.reactQuery.typesCoreQueryCacheMod.NotifyEventObserverResultsUpdated = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("observerResultsUpdated")
      __obj.asInstanceOf[typingsJapgolly.reactQuery.typesCoreQueryCacheMod.NotifyEventObserverResultsUpdated]
    }
    
    inline def NotifyEventQueryAdded(query: Query[Any, Any, Any, Any]): typingsJapgolly.reactQuery.typesCoreQueryCacheMod.NotifyEventQueryAdded = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("queryAdded")
      __obj.asInstanceOf[typingsJapgolly.reactQuery.typesCoreQueryCacheMod.NotifyEventQueryAdded]
    }
    
    inline def NotifyEventQueryRemoved(query: Query[Any, Any, Any, Any]): typingsJapgolly.reactQuery.typesCoreQueryCacheMod.NotifyEventQueryRemoved = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("queryRemoved")
      __obj.asInstanceOf[typingsJapgolly.reactQuery.typesCoreQueryCacheMod.NotifyEventQueryRemoved]
    }
    
    inline def NotifyEventQueryUpdated(action: Action[Any, Any], query: Query[Any, Any, Any, Any]): typingsJapgolly.reactQuery.typesCoreQueryCacheMod.NotifyEventQueryUpdated = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("queryUpdated")
      __obj.asInstanceOf[typingsJapgolly.reactQuery.typesCoreQueryCacheMod.NotifyEventQueryUpdated]
    }
  }
}
