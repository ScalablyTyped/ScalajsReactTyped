package typingsJapgolly.maximMazurokGapiClientAccesscontextmanager.gapi.client.accesscontextmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasicLevel extends StObject {
  
  /**
    * How the `conditions` list should be combined to determine if a request is granted this `AccessLevel`. If AND is used, each `Condition` in `conditions` must be satisfied for the
    * `AccessLevel` to be applied. If OR is used, at least one `Condition` in `conditions` must be satisfied for the `AccessLevel` to be applied. Default behavior is AND.
    */
  var combiningFunction: js.UndefOr[String] = js.undefined
  
  /** Required. A list of requirements for the `AccessLevel` to be granted. */
  var conditions: js.UndefOr[js.Array[Condition]] = js.undefined
}
object BasicLevel {
  
  inline def apply(): BasicLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicLevel]
  }
  
  extension [Self <: BasicLevel](x: Self) {
    
    inline def setCombiningFunction(value: String): Self = StObject.set(x, "combiningFunction", value.asInstanceOf[js.Any])
    
    inline def setCombiningFunctionUndefined: Self = StObject.set(x, "combiningFunction", js.undefined)
    
    inline def setConditions(value: js.Array[Condition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: Condition*): Self = StObject.set(x, "conditions", js.Array(value*))
  }
}
