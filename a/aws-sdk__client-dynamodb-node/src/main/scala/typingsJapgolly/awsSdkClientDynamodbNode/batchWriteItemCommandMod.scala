package typingsJapgolly.awsSdkClientDynamodbNode

import typingsJapgolly.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsJapgolly.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbNode.typesBatchWriteItemInputMod.BatchWriteItemInput
import typingsJapgolly.awsSdkClientDynamodbNode.typesBatchWriteItemOutputMod.BatchWriteItemOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/BatchWriteItemCommand", JSImport.Namespace)
@js.native
object batchWriteItemCommandMod extends js.Object {
  @js.native
  class BatchWriteItemCommand protected () extends Command[
          InputTypesUnion, 
          BatchWriteItemInput, 
          OutputTypesUnion, 
          BatchWriteItemOutput, 
          DynamoDBResolvedConfiguration, 
          Readable
        ] {
    def this(input: BatchWriteItemInput) = this()
    /* CompleteClass */
    override val input: BatchWriteItemInput = js.native
    val middlewareStack: MiddlewareStack[BatchWriteItemInput, BatchWriteItemOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[BatchWriteItemInput, BatchWriteItemOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[BatchWriteItemInput, BatchWriteItemOutput] = js.native
  }
  
}

