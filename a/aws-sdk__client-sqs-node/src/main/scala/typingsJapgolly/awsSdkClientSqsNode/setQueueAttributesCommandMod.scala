package typingsJapgolly.awsSdkClientSqsNode

import typingsJapgolly.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typingsJapgolly.awsSdkClientSqsNode.typesSetQueueAttributesInputMod.SetQueueAttributesInput
import typingsJapgolly.awsSdkClientSqsNode.typesSetQueueAttributesOutputMod.SetQueueAttributesOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/SetQueueAttributesCommand", JSImport.Namespace)
@js.native
object setQueueAttributesCommandMod extends js.Object {
  @js.native
  class SetQueueAttributesCommand protected () extends Command[
          InputTypesUnion, 
          SetQueueAttributesInput, 
          OutputTypesUnion, 
          SetQueueAttributesOutput, 
          SQSResolvedConfiguration, 
          Readable
        ] {
    def this(input: SetQueueAttributesInput) = this()
    /* CompleteClass */
    override val input: SetQueueAttributesInput = js.native
    val middlewareStack: MiddlewareStack[SetQueueAttributesInput, SetQueueAttributesOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[SetQueueAttributesInput, SetQueueAttributesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[SetQueueAttributesInput, SetQueueAttributesOutput] = js.native
  }
  
}

