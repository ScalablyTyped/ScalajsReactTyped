package typingsJapgolly.algoliasearch.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.algoliaClientSearch.mod.SearchDictionaryEntriesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.SearchDictionaryEntriesResponse>> */
trait ReadonlyPromiseSearchDict extends StObject {
  
  def `catch`[TResult](): js.Promise[SearchDictionaryEntriesResponse | TResult]
  
  def `finally`(): js.Promise[SearchDictionaryEntriesResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseSearchDict {
  
  inline def apply(
    `catch`: CallbackTo[js.Promise[SearchDictionaryEntriesResponse | Any]],
    `finally`: CallbackTo[js.Promise[SearchDictionaryEntriesResponse]],
    `then`: CallbackTo[js.Promise[Any | Any]]
  ): ReadonlyPromiseSearchDict = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(`catch`.toJsFn)
    __obj.updateDynamic("finally")(`finally`.toJsFn)
    __obj.updateDynamic("then")(`then`.toJsFn)
    __obj.asInstanceOf[ReadonlyPromiseSearchDict]
  }
  
  extension [Self <: ReadonlyPromiseSearchDict](x: Self) {
    
    inline def setCatch(value: CallbackTo[js.Promise[SearchDictionaryEntriesResponse | Any]]): Self = StObject.set(x, "catch", value.toJsFn)
    
    inline def setFinally(value: CallbackTo[js.Promise[SearchDictionaryEntriesResponse]]): Self = StObject.set(x, "finally", value.toJsFn)
    
    inline def setThen(value: CallbackTo[js.Promise[Any | Any]]): Self = StObject.set(x, "then", value.toJsFn)
  }
}
