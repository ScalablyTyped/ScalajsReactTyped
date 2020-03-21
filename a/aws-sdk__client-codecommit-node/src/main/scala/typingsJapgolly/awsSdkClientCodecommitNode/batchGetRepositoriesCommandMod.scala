package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsJapgolly.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesBatchGetRepositoriesInputMod.BatchGetRepositoriesInput
import typingsJapgolly.awsSdkClientCodecommitNode.typesBatchGetRepositoriesOutputMod.BatchGetRepositoriesOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/BatchGetRepositoriesCommand", JSImport.Namespace)
@js.native
object batchGetRepositoriesCommandMod extends js.Object {
  @js.native
  class BatchGetRepositoriesCommand protected () extends Command[
          InputTypesUnion, 
          BatchGetRepositoriesInput, 
          OutputTypesUnion, 
          BatchGetRepositoriesOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: BatchGetRepositoriesInput) = this()
    /* CompleteClass */
    override val input: BatchGetRepositoriesInput = js.native
    val middlewareStack: MiddlewareStack[BatchGetRepositoriesInput, BatchGetRepositoriesOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[BatchGetRepositoriesInput, BatchGetRepositoriesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[BatchGetRepositoriesInput, BatchGetRepositoriesOutput] = js.native
  }
  
}

