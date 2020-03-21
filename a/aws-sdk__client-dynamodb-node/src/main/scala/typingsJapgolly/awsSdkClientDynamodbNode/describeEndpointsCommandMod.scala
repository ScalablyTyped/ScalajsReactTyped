package typingsJapgolly.awsSdkClientDynamodbNode

import typingsJapgolly.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsJapgolly.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbNode.typesDescribeEndpointsInputMod.DescribeEndpointsInput
import typingsJapgolly.awsSdkClientDynamodbNode.typesDescribeEndpointsOutputMod.DescribeEndpointsOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/DescribeEndpointsCommand", JSImport.Namespace)
@js.native
object describeEndpointsCommandMod extends js.Object {
  @js.native
  class DescribeEndpointsCommand protected () extends Command[
          InputTypesUnion, 
          DescribeEndpointsInput, 
          OutputTypesUnion, 
          DescribeEndpointsOutput, 
          DynamoDBResolvedConfiguration, 
          Readable
        ] {
    def this(input: DescribeEndpointsInput) = this()
    /* CompleteClass */
    override val input: DescribeEndpointsInput = js.native
    val middlewareStack: MiddlewareStack[DescribeEndpointsInput, DescribeEndpointsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeEndpointsInput, DescribeEndpointsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeEndpointsInput, DescribeEndpointsOutput] = js.native
  }
  
}

