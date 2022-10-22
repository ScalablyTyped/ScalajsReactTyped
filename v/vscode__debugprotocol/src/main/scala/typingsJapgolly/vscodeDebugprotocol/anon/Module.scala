package typingsJapgolly.vscodeDebugprotocol.anon

import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.`new`
import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.changed
import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.removed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Module extends StObject {
  
  /** The new, changed, or removed module. In case of `removed` only the module id is used. */
  var module: typingsJapgolly.vscodeDebugprotocol.mod.DebugProtocol.Module
  
  /** The reason for the event. */
  var reason: `new` | changed | removed
}
object Module {
  
  inline def apply(
    module: typingsJapgolly.vscodeDebugprotocol.mod.DebugProtocol.Module,
    reason: `new` | changed | removed
  ): Module = {
    val __obj = js.Dynamic.literal(module = module.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Module]
  }
  
  extension [Self <: Module](x: Self) {
    
    inline def setModule(value: typingsJapgolly.vscodeDebugprotocol.mod.DebugProtocol.Module): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setReason(value: `new` | changed | removed): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
  }
}
