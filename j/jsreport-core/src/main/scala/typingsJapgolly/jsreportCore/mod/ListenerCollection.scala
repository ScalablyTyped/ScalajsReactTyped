package typingsJapgolly.jsreportCore.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenerCollection extends StObject {
  
  def add(
    `type`: String,
    callback: js.Function3[
      /* req */ Request, 
      /* res */ Response, 
      /* err */ js.UndefOr[Any], 
      js.Promise[Any] | Unit
    ]
  ): Unit
}
object ListenerCollection {
  
  inline def apply(
    add: (String, js.Function3[
      /* req */ Request, 
      /* res */ Response, 
      /* err */ js.UndefOr[Any], 
      js.Promise[Any] | Unit
    ]) => Callback
  ): ListenerCollection = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2((t0: String, t1: js.Function3[
      /* req */ Request, 
      /* res */ Response, 
      /* err */ js.UndefOr[Any], 
      js.Promise[Any] | Unit
    ]) => (add(t0, t1)).runNow()))
    __obj.asInstanceOf[ListenerCollection]
  }
  
  extension [Self <: ListenerCollection](x: Self) {
    
    inline def setAdd(
      value: (String, js.Function3[
          /* req */ Request, 
          /* res */ Response, 
          /* err */ js.UndefOr[Any], 
          js.Promise[Any] | Unit
        ]) => Callback
    ): Self = StObject.set(x, "add", js.Any.fromFunction2((t0: String, t1: js.Function3[
          /* req */ Request, 
          /* res */ Response, 
          /* err */ js.UndefOr[Any], 
          js.Promise[Any] | Unit
        ]) => (value(t0, t1)).runNow()))
  }
}
