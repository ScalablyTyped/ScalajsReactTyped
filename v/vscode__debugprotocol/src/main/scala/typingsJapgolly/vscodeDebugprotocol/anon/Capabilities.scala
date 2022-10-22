package typingsJapgolly.vscodeDebugprotocol.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Capabilities extends StObject {
  
  /** The set of updated capabilities. */
  var capabilities: typingsJapgolly.vscodeDebugprotocol.mod.DebugProtocol.Capabilities
}
object Capabilities {
  
  inline def apply(capabilities: typingsJapgolly.vscodeDebugprotocol.mod.DebugProtocol.Capabilities): Capabilities = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[Capabilities]
  }
  
  extension [Self <: Capabilities](x: Self) {
    
    inline def setCapabilities(value: typingsJapgolly.vscodeDebugprotocol.mod.DebugProtocol.Capabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
  }
}
