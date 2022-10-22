package typingsJapgolly.openpgp.mod

import typingsJapgolly.openpgp.mod.enums.reasonForRevocation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait revokeReasonForRevocation extends StObject {
  
  /**
    * optional, flag indicating the reason for revocation
    */
  var flag: reasonForRevocation
  
  /**
    * optional, string explaining the reason for revocation
    */
  var string: String
}
object revokeReasonForRevocation {
  
  inline def apply(flag: reasonForRevocation, string: String): revokeReasonForRevocation = {
    val __obj = js.Dynamic.literal(flag = flag.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[revokeReasonForRevocation]
  }
  
  extension [Self <: revokeReasonForRevocation](x: Self) {
    
    inline def setFlag(value: reasonForRevocation): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
  }
}
