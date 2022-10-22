package typingsJapgolly.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolbarLayout extends StObject {
  
  var orientation: Orientation
}
object ToolbarLayout {
  
  inline def apply(orientation: Orientation): ToolbarLayout = {
    val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarLayout]
  }
  
  extension [Self <: ToolbarLayout](x: Self) {
    
    inline def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
  }
}
