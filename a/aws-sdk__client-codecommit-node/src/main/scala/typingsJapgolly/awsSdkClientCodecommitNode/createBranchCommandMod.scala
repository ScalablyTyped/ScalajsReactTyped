package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsJapgolly.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesCreateBranchInputMod.CreateBranchInput
import typingsJapgolly.awsSdkClientCodecommitNode.typesCreateBranchOutputMod.CreateBranchOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/CreateBranchCommand", JSImport.Namespace)
@js.native
object createBranchCommandMod extends js.Object {
  @js.native
  class CreateBranchCommand protected () extends Command[
          InputTypesUnion, 
          CreateBranchInput, 
          OutputTypesUnion, 
          CreateBranchOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: CreateBranchInput) = this()
    /* CompleteClass */
    override val input: CreateBranchInput = js.native
    val middlewareStack: MiddlewareStack[CreateBranchInput, CreateBranchOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[CreateBranchInput, CreateBranchOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[CreateBranchInput, CreateBranchOutput] = js.native
  }
  
}

