package typingsJapgolly.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeightMarginRight extends StObject {
  
  var height: Double
  
  var marginRight: Double
  
  var width: Double
}
object HeightMarginRight {
  
  inline def apply(height: Double, marginRight: Double, width: Double): HeightMarginRight = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], marginRight = marginRight.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeightMarginRight]
  }
  
  extension [Self <: HeightMarginRight](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setMarginRight(value: Double): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
