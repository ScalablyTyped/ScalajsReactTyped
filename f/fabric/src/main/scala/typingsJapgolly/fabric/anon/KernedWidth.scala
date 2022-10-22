package typingsJapgolly.fabric.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KernedWidth extends StObject {
  
  var kernedWidth: Double
  
  var width: Double
}
object KernedWidth {
  
  inline def apply(kernedWidth: Double, width: Double): KernedWidth = {
    val __obj = js.Dynamic.literal(kernedWidth = kernedWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[KernedWidth]
  }
  
  extension [Self <: KernedWidth](x: Self) {
    
    inline def setKernedWidth(value: Double): Self = StObject.set(x, "kernedWidth", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
