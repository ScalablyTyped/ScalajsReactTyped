package typingsJapgolly.awsSdkClientSqsNode

import typingsJapgolly.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typingsJapgolly.awsSdkClientSqsNode.typesUntagQueueInputMod.UntagQueueInput
import typingsJapgolly.awsSdkClientSqsNode.typesUntagQueueOutputMod.UntagQueueOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/UntagQueueCommand", JSImport.Namespace)
@js.native
object untagQueueCommandMod extends js.Object {
  @js.native
  class UntagQueueCommand protected () extends Command[
          InputTypesUnion, 
          UntagQueueInput, 
          OutputTypesUnion, 
          UntagQueueOutput, 
          SQSResolvedConfiguration, 
          Readable
        ] {
    def this(input: UntagQueueInput) = this()
    /* CompleteClass */
    override val input: UntagQueueInput = js.native
    val middlewareStack: MiddlewareStack[UntagQueueInput, UntagQueueOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[UntagQueueInput, UntagQueueOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[UntagQueueInput, UntagQueueOutput] = js.native
  }
  
}

