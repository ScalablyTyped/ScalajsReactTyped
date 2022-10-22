package typingsJapgolly.forgeViewer.Autodesk.Viewing

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextMenuItem extends StObject {
  
  def target(): Unit
  
  var title: String
}
object ContextMenuItem {
  
  inline def apply(target: Callback, title: String): ContextMenuItem = {
    val __obj = js.Dynamic.literal(target = target.toJsFn, title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextMenuItem]
  }
  
  extension [Self <: ContextMenuItem](x: Self) {
    
    inline def setTarget(value: Callback): Self = StObject.set(x, "target", value.toJsFn)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
