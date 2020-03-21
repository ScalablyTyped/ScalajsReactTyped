package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsJapgolly.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesGetPullRequestInputMod.GetPullRequestInput
import typingsJapgolly.awsSdkClientCodecommitNode.typesGetPullRequestOutputMod.GetPullRequestOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/GetPullRequestCommand", JSImport.Namespace)
@js.native
object getPullRequestCommandMod extends js.Object {
  @js.native
  class GetPullRequestCommand protected () extends Command[
          InputTypesUnion, 
          GetPullRequestInput, 
          OutputTypesUnion, 
          GetPullRequestOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetPullRequestInput) = this()
    /* CompleteClass */
    override val input: GetPullRequestInput = js.native
    val middlewareStack: MiddlewareStack[GetPullRequestInput, GetPullRequestOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetPullRequestInput, GetPullRequestOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetPullRequestInput, GetPullRequestOutput] = js.native
  }
  
}

