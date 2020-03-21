package typingsJapgolly.awsSdkClientSqsNode

import typingsJapgolly.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typingsJapgolly.awsSdkClientSqsNode.typesDeleteMessageInputMod.DeleteMessageInput
import typingsJapgolly.awsSdkClientSqsNode.typesDeleteMessageOutputMod.DeleteMessageOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/DeleteMessageCommand", JSImport.Namespace)
@js.native
object deleteMessageCommandMod extends js.Object {
  @js.native
  class DeleteMessageCommand protected () extends Command[
          InputTypesUnion, 
          DeleteMessageInput, 
          OutputTypesUnion, 
          DeleteMessageOutput, 
          SQSResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteMessageInput) = this()
    /* CompleteClass */
    override val input: DeleteMessageInput = js.native
    val middlewareStack: MiddlewareStack[DeleteMessageInput, DeleteMessageOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[DeleteMessageInput, DeleteMessageOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[DeleteMessageInput, DeleteMessageOutput] = js.native
  }
  
}

