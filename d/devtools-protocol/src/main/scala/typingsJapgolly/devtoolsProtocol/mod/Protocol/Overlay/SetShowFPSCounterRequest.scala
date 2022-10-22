package typingsJapgolly.devtoolsProtocol.mod.Protocol.Overlay

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetShowFPSCounterRequest extends StObject {
  
  /**
    * True for showing the FPS counter
    */
  var show: Boolean
}
object SetShowFPSCounterRequest {
  
  inline def apply(show: Boolean): SetShowFPSCounterRequest = {
    val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetShowFPSCounterRequest]
  }
  
  extension [Self <: SetShowFPSCounterRequest](x: Self) {
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
  }
}
