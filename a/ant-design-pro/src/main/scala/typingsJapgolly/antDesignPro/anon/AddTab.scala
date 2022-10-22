package typingsJapgolly.antDesignPro.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddTab extends StObject {
  
  def addTab(id: Any): Unit
  
  def removeTab(id: Any): Unit
}
object AddTab {
  
  inline def apply(addTab: Any => Callback, removeTab: Any => Callback): AddTab = {
    val __obj = js.Dynamic.literal(addTab = js.Any.fromFunction1((t0: Any) => addTab(t0).runNow()), removeTab = js.Any.fromFunction1((t0: Any) => removeTab(t0).runNow()))
    __obj.asInstanceOf[AddTab]
  }
  
  extension [Self <: AddTab](x: Self) {
    
    inline def setAddTab(value: Any => Callback): Self = StObject.set(x, "addTab", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setRemoveTab(value: Any => Callback): Self = StObject.set(x, "removeTab", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
