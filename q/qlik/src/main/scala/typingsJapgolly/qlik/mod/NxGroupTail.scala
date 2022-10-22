package typingsJapgolly.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NxGroupTail extends StObject {
  
  var qDown: Double
  
  var qUp: Double
}
object NxGroupTail {
  
  inline def apply(qDown: Double, qUp: Double): NxGroupTail = {
    val __obj = js.Dynamic.literal(qDown = qDown.asInstanceOf[js.Any], qUp = qUp.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxGroupTail]
  }
  
  extension [Self <: NxGroupTail](x: Self) {
    
    inline def setQDown(value: Double): Self = StObject.set(x, "qDown", value.asInstanceOf[js.Any])
    
    inline def setQUp(value: Double): Self = StObject.set(x, "qUp", value.asInstanceOf[js.Any])
  }
}
