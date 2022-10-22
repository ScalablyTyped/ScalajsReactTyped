package typingsJapgolly.iotaLibJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Security extends StObject {
  
  var end: Double
  
  var security: js.UndefOr[typingsJapgolly.iotaLibJs.mod.Security] = js.undefined
  
  var start: Double
}
object Security {
  
  inline def apply(end: Double, start: Double): Security = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Security]
  }
  
  extension [Self <: Security](x: Self) {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setSecurity(value: typingsJapgolly.iotaLibJs.mod.Security): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
  }
}
