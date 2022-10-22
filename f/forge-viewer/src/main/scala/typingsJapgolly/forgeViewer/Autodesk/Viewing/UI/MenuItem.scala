package typingsJapgolly.forgeViewer.Autodesk.Viewing.UI

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuItem extends StObject {
  
  def target(): Unit | js.Array[MenuItem]
  
  var title: String
}
object MenuItem {
  
  inline def apply(target: CallbackTo[Unit | js.Array[MenuItem]], title: String): MenuItem = {
    val __obj = js.Dynamic.literal(target = target.toJsFn, title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItem]
  }
  
  extension [Self <: MenuItem](x: Self) {
    
    inline def setTarget(value: CallbackTo[Unit | js.Array[MenuItem]]): Self = StObject.set(x, "target", value.toJsFn)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
