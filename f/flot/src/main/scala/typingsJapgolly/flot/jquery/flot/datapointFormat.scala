package typingsJapgolly.flot.jquery.flot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait datapointFormat extends StObject {
  
  var defaultValue: js.UndefOr[Double] = js.undefined
  
  var number: Boolean
  
  var required: Boolean
  
  var x: js.UndefOr[Boolean] = js.undefined
  
  var y: js.UndefOr[Boolean] = js.undefined
}
object datapointFormat {
  
  inline def apply(number: Boolean, required: Boolean): datapointFormat = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.asInstanceOf[datapointFormat]
  }
  
  extension [Self <: datapointFormat](x: Self) {
    
    inline def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setNumber(value: Boolean): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setX(value: Boolean): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Boolean): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
