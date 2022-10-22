package typingsJapgolly.awsSdkClientSts

import typingsJapgolly.awsSdkClientSts.distTypesModelsModels0Mod.GetFederationTokenRequest
import typingsJapgolly.awsSdkClientSts.distTypesModelsModels0Mod.GetFederationTokenResponse
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

object distTypesCommandsGetFederationTokenCommandMod {
  
  @JSImport("@aws-sdk/client-sts/dist-types/commands/GetFederationTokenCommand", "GetFederationTokenCommand")
  @js.native
  open class GetFederationTokenCommand protected () extends Command[
          GetFederationTokenCommandInput, 
          GetFederationTokenCommandOutput, 
          STSClientResolvedConfig, 
          Any, 
          Any
        ] {
    def this(input: GetFederationTokenCommandInput) = this()
    
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: STSClientResolvedConfig
    ): Handler[GetFederationTokenCommandInput, GetFederationTokenCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: STSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[GetFederationTokenCommandInput, GetFederationTokenCommandOutput] = js.native
    
    /* private */ var serialize: Any = js.native
  }
  
  type GetFederationTokenCommandInput = GetFederationTokenRequest
  
  trait GetFederationTokenCommandOutput
    extends StObject
       with GetFederationTokenResponse
       with MetadataBearer
       with ServiceOutputTypes
  object GetFederationTokenCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): GetFederationTokenCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetFederationTokenCommandOutput]
    }
  }
}
