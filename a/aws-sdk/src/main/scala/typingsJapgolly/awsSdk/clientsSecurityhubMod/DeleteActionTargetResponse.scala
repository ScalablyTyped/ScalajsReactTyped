package typingsJapgolly.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteActionTargetResponse extends StObject {
  
  /**
    * The ARN of the custom action target that was deleted.
    */
  var ActionTargetArn: NonEmptyString
}
object DeleteActionTargetResponse {
  
  inline def apply(ActionTargetArn: NonEmptyString): DeleteActionTargetResponse = {
    val __obj = js.Dynamic.literal(ActionTargetArn = ActionTargetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteActionTargetResponse]
  }
  
  extension [Self <: DeleteActionTargetResponse](x: Self) {
    
    inline def setActionTargetArn(value: NonEmptyString): Self = StObject.set(x, "ActionTargetArn", value.asInstanceOf[js.Any])
  }
}
