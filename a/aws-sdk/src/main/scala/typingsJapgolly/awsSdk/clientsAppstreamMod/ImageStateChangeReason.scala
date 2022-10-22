package typingsJapgolly.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageStateChangeReason extends StObject {
  
  /**
    * The state change reason code.
    */
  var Code: js.UndefOr[ImageStateChangeReasonCode] = js.undefined
  
  /**
    * The state change reason message.
    */
  var Message: js.UndefOr[String] = js.undefined
}
object ImageStateChangeReason {
  
  inline def apply(): ImageStateChangeReason = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageStateChangeReason]
  }
  
  extension [Self <: ImageStateChangeReason](x: Self) {
    
    inline def setCode(value: ImageStateChangeReasonCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
