package typingsJapgolly.escpos.anon

import typingsJapgolly.escpos.escposStrings.A
import typingsJapgolly.escpos.escposStrings.ABV
import typingsJapgolly.escpos.escposStrings.B
import typingsJapgolly.escpos.escposStrings.BLW
import typingsJapgolly.escpos.escposStrings.BTH
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Font extends StObject {
  
  var font: A | B
  
  var height: Double
  
  var includeParity: Boolean
  
  /**
    * OFF, ABOVE, BELOW, BOTH
    *
    * @default BELOW
    */
  var position: typingsJapgolly.escpos.escposStrings.OFF | ABV | BLW | BTH
  
  var width: Double
}
object Font {
  
  inline def apply(
    font: A | B,
    height: Double,
    includeParity: Boolean,
    position: typingsJapgolly.escpos.escposStrings.OFF | ABV | BLW | BTH,
    width: Double
  ): Font = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], includeParity = includeParity.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Font]
  }
  
  extension [Self <: Font](x: Self) {
    
    inline def setFont(value: A | B): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setIncludeParity(value: Boolean): Self = StObject.set(x, "includeParity", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: typingsJapgolly.escpos.escposStrings.OFF | ABV | BLW | BTH): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
