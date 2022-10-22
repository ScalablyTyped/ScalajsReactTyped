package typingsJapgolly.antd.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.antd.libModalConfirmMod.ConfigUpdate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Destroy extends StObject {
  
  def destroy(): Unit
  
  def update(configUpdate: ConfigUpdate): Unit
}
object Destroy {
  
  inline def apply(destroy: Callback, update: ConfigUpdate => Callback): Destroy = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, update = js.Any.fromFunction1((t0: ConfigUpdate) => update(t0).runNow()))
    __obj.asInstanceOf[Destroy]
  }
  
  extension [Self <: Destroy](x: Self) {
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setUpdate(value: ConfigUpdate => Callback): Self = StObject.set(x, "update", js.Any.fromFunction1((t0: ConfigUpdate) => value(t0).runNow()))
  }
}
