package typingsJapgolly.awsSdkClientKmsNode

import typingsJapgolly.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typingsJapgolly.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientKmsNode.typesDeleteAliasInputMod.DeleteAliasInput
import typingsJapgolly.awsSdkClientKmsNode.typesDeleteAliasOutputMod.DeleteAliasOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/DeleteAliasCommand", JSImport.Namespace)
@js.native
object deleteAliasCommandMod extends js.Object {
  @js.native
  class DeleteAliasCommand protected () extends Command[
          InputTypesUnion, 
          DeleteAliasInput, 
          OutputTypesUnion, 
          DeleteAliasOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteAliasInput) = this()
    /* CompleteClass */
    override val input: DeleteAliasInput = js.native
    val middlewareStack: MiddlewareStack[DeleteAliasInput, DeleteAliasOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[DeleteAliasInput, DeleteAliasOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[DeleteAliasInput, DeleteAliasOutput] = js.native
  }
  
}

