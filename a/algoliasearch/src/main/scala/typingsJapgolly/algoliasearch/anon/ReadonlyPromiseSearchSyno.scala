package typingsJapgolly.algoliasearch.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.algoliaClientSearch.mod.SearchSynonymsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.SearchSynonymsResponse>> */
trait ReadonlyPromiseSearchSyno extends StObject {
  
  def `catch`[TResult](): js.Promise[SearchSynonymsResponse | TResult]
  
  def `finally`(): js.Promise[SearchSynonymsResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseSearchSyno {
  
  inline def apply(
    `catch`: CallbackTo[js.Promise[SearchSynonymsResponse | Any]],
    `finally`: CallbackTo[js.Promise[SearchSynonymsResponse]],
    `then`: CallbackTo[js.Promise[Any | Any]]
  ): ReadonlyPromiseSearchSyno = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(`catch`.toJsFn)
    __obj.updateDynamic("finally")(`finally`.toJsFn)
    __obj.updateDynamic("then")(`then`.toJsFn)
    __obj.asInstanceOf[ReadonlyPromiseSearchSyno]
  }
  
  extension [Self <: ReadonlyPromiseSearchSyno](x: Self) {
    
    inline def setCatch(value: CallbackTo[js.Promise[SearchSynonymsResponse | Any]]): Self = StObject.set(x, "catch", value.toJsFn)
    
    inline def setFinally(value: CallbackTo[js.Promise[SearchSynonymsResponse]]): Self = StObject.set(x, "finally", value.toJsFn)
    
    inline def setThen(value: CallbackTo[js.Promise[Any | Any]]): Self = StObject.set(x, "then", value.toJsFn)
  }
}
