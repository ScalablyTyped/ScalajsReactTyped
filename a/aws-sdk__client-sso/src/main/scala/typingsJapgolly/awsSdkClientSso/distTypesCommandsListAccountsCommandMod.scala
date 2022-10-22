package typingsJapgolly.awsSdkClientSso

import typingsJapgolly.awsSdkClientSso.distTypesModelsModels0Mod.ListAccountsRequest
import typingsJapgolly.awsSdkClientSso.distTypesModelsModels0Mod.ListAccountsResponse
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

object distTypesCommandsListAccountsCommandMod {
  
  @JSImport("@aws-sdk/client-sso/dist-types/commands/ListAccountsCommand", "ListAccountsCommand")
  @js.native
  open class ListAccountsCommand protected () extends Command[ListAccountsCommandInput, ListAccountsCommandOutput, SSOClientResolvedConfig, Any, Any] {
    def this(input: ListAccountsCommandInput) = this()
    
    /* private */ var deserialize: Any = js.native
    
    /**
      * @internal
      */
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: SSOClientResolvedConfig
    ): Handler[ListAccountsCommandInput, ListAccountsCommandOutput] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[ServiceInputTypes, ServiceOutputTypes],
      configuration: SSOClientResolvedConfig,
      options: HttpHandlerOptions
    ): Handler[ListAccountsCommandInput, ListAccountsCommandOutput] = js.native
    
    /* private */ var serialize: Any = js.native
  }
  
  type ListAccountsCommandInput = ListAccountsRequest
  
  trait ListAccountsCommandOutput
    extends StObject
       with ListAccountsResponse
       with MetadataBearer
       with _ServiceOutputTypes
  object ListAccountsCommandOutput {
    
    inline def apply($metadata: ResponseMetadata): ListAccountsCommandOutput = {
      val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListAccountsCommandOutput]
    }
  }
}
