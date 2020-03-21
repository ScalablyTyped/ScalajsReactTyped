package typingsJapgolly.awsSdkClientDynamodbNode

import typingsJapgolly.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsJapgolly.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbNode.typesUpdateContinuousBackupsInputMod.UpdateContinuousBackupsInput
import typingsJapgolly.awsSdkClientDynamodbNode.typesUpdateContinuousBackupsOutputMod.UpdateContinuousBackupsOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/UpdateContinuousBackupsCommand", JSImport.Namespace)
@js.native
object updateContinuousBackupsCommandMod extends js.Object {
  @js.native
  class UpdateContinuousBackupsCommand protected () extends Command[
          InputTypesUnion, 
          UpdateContinuousBackupsInput, 
          OutputTypesUnion, 
          UpdateContinuousBackupsOutput, 
          DynamoDBResolvedConfiguration, 
          Readable
        ] {
    def this(input: UpdateContinuousBackupsInput) = this()
    /* CompleteClass */
    override val input: UpdateContinuousBackupsInput = js.native
    val middlewareStack: MiddlewareStack[UpdateContinuousBackupsInput, UpdateContinuousBackupsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[UpdateContinuousBackupsInput, UpdateContinuousBackupsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[UpdateContinuousBackupsInput, UpdateContinuousBackupsOutput] = js.native
  }
  
}

