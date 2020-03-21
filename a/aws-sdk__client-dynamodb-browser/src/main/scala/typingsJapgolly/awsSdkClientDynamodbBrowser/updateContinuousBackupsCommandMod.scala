package typingsJapgolly.awsSdkClientDynamodbBrowser

import typingsJapgolly.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsJapgolly.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesUpdateContinuousBackupsInputMod.UpdateContinuousBackupsInput
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesUpdateContinuousBackupsOutputMod.UpdateContinuousBackupsOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/UpdateContinuousBackupsCommand", JSImport.Namespace)
@js.native
object updateContinuousBackupsCommandMod extends js.Object {
  @js.native
  class UpdateContinuousBackupsCommand protected () extends Command[
          InputTypesUnion, 
          UpdateContinuousBackupsInput, 
          OutputTypesUnion, 
          UpdateContinuousBackupsOutput, 
          DynamoDBResolvedConfiguration, 
          Blob
        ] {
    def this(input: UpdateContinuousBackupsInput) = this()
    /* CompleteClass */
    override val input: UpdateContinuousBackupsInput = js.native
    val middlewareStack: MiddlewareStack[
        UpdateContinuousBackupsInput, 
        UpdateContinuousBackupsOutput, 
        org.scalajs.dom.raw.Blob
      ] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[UpdateContinuousBackupsInput, UpdateContinuousBackupsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[UpdateContinuousBackupsInput, UpdateContinuousBackupsOutput] = js.native
  }
  
}

