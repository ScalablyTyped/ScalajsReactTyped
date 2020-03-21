package typingsJapgolly.awsSdkClientDynamodbNode

import typingsJapgolly.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsJapgolly.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbNode.typesRestoreTableFromBackupInputMod.RestoreTableFromBackupInput
import typingsJapgolly.awsSdkClientDynamodbNode.typesRestoreTableFromBackupOutputMod.RestoreTableFromBackupOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/RestoreTableFromBackupCommand", JSImport.Namespace)
@js.native
object restoreTableFromBackupCommandMod extends js.Object {
  @js.native
  class RestoreTableFromBackupCommand protected () extends Command[
          InputTypesUnion, 
          RestoreTableFromBackupInput, 
          OutputTypesUnion, 
          RestoreTableFromBackupOutput, 
          DynamoDBResolvedConfiguration, 
          Readable
        ] {
    def this(input: RestoreTableFromBackupInput) = this()
    /* CompleteClass */
    override val input: RestoreTableFromBackupInput = js.native
    val middlewareStack: MiddlewareStack[RestoreTableFromBackupInput, RestoreTableFromBackupOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[RestoreTableFromBackupInput, RestoreTableFromBackupOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[RestoreTableFromBackupInput, RestoreTableFromBackupOutput] = js.native
  }
  
}

