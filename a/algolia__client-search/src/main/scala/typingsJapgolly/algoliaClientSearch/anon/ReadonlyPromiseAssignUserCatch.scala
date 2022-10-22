package typingsJapgolly.algoliaClientSearch.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.algoliaClientSearch.mod.AssignUserIDsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.AssignUserIDsResponse>> */
trait ReadonlyPromiseAssignUserCatch extends StObject {
  
  def `catch`[TResult](): js.Promise[AssignUserIDsResponse | TResult]
  
  def `finally`(): js.Promise[AssignUserIDsResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseAssignUserCatch {
  
  inline def apply(
    `catch`: CallbackTo[js.Promise[AssignUserIDsResponse | Any]],
    `finally`: CallbackTo[js.Promise[AssignUserIDsResponse]],
    `then`: CallbackTo[js.Promise[Any | Any]]
  ): ReadonlyPromiseAssignUserCatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(`catch`.toJsFn)
    __obj.updateDynamic("finally")(`finally`.toJsFn)
    __obj.updateDynamic("then")(`then`.toJsFn)
    __obj.asInstanceOf[ReadonlyPromiseAssignUserCatch]
  }
  
  extension [Self <: ReadonlyPromiseAssignUserCatch](x: Self) {
    
    inline def setCatch(value: CallbackTo[js.Promise[AssignUserIDsResponse | Any]]): Self = StObject.set(x, "catch", value.toJsFn)
    
    inline def setFinally(value: CallbackTo[js.Promise[AssignUserIDsResponse]]): Self = StObject.set(x, "finally", value.toJsFn)
    
    inline def setThen(value: CallbackTo[js.Promise[Any | Any]]): Self = StObject.set(x, "then", value.toJsFn)
  }
}
