package typingsJapgolly.kendoUi.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDropTarget extends StObject {
  
  /* static member */
  def destroyGroup(groupName: String): Unit
}
object TypeofDropTarget {
  
  inline def apply(destroyGroup: String => Callback): TypeofDropTarget = {
    val __obj = js.Dynamic.literal(destroyGroup = js.Any.fromFunction1((t0: String) => destroyGroup(t0).runNow()))
    __obj.asInstanceOf[TypeofDropTarget]
  }
  
  extension [Self <: TypeofDropTarget](x: Self) {
    
    inline def setDestroyGroup(value: String => Callback): Self = StObject.set(x, "destroyGroup", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
