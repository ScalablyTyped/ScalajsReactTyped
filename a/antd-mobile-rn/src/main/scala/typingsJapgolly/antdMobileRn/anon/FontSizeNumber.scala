package typingsJapgolly.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontSizeNumber extends StObject {
  
  var fontSize: Double
}
object FontSizeNumber {
  
  inline def apply(fontSize: Double): FontSizeNumber = {
    val __obj = js.Dynamic.literal(fontSize = fontSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontSizeNumber]
  }
  
  extension [Self <: FontSizeNumber](x: Self) {
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
  }
}
