package typingsJapgolly.devtoolsProtocol.mod.Protocol.Debugger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetSkipAllPausesRequest extends StObject {
  
  /**
    * New value for skip pauses state.
    */
  var skip: Boolean
}
object SetSkipAllPausesRequest {
  
  inline def apply(skip: Boolean): SetSkipAllPausesRequest = {
    val __obj = js.Dynamic.literal(skip = skip.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetSkipAllPausesRequest]
  }
  
  extension [Self <: SetSkipAllPausesRequest](x: Self) {
    
    inline def setSkip(value: Boolean): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
  }
}
