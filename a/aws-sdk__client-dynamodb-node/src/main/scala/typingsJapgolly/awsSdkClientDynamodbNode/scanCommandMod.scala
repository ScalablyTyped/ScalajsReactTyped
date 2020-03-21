package typingsJapgolly.awsSdkClientDynamodbNode

import typingsJapgolly.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsJapgolly.awsSdkClientDynamodbNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbNode.typesScanInputMod.ScanInput
import typingsJapgolly.awsSdkClientDynamodbNode.typesScanOutputMod.ScanOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-dynamodb-node/commands/ScanCommand", JSImport.Namespace)
@js.native
object scanCommandMod extends js.Object {
  @js.native
  class ScanCommand protected () extends Command[
          InputTypesUnion, 
          ScanInput, 
          OutputTypesUnion, 
          ScanOutput, 
          DynamoDBResolvedConfiguration, 
          Readable
        ] {
    def this(input: ScanInput) = this()
    /* CompleteClass */
    override val input: ScanInput = js.native
    val middlewareStack: MiddlewareStack[ScanInput, ScanOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[ScanInput, ScanOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: DynamoDBResolvedConfiguration
    ): Handler[ScanInput, ScanOutput] = js.native
  }
  
}

