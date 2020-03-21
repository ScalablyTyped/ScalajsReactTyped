package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsJapgolly.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesListBranchesInputMod.ListBranchesInput
import typingsJapgolly.awsSdkClientCodecommitNode.typesListBranchesOutputMod.ListBranchesOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/ListBranchesCommand", JSImport.Namespace)
@js.native
object listBranchesCommandMod extends js.Object {
  @js.native
  class ListBranchesCommand protected () extends Command[
          InputTypesUnion, 
          ListBranchesInput, 
          OutputTypesUnion, 
          ListBranchesOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListBranchesInput) = this()
    /* CompleteClass */
    override val input: ListBranchesInput = js.native
    val middlewareStack: MiddlewareStack[ListBranchesInput, ListBranchesOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[ListBranchesInput, ListBranchesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[ListBranchesInput, ListBranchesOutput] = js.native
  }
  
}

