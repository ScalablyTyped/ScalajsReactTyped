package typingsJapgolly.algoliasearch.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.algoliaClientSearch.mod.GetTopUserIDsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.GetTopUserIDsResponse>> */
trait ReadonlyPromiseGetTopUser extends StObject {
  
  def `catch`[TResult](): js.Promise[GetTopUserIDsResponse | TResult]
  
  def `finally`(): js.Promise[GetTopUserIDsResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseGetTopUser {
  
  inline def apply(
    `catch`: CallbackTo[js.Promise[GetTopUserIDsResponse | Any]],
    `finally`: CallbackTo[js.Promise[GetTopUserIDsResponse]],
    `then`: CallbackTo[js.Promise[Any | Any]]
  ): ReadonlyPromiseGetTopUser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(`catch`.toJsFn)
    __obj.updateDynamic("finally")(`finally`.toJsFn)
    __obj.updateDynamic("then")(`then`.toJsFn)
    __obj.asInstanceOf[ReadonlyPromiseGetTopUser]
  }
  
  extension [Self <: ReadonlyPromiseGetTopUser](x: Self) {
    
    inline def setCatch(value: CallbackTo[js.Promise[GetTopUserIDsResponse | Any]]): Self = StObject.set(x, "catch", value.toJsFn)
    
    inline def setFinally(value: CallbackTo[js.Promise[GetTopUserIDsResponse]]): Self = StObject.set(x, "finally", value.toJsFn)
    
    inline def setThen(value: CallbackTo[js.Promise[Any | Any]]): Self = StObject.set(x, "then", value.toJsFn)
  }
}
