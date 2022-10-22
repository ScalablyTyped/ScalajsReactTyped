package typingsJapgolly.algoliasearch.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.algoliaClientSearch.mod.ListUserIDsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.ListUserIDsResponse>> */
trait ReadonlyPromiseListUserID extends StObject {
  
  def `catch`[TResult](): js.Promise[ListUserIDsResponse | TResult]
  
  def `finally`(): js.Promise[ListUserIDsResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseListUserID {
  
  inline def apply(
    `catch`: CallbackTo[js.Promise[ListUserIDsResponse | Any]],
    `finally`: CallbackTo[js.Promise[ListUserIDsResponse]],
    `then`: CallbackTo[js.Promise[Any | Any]]
  ): ReadonlyPromiseListUserID = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(`catch`.toJsFn)
    __obj.updateDynamic("finally")(`finally`.toJsFn)
    __obj.updateDynamic("then")(`then`.toJsFn)
    __obj.asInstanceOf[ReadonlyPromiseListUserID]
  }
  
  extension [Self <: ReadonlyPromiseListUserID](x: Self) {
    
    inline def setCatch(value: CallbackTo[js.Promise[ListUserIDsResponse | Any]]): Self = StObject.set(x, "catch", value.toJsFn)
    
    inline def setFinally(value: CallbackTo[js.Promise[ListUserIDsResponse]]): Self = StObject.set(x, "finally", value.toJsFn)
    
    inline def setThen(value: CallbackTo[js.Promise[Any | Any]]): Self = StObject.set(x, "then", value.toJsFn)
  }
}
