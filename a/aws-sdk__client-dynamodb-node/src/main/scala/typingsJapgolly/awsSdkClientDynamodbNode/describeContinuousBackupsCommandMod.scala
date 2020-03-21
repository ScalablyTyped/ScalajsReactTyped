package typingsJapgolly.awsSdkClientDynamodbNode

import typingsJapgolly.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsJapgolly.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbNode.typesDescribeContinuousBackupsInputMod.DescribeContinuousBackupsInput
import typingsJapgolly.awsSdkClientDynamodbNode.typesDescribeContinuousBackupsOutputMod.DescribeContinuousBackupsOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/DescribeContinuousBackupsCommand", JSImport.Namespace)
@js.native
object describeContinuousBackupsCommandMod extends js.Object {
  @js.native
  class DescribeContinuousBackupsCommand protected () extends Command[
          InputTypesUnion, 
          DescribeContinuousBackupsInput, 
          OutputTypesUnion, 
          DescribeContinuousBackupsOutput, 
          DynamoDBResolvedConfiguration, 
          Readable
        ] {
    def this(input: DescribeContinuousBackupsInput) = this()
    /* CompleteClass */
    override val input: DescribeContinuousBackupsInput = js.native
    val middlewareStack: MiddlewareStack[DescribeContinuousBackupsInput, DescribeContinuousBackupsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeContinuousBackupsInput, DescribeContinuousBackupsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[DescribeContinuousBackupsInput, DescribeContinuousBackupsOutput] = js.native
  }
  
}

