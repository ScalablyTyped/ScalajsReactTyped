package typingsJapgolly.vscodeDebugprotocol.anon

import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.`new`
import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.changed
import typingsJapgolly.vscodeDebugprotocol.vscodeDebugprotocolStrings.removed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Source extends StObject {
  
  /** The reason for the event. */
  var reason: `new` | changed | removed
  
  /** The new, changed, or removed source. */
  var source: typingsJapgolly.vscodeDebugprotocol.mod.DebugProtocol.Source
}
object Source {
  
  inline def apply(
    reason: `new` | changed | removed,
    source: typingsJapgolly.vscodeDebugprotocol.mod.DebugProtocol.Source
  ): Source = {
    val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  
  extension [Self <: Source](x: Self) {
    
    inline def setReason(value: `new` | changed | removed): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setSource(value: typingsJapgolly.vscodeDebugprotocol.mod.DebugProtocol.Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
