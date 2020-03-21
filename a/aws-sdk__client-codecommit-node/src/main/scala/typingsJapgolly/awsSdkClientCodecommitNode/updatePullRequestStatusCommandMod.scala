package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsJapgolly.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesUpdatePullRequestStatusInputMod.UpdatePullRequestStatusInput
import typingsJapgolly.awsSdkClientCodecommitNode.typesUpdatePullRequestStatusOutputMod.UpdatePullRequestStatusOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/UpdatePullRequestStatusCommand", JSImport.Namespace)
@js.native
object updatePullRequestStatusCommandMod extends js.Object {
  @js.native
  class UpdatePullRequestStatusCommand protected () extends Command[
          InputTypesUnion, 
          UpdatePullRequestStatusInput, 
          OutputTypesUnion, 
          UpdatePullRequestStatusOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: UpdatePullRequestStatusInput) = this()
    /* CompleteClass */
    override val input: UpdatePullRequestStatusInput = js.native
    val middlewareStack: MiddlewareStack[UpdatePullRequestStatusInput, UpdatePullRequestStatusOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[UpdatePullRequestStatusInput, UpdatePullRequestStatusOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[UpdatePullRequestStatusInput, UpdatePullRequestStatusOutput] = js.native
  }
  
}

