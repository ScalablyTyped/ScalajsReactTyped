package typingsJapgolly.algoliaClientSearch.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.algoliaClientSearch.mod.Settings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<@algolia/client-search.@algolia/client-search.Settings>> */
trait ReadonlyPromiseSettings extends StObject {
  
  def `catch`[TResult](): js.Promise[Settings | TResult]
  
  def `finally`(): js.Promise[Settings]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseSettings {
  
  inline def apply(
    `catch`: CallbackTo[js.Promise[Settings | Any]],
    `finally`: CallbackTo[js.Promise[Settings]],
    `then`: CallbackTo[js.Promise[Any | Any]]
  ): ReadonlyPromiseSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(`catch`.toJsFn)
    __obj.updateDynamic("finally")(`finally`.toJsFn)
    __obj.updateDynamic("then")(`then`.toJsFn)
    __obj.asInstanceOf[ReadonlyPromiseSettings]
  }
  
  extension [Self <: ReadonlyPromiseSettings](x: Self) {
    
    inline def setCatch(value: CallbackTo[js.Promise[Settings | Any]]): Self = StObject.set(x, "catch", value.toJsFn)
    
    inline def setFinally(value: CallbackTo[js.Promise[Settings]]): Self = StObject.set(x, "finally", value.toJsFn)
    
    inline def setThen(value: CallbackTo[js.Promise[Any | Any]]): Self = StObject.set(x, "then", value.toJsFn)
  }
}
