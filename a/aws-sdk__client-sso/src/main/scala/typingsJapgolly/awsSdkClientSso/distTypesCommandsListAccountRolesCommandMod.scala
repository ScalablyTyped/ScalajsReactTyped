package typingsJapgolly.awsSdkClientSso

import typingsJapgolly.awsSdkClientSso.distTypesModelsModels0Mod.ListAccountRolesRequest
import typingsJapgolly.awsSdkClientSso.distTypesModelsModels0Mod.ListAccountRolesResponse
import typingsJapgolly.awsSdkClientSso.distTypesSsoclientMod.SSOClientResolvedConfig
import typingsJapgolly.awsSdkClientSso.distTypesSsoclientMod.ServiceInputTypes
import typingsJapgolly.awsSdkClientSso.distTypesSsoclientMod.ServiceOutputTypes
import typingsJapgolly.awsSdkClientSso.distTypesSsoclientMod._ServiceOutputTypes
import typingsJapgolly.awsSdkSmithyClient.mod.Command
import typingsJapgolly.awsSdkTypes.distTypesHttpMod.HttpHandlerOptions
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.MetadataBearer
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.ResponseMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCommandsListAccountRolesCommandMod {
  
  @JSImport("@aws-sdk/client-sso/dist-types/commands/ListAccountRolesCommand", "ListAccountRolesCommand")
  @js.native
  open class ListAccountRolesCommand protected () extends Command[
          ListAccountRolesCommandInput, 
          ListAccountRolesCommandOutput, 
          SSOClientResolvedConfig, 
          Any, 
          Any
        ] {
    def this(input: ListAccountRolesCommandInput) = this()
    
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: SSOClientResolvedConfig
    ): Handler[ListAccountRolesCommandInput, ListAccountRolesCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: SSOClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[ListAccountRolesCommandInput, ListAccountRolesCommandOutput] = js.native
    
    /* private */ var serialize: Any = js.native
  }
  
  type ListAccountRolesCommandInput = ListAccountRolesRequest
  
  trait ListAccountRolesCommandOutput
    extends StObject
       with ListAccountRolesResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object ListAccountRolesCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): ListAccountRolesCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListAccountRolesCommandOutput]
    }
  }
}
