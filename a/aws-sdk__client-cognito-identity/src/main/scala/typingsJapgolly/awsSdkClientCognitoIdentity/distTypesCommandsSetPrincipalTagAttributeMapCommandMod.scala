package typingsJapgolly.awsSdkClientCognitoIdentity

import typingsJapgolly.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typingsJapgolly.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.ServiceInputTypes
import typingsJapgolly.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.ServiceOutputTypes
import typingsJapgolly.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod._ServiceOutputTypes
import typingsJapgolly.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.SetPrincipalTagAttributeMapInput
import typingsJapgolly.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.SetPrincipalTagAttributeMapResponse
import typingsJapgolly.awsSdkSmithyClient.mod.Command
import typingsJapgolly.awsSdkTypes.distTypesHttpMod.HttpHandlerOptions
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCommandsSetPrincipalTagAttributeMapCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands/SetPrincipalTagAttributeMapCommand", "SetPrincipalTagAttributeMapCommand")
  @js.native
  open class SetPrincipalTagAttributeMapCommand protected () extends Command[
          SetPrincipalTagAttributeMapCommandInput, 
          SetPrincipalTagAttributeMapCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          Any, 
          Any
        ] {
    def this(input: SetPrincipalTagAttributeMapCommandInput) = this()
    
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[SetPrincipalTagAttributeMapCommandInput, SetPrincipalTagAttributeMapCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[SetPrincipalTagAttributeMapCommandInput, SetPrincipalTagAttributeMapCommandOutput] = js.native
    
    /* private */ var serialize: Any = js.native
  }
  
  type SetPrincipalTagAttributeMapCommandInput = SetPrincipalTagAttributeMapInput
  
  trait SetPrincipalTagAttributeMapCommandOutput
    extends StObject
       with SetPrincipalTagAttributeMapResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object SetPrincipalTagAttributeMapCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): SetPrincipalTagAttributeMapCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetPrincipalTagAttributeMapCommandOutput]
    }
  }
}
