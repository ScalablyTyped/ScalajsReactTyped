package typingsJapgolly.devextreme.anon

import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDiagram.DiagramDataLayoutType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Orientation extends StObject {
  
  /**
    * Specifies the diagram layout orientation.
    */
  var orientation: js.UndefOr[typingsJapgolly.devextreme.mod.DevExpress.common.Orientation] = js.undefined
  
  /**
    * Specifies an auto-layout algorithm that is used to automatically arrange shapes.
    */
  var `type`: js.UndefOr[DiagramDataLayoutType] = js.undefined
}
object Orientation {
  
  inline def apply(): Orientation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Orientation]
  }
  
  extension [Self <: Orientation](x: Self) {
    
    inline def setOrientation(value: typingsJapgolly.devextreme.mod.DevExpress.common.Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setType(value: DiagramDataLayoutType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
