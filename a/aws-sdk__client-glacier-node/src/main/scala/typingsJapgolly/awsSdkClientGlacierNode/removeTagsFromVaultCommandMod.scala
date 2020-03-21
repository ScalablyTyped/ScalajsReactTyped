package typingsJapgolly.awsSdkClientGlacierNode

import typingsJapgolly.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsJapgolly.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientGlacierNode.typesRemoveTagsFromVaultInputMod.RemoveTagsFromVaultInput
import typingsJapgolly.awsSdkClientGlacierNode.typesRemoveTagsFromVaultOutputMod.RemoveTagsFromVaultOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/RemoveTagsFromVaultCommand", JSImport.Namespace)
@js.native
object removeTagsFromVaultCommandMod extends js.Object {
  @js.native
  class RemoveTagsFromVaultCommand protected () extends Command[
          InputTypesUnion, 
          RemoveTagsFromVaultInput, 
          OutputTypesUnion, 
          RemoveTagsFromVaultOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: RemoveTagsFromVaultInput) = this()
    /* CompleteClass */
    override val input: RemoveTagsFromVaultInput = js.native
    val middlewareStack: MiddlewareStack[RemoveTagsFromVaultInput, RemoveTagsFromVaultOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[RemoveTagsFromVaultInput, RemoveTagsFromVaultOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[RemoveTagsFromVaultInput, RemoveTagsFromVaultOutput] = js.native
  }
  
}

