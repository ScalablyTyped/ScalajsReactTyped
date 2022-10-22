package typingsJapgolly.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RejectDataShareMessage extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the datashare to reject.
    */
  var DataShareArn: String
}
object RejectDataShareMessage {
  
  inline def apply(DataShareArn: String): RejectDataShareMessage = {
    val __obj = js.Dynamic.literal(DataShareArn = DataShareArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectDataShareMessage]
  }
  
  extension [Self <: RejectDataShareMessage](x: Self) {
    
    inline def setDataShareArn(value: String): Self = StObject.set(x, "DataShareArn", value.asInstanceOf[js.Any])
  }
}
