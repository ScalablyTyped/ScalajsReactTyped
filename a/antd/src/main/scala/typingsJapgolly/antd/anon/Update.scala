package typingsJapgolly.antd.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.antd.libModalConfirmMod.ConfigUpdate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Update extends StObject {
  
  def destroy(args: Any*): Unit
  
  def update(configUpdate: ConfigUpdate): Unit
}
object Update {
  
  inline def apply(destroy: /* repeated */ Any => Callback, update: ConfigUpdate => Callback): Update = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction1((t0: /* repeated */ Any) => destroy(t0).runNow()), update = js.Any.fromFunction1((t0: ConfigUpdate) => update(t0).runNow()))
    __obj.asInstanceOf[Update]
  }
  
  extension [Self <: Update](x: Self) {
    
    inline def setDestroy(value: /* repeated */ Any => Callback): Self = StObject.set(x, "destroy", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    
    inline def setUpdate(value: ConfigUpdate => Callback): Self = StObject.set(x, "update", js.Any.fromFunction1((t0: ConfigUpdate) => value(t0).runNow()))
  }
}
