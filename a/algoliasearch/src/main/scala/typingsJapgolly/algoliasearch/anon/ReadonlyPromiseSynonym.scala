package typingsJapgolly.algoliasearch.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.algoliaClientSearch.mod.Synonym
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.Synonym>> */
trait ReadonlyPromiseSynonym extends StObject {
  
  def `catch`[TResult](): js.Promise[Synonym | TResult]
  
  def `finally`(): js.Promise[Synonym]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseSynonym {
  
  inline def apply(
    `catch`: CallbackTo[js.Promise[Synonym | Any]],
    `finally`: CallbackTo[js.Promise[Synonym]],
    `then`: CallbackTo[js.Promise[Any | Any]]
  ): ReadonlyPromiseSynonym = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(`catch`.toJsFn)
    __obj.updateDynamic("finally")(`finally`.toJsFn)
    __obj.updateDynamic("then")(`then`.toJsFn)
    __obj.asInstanceOf[ReadonlyPromiseSynonym]
  }
  
  extension [Self <: ReadonlyPromiseSynonym](x: Self) {
    
    inline def setCatch(value: CallbackTo[js.Promise[Synonym | Any]]): Self = StObject.set(x, "catch", value.toJsFn)
    
    inline def setFinally(value: CallbackTo[js.Promise[Synonym]]): Self = StObject.set(x, "finally", value.toJsFn)
    
    inline def setThen(value: CallbackTo[js.Promise[Any | Any]]): Self = StObject.set(x, "then", value.toJsFn)
  }
}
