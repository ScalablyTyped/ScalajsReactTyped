package typingsJapgolly.algoliasearch.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.algoliaClientSearch.mod.ListClustersResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.ListClustersResponse>> */
trait ReadonlyPromiseListCluste extends StObject {
  
  def `catch`[TResult](): js.Promise[ListClustersResponse | TResult]
  
  def `finally`(): js.Promise[ListClustersResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseListCluste {
  
  inline def apply(
    `catch`: CallbackTo[js.Promise[ListClustersResponse | Any]],
    `finally`: CallbackTo[js.Promise[ListClustersResponse]],
    `then`: CallbackTo[js.Promise[Any | Any]]
  ): ReadonlyPromiseListCluste = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(`catch`.toJsFn)
    __obj.updateDynamic("finally")(`finally`.toJsFn)
    __obj.updateDynamic("then")(`then`.toJsFn)
    __obj.asInstanceOf[ReadonlyPromiseListCluste]
  }
  
  extension [Self <: ReadonlyPromiseListCluste](x: Self) {
    
    inline def setCatch(value: CallbackTo[js.Promise[ListClustersResponse | Any]]): Self = StObject.set(x, "catch", value.toJsFn)
    
    inline def setFinally(value: CallbackTo[js.Promise[ListClustersResponse]]): Self = StObject.set(x, "finally", value.toJsFn)
    
    inline def setThen(value: CallbackTo[js.Promise[Any | Any]]): Self = StObject.set(x, "then", value.toJsFn)
  }
}
