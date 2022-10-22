package typingsJapgolly.tailwindcss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<'auto' | 'min' | 'max' | 'fr', string> */
trait Recordautominmaxfrstring extends StObject {
  
  var auto: String
  
  var fr: String
  
  var max: String
  
  var min: String
}
object Recordautominmaxfrstring {
  
  inline def apply(auto: String, fr: String, max: String, min: String): Recordautominmaxfrstring = {
    val __obj = js.Dynamic.literal(auto = auto.asInstanceOf[js.Any], fr = fr.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recordautominmaxfrstring]
  }
  
  extension [Self <: Recordautominmaxfrstring](x: Self) {
    
    inline def setAuto(value: String): Self = StObject.set(x, "auto", value.asInstanceOf[js.Any])
    
    inline def setFr(value: String): Self = StObject.set(x, "fr", value.asInstanceOf[js.Any])
    
    inline def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
