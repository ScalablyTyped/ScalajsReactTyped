package typingsJapgolly.awsSdkClientDynamodbBrowser

import typingsJapgolly.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsJapgolly.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesUpdateTableInputMod.UpdateTableInput
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesUpdateTableOutputMod.UpdateTableOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/UpdateTableCommand", JSImport.Namespace)
@js.native
object updateTableCommandMod extends js.Object {
  @js.native
  class UpdateTableCommand protected () extends Command[
          InputTypesUnion, 
          UpdateTableInput, 
          OutputTypesUnion, 
          UpdateTableOutput, 
          DynamoDBResolvedConfiguration, 
          Blob
        ] {
    def this(input: UpdateTableInput) = this()
    /* CompleteClass */
    override val input: UpdateTableInput = js.native
    val middlewareStack: MiddlewareStack[UpdateTableInput, UpdateTableOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[UpdateTableInput, UpdateTableOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[UpdateTableInput, UpdateTableOutput] = js.native
  }
  
}

