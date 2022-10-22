package typingsJapgolly.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Callback extends StObject {
  
  var callback: js.UndefOr[js.Function1[/* params */ js.UndefOr[Any], Unit]] = js.undefined
}
object Callback {
  
  inline def apply(): Callback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Callback]
  }
  
  extension [Self <: Callback](x: Self) {
    
    inline def setCallback(value: /* params */ js.UndefOr[Any] => japgolly.scalajs.react.Callback): Self = StObject.set(x, "callback", js.Any.fromFunction1((t0: /* params */ js.UndefOr[Any]) => value(t0).runNow()))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
  }
}
