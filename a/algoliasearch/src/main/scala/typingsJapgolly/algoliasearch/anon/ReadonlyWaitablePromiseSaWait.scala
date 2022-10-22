package typingsJapgolly.algoliasearch.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.algoliaClientSearch.mod.SaveRulesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@algolia/client-common.@algolia/client-common.WaitablePromise<@algolia/client-search.@algolia/client-search.SaveRulesResponse>> */
trait ReadonlyWaitablePromiseSaWait extends StObject {
  
  def `catch`[TResult](): js.Promise[SaveRulesResponse | TResult]
  
  def `finally`(): js.Promise[SaveRulesResponse]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyWaitablePromiseSaWait {
  
  inline def apply(
    `catch`: CallbackTo[js.Promise[SaveRulesResponse | Any]],
    `finally`: CallbackTo[js.Promise[SaveRulesResponse]],
    `then`: CallbackTo[js.Promise[Any | Any]]
  ): ReadonlyWaitablePromiseSaWait = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(`catch`.toJsFn)
    __obj.updateDynamic("finally")(`finally`.toJsFn)
    __obj.updateDynamic("then")(`then`.toJsFn)
    __obj.asInstanceOf[ReadonlyWaitablePromiseSaWait]
  }
  
  extension [Self <: ReadonlyWaitablePromiseSaWait](x: Self) {
    
    inline def setCatch(value: CallbackTo[js.Promise[SaveRulesResponse | Any]]): Self = StObject.set(x, "catch", value.toJsFn)
    
    inline def setFinally(value: CallbackTo[js.Promise[SaveRulesResponse]]): Self = StObject.set(x, "finally", value.toJsFn)
    
    inline def setThen(value: CallbackTo[js.Promise[Any | Any]]): Self = StObject.set(x, "then", value.toJsFn)
  }
}
