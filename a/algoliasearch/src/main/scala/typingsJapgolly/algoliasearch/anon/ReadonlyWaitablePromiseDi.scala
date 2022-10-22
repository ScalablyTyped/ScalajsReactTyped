package typingsJapgolly.algoliasearch.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.algoliaClientSearch.mod.DictionaryEntriesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.DictionaryEntriesResponse>> */
trait ReadonlyWaitablePromiseDi extends StObject {
  
  def `catch`[TResult](): js.Promise[DictionaryEntriesResponse | TResult]
  
  def `finally`(): js.Promise[DictionaryEntriesResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyWaitablePromiseDi {
  
  inline def apply(
    `catch`: CallbackTo[js.Promise[DictionaryEntriesResponse | Any]],
    `finally`: CallbackTo[js.Promise[DictionaryEntriesResponse]],
    `then`: CallbackTo[js.Promise[Any | Any]]
  ): ReadonlyWaitablePromiseDi = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(`catch`.toJsFn)
    __obj.updateDynamic("finally")(`finally`.toJsFn)
    __obj.updateDynamic("then")(`then`.toJsFn)
    __obj.asInstanceOf[ReadonlyWaitablePromiseDi]
  }
  
  extension [Self <: ReadonlyWaitablePromiseDi](x: Self) {
    
    inline def setCatch(value: CallbackTo[js.Promise[DictionaryEntriesResponse | Any]]): Self = StObject.set(x, "catch", value.toJsFn)
    
    inline def setFinally(value: CallbackTo[js.Promise[DictionaryEntriesResponse]]): Self = StObject.set(x, "finally", value.toJsFn)
    
    inline def setThen(value: CallbackTo[js.Promise[Any | Any]]): Self = StObject.set(x, "then", value.toJsFn)
  }
}
