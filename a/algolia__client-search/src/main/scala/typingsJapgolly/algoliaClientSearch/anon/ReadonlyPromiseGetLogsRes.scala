package typingsJapgolly.algoliaClientSearch.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.algoliaClientSearch.mod.GetLogsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.GetLogsResponse>> */
trait ReadonlyPromiseGetLogsRes extends StObject {
  
  def `catch`[TResult](): js.Promise[GetLogsResponse | TResult]
  
  def `finally`(): js.Promise[GetLogsResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseGetLogsRes {
  
  inline def apply(
    `catch`: CallbackTo[js.Promise[GetLogsResponse | Any]],
    `finally`: CallbackTo[js.Promise[GetLogsResponse]],
    `then`: CallbackTo[js.Promise[Any | Any]]
  ): ReadonlyPromiseGetLogsRes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(`catch`.toJsFn)
    __obj.updateDynamic("finally")(`finally`.toJsFn)
    __obj.updateDynamic("then")(`then`.toJsFn)
    __obj.asInstanceOf[ReadonlyPromiseGetLogsRes]
  }
  
  extension [Self <: ReadonlyPromiseGetLogsRes](x: Self) {
    
    inline def setCatch(value: CallbackTo[js.Promise[GetLogsResponse | Any]]): Self = StObject.set(x, "catch", value.toJsFn)
    
    inline def setFinally(value: CallbackTo[js.Promise[GetLogsResponse]]): Self = StObject.set(x, "finally", value.toJsFn)
    
    inline def setThen(value: CallbackTo[js.Promise[Any | Any]]): Self = StObject.set(x, "then", value.toJsFn)
  }
}
