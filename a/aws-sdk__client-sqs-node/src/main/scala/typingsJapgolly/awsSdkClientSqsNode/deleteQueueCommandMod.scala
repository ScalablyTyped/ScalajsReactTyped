package typingsJapgolly.awsSdkClientSqsNode

import typingsJapgolly.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typingsJapgolly.awsSdkClientSqsNode.typesDeleteQueueInputMod.DeleteQueueInput
import typingsJapgolly.awsSdkClientSqsNode.typesDeleteQueueOutputMod.DeleteQueueOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/DeleteQueueCommand", JSImport.Namespace)
@js.native
object deleteQueueCommandMod extends js.Object {
  @js.native
  class DeleteQueueCommand protected () extends Command[
          InputTypesUnion, 
          DeleteQueueInput, 
          OutputTypesUnion, 
          DeleteQueueOutput, 
          SQSResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteQueueInput) = this()
    /* CompleteClass */
    override val input: DeleteQueueInput = js.native
    val middlewareStack: MiddlewareStack[DeleteQueueInput, DeleteQueueOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[DeleteQueueInput, DeleteQueueOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[DeleteQueueInput, DeleteQueueOutput] = js.native
  }
  
}

