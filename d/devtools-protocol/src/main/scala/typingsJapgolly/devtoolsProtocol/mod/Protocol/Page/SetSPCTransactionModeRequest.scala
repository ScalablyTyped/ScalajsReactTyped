package typingsJapgolly.devtoolsProtocol.mod.Protocol.Page

import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.autoaccept
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.autoreject
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.none_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetSPCTransactionModeRequest extends StObject {
  
  /**
    *  (SetSPCTransactionModeRequestMode enum)
    */
  var mode: none_ | autoaccept | autoreject
}
object SetSPCTransactionModeRequest {
  
  inline def apply(mode: none_ | autoaccept | autoreject): SetSPCTransactionModeRequest = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetSPCTransactionModeRequest]
  }
  
  extension [Self <: SetSPCTransactionModeRequest](x: Self) {
    
    inline def setMode(value: none_ | autoaccept | autoreject): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
  }
}
