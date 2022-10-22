package typingsJapgolly.aureliaTemplating.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentDetached extends StObject {
  
  /**
  	* Implement this hook if you want to perform custom logic if/when the component is removed from the the DOM.
  	*/
  def detached(): Unit
}
object ComponentDetached {
  
  inline def apply(detached: Callback): ComponentDetached = {
    val __obj = js.Dynamic.literal(detached = detached.toJsFn)
    __obj.asInstanceOf[ComponentDetached]
  }
  
  extension [Self <: ComponentDetached](x: Self) {
    
    inline def setDetached(value: Callback): Self = StObject.set(x, "detached", value.toJsFn)
  }
}
