package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsJapgolly.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesDeleteBranchInputMod.DeleteBranchInput
import typingsJapgolly.awsSdkClientCodecommitNode.typesDeleteBranchOutputMod.DeleteBranchOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/DeleteBranchCommand", JSImport.Namespace)
@js.native
object deleteBranchCommandMod extends js.Object {
  @js.native
  class DeleteBranchCommand protected () extends Command[
          InputTypesUnion, 
          DeleteBranchInput, 
          OutputTypesUnion, 
          DeleteBranchOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteBranchInput) = this()
    /* CompleteClass */
    override val input: DeleteBranchInput = js.native
    val middlewareStack: MiddlewareStack[DeleteBranchInput, DeleteBranchOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[DeleteBranchInput, DeleteBranchOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[DeleteBranchInput, DeleteBranchOutput] = js.native
  }
  
}

