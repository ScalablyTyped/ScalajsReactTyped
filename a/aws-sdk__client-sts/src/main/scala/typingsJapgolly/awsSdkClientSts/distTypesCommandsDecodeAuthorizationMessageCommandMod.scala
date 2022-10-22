package typingsJapgolly.awsSdkClientSts

import typingsJapgolly.awsSdkClientSts.distTypesModelsModels0Mod.DecodeAuthorizationMessageRequest
import typingsJapgolly.awsSdkClientSts.distTypesModelsModels0Mod.DecodeAuthorizationMessageResponse
import typingsJapgolly.awsSdkClientSts.distTypesStsclientMod.STSClientResolvedConfig
import typingsJapgolly.awsSdkClientSts.distTypesStsclientMod.ServiceInputTypes
import typingsJapgolly.awsSdkClientSts.distTypesStsclientMod.ServiceOutputTypes
import typingsJapgolly.awsSdkSmithyClient.mod.Command
import typingsJapgolly.awsSdkTypes.distTypesHttpMod.HttpHandlerOptions
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCommandsDecodeAuthorizationMessageCommandMod {
  
  @JSImport("@aws-sdk/client-sts/dist-types/commands/DecodeAuthorizationMessageCommand", "DecodeAuthorizationMessageCommand")
  @js.native
  open class DecodeAuthorizationMessageCommand protected () extends Command[
          DecodeAuthorizationMessageCommandInput, 
          DecodeAuthorizationMessageCommandOutput, 
          STSClientResolvedConfig, 
          Any, 
          Any
        ] {
    def this(input: DecodeAuthorizationMessageCommandInput) = this()
    
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: STSClientResolvedConfig
    ): Handler[DecodeAuthorizationMessageCommandInput, DecodeAuthorizationMessageCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: STSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[DecodeAuthorizationMessageCommandInput, DecodeAuthorizationMessageCommandOutput] = js.native
    
    /* private */ var serialize: Any = js.native
  }
  
  type DecodeAuthorizationMessageCommandInput = DecodeAuthorizationMessageRequest
  
  trait DecodeAuthorizationMessageCommandOutput
    extends StObject
       with DecodeAuthorizationMessageResponse
       with MetadataBearer
       with ServiceOutputTypes
  object DecodeAuthorizationMessageCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): DecodeAuthorizationMessageCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecodeAuthorizationMessageCommandOutput]
    }
  }
}
