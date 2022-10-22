package typingsJapgolly.reactVis.anon

import typingsJapgolly.reactVis.reactVisStrings.horizontal
import typingsJapgolly.reactVis.reactVisStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HORIZONTAL_ extends StObject {
  
  var HORIZONTAL: horizontal
  
  var VERTICAL: vertical
}
object HORIZONTAL_ {
  
  inline def apply(): HORIZONTAL_ = {
    val __obj = js.Dynamic.literal(HORIZONTAL = "horizontal", VERTICAL = "vertical")
    __obj.asInstanceOf[HORIZONTAL_]
  }
  
  extension [Self <: HORIZONTAL_](x: Self) {
    
    inline def setHORIZONTAL(value: horizontal): Self = StObject.set(x, "HORIZONTAL", value.asInstanceOf[js.Any])
    
    inline def setVERTICAL(value: vertical): Self = StObject.set(x, "VERTICAL", value.asInstanceOf[js.Any])
  }
}
