package typingsJapgolly.awsSdkClientDynamodbBrowser

import typingsJapgolly.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsJapgolly.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesDeleteBackupInputMod.DeleteBackupInput
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesDeleteBackupOutputMod.DeleteBackupOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/DeleteBackupCommand", JSImport.Namespace)
@js.native
object deleteBackupCommandMod extends js.Object {
  @js.native
  class DeleteBackupCommand protected () extends Command[
          InputTypesUnion, 
          DeleteBackupInput, 
          OutputTypesUnion, 
          DeleteBackupOutput, 
          DynamoDBResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteBackupInput) = this()
    /* CompleteClass */
    override val input: DeleteBackupInput = js.native
    val middlewareStack: MiddlewareStack[DeleteBackupInput, DeleteBackupOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DeleteBackupInput, DeleteBackupOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DeleteBackupInput, DeleteBackupOutput] = js.native
  }
  
}

