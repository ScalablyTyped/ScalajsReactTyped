package typingsJapgolly.awsSdkClientDynamodbBrowser

import typingsJapgolly.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsJapgolly.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesListTablesInputMod.ListTablesInput
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesListTablesOutputMod.ListTablesOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/ListTablesCommand", JSImport.Namespace)
@js.native
object listTablesCommandMod extends js.Object {
  @js.native
  class ListTablesCommand protected () extends Command[
          InputTypesUnion, 
          ListTablesInput, 
          OutputTypesUnion, 
          ListTablesOutput, 
          DynamoDBResolvedConfiguration, 
          Blob
        ] {
    def this(input: ListTablesInput) = this()
    /* CompleteClass */
    override val input: ListTablesInput = js.native
    val middlewareStack: MiddlewareStack[ListTablesInput, ListTablesOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[ListTablesInput, ListTablesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[ListTablesInput, ListTablesOutput] = js.native
  }
  
}

