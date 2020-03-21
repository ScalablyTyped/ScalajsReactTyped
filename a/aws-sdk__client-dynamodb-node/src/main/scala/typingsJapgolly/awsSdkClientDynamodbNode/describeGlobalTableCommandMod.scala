package typingsJapgolly.awsSdkClientDynamodbNode

import typingsJapgolly.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsJapgolly.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbNode.typesDescribeGlobalTableInputMod.DescribeGlobalTableInput
import typingsJapgolly.awsSdkClientDynamodbNode.typesDescribeGlobalTableOutputMod.DescribeGlobalTableOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/DescribeGlobalTableCommand", JSImport.Namespace)
@js.native
object describeGlobalTableCommandMod extends js.Object {
  @js.native
  class DescribeGlobalTableCommand protected () extends Command[
          InputTypesUnion, 
          DescribeGlobalTableInput, 
          OutputTypesUnion, 
          DescribeGlobalTableOutput, 
          DynamoDBResolvedConfiguration, 
          Readable
        ] {
    def this(input: DescribeGlobalTableInput) = this()
    /* CompleteClass */
    override val input: DescribeGlobalTableInput = js.native
    val middlewareStack: MiddlewareStack[DescribeGlobalTableInput, DescribeGlobalTableOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeGlobalTableInput, DescribeGlobalTableOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeGlobalTableInput, DescribeGlobalTableOutput] = js.native
  }
  
}

