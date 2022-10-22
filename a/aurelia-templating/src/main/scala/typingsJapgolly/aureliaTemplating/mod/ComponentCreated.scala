package typingsJapgolly.aureliaTemplating.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentCreated extends StObject {
  
  /**
  	* Implement this hook if you want to perform custom logic after the constructor has been called.
  	* At this point in time, the view has also been created and both the view-model and the view
  	* are connected to their controller. The hook will recieve the instance of the "owningView".
  	* This is the view that the component is declared inside of. If the component itself has a view,
  	* this will be passed second.
  	*/
  def created(owningView: View_, myView: View_): Unit
}
object ComponentCreated {
  
  inline def apply(created: (View_, View_) => Callback): ComponentCreated = {
    val __obj = js.Dynamic.literal(created = js.Any.fromFunction2((t0: View_, t1: View_) => (created(t0, t1)).runNow()))
    __obj.asInstanceOf[ComponentCreated]
  }
  
  extension [Self <: ComponentCreated](x: Self) {
    
    inline def setCreated(value: (View_, View_) => Callback): Self = StObject.set(x, "created", js.Any.fromFunction2((t0: View_, t1: View_) => (value(t0, t1)).runNow()))
  }
}
