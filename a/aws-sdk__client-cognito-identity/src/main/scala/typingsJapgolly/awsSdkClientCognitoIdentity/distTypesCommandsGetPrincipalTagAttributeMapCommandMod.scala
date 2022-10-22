package typingsJapgolly.awsSdkClientCognitoIdentity

import typingsJapgolly.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typingsJapgolly.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.ServiceInputTypes
import typingsJapgolly.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.ServiceOutputTypes
import typingsJapgolly.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod._ServiceOutputTypes
import typingsJapgolly.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.GetPrincipalTagAttributeMapInput
import typingsJapgolly.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.GetPrincipalTagAttributeMapResponse
import typingsJapgolly.awsSdkSmithyClient.mod.Command
import typingsJapgolly.awsSdkTypes.distTypesHttpMod.HttpHandlerOptions
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCommandsGetPrincipalTagAttributeMapCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands/GetPrincipalTagAttributeMapCommand", "GetPrincipalTagAttributeMapCommand")
  @js.native
  open class GetPrincipalTagAttributeMapCommand protected () extends Command[
          GetPrincipalTagAttributeMapCommandInput, 
          GetPrincipalTagAttributeMapCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          Any, 
          Any
        ] {
    def this(input: GetPrincipalTagAttributeMapCommandInput) = this()
    
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[GetPrincipalTagAttributeMapCommandInput, GetPrincipalTagAttributeMapCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[GetPrincipalTagAttributeMapCommandInput, GetPrincipalTagAttributeMapCommandOutput] = js.native
    
    /* private */ var serialize: Any = js.native
  }
  
  type GetPrincipalTagAttributeMapCommandInput = GetPrincipalTagAttributeMapInput
  
  trait GetPrincipalTagAttributeMapCommandOutput
    extends StObject
       with GetPrincipalTagAttributeMapResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object GetPrincipalTagAttributeMapCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): GetPrincipalTagAttributeMapCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetPrincipalTagAttributeMapCommandOutput]
    }
  }
}
