package typingsJapgolly.awsSdkClientSts

import typingsJapgolly.awsSdkClientSts.distTypesModelsModels0Mod.GetSessionTokenRequest
import typingsJapgolly.awsSdkClientSts.distTypesModelsModels0Mod.GetSessionTokenResponse
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

object distTypesCommandsGetSessionTokenCommandMod {
  
  @JSImport("@aws-sdk/client-sts/dist-types/commands/GetSessionTokenCommand", "GetSessionTokenCommand")
  @js.native
  open class GetSessionTokenCommand protected () extends Command[
          GetSessionTokenCommandInput, 
          GetSessionTokenCommandOutput, 
          STSClientResolvedConfig, 
          Any, 
          Any
        ] {
    def this(input: GetSessionTokenCommandInput) = this()
    
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: STSClientResolvedConfig
    ): Handler[GetSessionTokenCommandInput, GetSessionTokenCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: STSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[GetSessionTokenCommandInput, GetSessionTokenCommandOutput] = js.native
    
    /* private */ var serialize: Any = js.native
  }
  
  type GetSessionTokenCommandInput = GetSessionTokenRequest
  
  trait GetSessionTokenCommandOutput
    extends StObject
       with GetSessionTokenResponse
       with MetadataBearer
       with ServiceOutputTypes
  object GetSessionTokenCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): GetSessionTokenCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetSessionTokenCommandOutput]
    }
  }
}
