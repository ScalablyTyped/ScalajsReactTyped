package typingsJapgolly.tailwindcss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'0' | 'full' | 'min' | 'max' | 'fit', string> */
trait Record0fullminmaxfitstrin extends StObject {
  
  var `0`: String
  
  var fit: String
  
  var full: String
  
  var max: String
  
  var min: String
}
object Record0fullminmaxfitstrin {
  
  inline def apply(`0`: String, fit: String, full: String, max: String, min: String): Record0fullminmaxfitstrin = {
    val __obj = js.Dynamic.literal(fit = fit.asInstanceOf[js.Any], full = full.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Record0fullminmaxfitstrin]
  }
  
  extension [Self <: Record0fullminmaxfitstrin](x: Self) {
    
    inline def set0(value: String): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
    
    inline def setFit(value: String): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
    
    inline def setFull(value: String): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    
    inline def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
