package typingsJapgolly.oracleOraclejet.anon

import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.on
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderWidth extends StObject {
  
  var backgroundColor: String
  
  var borderColor: String
  
  var borderWidth: Double
  
  var rendered: off | on
}
object BorderWidth {
  
  inline def apply(backgroundColor: String, borderColor: String, borderWidth: Double, rendered: off | on): BorderWidth = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderWidth]
  }
  
  extension [Self <: BorderWidth](x: Self) {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setRendered(value: off | on): Self = StObject.set(x, "rendered", value.asInstanceOf[js.Any])
  }
}
