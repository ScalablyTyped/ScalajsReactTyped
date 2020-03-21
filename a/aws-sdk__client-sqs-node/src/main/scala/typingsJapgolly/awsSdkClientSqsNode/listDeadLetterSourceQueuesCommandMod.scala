package typingsJapgolly.awsSdkClientSqsNode

import typingsJapgolly.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typingsJapgolly.awsSdkClientSqsNode.typesListDeadLetterSourceQueuesInputMod.ListDeadLetterSourceQueuesInput
import typingsJapgolly.awsSdkClientSqsNode.typesListDeadLetterSourceQueuesOutputMod.ListDeadLetterSourceQueuesOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/ListDeadLetterSourceQueuesCommand", JSImport.Namespace)
@js.native
object listDeadLetterSourceQueuesCommandMod extends js.Object {
  @js.native
  class ListDeadLetterSourceQueuesCommand protected () extends Command[
          InputTypesUnion, 
          ListDeadLetterSourceQueuesInput, 
          OutputTypesUnion, 
          ListDeadLetterSourceQueuesOutput, 
          SQSResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListDeadLetterSourceQueuesInput) = this()
    /* CompleteClass */
    override val input: ListDeadLetterSourceQueuesInput = js.native
    val middlewareStack: MiddlewareStack[ListDeadLetterSourceQueuesInput, ListDeadLetterSourceQueuesOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[ListDeadLetterSourceQueuesInput, ListDeadLetterSourceQueuesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[ListDeadLetterSourceQueuesInput, ListDeadLetterSourceQueuesOutput] = js.native
  }
  
}

