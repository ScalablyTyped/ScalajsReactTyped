package typingsJapgolly.algoliaClientSearch.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.algoliaClientSearch.mod.GetDictionarySettingsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.GetDictionarySettingsResponse>> */
trait ReadonlyPromiseGetDiction extends StObject {
  
  def `catch`[TResult](): js.Promise[GetDictionarySettingsResponse | TResult]
  
  def `finally`(): js.Promise[GetDictionarySettingsResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseGetDiction {
  
  inline def apply(
    `catch`: CallbackTo[js.Promise[GetDictionarySettingsResponse | Any]],
    `finally`: CallbackTo[js.Promise[GetDictionarySettingsResponse]],
    `then`: CallbackTo[js.Promise[Any | Any]]
  ): ReadonlyPromiseGetDiction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(`catch`.toJsFn)
    __obj.updateDynamic("finally")(`finally`.toJsFn)
    __obj.updateDynamic("then")(`then`.toJsFn)
    __obj.asInstanceOf[ReadonlyPromiseGetDiction]
  }
  
  extension [Self <: ReadonlyPromiseGetDiction](x: Self) {
    
    inline def setCatch(value: CallbackTo[js.Promise[GetDictionarySettingsResponse | Any]]): Self = StObject.set(x, "catch", value.toJsFn)
    
    inline def setFinally(value: CallbackTo[js.Promise[GetDictionarySettingsResponse]]): Self = StObject.set(x, "finally", value.toJsFn)
    
    inline def setThen(value: CallbackTo[js.Promise[Any | Any]]): Self = StObject.set(x, "then", value.toJsFn)
  }
}
