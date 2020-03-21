package typingsJapgolly.awsSdkClientGlacierNode

import typingsJapgolly.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsJapgolly.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientGlacierNode.typesDeleteVaultNotificationsInputMod.DeleteVaultNotificationsInput
import typingsJapgolly.awsSdkClientGlacierNode.typesDeleteVaultNotificationsOutputMod.DeleteVaultNotificationsOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/DeleteVaultNotificationsCommand", JSImport.Namespace)
@js.native
object deleteVaultNotificationsCommandMod extends js.Object {
  @js.native
  class DeleteVaultNotificationsCommand protected () extends Command[
          InputTypesUnion, 
          DeleteVaultNotificationsInput, 
          OutputTypesUnion, 
          DeleteVaultNotificationsOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteVaultNotificationsInput) = this()
    /* CompleteClass */
    override val input: DeleteVaultNotificationsInput = js.native
    val middlewareStack: MiddlewareStack[DeleteVaultNotificationsInput, DeleteVaultNotificationsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[DeleteVaultNotificationsInput, DeleteVaultNotificationsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[DeleteVaultNotificationsInput, DeleteVaultNotificationsOutput] = js.native
  }
  
}

