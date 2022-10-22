package typingsJapgolly.algoliasearch.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.algoliaClientSearch.mod.RemoveUserIDResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.RemoveUserIDResponse>> */
trait ReadonlyPromiseRemoveUser extends StObject {
  
  def `catch`[TResult](): js.Promise[RemoveUserIDResponse | TResult]
  
  def `finally`(): js.Promise[RemoveUserIDResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseRemoveUser {
  
  inline def apply(
    `catch`: CallbackTo[js.Promise[RemoveUserIDResponse | Any]],
    `finally`: CallbackTo[js.Promise[RemoveUserIDResponse]],
    `then`: CallbackTo[js.Promise[Any | Any]]
  ): ReadonlyPromiseRemoveUser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(`catch`.toJsFn)
    __obj.updateDynamic("finally")(`finally`.toJsFn)
    __obj.updateDynamic("then")(`then`.toJsFn)
    __obj.asInstanceOf[ReadonlyPromiseRemoveUser]
  }
  
  extension [Self <: ReadonlyPromiseRemoveUser](x: Self) {
    
    inline def setCatch(value: CallbackTo[js.Promise[RemoveUserIDResponse | Any]]): Self = StObject.set(x, "catch", value.toJsFn)
    
    inline def setFinally(value: CallbackTo[js.Promise[RemoveUserIDResponse]]): Self = StObject.set(x, "finally", value.toJsFn)
    
    inline def setThen(value: CallbackTo[js.Promise[Any | Any]]): Self = StObject.set(x, "then", value.toJsFn)
  }
}
