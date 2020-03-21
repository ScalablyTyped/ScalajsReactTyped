package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsJapgolly.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesGetCommentsForPullRequestInputMod.GetCommentsForPullRequestInput
import typingsJapgolly.awsSdkClientCodecommitNode.typesGetCommentsForPullRequestOutputMod.GetCommentsForPullRequestOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/GetCommentsForPullRequestCommand", JSImport.Namespace)
@js.native
object getCommentsForPullRequestCommandMod extends js.Object {
  @js.native
  class GetCommentsForPullRequestCommand protected () extends Command[
          InputTypesUnion, 
          GetCommentsForPullRequestInput, 
          OutputTypesUnion, 
          GetCommentsForPullRequestOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetCommentsForPullRequestInput) = this()
    /* CompleteClass */
    override val input: GetCommentsForPullRequestInput = js.native
    val middlewareStack: MiddlewareStack[GetCommentsForPullRequestInput, GetCommentsForPullRequestOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetCommentsForPullRequestInput, GetCommentsForPullRequestOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetCommentsForPullRequestInput, GetCommentsForPullRequestOutput] = js.native
  }
  
}

