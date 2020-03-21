package typingsJapgolly.awsSdkClientSqsNode

import typingsJapgolly.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typingsJapgolly.awsSdkClientSqsNode.typesSendMessageBatchInputMod.SendMessageBatchInput
import typingsJapgolly.awsSdkClientSqsNode.typesSendMessageBatchOutputMod.SendMessageBatchOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/SendMessageBatchCommand", JSImport.Namespace)
@js.native
object sendMessageBatchCommandMod extends js.Object {
  @js.native
  class SendMessageBatchCommand protected () extends Command[
          InputTypesUnion, 
          SendMessageBatchInput, 
          OutputTypesUnion, 
          SendMessageBatchOutput, 
          SQSResolvedConfiguration, 
          Readable
        ] {
    def this(input: SendMessageBatchInput) = this()
    /* CompleteClass */
    override val input: SendMessageBatchInput = js.native
    val middlewareStack: MiddlewareStack[SendMessageBatchInput, SendMessageBatchOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[SendMessageBatchInput, SendMessageBatchOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[SendMessageBatchInput, SendMessageBatchOutput] = js.native
  }
  
}

