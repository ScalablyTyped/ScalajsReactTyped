package typingsJapgolly.bizcharts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Width extends StObject {
  
  var height: Any
  
  var width: Any
}
object Width {
  
  inline def apply(height: Any, width: Any): Width = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Width]
  }
  
  extension [Self <: Width](x: Self) {
    
    inline def setHeight(value: Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
