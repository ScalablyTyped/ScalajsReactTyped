package typingsJapgolly.algoliaClientSearch.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Promise<boolean>> */
trait ReadonlyPromiseboolean extends StObject {
  
  def `catch`[TResult](): js.Promise[Boolean | TResult]
  
  def `finally`(): js.Promise[Boolean]
  
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}
object ReadonlyPromiseboolean {
  
  inline def apply(
    `catch`: CallbackTo[js.Promise[Boolean | Any]],
    `finally`: CallbackTo[js.Promise[Boolean]],
    `then`: CallbackTo[js.Promise[Any | Any]]
  ): ReadonlyPromiseboolean = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(`catch`.toJsFn)
    __obj.updateDynamic("finally")(`finally`.toJsFn)
    __obj.updateDynamic("then")(`then`.toJsFn)
    __obj.asInstanceOf[ReadonlyPromiseboolean]
  }
  
  extension [Self <: ReadonlyPromiseboolean](x: Self) {
    
    inline def setCatch(value: CallbackTo[js.Promise[Boolean | Any]]): Self = StObject.set(x, "catch", value.toJsFn)
    
    inline def setFinally(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "finally", value.toJsFn)
    
    inline def setThen(value: CallbackTo[js.Promise[Any | Any]]): Self = StObject.set(x, "then", value.toJsFn)
  }
}
