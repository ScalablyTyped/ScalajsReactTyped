package typingsJapgolly.algoliasearch.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.algoliaClientSearch.mod.ListApiKeysResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.ListApiKeysResponse>> */
trait ReadonlyPromiseListApiKey extends StObject {
  
  def `catch`[TResult](): js.Promise[ListApiKeysResponse | TResult]
  
  def `finally`(): js.Promise[ListApiKeysResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseListApiKey {
  
  inline def apply(
    `catch`: CallbackTo[js.Promise[ListApiKeysResponse | Any]],
    `finally`: CallbackTo[js.Promise[ListApiKeysResponse]],
    `then`: CallbackTo[js.Promise[Any | Any]]
  ): ReadonlyPromiseListApiKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(`catch`.toJsFn)
    __obj.updateDynamic("finally")(`finally`.toJsFn)
    __obj.updateDynamic("then")(`then`.toJsFn)
    __obj.asInstanceOf[ReadonlyPromiseListApiKey]
  }
  
  extension [Self <: ReadonlyPromiseListApiKey](x: Self) {
    
    inline def setCatch(value: CallbackTo[js.Promise[ListApiKeysResponse | Any]]): Self = StObject.set(x, "catch", value.toJsFn)
    
    inline def setFinally(value: CallbackTo[js.Promise[ListApiKeysResponse]]): Self = StObject.set(x, "finally", value.toJsFn)
    
    inline def setThen(value: CallbackTo[js.Promise[Any | Any]]): Self = StObject.set(x, "then", value.toJsFn)
  }
}
