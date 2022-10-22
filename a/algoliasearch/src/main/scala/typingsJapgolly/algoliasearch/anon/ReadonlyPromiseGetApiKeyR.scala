package typingsJapgolly.algoliasearch.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.algoliaClientSearch.mod.GetApiKeyResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.GetApiKeyResponse>> */
trait ReadonlyPromiseGetApiKeyR extends StObject {
  
  def `catch`[TResult](): js.Promise[GetApiKeyResponse | TResult]
  
  def `finally`(): js.Promise[GetApiKeyResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseGetApiKeyR {
  
  inline def apply(
    `catch`: CallbackTo[js.Promise[GetApiKeyResponse | Any]],
    `finally`: CallbackTo[js.Promise[GetApiKeyResponse]],
    `then`: CallbackTo[js.Promise[Any | Any]]
  ): ReadonlyPromiseGetApiKeyR = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(`catch`.toJsFn)
    __obj.updateDynamic("finally")(`finally`.toJsFn)
    __obj.updateDynamic("then")(`then`.toJsFn)
    __obj.asInstanceOf[ReadonlyPromiseGetApiKeyR]
  }
  
  extension [Self <: ReadonlyPromiseGetApiKeyR](x: Self) {
    
    inline def setCatch(value: CallbackTo[js.Promise[GetApiKeyResponse | Any]]): Self = StObject.set(x, "catch", value.toJsFn)
    
    inline def setFinally(value: CallbackTo[js.Promise[GetApiKeyResponse]]): Self = StObject.set(x, "finally", value.toJsFn)
    
    inline def setThen(value: CallbackTo[js.Promise[Any | Any]]): Self = StObject.set(x, "then", value.toJsFn)
  }
}
