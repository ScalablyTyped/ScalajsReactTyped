package typingsJapgolly.algoliaClientSearch.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.algoliaClientSearch.mod.SearchUserIDsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.SearchUserIDsResponse>> */
trait ReadonlyPromiseSearchUser extends StObject {
  
  def `catch`[TResult](): js.Promise[SearchUserIDsResponse | TResult]
  
  def `finally`(): js.Promise[SearchUserIDsResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseSearchUser {
  
  inline def apply(
    `catch`: CallbackTo[js.Promise[SearchUserIDsResponse | Any]],
    `finally`: CallbackTo[js.Promise[SearchUserIDsResponse]],
    `then`: CallbackTo[js.Promise[Any | Any]]
  ): ReadonlyPromiseSearchUser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(`catch`.toJsFn)
    __obj.updateDynamic("finally")(`finally`.toJsFn)
    __obj.updateDynamic("then")(`then`.toJsFn)
    __obj.asInstanceOf[ReadonlyPromiseSearchUser]
  }
  
  extension [Self <: ReadonlyPromiseSearchUser](x: Self) {
    
    inline def setCatch(value: CallbackTo[js.Promise[SearchUserIDsResponse | Any]]): Self = StObject.set(x, "catch", value.toJsFn)
    
    inline def setFinally(value: CallbackTo[js.Promise[SearchUserIDsResponse]]): Self = StObject.set(x, "finally", value.toJsFn)
    
    inline def setThen(value: CallbackTo[js.Promise[Any | Any]]): Self = StObject.set(x, "then", value.toJsFn)
  }
}
