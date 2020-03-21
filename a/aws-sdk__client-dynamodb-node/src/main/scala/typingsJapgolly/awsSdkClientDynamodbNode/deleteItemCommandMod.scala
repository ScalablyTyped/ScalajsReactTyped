package typingsJapgolly.awsSdkClientDynamodbNode

import typingsJapgolly.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsJapgolly.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbNode.typesDeleteItemInputMod.DeleteItemInput
import typingsJapgolly.awsSdkClientDynamodbNode.typesDeleteItemOutputMod.DeleteItemOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/DeleteItemCommand", JSImport.Namespace)
@js.native
object deleteItemCommandMod extends js.Object {
  @js.native
  class DeleteItemCommand protected () extends Command[
          InputTypesUnion, 
          DeleteItemInput, 
          OutputTypesUnion, 
          DeleteItemOutput, 
          DynamoDBResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteItemInput) = this()
    /* CompleteClass */
    override val input: DeleteItemInput = js.native
    val middlewareStack: MiddlewareStack[DeleteItemInput, DeleteItemOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DeleteItemInput, DeleteItemOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DeleteItemInput, DeleteItemOutput] = js.native
  }
  
}

