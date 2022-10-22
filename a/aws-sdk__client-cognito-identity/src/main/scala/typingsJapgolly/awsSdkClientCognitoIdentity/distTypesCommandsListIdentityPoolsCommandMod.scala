package typingsJapgolly.awsSdkClientCognitoIdentity

import typingsJapgolly.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typingsJapgolly.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.ServiceInputTypes
import typingsJapgolly.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.ServiceOutputTypes
import typingsJapgolly.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod._ServiceOutputTypes
import typingsJapgolly.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.ListIdentityPoolsInput
import typingsJapgolly.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.ListIdentityPoolsResponse
import typingsJapgolly.awsSdkSmithyClient.mod.Command
import typingsJapgolly.awsSdkTypes.distTypesHttpMod.HttpHandlerOptions
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCommandsListIdentityPoolsCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands/ListIdentityPoolsCommand", "ListIdentityPoolsCommand")
  @js.native
  open class ListIdentityPoolsCommand protected () extends Command[
          ListIdentityPoolsCommandInput, 
          ListIdentityPoolsCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          Any, 
          Any
        ] {
    def this(input: ListIdentityPoolsCommandInput) = this()
    
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[ListIdentityPoolsCommandInput, ListIdentityPoolsCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[ListIdentityPoolsCommandInput, ListIdentityPoolsCommandOutput] = js.native
    
    /* private */ var serialize: Any = js.native
  }
  
  type ListIdentityPoolsCommandInput = ListIdentityPoolsInput
  
  trait ListIdentityPoolsCommandOutput
    extends StObject
       with ListIdentityPoolsResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object ListIdentityPoolsCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): ListIdentityPoolsCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListIdentityPoolsCommandOutput]
    }
  }
}
