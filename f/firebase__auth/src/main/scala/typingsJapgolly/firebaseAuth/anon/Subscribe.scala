package typingsJapgolly.firebaseAuth.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subscribe extends StObject {
  
  def subscribe(n: Null, cb: js.Function1[/* event */ (Record[String, String]) | Null, Unit]): Unit
}
object Subscribe {
  
  inline def apply(subscribe: (Null, js.Function1[/* event */ (Record[String, String]) | Null, Unit]) => Callback): Subscribe = {
    val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction2((t0: Null, t1: js.Function1[/* event */ (Record[String, String]) | Null, Unit]) => (subscribe(t0, t1)).runNow()))
    __obj.asInstanceOf[Subscribe]
  }
  
  extension [Self <: Subscribe](x: Self) {
    
    inline def setSubscribe(value: (Null, js.Function1[/* event */ (Record[String, String]) | Null, Unit]) => Callback): Self = StObject.set(x, "subscribe", js.Any.fromFunction2((t0: Null, t1: js.Function1[/* event */ (Record[String, String]) | Null, Unit]) => (value(t0, t1)).runNow()))
  }
}
