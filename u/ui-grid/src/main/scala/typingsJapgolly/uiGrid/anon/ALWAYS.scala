package typingsJapgolly.uiGrid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ALWAYS extends StObject {
  
  var ALWAYS: Double
  
  var NEVER: Double
  
  var WHEN_NEEDED: Double
}
object ALWAYS {
  
  inline def apply(ALWAYS: Double, NEVER: Double, WHEN_NEEDED: Double): ALWAYS = {
    val __obj = js.Dynamic.literal(ALWAYS = ALWAYS.asInstanceOf[js.Any], NEVER = NEVER.asInstanceOf[js.Any], WHEN_NEEDED = WHEN_NEEDED.asInstanceOf[js.Any])
    __obj.asInstanceOf[ALWAYS]
  }
  
  extension [Self <: ALWAYS](x: Self) {
    
    inline def setALWAYS(value: Double): Self = StObject.set(x, "ALWAYS", value.asInstanceOf[js.Any])
    
    inline def setNEVER(value: Double): Self = StObject.set(x, "NEVER", value.asInstanceOf[js.Any])
    
    inline def setWHEN_NEEDED(value: Double): Self = StObject.set(x, "WHEN_NEEDED", value.asInstanceOf[js.Any])
  }
}
