package typingsJapgolly.awsSdkClientGlacierNode

import typingsJapgolly.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsJapgolly.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientGlacierNode.typesListTagsForVaultInputMod.ListTagsForVaultInput
import typingsJapgolly.awsSdkClientGlacierNode.typesListTagsForVaultOutputMod.ListTagsForVaultOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/ListTagsForVaultCommand", JSImport.Namespace)
@js.native
object listTagsForVaultCommandMod extends js.Object {
  @js.native
  class ListTagsForVaultCommand protected () extends Command[
          InputTypesUnion, 
          ListTagsForVaultInput, 
          OutputTypesUnion, 
          ListTagsForVaultOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListTagsForVaultInput) = this()
    /* CompleteClass */
    override val input: ListTagsForVaultInput = js.native
    val middlewareStack: MiddlewareStack[ListTagsForVaultInput, ListTagsForVaultOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[ListTagsForVaultInput, ListTagsForVaultOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[ListTagsForVaultInput, ListTagsForVaultOutput] = js.native
  }
  
}

