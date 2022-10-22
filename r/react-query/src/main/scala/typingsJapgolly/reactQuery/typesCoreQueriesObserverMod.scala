package typingsJapgolly.reactQuery

import typingsJapgolly.reactQuery.typesCoreQueryClientMod.QueryClient
import typingsJapgolly.reactQuery.typesCoreQueryObserverMod.NotifyOptions
import typingsJapgolly.reactQuery.typesCoreSubscribableMod.Subscribable
import typingsJapgolly.reactQuery.typesCoreTypesMod.QueryKey
import typingsJapgolly.reactQuery.typesCoreTypesMod.QueryObserverOptions
import typingsJapgolly.reactQuery.typesCoreTypesMod.QueryObserverResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCoreQueriesObserverMod {
  
  @JSImport("react-query/types/core/queriesObserver", "QueriesObserver")
  @js.native
  open class QueriesObserver protected () extends Subscribable[QueriesObserverListener] {
    def this(client: QueryClient) = this()
    def this(client: QueryClient, queries: js.Array[QueryObserverOptions[Any, Any, Any, Any, QueryKey]]) = this()
    
    /* private */ var client: Any = js.native
    
    def destroy(): Unit = js.native
    
    /* private */ var findMatchingObservers: Any = js.native
    
    def getCurrentResult(): js.Array[QueryObserverResult[Any, Any]] = js.native
    
    /* private */ var getObserver: Any = js.native
    
    def getOptimisticResult(queries: js.Array[QueryObserverOptions[Any, Any, Any, Any, QueryKey]]): js.Array[QueryObserverResult[Any, Any]] = js.native
    
    /* private */ @JSName("notify")
    var notify_FQueriesObserver: Any = js.native
    
    /* private */ var observers: Any = js.native
    
    /* private */ var observersMap: Any = js.native
    
    /* private */ var onUpdate: Any = js.native
    
    /* private */ var queries: Any = js.native
    
    /* private */ var result: Any = js.native
    
    def setQueries(queries: js.Array[QueryObserverOptions[Any, Any, Any, Any, QueryKey]]): Unit = js.native
    def setQueries(
      queries: js.Array[QueryObserverOptions[Any, Any, Any, Any, QueryKey]],
      notifyOptions: NotifyOptions
    ): Unit = js.native
    
    /* private */ var updateObservers: Any = js.native
  }
  
  type QueriesObserverListener = js.Function1[/* result */ js.Array[QueryObserverResult[Any, Any]], Unit]
}
