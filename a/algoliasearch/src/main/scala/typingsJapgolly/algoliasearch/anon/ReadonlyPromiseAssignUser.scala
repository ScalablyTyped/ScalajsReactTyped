package typingsJapgolly.algoliasearch.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.algoliaClientSearch.mod.AssignUserIDResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.AssignUserIDResponse>> */
trait ReadonlyPromiseAssignUser extends StObject {
  
  def `catch`[TResult](): js.Promise[AssignUserIDResponse | TResult]
  
  def `finally`(): js.Promise[AssignUserIDResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseAssignUser {
  
  inline def apply(
    `catch`: CallbackTo[js.Promise[AssignUserIDResponse | Any]],
    `finally`: CallbackTo[js.Promise[AssignUserIDResponse]],
    `then`: CallbackTo[js.Promise[Any | Any]]
  ): ReadonlyPromiseAssignUser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(`catch`.toJsFn)
    __obj.updateDynamic("finally")(`finally`.toJsFn)
    __obj.updateDynamic("then")(`then`.toJsFn)
    __obj.asInstanceOf[ReadonlyPromiseAssignUser]
  }
  
  extension [Self <: ReadonlyPromiseAssignUser](x: Self) {
    
    inline def setCatch(value: CallbackTo[js.Promise[AssignUserIDResponse | Any]]): Self = StObject.set(x, "catch", value.toJsFn)
    
    inline def setFinally(value: CallbackTo[js.Promise[AssignUserIDResponse]]): Self = StObject.set(x, "finally", value.toJsFn)
    
    inline def setThen(value: CallbackTo[js.Promise[Any | Any]]): Self = StObject.set(x, "then", value.toJsFn)
  }
}
