package typingsJapgolly.algoliaClientSearch.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.algoliaClientSearch.mod.SearchForFacetValuesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.SearchForFacetValuesResponse>> */
trait ReadonlyPromiseSearchForF extends StObject {
  
  def `catch`[TResult](): js.Promise[SearchForFacetValuesResponse | TResult]
  
  def `finally`(): js.Promise[SearchForFacetValuesResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseSearchForF {
  
  inline def apply(
    `catch`: CallbackTo[js.Promise[SearchForFacetValuesResponse | Any]],
    `finally`: CallbackTo[js.Promise[SearchForFacetValuesResponse]],
    `then`: CallbackTo[js.Promise[Any | Any]]
  ): ReadonlyPromiseSearchForF = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(`catch`.toJsFn)
    __obj.updateDynamic("finally")(`finally`.toJsFn)
    __obj.updateDynamic("then")(`then`.toJsFn)
    __obj.asInstanceOf[ReadonlyPromiseSearchForF]
  }
  
  extension [Self <: ReadonlyPromiseSearchForF](x: Self) {
    
    inline def setCatch(value: CallbackTo[js.Promise[SearchForFacetValuesResponse | Any]]): Self = StObject.set(x, "catch", value.toJsFn)
    
    inline def setFinally(value: CallbackTo[js.Promise[SearchForFacetValuesResponse]]): Self = StObject.set(x, "finally", value.toJsFn)
    
    inline def setThen(value: CallbackTo[js.Promise[Any | Any]]): Self = StObject.set(x, "then", value.toJsFn)
  }
}
