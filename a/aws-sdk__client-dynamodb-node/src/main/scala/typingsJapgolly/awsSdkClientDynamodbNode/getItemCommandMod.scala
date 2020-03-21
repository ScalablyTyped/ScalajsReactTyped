package typingsJapgolly.awsSdkClientDynamodbNode

import typingsJapgolly.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsJapgolly.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbNode.typesGetItemInputMod.GetItemInput
import typingsJapgolly.awsSdkClientDynamodbNode.typesGetItemOutputMod.GetItemOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/GetItemCommand", JSImport.Namespace)
@js.native
object getItemCommandMod extends js.Object {
  @js.native
  class GetItemCommand protected () extends Command[
          InputTypesUnion, 
          GetItemInput, 
          OutputTypesUnion, 
          GetItemOutput, 
          DynamoDBResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetItemInput) = this()
    /* CompleteClass */
    override val input: GetItemInput = js.native
    val middlewareStack: MiddlewareStack[GetItemInput, GetItemOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[GetItemInput, GetItemOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[GetItemInput, GetItemOutput] = js.native
  }
  
}

