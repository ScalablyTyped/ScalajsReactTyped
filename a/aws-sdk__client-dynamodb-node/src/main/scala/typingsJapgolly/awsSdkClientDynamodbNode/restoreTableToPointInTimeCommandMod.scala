package typingsJapgolly.awsSdkClientDynamodbNode

import typingsJapgolly.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsJapgolly.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbNode.typesRestoreTableToPointInTimeInputMod.RestoreTableToPointInTimeInput
import typingsJapgolly.awsSdkClientDynamodbNode.typesRestoreTableToPointInTimeOutputMod.RestoreTableToPointInTimeOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/RestoreTableToPointInTimeCommand", JSImport.Namespace)
@js.native
object restoreTableToPointInTimeCommandMod extends js.Object {
  @js.native
  class RestoreTableToPointInTimeCommand protected () extends Command[
          InputTypesUnion, 
          RestoreTableToPointInTimeInput, 
          OutputTypesUnion, 
          RestoreTableToPointInTimeOutput, 
          DynamoDBResolvedConfiguration, 
          Readable
        ] {
    def this(input: RestoreTableToPointInTimeInput) = this()
    /* CompleteClass */
    override val input: RestoreTableToPointInTimeInput = js.native
    val middlewareStack: MiddlewareStack[RestoreTableToPointInTimeInput, RestoreTableToPointInTimeOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[RestoreTableToPointInTimeInput, RestoreTableToPointInTimeOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[RestoreTableToPointInTimeInput, RestoreTableToPointInTimeOutput] = js.native
  }
  
}

