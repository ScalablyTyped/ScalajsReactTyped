package typingsJapgolly.awsSdkClientSqsNode

import typingsJapgolly.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typingsJapgolly.awsSdkClientSqsNode.typesGetQueueAttributesInputMod.GetQueueAttributesInput
import typingsJapgolly.awsSdkClientSqsNode.typesGetQueueAttributesOutputMod.GetQueueAttributesOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/GetQueueAttributesCommand", JSImport.Namespace)
@js.native
object getQueueAttributesCommandMod extends js.Object {
  @js.native
  class GetQueueAttributesCommand protected () extends Command[
          InputTypesUnion, 
          GetQueueAttributesInput, 
          OutputTypesUnion, 
          GetQueueAttributesOutput, 
          SQSResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetQueueAttributesInput) = this()
    /* CompleteClass */
    override val input: GetQueueAttributesInput = js.native
    val middlewareStack: MiddlewareStack[GetQueueAttributesInput, GetQueueAttributesOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[GetQueueAttributesInput, GetQueueAttributesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[GetQueueAttributesInput, GetQueueAttributesOutput] = js.native
  }
  
}

