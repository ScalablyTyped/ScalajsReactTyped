package typingsJapgolly.awsSdkEc2ErrorUnmarshaller

import typingsJapgolly.awsSdkEc2ErrorUnmarshaller.anon.Error
import typingsJapgolly.awsSdkEc2ErrorUnmarshaller.anon.RequestId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildConstantsMod {
  
  @JSImport("@aws-sdk/ec2-error-unmarshaller/build/constants", "ERR_RESP_SHAPE_LEGACY")
  @js.native
  val ERR_RESP_SHAPE_LEGACY: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Member */ Any = js.native
  
  trait ParsedLegacyErrorResponse extends StObject {
    
    @JSName("$metadata")
    var $metadata: RequestId
    
    var Errors: js.UndefOr[Error] = js.undefined
  }
  object ParsedLegacyErrorResponse {
    
    inline def apply($metadata: RequestId): ParsedLegacyErrorResponse = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedLegacyErrorResponse]
    }
    
    extension [Self <: ParsedLegacyErrorResponse](x: Self) {
      
      inline def set$metadata(value: RequestId): Self = StObject.set(x, "$metadata", value.asInstanceOf[js.Any])
      
      inline def setErrors(value: Error): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    }
  }
}
