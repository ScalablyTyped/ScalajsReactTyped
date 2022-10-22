package typingsJapgolly.activexLibreoffice.com_.sun.star.rendering

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RGBColor extends StObject {
  
  var Blue: ColorComponent
  
  var Green: ColorComponent
  
  var Red: ColorComponent
}
object RGBColor {
  
  inline def apply(Blue: ColorComponent, Green: ColorComponent, Red: ColorComponent): RGBColor = {
    val __obj = js.Dynamic.literal(Blue = Blue.asInstanceOf[js.Any], Green = Green.asInstanceOf[js.Any], Red = Red.asInstanceOf[js.Any])
    __obj.asInstanceOf[RGBColor]
  }
  
  extension [Self <: RGBColor](x: Self) {
    
    inline def setBlue(value: ColorComponent): Self = StObject.set(x, "Blue", value.asInstanceOf[js.Any])
    
    inline def setGreen(value: ColorComponent): Self = StObject.set(x, "Green", value.asInstanceOf[js.Any])
    
    inline def setRed(value: ColorComponent): Self = StObject.set(x, "Red", value.asInstanceOf[js.Any])
  }
}
