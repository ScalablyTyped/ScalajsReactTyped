package typingsJapgolly.awsSdkClientSqsNode

import typingsJapgolly.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typingsJapgolly.awsSdkClientSqsNode.typesGetQueueUrlInputMod.GetQueueUrlInput
import typingsJapgolly.awsSdkClientSqsNode.typesGetQueueUrlOutputMod.GetQueueUrlOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/GetQueueUrlCommand", JSImport.Namespace)
@js.native
object getQueueUrlCommandMod extends js.Object {
  @js.native
  class GetQueueUrlCommand protected () extends Command[
          InputTypesUnion, 
          GetQueueUrlInput, 
          OutputTypesUnion, 
          GetQueueUrlOutput, 
          SQSResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetQueueUrlInput) = this()
    /* CompleteClass */
    override val input: GetQueueUrlInput = js.native
    val middlewareStack: MiddlewareStack[GetQueueUrlInput, GetQueueUrlOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[GetQueueUrlInput, GetQueueUrlOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[GetQueueUrlInput, GetQueueUrlOutput] = js.native
  }
  
}

