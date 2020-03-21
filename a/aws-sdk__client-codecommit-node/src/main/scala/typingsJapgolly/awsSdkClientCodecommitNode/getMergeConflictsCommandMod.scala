package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsJapgolly.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesGetMergeConflictsInputMod.GetMergeConflictsInput
import typingsJapgolly.awsSdkClientCodecommitNode.typesGetMergeConflictsOutputMod.GetMergeConflictsOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/GetMergeConflictsCommand", JSImport.Namespace)
@js.native
object getMergeConflictsCommandMod extends js.Object {
  @js.native
  class GetMergeConflictsCommand protected () extends Command[
          InputTypesUnion, 
          GetMergeConflictsInput, 
          OutputTypesUnion, 
          GetMergeConflictsOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetMergeConflictsInput) = this()
    /* CompleteClass */
    override val input: GetMergeConflictsInput = js.native
    val middlewareStack: MiddlewareStack[GetMergeConflictsInput, GetMergeConflictsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetMergeConflictsInput, GetMergeConflictsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetMergeConflictsInput, GetMergeConflictsOutput] = js.native
  }
  
}

