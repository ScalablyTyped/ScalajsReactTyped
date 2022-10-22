package typingsJapgolly.reactVis.anon

import typingsJapgolly.reactVis.reactVisStrings.bottom
import typingsJapgolly.reactVis.reactVisStrings.horizontal
import typingsJapgolly.reactVis.reactVisStrings.left
import typingsJapgolly.reactVis.reactVisStrings.right
import typingsJapgolly.reactVis.reactVisStrings.top
import typingsJapgolly.reactVis.reactVisStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BOTTOM_ extends StObject {
  
  var BOTTOM: bottom
  
  var HORIZONTAL: horizontal
  
  var LEFT: left
  
  var RIGHT: right
  
  var TOP: top
  
  var VERTICAL: vertical
}
object BOTTOM_ {
  
  inline def apply(): BOTTOM_ = {
    val __obj = js.Dynamic.literal(BOTTOM = "bottom", HORIZONTAL = "horizontal", LEFT = "left", RIGHT = "right", TOP = "top", VERTICAL = "vertical")
    __obj.asInstanceOf[BOTTOM_]
  }
  
  extension [Self <: BOTTOM_](x: Self) {
    
    inline def setBOTTOM(value: bottom): Self = StObject.set(x, "BOTTOM", value.asInstanceOf[js.Any])
    
    inline def setHORIZONTAL(value: horizontal): Self = StObject.set(x, "HORIZONTAL", value.asInstanceOf[js.Any])
    
    inline def setLEFT(value: left): Self = StObject.set(x, "LEFT", value.asInstanceOf[js.Any])
    
    inline def setRIGHT(value: right): Self = StObject.set(x, "RIGHT", value.asInstanceOf[js.Any])
    
    inline def setTOP(value: top): Self = StObject.set(x, "TOP", value.asInstanceOf[js.Any])
    
    inline def setVERTICAL(value: vertical): Self = StObject.set(x, "VERTICAL", value.asInstanceOf[js.Any])
  }
}
