package typingsJapgolly.algoliasearch.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.algoliaClientSearch.mod.TaskStatusResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.TaskStatusResponse>> */
trait ReadonlyPromiseTaskStatus extends StObject {
  
  def `catch`[TResult](): js.Promise[TaskStatusResponse | TResult]
  
  def `finally`(): js.Promise[TaskStatusResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseTaskStatus {
  
  inline def apply(
    `catch`: CallbackTo[js.Promise[TaskStatusResponse | Any]],
    `finally`: CallbackTo[js.Promise[TaskStatusResponse]],
    `then`: CallbackTo[js.Promise[Any | Any]]
  ): ReadonlyPromiseTaskStatus = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(`catch`.toJsFn)
    __obj.updateDynamic("finally")(`finally`.toJsFn)
    __obj.updateDynamic("then")(`then`.toJsFn)
    __obj.asInstanceOf[ReadonlyPromiseTaskStatus]
  }
  
  extension [Self <: ReadonlyPromiseTaskStatus](x: Self) {
    
    inline def setCatch(value: CallbackTo[js.Promise[TaskStatusResponse | Any]]): Self = StObject.set(x, "catch", value.toJsFn)
    
    inline def setFinally(value: CallbackTo[js.Promise[TaskStatusResponse]]): Self = StObject.set(x, "finally", value.toJsFn)
    
    inline def setThen(value: CallbackTo[js.Promise[Any | Any]]): Self = StObject.set(x, "then", value.toJsFn)
  }
}
