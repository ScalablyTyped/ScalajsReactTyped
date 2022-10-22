package typingsJapgolly.algoliasearch.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.algoliaClientSearch.mod.SaveSynonymsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.SaveSynonymsResponse>> */
trait ReadonlyWaitablePromiseSaFinally extends StObject {
  
  def `catch`[TResult](): js.Promise[SaveSynonymsResponse | TResult]
  
  def `finally`(): js.Promise[SaveSynonymsResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyWaitablePromiseSaFinally {
  
  inline def apply(
    `catch`: CallbackTo[js.Promise[SaveSynonymsResponse | Any]],
    `finally`: CallbackTo[js.Promise[SaveSynonymsResponse]],
    `then`: CallbackTo[js.Promise[Any | Any]]
  ): ReadonlyWaitablePromiseSaFinally = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(`catch`.toJsFn)
    __obj.updateDynamic("finally")(`finally`.toJsFn)
    __obj.updateDynamic("then")(`then`.toJsFn)
    __obj.asInstanceOf[ReadonlyWaitablePromiseSaFinally]
  }
  
  extension [Self <: ReadonlyWaitablePromiseSaFinally](x: Self) {
    
    inline def setCatch(value: CallbackTo[js.Promise[SaveSynonymsResponse | Any]]): Self = StObject.set(x, "catch", value.toJsFn)
    
    inline def setFinally(value: CallbackTo[js.Promise[SaveSynonymsResponse]]): Self = StObject.set(x, "finally", value.toJsFn)
    
    inline def setThen(value: CallbackTo[js.Promise[Any | Any]]): Self = StObject.set(x, "then", value.toJsFn)
  }
}
