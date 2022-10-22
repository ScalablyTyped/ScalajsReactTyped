package typingsJapgolly.awsSdkClientCognitoIdentity

import typingsJapgolly.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.CognitoIdentityClientResolvedConfig
import typingsJapgolly.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.ServiceInputTypes
import typingsJapgolly.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod.ServiceOutputTypes
import typingsJapgolly.awsSdkClientCognitoIdentity.distTypesCognitoIdentityClientMod._ServiceOutputTypes
import typingsJapgolly.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.ListTagsForResourceInput
import typingsJapgolly.awsSdkClientCognitoIdentity.distTypesModelsModels0Mod.ListTagsForResourceResponse
import typingsJapgolly.awsSdkSmithyClient.mod.Command
import typingsJapgolly.awsSdkTypes.distTypesHttpMod.HttpHandlerOptions
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCommandsListTagsForResourceCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/commands/ListTagsForResourceCommand", "ListTagsForResourceCommand")
  @js.native
  open class ListTagsForResourceCommand protected () extends Command[
          ListTagsForResourceCommandInput, 
          ListTagsForResourceCommandOutput, 
          CognitoIdentityClientResolvedConfig, 
          Any, 
          Any
        ] {
    def this(input: ListTagsForResourceCommandInput) = this()
    
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig
    ): Handler[ListTagsForResourceCommandInput, ListTagsForResourceCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: CognitoIdentityClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[ListTagsForResourceCommandInput, ListTagsForResourceCommandOutput] = js.native
    
    /* private */ var serialize: Any = js.native
  }
  
  type ListTagsForResourceCommandInput = ListTagsForResourceInput
  
  trait ListTagsForResourceCommandOutput
    extends StObject
       with ListTagsForResourceResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object ListTagsForResourceCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): ListTagsForResourceCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListTagsForResourceCommandOutput]
    }
  }
}
