package typingsJapgolly.nodeMailjet.mod.SMS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// other types
trait GetResponseDataData extends StObject {
  
  val Cost: ResponseCost
  
  val CreationTS: Double
  
  val From: String
  
  val MessageId: String
  
  val SMSCount: Double
  
  val SentTS: Double
  
  val Status: ResponseStatus
  
  val To: String
}
object GetResponseDataData {
  
  inline def apply(
    Cost: ResponseCost,
    CreationTS: Double,
    From: String,
    MessageId: String,
    SMSCount: Double,
    SentTS: Double,
    Status: ResponseStatus,
    To: String
  ): GetResponseDataData = {
    val __obj = js.Dynamic.literal(Cost = Cost.asInstanceOf[js.Any], CreationTS = CreationTS.asInstanceOf[js.Any], From = From.asInstanceOf[js.Any], MessageId = MessageId.asInstanceOf[js.Any], SMSCount = SMSCount.asInstanceOf[js.Any], SentTS = SentTS.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], To = To.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResponseDataData]
  }
  
  extension [Self <: GetResponseDataData](x: Self) {
    
    inline def setCost(value: ResponseCost): Self = StObject.set(x, "Cost", value.asInstanceOf[js.Any])
    
    inline def setCreationTS(value: Double): Self = StObject.set(x, "CreationTS", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: String): Self = StObject.set(x, "From", value.asInstanceOf[js.Any])
    
    inline def setMessageId(value: String): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
    
    inline def setSMSCount(value: Double): Self = StObject.set(x, "SMSCount", value.asInstanceOf[js.Any])
    
    inline def setSentTS(value: Double): Self = StObject.set(x, "SentTS", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ResponseStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setTo(value: String): Self = StObject.set(x, "To", value.asInstanceOf[js.Any])
  }
}
