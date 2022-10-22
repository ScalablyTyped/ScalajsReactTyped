package typingsJapgolly.aureliaTemplating.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentUnbind extends StObject {
  
  /**
  	* Implement this hook if you want to perform custom logic after the component is detached and unbound.
  	*/
  def unbind(): Unit
}
object ComponentUnbind {
  
  inline def apply(unbind: Callback): ComponentUnbind = {
    val __obj = js.Dynamic.literal(unbind = unbind.toJsFn)
    __obj.asInstanceOf[ComponentUnbind]
  }
  
  extension [Self <: ComponentUnbind](x: Self) {
    
    inline def setUnbind(value: Callback): Self = StObject.set(x, "unbind", value.toJsFn)
  }
}
