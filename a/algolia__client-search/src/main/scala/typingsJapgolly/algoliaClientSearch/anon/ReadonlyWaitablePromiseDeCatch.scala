package typingsJapgolly.algoliaClientSearch.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.algoliaClientSearch.mod.DeleteApiKeyResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.DeleteApiKeyResponse>> */
trait ReadonlyWaitablePromiseDeCatch extends StObject {
  
  def `catch`[TResult](): js.Promise[DeleteApiKeyResponse | TResult]
  
  def `finally`(): js.Promise[DeleteApiKeyResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyWaitablePromiseDeCatch {
  
  inline def apply(
    `catch`: CallbackTo[js.Promise[DeleteApiKeyResponse | Any]],
    `finally`: CallbackTo[js.Promise[DeleteApiKeyResponse]],
    `then`: CallbackTo[js.Promise[Any | Any]]
  ): ReadonlyWaitablePromiseDeCatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(`catch`.toJsFn)
    __obj.updateDynamic("finally")(`finally`.toJsFn)
    __obj.updateDynamic("then")(`then`.toJsFn)
    __obj.asInstanceOf[ReadonlyWaitablePromiseDeCatch]
  }
  
  extension [Self <: ReadonlyWaitablePromiseDeCatch](x: Self) {
    
    inline def setCatch(value: CallbackTo[js.Promise[DeleteApiKeyResponse | Any]]): Self = StObject.set(x, "catch", value.toJsFn)
    
    inline def setFinally(value: CallbackTo[js.Promise[DeleteApiKeyResponse]]): Self = StObject.set(x, "finally", value.toJsFn)
    
    inline def setThen(value: CallbackTo[js.Promise[Any | Any]]): Self = StObject.set(x, "then", value.toJsFn)
  }
}
