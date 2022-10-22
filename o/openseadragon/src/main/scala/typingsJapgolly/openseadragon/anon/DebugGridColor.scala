package typingsJapgolly.openseadragon.anon

import typingsJapgolly.openseadragon.mod.Viewer
import typingsJapgolly.openseadragon.mod.Viewport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebugGridColor extends StObject {
  
  var debugGridColor: js.UndefOr[String] = js.undefined
  
  var element: org.scalajs.dom.Element
  
  var viewer: Viewer
  
  var viewport: Viewport
}
object DebugGridColor {
  
  inline def apply(element: org.scalajs.dom.Element, viewer: Viewer, viewport: Viewport): DebugGridColor = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], viewer = viewer.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugGridColor]
  }
  
  extension [Self <: DebugGridColor](x: Self) {
    
    inline def setDebugGridColor(value: String): Self = StObject.set(x, "debugGridColor", value.asInstanceOf[js.Any])
    
    inline def setDebugGridColorUndefined: Self = StObject.set(x, "debugGridColor", js.undefined)
    
    inline def setElement(value: org.scalajs.dom.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setViewer(value: Viewer): Self = StObject.set(x, "viewer", value.asInstanceOf[js.Any])
    
    inline def setViewport(value: Viewport): Self = StObject.set(x, "viewport", value.asInstanceOf[js.Any])
  }
}
