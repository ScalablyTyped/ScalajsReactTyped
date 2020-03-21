package typingsJapgolly.awsSdkClientSqsNode

import typingsJapgolly.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typingsJapgolly.awsSdkClientSqsNode.typesDeleteMessageBatchInputMod.DeleteMessageBatchInput
import typingsJapgolly.awsSdkClientSqsNode.typesDeleteMessageBatchOutputMod.DeleteMessageBatchOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/DeleteMessageBatchCommand", JSImport.Namespace)
@js.native
object deleteMessageBatchCommandMod extends js.Object {
  @js.native
  class DeleteMessageBatchCommand protected () extends Command[
          InputTypesUnion, 
          DeleteMessageBatchInput, 
          OutputTypesUnion, 
          DeleteMessageBatchOutput, 
          SQSResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteMessageBatchInput) = this()
    /* CompleteClass */
    override val input: DeleteMessageBatchInput = js.native
    val middlewareStack: MiddlewareStack[DeleteMessageBatchInput, DeleteMessageBatchOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[DeleteMessageBatchInput, DeleteMessageBatchOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[DeleteMessageBatchInput, DeleteMessageBatchOutput] = js.native
  }
  
}

