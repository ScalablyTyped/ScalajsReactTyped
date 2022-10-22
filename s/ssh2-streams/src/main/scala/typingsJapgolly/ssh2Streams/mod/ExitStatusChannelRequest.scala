package typingsJapgolly.ssh2Streams.mod

import typingsJapgolly.ssh2Streams.ssh2StreamsStrings.`exit-status`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExitStatusChannelRequest
  extends StObject
     with ChannelRequest {
  
  var code: Double
  
  var recipient: Double
  
  var request: `exit-status`
}
object ExitStatusChannelRequest {
  
  inline def apply(code: Double, recipient: Double): ExitStatusChannelRequest = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], recipient = recipient.asInstanceOf[js.Any], request = "exit-status")
    __obj.asInstanceOf[ExitStatusChannelRequest]
  }
  
  extension [Self <: ExitStatusChannelRequest](x: Self) {
    
    inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setRecipient(value: Double): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: `exit-status`): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
