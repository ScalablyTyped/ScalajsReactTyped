package typingsJapgolly.algoliaLoggerCommon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Readonly<std.Promise<void>> */
  trait ReadonlyPromisevoid extends StObject {
    
    def `catch`[TResult](): js.Promise[Unit | TResult]
    
    def `finally`(): js.Promise[Unit]
    
    def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
  }
  object ReadonlyPromisevoid {
    
    inline def apply(
      `catch`: CallbackTo[js.Promise[Unit | Any]],
      `finally`: CallbackTo[js.Promise[Unit]],
      `then`: CallbackTo[js.Promise[Any | Any]]
    ): ReadonlyPromisevoid = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("catch")(`catch`.toJsFn)
      __obj.updateDynamic("finally")(`finally`.toJsFn)
      __obj.updateDynamic("then")(`then`.toJsFn)
      __obj.asInstanceOf[ReadonlyPromisevoid]
    }
    
    extension [Self <: ReadonlyPromisevoid](x: Self) {
      
      inline def setCatch(value: CallbackTo[js.Promise[Unit | Any]]): Self = StObject.set(x, "catch", value.toJsFn)
      
      inline def setFinally(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "finally", value.toJsFn)
      
      inline def setThen(value: CallbackTo[js.Promise[Any | Any]]): Self = StObject.set(x, "then", value.toJsFn)
    }
  }
}
