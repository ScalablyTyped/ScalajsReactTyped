package typingsJapgolly.algoliasearch.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.algoliaClientSearch.mod.Rule
import typingsJapgolly.algoliaClientSearch.mod.SearchResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.SearchResponse<@algolia/client-search.@algolia/client-search.Rule>>> */
trait ReadonlyPromiseSearchResp extends StObject {
  
  def `catch`[TResult](): js.Promise[SearchResponse[Rule] | TResult]
  
  def `finally`(): js.Promise[SearchResponse[Rule]]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseSearchResp {
  
  inline def apply(
    `catch`: CallbackTo[js.Promise[SearchResponse[Rule] | Any]],
    `finally`: CallbackTo[js.Promise[SearchResponse[Rule]]],
    `then`: CallbackTo[js.Promise[Any | Any]]
  ): ReadonlyPromiseSearchResp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(`catch`.toJsFn)
    __obj.updateDynamic("finally")(`finally`.toJsFn)
    __obj.updateDynamic("then")(`then`.toJsFn)
    __obj.asInstanceOf[ReadonlyPromiseSearchResp]
  }
  
  extension [Self <: ReadonlyPromiseSearchResp](x: Self) {
    
    inline def setCatch(value: CallbackTo[js.Promise[SearchResponse[Rule] | Any]]): Self = StObject.set(x, "catch", value.toJsFn)
    
    inline def setFinally(value: CallbackTo[js.Promise[SearchResponse[Rule]]]): Self = StObject.set(x, "finally", value.toJsFn)
    
    inline def setThen(value: CallbackTo[js.Promise[Any | Any]]): Self = StObject.set(x, "then", value.toJsFn)
  }
}
