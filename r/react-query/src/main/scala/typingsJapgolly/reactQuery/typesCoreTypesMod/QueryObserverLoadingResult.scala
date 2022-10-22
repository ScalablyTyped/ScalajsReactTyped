package typingsJapgolly.reactQuery.typesCoreTypesMod

import typingsJapgolly.reactQuery.reactQueryBooleans.`false`
import typingsJapgolly.reactQuery.reactQueryBooleans.`true`
import typingsJapgolly.reactQuery.reactQueryStrings.loading
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryObserverLoadingResult[TData, TError]
  extends StObject
     with QueryObserverBaseResult[TData, TError]
     with QueryObserverResult[TData, TError] {
  
  @JSName("data")
  var data_QueryObserverLoadingResult: Unit = js.native
  
  @JSName("error")
  var error_QueryObserverLoadingResult: Null = js.native
  
  @JSName("isError")
  var isError_QueryObserverLoadingResult: `false` = js.native
  
  @JSName("isIdle")
  var isIdle_QueryObserverLoadingResult: `false` = js.native
  
  @JSName("isLoadingError")
  var isLoadingError_QueryObserverLoadingResult: `false` = js.native
  
  @JSName("isLoading")
  var isLoading_QueryObserverLoadingResult: `true` = js.native
  
  @JSName("isRefetchError")
  var isRefetchError_QueryObserverLoadingResult: `false` = js.native
  
  @JSName("isSuccess")
  var isSuccess_QueryObserverLoadingResult: `false` = js.native
  
  @JSName("status")
  var status_QueryObserverLoadingResult: loading = js.native
}
