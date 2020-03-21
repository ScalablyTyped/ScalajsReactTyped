package typingsJapgolly.awsSdkClientSqsNode

import typingsJapgolly.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typingsJapgolly.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchInputMod.ChangeMessageVisibilityBatchInput
import typingsJapgolly.awsSdkClientSqsNode.typesChangeMessageVisibilityBatchOutputMod.ChangeMessageVisibilityBatchOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/ChangeMessageVisibilityBatchCommand", JSImport.Namespace)
@js.native
object changeMessageVisibilityBatchCommandMod extends js.Object {
  @js.native
  class ChangeMessageVisibilityBatchCommand protected () extends Command[
          InputTypesUnion, 
          ChangeMessageVisibilityBatchInput, 
          OutputTypesUnion, 
          ChangeMessageVisibilityBatchOutput, 
          SQSResolvedConfiguration, 
          Readable
        ] {
    def this(input: ChangeMessageVisibilityBatchInput) = this()
    /* CompleteClass */
    override val input: ChangeMessageVisibilityBatchInput = js.native
    val middlewareStack: MiddlewareStack[ChangeMessageVisibilityBatchInput, ChangeMessageVisibilityBatchOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[ChangeMessageVisibilityBatchInput, ChangeMessageVisibilityBatchOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[ChangeMessageVisibilityBatchInput, ChangeMessageVisibilityBatchOutput] = js.native
  }
  
}

