package typingsJapgolly.twilsock.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContinuationTokenStatus extends StObject {
  
  var reissue_message: String
  
  var reissued: Boolean
}
object ContinuationTokenStatus {
  
  inline def apply(reissue_message: String, reissued: Boolean): ContinuationTokenStatus = {
    val __obj = js.Dynamic.literal(reissue_message = reissue_message.asInstanceOf[js.Any], reissued = reissued.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuationTokenStatus]
  }
  
  extension [Self <: ContinuationTokenStatus](x: Self) {
    
    inline def setReissue_message(value: String): Self = StObject.set(x, "reissue_message", value.asInstanceOf[js.Any])
    
    inline def setReissued(value: Boolean): Self = StObject.set(x, "reissued", value.asInstanceOf[js.Any])
  }
}
