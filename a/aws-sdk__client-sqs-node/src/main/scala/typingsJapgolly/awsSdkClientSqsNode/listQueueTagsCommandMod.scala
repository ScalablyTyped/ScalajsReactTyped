package typingsJapgolly.awsSdkClientSqsNode

import typingsJapgolly.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typingsJapgolly.awsSdkClientSqsNode.typesListQueueTagsInputMod.ListQueueTagsInput
import typingsJapgolly.awsSdkClientSqsNode.typesListQueueTagsOutputMod.ListQueueTagsOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/ListQueueTagsCommand", JSImport.Namespace)
@js.native
object listQueueTagsCommandMod extends js.Object {
  @js.native
  class ListQueueTagsCommand protected () extends Command[
          InputTypesUnion, 
          ListQueueTagsInput, 
          OutputTypesUnion, 
          ListQueueTagsOutput, 
          SQSResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListQueueTagsInput) = this()
    /* CompleteClass */
    override val input: ListQueueTagsInput = js.native
    val middlewareStack: MiddlewareStack[ListQueueTagsInput, ListQueueTagsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[ListQueueTagsInput, ListQueueTagsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[ListQueueTagsInput, ListQueueTagsOutput] = js.native
  }
  
}

