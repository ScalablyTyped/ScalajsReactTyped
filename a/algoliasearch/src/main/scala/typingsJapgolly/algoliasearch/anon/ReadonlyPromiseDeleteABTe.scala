package typingsJapgolly.algoliasearch.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.algoliaClientAnalytics.mod.DeleteABTestResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-analytics.@algolia/client-analytics.DeleteABTestResponse>> */
trait ReadonlyPromiseDeleteABTe extends StObject {
  
  def `catch`[TResult](): js.Promise[DeleteABTestResponse | TResult]
  
  def `finally`(): js.Promise[DeleteABTestResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseDeleteABTe {
  
  inline def apply(
    `catch`: CallbackTo[js.Promise[DeleteABTestResponse | Any]],
    `finally`: CallbackTo[js.Promise[DeleteABTestResponse]],
    `then`: CallbackTo[js.Promise[Any | Any]]
  ): ReadonlyPromiseDeleteABTe = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(`catch`.toJsFn)
    __obj.updateDynamic("finally")(`finally`.toJsFn)
    __obj.updateDynamic("then")(`then`.toJsFn)
    __obj.asInstanceOf[ReadonlyPromiseDeleteABTe]
  }
  
  extension [Self <: ReadonlyPromiseDeleteABTe](x: Self) {
    
    inline def setCatch(value: CallbackTo[js.Promise[DeleteABTestResponse | Any]]): Self = StObject.set(x, "catch", value.toJsFn)
    
    inline def setFinally(value: CallbackTo[js.Promise[DeleteABTestResponse]]): Self = StObject.set(x, "finally", value.toJsFn)
    
    inline def setThen(value: CallbackTo[js.Promise[Any | Any]]): Self = StObject.set(x, "then", value.toJsFn)
  }
}
