package typingsJapgolly.awsSdkClientSqsNode

import typingsJapgolly.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typingsJapgolly.awsSdkClientSqsNode.typesReceiveMessageInputMod.ReceiveMessageInput
import typingsJapgolly.awsSdkClientSqsNode.typesReceiveMessageOutputMod.ReceiveMessageOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/ReceiveMessageCommand", JSImport.Namespace)
@js.native
object receiveMessageCommandMod extends js.Object {
  @js.native
  class ReceiveMessageCommand protected () extends Command[
          InputTypesUnion, 
          ReceiveMessageInput, 
          OutputTypesUnion, 
          ReceiveMessageOutput, 
          SQSResolvedConfiguration, 
          Readable
        ] {
    def this(input: ReceiveMessageInput) = this()
    /* CompleteClass */
    override val input: ReceiveMessageInput = js.native
    val middlewareStack: MiddlewareStack[ReceiveMessageInput, ReceiveMessageOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[ReceiveMessageInput, ReceiveMessageOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[ReceiveMessageInput, ReceiveMessageOutput] = js.native
  }
  
}

