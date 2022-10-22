package typingsJapgolly.ethereumProtocol.mod

import typingsJapgolly.ethereumProtocol.mod.AbiType.Fallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FallbackAbi
  extends StObject
     with FunctionAbi {
  
  var payable: Boolean
  
  var `type`: Fallback
}
object FallbackAbi {
  
  inline def apply(payable: Boolean, `type`: Fallback): FallbackAbi = {
    val __obj = js.Dynamic.literal(payable = payable.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FallbackAbi]
  }
  
  extension [Self <: FallbackAbi](x: Self) {
    
    inline def setPayable(value: Boolean): Self = StObject.set(x, "payable", value.asInstanceOf[js.Any])
    
    inline def setType(value: Fallback): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
