package typingsJapgolly.antd.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddSider extends StObject {
  
  def addSider(id: String): Unit
  
  def removeSider(id: String): Unit
}
object AddSider {
  
  inline def apply(addSider: String => Callback, removeSider: String => Callback): AddSider = {
    val __obj = js.Dynamic.literal(addSider = js.Any.fromFunction1((t0: String) => addSider(t0).runNow()), removeSider = js.Any.fromFunction1((t0: String) => removeSider(t0).runNow()))
    __obj.asInstanceOf[AddSider]
  }
  
  extension [Self <: AddSider](x: Self) {
    
    inline def setAddSider(value: String => Callback): Self = StObject.set(x, "addSider", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setRemoveSider(value: String => Callback): Self = StObject.set(x, "removeSider", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
