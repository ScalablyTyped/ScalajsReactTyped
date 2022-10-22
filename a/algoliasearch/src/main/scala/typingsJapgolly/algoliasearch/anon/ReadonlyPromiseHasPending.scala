package typingsJapgolly.algoliasearch.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.algoliaClientSearch.mod.HasPendingMappingsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.HasPendingMappingsResponse>> */
trait ReadonlyPromiseHasPending extends StObject {
  
  def `catch`[TResult](): js.Promise[HasPendingMappingsResponse | TResult]
  
  def `finally`(): js.Promise[HasPendingMappingsResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseHasPending {
  
  inline def apply(
    `catch`: CallbackTo[js.Promise[HasPendingMappingsResponse | Any]],
    `finally`: CallbackTo[js.Promise[HasPendingMappingsResponse]],
    `then`: CallbackTo[js.Promise[Any | Any]]
  ): ReadonlyPromiseHasPending = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(`catch`.toJsFn)
    __obj.updateDynamic("finally")(`finally`.toJsFn)
    __obj.updateDynamic("then")(`then`.toJsFn)
    __obj.asInstanceOf[ReadonlyPromiseHasPending]
  }
  
  extension [Self <: ReadonlyPromiseHasPending](x: Self) {
    
    inline def setCatch(value: CallbackTo[js.Promise[HasPendingMappingsResponse | Any]]): Self = StObject.set(x, "catch", value.toJsFn)
    
    inline def setFinally(value: CallbackTo[js.Promise[HasPendingMappingsResponse]]): Self = StObject.set(x, "finally", value.toJsFn)
    
    inline def setThen(value: CallbackTo[js.Promise[Any | Any]]): Self = StObject.set(x, "then", value.toJsFn)
  }
}
