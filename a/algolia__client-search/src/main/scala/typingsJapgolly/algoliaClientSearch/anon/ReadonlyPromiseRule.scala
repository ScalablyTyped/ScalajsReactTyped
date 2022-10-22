package typingsJapgolly.algoliaClientSearch.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.algoliaClientSearch.mod.Rule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.Rule>> */
trait ReadonlyPromiseRule extends StObject {
  
  def `catch`[TResult](): js.Promise[Rule | TResult]
  
  def `finally`(): js.Promise[Rule]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseRule {
  
  inline def apply(
    `catch`: CallbackTo[js.Promise[Rule | Any]],
    `finally`: CallbackTo[js.Promise[Rule]],
    `then`: CallbackTo[js.Promise[Any | Any]]
  ): ReadonlyPromiseRule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(`catch`.toJsFn)
    __obj.updateDynamic("finally")(`finally`.toJsFn)
    __obj.updateDynamic("then")(`then`.toJsFn)
    __obj.asInstanceOf[ReadonlyPromiseRule]
  }
  
  extension [Self <: ReadonlyPromiseRule](x: Self) {
    
    inline def setCatch(value: CallbackTo[js.Promise[Rule | Any]]): Self = StObject.set(x, "catch", value.toJsFn)
    
    inline def setFinally(value: CallbackTo[js.Promise[Rule]]): Self = StObject.set(x, "finally", value.toJsFn)
    
    inline def setThen(value: CallbackTo[js.Promise[Any | Any]]): Self = StObject.set(x, "then", value.toJsFn)
  }
}
