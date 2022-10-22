package typingsJapgolly.escpos.anon

import typingsJapgolly.escpos.escposStrings.InformationseparatorthreeECNull
import typingsJapgolly.escpos.escposStrings.InformationseparatorthreeECStartofheading
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OFF extends StObject {
  
  // Barcode mode on
  var OFF: InformationseparatorthreeECNull
  
  var ON: InformationseparatorthreeECStartofheading
}
object OFF {
  
  inline def apply(): OFF = {
    val __obj = js.Dynamic.literal(OFF = "\u001DEC\u0000", ON = "\u001DEC\u0001")
    __obj.asInstanceOf[OFF]
  }
  
  extension [Self <: OFF](x: Self) {
    
    inline def setOFF(value: InformationseparatorthreeECNull): Self = StObject.set(x, "OFF", value.asInstanceOf[js.Any])
    
    inline def setON(value: InformationseparatorthreeECStartofheading): Self = StObject.set(x, "ON", value.asInstanceOf[js.Any])
  }
}
