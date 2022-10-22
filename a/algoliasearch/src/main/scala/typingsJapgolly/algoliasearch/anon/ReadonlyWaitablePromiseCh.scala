package typingsJapgolly.algoliasearch.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.algoliaClientSearch.mod.ChunkedBatchResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.ChunkedBatchResponse>> */
trait ReadonlyWaitablePromiseCh extends StObject {
  
  def `catch`[TResult](): js.Promise[ChunkedBatchResponse | TResult]
  
  def `finally`(): js.Promise[ChunkedBatchResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyWaitablePromiseCh {
  
  inline def apply(
    `catch`: CallbackTo[js.Promise[ChunkedBatchResponse | Any]],
    `finally`: CallbackTo[js.Promise[ChunkedBatchResponse]],
    `then`: CallbackTo[js.Promise[Any | Any]]
  ): ReadonlyWaitablePromiseCh = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(`catch`.toJsFn)
    __obj.updateDynamic("finally")(`finally`.toJsFn)
    __obj.updateDynamic("then")(`then`.toJsFn)
    __obj.asInstanceOf[ReadonlyWaitablePromiseCh]
  }
  
  extension [Self <: ReadonlyWaitablePromiseCh](x: Self) {
    
    inline def setCatch(value: CallbackTo[js.Promise[ChunkedBatchResponse | Any]]): Self = StObject.set(x, "catch", value.toJsFn)
    
    inline def setFinally(value: CallbackTo[js.Promise[ChunkedBatchResponse]]): Self = StObject.set(x, "finally", value.toJsFn)
    
    inline def setThen(value: CallbackTo[js.Promise[Any | Any]]): Self = StObject.set(x, "then", value.toJsFn)
  }
}
