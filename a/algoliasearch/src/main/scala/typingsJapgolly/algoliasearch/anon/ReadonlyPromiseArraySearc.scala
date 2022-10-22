package typingsJapgolly.algoliasearch.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.algoliaClientSearch.mod.SearchForFacetValuesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<std.Array<@algolia/client-search.@algolia/client-search.SearchForFacetValuesResponse>>> */
trait ReadonlyPromiseArraySearc extends StObject {
  
  def `catch`[TResult](): js.Promise[js.Array[SearchForFacetValuesResponse] | TResult]
  
  def `finally`(): js.Promise[js.Array[SearchForFacetValuesResponse]]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseArraySearc {
  
  inline def apply(
    `catch`: CallbackTo[js.Promise[js.Array[SearchForFacetValuesResponse] | Any]],
    `finally`: CallbackTo[js.Promise[js.Array[SearchForFacetValuesResponse]]],
    `then`: CallbackTo[js.Promise[Any | Any]]
  ): ReadonlyPromiseArraySearc = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(`catch`.toJsFn)
    __obj.updateDynamic("finally")(`finally`.toJsFn)
    __obj.updateDynamic("then")(`then`.toJsFn)
    __obj.asInstanceOf[ReadonlyPromiseArraySearc]
  }
  
  extension [Self <: ReadonlyPromiseArraySearc](x: Self) {
    
    inline def setCatch(value: CallbackTo[js.Promise[js.Array[SearchForFacetValuesResponse] | Any]]): Self = StObject.set(x, "catch", value.toJsFn)
    
    inline def setFinally(value: CallbackTo[js.Promise[js.Array[SearchForFacetValuesResponse]]]): Self = StObject.set(x, "finally", value.toJsFn)
    
    inline def setThen(value: CallbackTo[js.Promise[Any | Any]]): Self = StObject.set(x, "then", value.toJsFn)
  }
}
