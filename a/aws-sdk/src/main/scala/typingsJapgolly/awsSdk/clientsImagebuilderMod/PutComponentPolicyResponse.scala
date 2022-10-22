package typingsJapgolly.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutComponentPolicyResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the component that this policy was applied to.
    */
  var componentArn: js.UndefOr[ComponentBuildVersionArn] = js.undefined
  
  /**
    * The request ID that uniquely identifies this request.
    */
  var requestId: js.UndefOr[NonEmptyString] = js.undefined
}
object PutComponentPolicyResponse {
  
  inline def apply(): PutComponentPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutComponentPolicyResponse]
  }
  
  extension [Self <: PutComponentPolicyResponse](x: Self) {
    
    inline def setComponentArn(value: ComponentBuildVersionArn): Self = StObject.set(x, "componentArn", value.asInstanceOf[js.Any])
    
    inline def setComponentArnUndefined: Self = StObject.set(x, "componentArn", js.undefined)
    
    inline def setRequestId(value: NonEmptyString): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
