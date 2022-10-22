package typingsJapgolly.algoliaClientSearch.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.algoliaClientSearch.mod.UserIDResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.UserIDResponse>> */
trait ReadonlyPromiseUserIDResp extends StObject {
  
  def `catch`[TResult](): js.Promise[UserIDResponse | TResult]
  
  def `finally`(): js.Promise[UserIDResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseUserIDResp {
  
  inline def apply(
    `catch`: CallbackTo[js.Promise[UserIDResponse | Any]],
    `finally`: CallbackTo[js.Promise[UserIDResponse]],
    `then`: CallbackTo[js.Promise[Any | Any]]
  ): ReadonlyPromiseUserIDResp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(`catch`.toJsFn)
    __obj.updateDynamic("finally")(`finally`.toJsFn)
    __obj.updateDynamic("then")(`then`.toJsFn)
    __obj.asInstanceOf[ReadonlyPromiseUserIDResp]
  }
  
  extension [Self <: ReadonlyPromiseUserIDResp](x: Self) {
    
    inline def setCatch(value: CallbackTo[js.Promise[UserIDResponse | Any]]): Self = StObject.set(x, "catch", value.toJsFn)
    
    inline def setFinally(value: CallbackTo[js.Promise[UserIDResponse]]): Self = StObject.set(x, "finally", value.toJsFn)
    
    inline def setThen(value: CallbackTo[js.Promise[Any | Any]]): Self = StObject.set(x, "then", value.toJsFn)
  }
}
