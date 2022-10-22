package typingsJapgolly.algoliasearch.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.algoliaClientAnalytics.mod.AddABTestResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-analytics.@algolia/client-analytics.AddABTestResponse>> */
trait ReadonlyPromiseAddABTestR extends StObject {
  
  def `catch`[TResult](): js.Promise[AddABTestResponse | TResult]
  
  def `finally`(): js.Promise[AddABTestResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseAddABTestR {
  
  inline def apply(
    `catch`: CallbackTo[js.Promise[AddABTestResponse | Any]],
    `finally`: CallbackTo[js.Promise[AddABTestResponse]],
    `then`: CallbackTo[js.Promise[Any | Any]]
  ): ReadonlyPromiseAddABTestR = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(`catch`.toJsFn)
    __obj.updateDynamic("finally")(`finally`.toJsFn)
    __obj.updateDynamic("then")(`then`.toJsFn)
    __obj.asInstanceOf[ReadonlyPromiseAddABTestR]
  }
  
  extension [Self <: ReadonlyPromiseAddABTestR](x: Self) {
    
    inline def setCatch(value: CallbackTo[js.Promise[AddABTestResponse | Any]]): Self = StObject.set(x, "catch", value.toJsFn)
    
    inline def setFinally(value: CallbackTo[js.Promise[AddABTestResponse]]): Self = StObject.set(x, "finally", value.toJsFn)
    
    inline def setThen(value: CallbackTo[js.Promise[Any | Any]]): Self = StObject.set(x, "then", value.toJsFn)
  }
}
