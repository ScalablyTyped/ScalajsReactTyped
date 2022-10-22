package typingsJapgolly.awsSdkClientSts

import typingsJapgolly.awsSdkClientSts.distTypesModelsModels0Mod.GetAccessKeyInfoRequest
import typingsJapgolly.awsSdkClientSts.distTypesModelsModels0Mod.GetAccessKeyInfoResponse
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

object distTypesCommandsGetAccessKeyInfoCommandMod {
  
  @JSImport("@aws-sdk/client-sts/dist-types/commands/GetAccessKeyInfoCommand", "GetAccessKeyInfoCommand")
  @js.native
  open class GetAccessKeyInfoCommand protected () extends Command[
          GetAccessKeyInfoCommandInput, 
          GetAccessKeyInfoCommandOutput, 
          STSClientResolvedConfig, 
          Any, 
          Any
        ] {
    def this(input: GetAccessKeyInfoCommandInput) = this()
    
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: STSClientResolvedConfig
    ): Handler[GetAccessKeyInfoCommandInput, GetAccessKeyInfoCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: STSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[GetAccessKeyInfoCommandInput, GetAccessKeyInfoCommandOutput] = js.native
    
    /* private */ var serialize: Any = js.native
  }
  
  type GetAccessKeyInfoCommandInput = GetAccessKeyInfoRequest
  
  trait GetAccessKeyInfoCommandOutput
    extends StObject
       with GetAccessKeyInfoResponse
       with MetadataBearer
       with ServiceOutputTypes
  object GetAccessKeyInfoCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): GetAccessKeyInfoCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAccessKeyInfoCommandOutput]
    }
  }
}
