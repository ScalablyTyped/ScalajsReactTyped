package typingsJapgolly.awsSdkClientDynamodbBrowser

import typingsJapgolly.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsJapgolly.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesListBackupsInputMod.ListBackupsInput
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesListBackupsOutputMod.ListBackupsOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/ListBackupsCommand", JSImport.Namespace)
@js.native
object listBackupsCommandMod extends js.Object {
  @js.native
  class ListBackupsCommand protected () extends Command[
          InputTypesUnion, 
          ListBackupsInput, 
          OutputTypesUnion, 
          ListBackupsOutput, 
          DynamoDBResolvedConfiguration, 
          Blob
        ] {
    def this(input: ListBackupsInput) = this()
    /* CompleteClass */
    override val input: ListBackupsInput = js.native
    val middlewareStack: MiddlewareStack[ListBackupsInput, ListBackupsOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[ListBackupsInput, ListBackupsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[ListBackupsInput, ListBackupsOutput] = js.native
  }
  
}

