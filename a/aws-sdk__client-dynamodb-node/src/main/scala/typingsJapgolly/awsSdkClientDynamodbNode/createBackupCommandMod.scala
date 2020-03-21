package typingsJapgolly.awsSdkClientDynamodbNode

import typingsJapgolly.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsJapgolly.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbNode.typesCreateBackupInputMod.CreateBackupInput
import typingsJapgolly.awsSdkClientDynamodbNode.typesCreateBackupOutputMod.CreateBackupOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/CreateBackupCommand", JSImport.Namespace)
@js.native
object createBackupCommandMod extends js.Object {
  @js.native
  class CreateBackupCommand protected () extends Command[
          InputTypesUnion, 
          CreateBackupInput, 
          OutputTypesUnion, 
          CreateBackupOutput, 
          DynamoDBResolvedConfiguration, 
          Readable
        ] {
    def this(input: CreateBackupInput) = this()
    /* CompleteClass */
    override val input: CreateBackupInput = js.native
    val middlewareStack: MiddlewareStack[CreateBackupInput, CreateBackupOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[CreateBackupInput, CreateBackupOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[CreateBackupInput, CreateBackupOutput] = js.native
  }
  
}

