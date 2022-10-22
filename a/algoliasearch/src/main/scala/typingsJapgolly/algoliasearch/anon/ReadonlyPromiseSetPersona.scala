package typingsJapgolly.algoliasearch.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.algoliaClientPersonalization.mod.SetPersonalizationStrategyResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-personalization.@algolia/client-personalization.SetPersonalizationStrategyResponse>> */
trait ReadonlyPromiseSetPersona extends StObject {
  
  def `catch`[TResult](): js.Promise[SetPersonalizationStrategyResponse | TResult]
  
  def `finally`(): js.Promise[SetPersonalizationStrategyResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseSetPersona {
  
  inline def apply(
    `catch`: CallbackTo[js.Promise[SetPersonalizationStrategyResponse | Any]],
    `finally`: CallbackTo[js.Promise[SetPersonalizationStrategyResponse]],
    `then`: CallbackTo[js.Promise[Any | Any]]
  ): ReadonlyPromiseSetPersona = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(`catch`.toJsFn)
    __obj.updateDynamic("finally")(`finally`.toJsFn)
    __obj.updateDynamic("then")(`then`.toJsFn)
    __obj.asInstanceOf[ReadonlyPromiseSetPersona]
  }
  
  extension [Self <: ReadonlyPromiseSetPersona](x: Self) {
    
    inline def setCatch(value: CallbackTo[js.Promise[SetPersonalizationStrategyResponse | Any]]): Self = StObject.set(x, "catch", value.toJsFn)
    
    inline def setFinally(value: CallbackTo[js.Promise[SetPersonalizationStrategyResponse]]): Self = StObject.set(x, "finally", value.toJsFn)
    
    inline def setThen(value: CallbackTo[js.Promise[Any | Any]]): Self = StObject.set(x, "then", value.toJsFn)
  }
}
