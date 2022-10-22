package typingsJapgolly.algoliasearch.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.algoliaClientAnalytics.mod.GetABTestResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-analytics.@algolia/client-analytics.GetABTestResponse>> */
trait ReadonlyPromiseGetABTestR extends StObject {
  
  def `catch`[TResult](): js.Promise[GetABTestResponse | TResult]
  
  def `finally`(): js.Promise[GetABTestResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseGetABTestR {
  
  inline def apply(
    `catch`: CallbackTo[js.Promise[GetABTestResponse | Any]],
    `finally`: CallbackTo[js.Promise[GetABTestResponse]],
    `then`: CallbackTo[js.Promise[Any | Any]]
  ): ReadonlyPromiseGetABTestR = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(`catch`.toJsFn)
    __obj.updateDynamic("finally")(`finally`.toJsFn)
    __obj.updateDynamic("then")(`then`.toJsFn)
    __obj.asInstanceOf[ReadonlyPromiseGetABTestR]
  }
  
  extension [Self <: ReadonlyPromiseGetABTestR](x: Self) {
    
    inline def setCatch(value: CallbackTo[js.Promise[GetABTestResponse | Any]]): Self = StObject.set(x, "catch", value.toJsFn)
    
    inline def setFinally(value: CallbackTo[js.Promise[GetABTestResponse]]): Self = StObject.set(x, "finally", value.toJsFn)
    
    inline def setThen(value: CallbackTo[js.Promise[Any | Any]]): Self = StObject.set(x, "then", value.toJsFn)
  }
}
