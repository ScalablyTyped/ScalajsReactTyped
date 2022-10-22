package typingsJapgolly.forgeViewer.Autodesk.Viewing

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemSelectedObserver extends StObject {
  
  def onItemSelected(viewer: Viewer3D): Unit
}
object ItemSelectedObserver {
  
  inline def apply(onItemSelected: Viewer3D => Callback): ItemSelectedObserver = {
    val __obj = js.Dynamic.literal(onItemSelected = js.Any.fromFunction1((t0: Viewer3D) => onItemSelected(t0).runNow()))
    __obj.asInstanceOf[ItemSelectedObserver]
  }
  
  extension [Self <: ItemSelectedObserver](x: Self) {
    
    inline def setOnItemSelected(value: Viewer3D => Callback): Self = StObject.set(x, "onItemSelected", js.Any.fromFunction1((t0: Viewer3D) => value(t0).runNow()))
  }
}
