package typingsJapgolly.devtoolsProtocol.mod.Protocol.Emulation

import typingsJapgolly.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetTouchEmulationEnabledRequest extends StObject {
  
  /**
    * Whether the touch event emulation should be enabled.
    */
  var enabled: Boolean
  
  /**
    * Maximum touch points supported. Defaults to one.
    */
  var maxTouchPoints: js.UndefOr[integer] = js.undefined
}
object SetTouchEmulationEnabledRequest {
  
  inline def apply(enabled: Boolean): SetTouchEmulationEnabledRequest = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTouchEmulationEnabledRequest]
  }
  
  extension [Self <: SetTouchEmulationEnabledRequest](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setMaxTouchPoints(value: integer): Self = StObject.set(x, "maxTouchPoints", value.asInstanceOf[js.Any])
    
    inline def setMaxTouchPointsUndefined: Self = StObject.set(x, "maxTouchPoints", js.undefined)
  }
}
