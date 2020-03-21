package typingsJapgolly.awsSdkClientDynamodbBrowser

import typingsJapgolly.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsJapgolly.awsSdkClientDynamodbBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesDescribeGlobalTableInputMod.DescribeGlobalTableInput
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesDescribeGlobalTableOutputMod.DescribeGlobalTableOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-browser/commands/DescribeGlobalTableCommand", JSImport.Namespace)
@js.native
object describeGlobalTableCommandMod extends js.Object {
  @js.native
  class DescribeGlobalTableCommand protected () extends Command[
          InputTypesUnion, 
          DescribeGlobalTableInput, 
          OutputTypesUnion, 
          DescribeGlobalTableOutput, 
          DynamoDBResolvedConfiguration, 
          Blob
        ] {
    def this(input: DescribeGlobalTableInput) = this()
    /* CompleteClass */
    override val input: DescribeGlobalTableInput = js.native
    val middlewareStack: MiddlewareStack[DescribeGlobalTableInput, DescribeGlobalTableOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeGlobalTableInput, DescribeGlobalTableOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeGlobalTableInput, DescribeGlobalTableOutput] = js.native
  }
  
}

