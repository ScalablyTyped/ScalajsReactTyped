package typingsJapgolly.scrivito.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Menu extends StObject {
  
  def insert(params: MenuInsertParameters): Unit
  
  def modify(params: MenuModifyParameters): Unit
  
  def remove(id: String): Unit
}
object Menu {
  
  inline def apply(
    insert: MenuInsertParameters => Callback,
    modify: MenuModifyParameters => Callback,
    remove: String => Callback
  ): Menu = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1((t0: MenuInsertParameters) => insert(t0).runNow()), modify = js.Any.fromFunction1((t0: MenuModifyParameters) => modify(t0).runNow()), remove = js.Any.fromFunction1((t0: String) => remove(t0).runNow()))
    __obj.asInstanceOf[Menu]
  }
  
  extension [Self <: Menu](x: Self) {
    
    inline def setInsert(value: MenuInsertParameters => Callback): Self = StObject.set(x, "insert", js.Any.fromFunction1((t0: MenuInsertParameters) => value(t0).runNow()))
    
    inline def setModify(value: MenuModifyParameters => Callback): Self = StObject.set(x, "modify", js.Any.fromFunction1((t0: MenuModifyParameters) => value(t0).runNow()))
    
    inline def setRemove(value: String => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
