package typingsJapgolly.awsSdkClientSts

import typingsJapgolly.awsSdkClientSts.distTypesModelsModels0Mod.AssumeRoleWithSAMLRequest
import typingsJapgolly.awsSdkClientSts.distTypesModelsModels0Mod.AssumeRoleWithSAMLResponse
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

object distTypesCommandsAssumeRoleWithSAMLCommandMod {
  
  @JSImport("@aws-sdk/client-sts/dist-types/commands/AssumeRoleWithSAMLCommand", "AssumeRoleWithSAMLCommand")
  @js.native
  open class AssumeRoleWithSAMLCommand protected () extends Command[
          AssumeRoleWithSAMLCommandInput, 
          AssumeRoleWithSAMLCommandOutput, 
          STSClientResolvedConfig, 
          Any, 
          Any
        ] {
    def this(input: AssumeRoleWithSAMLCommandInput) = this()
    
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: STSClientResolvedConfig
    ): Handler[AssumeRoleWithSAMLCommandInput, AssumeRoleWithSAMLCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: STSClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[AssumeRoleWithSAMLCommandInput, AssumeRoleWithSAMLCommandOutput] = js.native
    
    /* private */ var serialize: Any = js.native
  }
  
  type AssumeRoleWithSAMLCommandInput = AssumeRoleWithSAMLRequest
  
  trait AssumeRoleWithSAMLCommandOutput
    extends StObject
       with AssumeRoleWithSAMLResponse
       with MetadataBearer
       with ServiceOutputTypes
  object AssumeRoleWithSAMLCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): AssumeRoleWithSAMLCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssumeRoleWithSAMLCommandOutput]
    }
  }
}
