package typingsJapgolly.awsSdk.clientsCloudhsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteHsmRequest extends StObject {
  
  /**
    * The ARN of the HSM to delete.
    */
  var HsmArn: typingsJapgolly.awsSdk.clientsCloudhsmMod.HsmArn
}
object DeleteHsmRequest {
  
  inline def apply(HsmArn: HsmArn): DeleteHsmRequest = {
    val __obj = js.Dynamic.literal(HsmArn = HsmArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteHsmRequest]
  }
  
  extension [Self <: DeleteHsmRequest](x: Self) {
    
    inline def setHsmArn(value: HsmArn): Self = StObject.set(x, "HsmArn", value.asInstanceOf[js.Any])
  }
}
