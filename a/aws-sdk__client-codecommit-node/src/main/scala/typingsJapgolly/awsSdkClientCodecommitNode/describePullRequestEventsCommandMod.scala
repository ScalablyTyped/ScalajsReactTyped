package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsJapgolly.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesDescribePullRequestEventsInputMod.DescribePullRequestEventsInput
import typingsJapgolly.awsSdkClientCodecommitNode.typesDescribePullRequestEventsOutputMod.DescribePullRequestEventsOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/DescribePullRequestEventsCommand", JSImport.Namespace)
@js.native
object describePullRequestEventsCommandMod extends js.Object {
  @js.native
  class DescribePullRequestEventsCommand protected () extends Command[
          InputTypesUnion, 
          DescribePullRequestEventsInput, 
          OutputTypesUnion, 
          DescribePullRequestEventsOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: DescribePullRequestEventsInput) = this()
    /* CompleteClass */
    override val input: DescribePullRequestEventsInput = js.native
    val middlewareStack: MiddlewareStack[DescribePullRequestEventsInput, DescribePullRequestEventsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[DescribePullRequestEventsInput, DescribePullRequestEventsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[DescribePullRequestEventsInput, DescribePullRequestEventsOutput] = js.native
  }
  
}

