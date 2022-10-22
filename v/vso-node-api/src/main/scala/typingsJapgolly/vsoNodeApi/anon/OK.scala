package typingsJapgolly.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OK extends StObject {
  
  var error: scala.Double
  
  var oK: scala.Double
  
  var warning: scala.Double
}
object OK {
  
  inline def apply(error: scala.Double, oK: scala.Double, warning: scala.Double): OK = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], oK = oK.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[OK]
  }
  
  extension [Self <: OK](x: Self) {
    
    inline def setError(value: scala.Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setOK(value: scala.Double): Self = StObject.set(x, "oK", value.asInstanceOf[js.Any])
    
    inline def setWarning(value: scala.Double): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
  }
}
