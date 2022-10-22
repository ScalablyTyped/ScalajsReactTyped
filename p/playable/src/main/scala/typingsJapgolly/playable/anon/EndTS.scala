package typingsJapgolly.playable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndTS extends StObject {
  
  var endTS: js.UndefOr[Double] = js.undefined
  
  var reason: String
  
  var startTS: js.UndefOr[Double] = js.undefined
}
object EndTS {
  
  inline def apply(reason: String): EndTS = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndTS]
  }
  
  extension [Self <: EndTS](x: Self) {
    
    inline def setEndTS(value: Double): Self = StObject.set(x, "endTS", value.asInstanceOf[js.Any])
    
    inline def setEndTSUndefined: Self = StObject.set(x, "endTS", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setStartTS(value: Double): Self = StObject.set(x, "startTS", value.asInstanceOf[js.Any])
    
    inline def setStartTSUndefined: Self = StObject.set(x, "startTS", js.undefined)
  }
}
