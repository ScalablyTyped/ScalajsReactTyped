package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsJapgolly.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesMergePullRequestByFastForwardInputMod.MergePullRequestByFastForwardInput
import typingsJapgolly.awsSdkClientCodecommitNode.typesMergePullRequestByFastForwardOutputMod.MergePullRequestByFastForwardOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/MergePullRequestByFastForwardCommand", JSImport.Namespace)
@js.native
object mergePullRequestByFastForwardCommandMod extends js.Object {
  @js.native
  class MergePullRequestByFastForwardCommand protected () extends Command[
          InputTypesUnion, 
          MergePullRequestByFastForwardInput, 
          OutputTypesUnion, 
          MergePullRequestByFastForwardOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: MergePullRequestByFastForwardInput) = this()
    /* CompleteClass */
    override val input: MergePullRequestByFastForwardInput = js.native
    val middlewareStack: MiddlewareStack[MergePullRequestByFastForwardInput, MergePullRequestByFastForwardOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[MergePullRequestByFastForwardInput, MergePullRequestByFastForwardOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[MergePullRequestByFastForwardInput, MergePullRequestByFastForwardOutput] = js.native
  }
  
}

