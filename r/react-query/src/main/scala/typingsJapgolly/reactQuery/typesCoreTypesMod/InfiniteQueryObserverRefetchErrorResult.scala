package typingsJapgolly.reactQuery.typesCoreTypesMod

import typingsJapgolly.reactQuery.reactQueryBooleans.`false`
import typingsJapgolly.reactQuery.reactQueryBooleans.`true`
import typingsJapgolly.reactQuery.reactQueryStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InfiniteQueryObserverRefetchErrorResult[TData, TError]
  extends StObject
     with InfiniteQueryObserverBaseResult[TData, TError]
     with InfiniteQueryObserverResult[TData, TError] {
  
  @JSName("data")
  var data_InfiniteQueryObserverRefetchErrorResult: InfiniteData[TData] = js.native
  
  @JSName("error")
  var error_InfiniteQueryObserverRefetchErrorResult: TError = js.native
  
  @JSName("isError")
  var isError_InfiniteQueryObserverRefetchErrorResult: `true` = js.native
  
  @JSName("isIdle")
  var isIdle_InfiniteQueryObserverRefetchErrorResult: `false` = js.native
  
  @JSName("isLoadingError")
  var isLoadingError_InfiniteQueryObserverRefetchErrorResult: `false` = js.native
  
  @JSName("isLoading")
  var isLoading_InfiniteQueryObserverRefetchErrorResult: `false` = js.native
  
  @JSName("isRefetchError")
  var isRefetchError_InfiniteQueryObserverRefetchErrorResult: `true` = js.native
  
  @JSName("isSuccess")
  var isSuccess_InfiniteQueryObserverRefetchErrorResult: `false` = js.native
  
  @JSName("status")
  var status_InfiniteQueryObserverRefetchErrorResult: error = js.native
}
