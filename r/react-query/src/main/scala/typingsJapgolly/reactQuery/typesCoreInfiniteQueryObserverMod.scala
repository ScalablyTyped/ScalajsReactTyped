package typingsJapgolly.reactQuery

import typingsJapgolly.reactQuery.typesCoreQueryClientMod.QueryClient
import typingsJapgolly.reactQuery.typesCoreQueryObserverMod.QueryObserver
import typingsJapgolly.reactQuery.typesCoreTypesMod.FetchNextPageOptions
import typingsJapgolly.reactQuery.typesCoreTypesMod.FetchPreviousPageOptions
import typingsJapgolly.reactQuery.typesCoreTypesMod.InfiniteData
import typingsJapgolly.reactQuery.typesCoreTypesMod.InfiniteQueryObserverOptions
import typingsJapgolly.reactQuery.typesCoreTypesMod.InfiniteQueryObserverResult
import typingsJapgolly.reactQuery.typesCoreTypesMod.QueryKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCoreInfiniteQueryObserverMod {
  
  @JSImport("react-query/types/core/infiniteQueryObserver", "InfiniteQueryObserver")
  @js.native
  open class InfiniteQueryObserver[TQueryFnData, TError, TData, TQueryData] protected () extends QueryObserver[TQueryFnData, TError, InfiniteData[TData], InfiniteData[TQueryData], QueryKey] {
    def this(
      client: QueryClient,
      options: InfiniteQueryObserverOptions[TQueryFnData, TError, TData, TQueryData, QueryKey]
    ) = this()
    
    def fetchNextPage(): js.Promise[InfiniteQueryObserverResult[TData, TError]] = js.native
    def fetchNextPage(options: FetchNextPageOptions): js.Promise[InfiniteQueryObserverResult[TData, TError]] = js.native
    
    def fetchPreviousPage(): js.Promise[InfiniteQueryObserverResult[TData, TError]] = js.native
    def fetchPreviousPage(options: FetchPreviousPageOptions): js.Promise[InfiniteQueryObserverResult[TData, TError]] = js.native
  }
  
  type InfiniteQueryObserverListener[TData, TError] = js.Function1[/* result */ InfiniteQueryObserverResult[TData, TError], Unit]
}
