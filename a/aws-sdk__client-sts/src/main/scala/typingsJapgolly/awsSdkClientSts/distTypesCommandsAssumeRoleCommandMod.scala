package typingsJapgolly.awsSdkClientSts

import typingsJapgolly.awsSdkClientSts.distTypesModelsModels0Mod.AssumeRoleRequest
import typingsJapgolly.awsSdkClientSts.distTypesModelsModels0Mod.AssumeRoleResponse
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

object distTypesCommandsAssumeRoleCommandMod {
  
  @JSImport("@aws-sdk/client-sts/dist-types/commands/AssumeRoleCommand", "AssumeRoleCommand")
  @js.native
  open class AssumeRoleCommand protected () extends Command[AssumeRoleCommandInput, AssumeRoleCommandOutput, STSClientResolvedConfig, Any, Any] {
    def this(input: AssumeRoleCommandInput) = this()
    
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: STSClientResolvedConfig
    ): Handler[AssumeRoleCommandInput, AssumeRoleCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: STSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[AssumeRoleCommandInput, AssumeRoleCommandOutput] = js.native
    
    /* private */ var serialize: Any = js.native
  }
  
  type AssumeRoleCommandInput = AssumeRoleRequest
  
  trait AssumeRoleCommandOutput
    extends StObject
       with AssumeRoleResponse
       with MetadataBearer
       with ServiceOutputTypes
  object AssumeRoleCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): AssumeRoleCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssumeRoleCommandOutput]
    }
  }
}
