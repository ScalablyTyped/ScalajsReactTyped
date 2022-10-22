package typingsJapgolly.awsSdkClientGlacierNode

import typingsJapgolly.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsJapgolly.awsSdkClientGlacierNode.typesDeleteVaultNotificationsInputMod.DeleteVaultNotificationsInput
import typingsJapgolly.awsSdkClientGlacierNode.typesDeleteVaultNotificationsOutputMod.DeleteVaultNotificationsOutput
import typingsJapgolly.awsSdkClientGlacierNode.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientGlacierNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDeleteVaultNotificationsCommandMod {
  
  @JSImport("@aws-sdk/client-glacier-node/commands/DeleteVaultNotificationsCommand", "DeleteVaultNotificationsCommand")
  @js.native
  open class DeleteVaultNotificationsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DeleteVaultNotificationsInput, 
          OutputTypesUnion, 
          DeleteVaultNotificationsOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: DeleteVaultNotificationsInput) = this()
    
    /* CompleteClass */
    override val input: DeleteVaultNotificationsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DeleteVaultNotificationsInput, DeleteVaultNotificationsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[DeleteVaultNotificationsInput, DeleteVaultNotificationsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: GlacierResolvedConfiguration,
      options: Any
    ): Handler[DeleteVaultNotificationsInput, DeleteVaultNotificationsOutput] = js.native
  }
}
