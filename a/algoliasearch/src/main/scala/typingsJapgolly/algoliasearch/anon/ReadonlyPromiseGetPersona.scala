package typingsJapgolly.algoliasearch.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.algoliaClientPersonalization.mod.GetPersonalizationStrategyResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-personalization.@algolia/client-personalization.GetPersonalizationStrategyResponse>> */
trait ReadonlyPromiseGetPersona extends StObject {
  
  def `catch`[TResult](): js.Promise[GetPersonalizationStrategyResponse | TResult]
  
  def `finally`(): js.Promise[GetPersonalizationStrategyResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseGetPersona {
  
  inline def apply(
    `catch`: CallbackTo[js.Promise[GetPersonalizationStrategyResponse | Any]],
    `finally`: CallbackTo[js.Promise[GetPersonalizationStrategyResponse]],
    `then`: CallbackTo[js.Promise[Any | Any]]
  ): ReadonlyPromiseGetPersona = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(`catch`.toJsFn)
    __obj.updateDynamic("finally")(`finally`.toJsFn)
    __obj.updateDynamic("then")(`then`.toJsFn)
    __obj.asInstanceOf[ReadonlyPromiseGetPersona]
  }
  
  extension [Self <: ReadonlyPromiseGetPersona](x: Self) {
    
    inline def setCatch(value: CallbackTo[js.Promise[GetPersonalizationStrategyResponse | Any]]): Self = StObject.set(x, "catch", value.toJsFn)
    
    inline def setFinally(value: CallbackTo[js.Promise[GetPersonalizationStrategyResponse]]): Self = StObject.set(x, "finally", value.toJsFn)
    
    inline def setThen(value: CallbackTo[js.Promise[Any | Any]]): Self = StObject.set(x, "then", value.toJsFn)
  }
}
