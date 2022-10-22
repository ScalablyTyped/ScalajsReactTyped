package typingsJapgolly.awsSdkClientDynamodbNode

import typingsJapgolly.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsJapgolly.awsSdkClientDynamodbNode.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbNode.typesScanInputMod.ScanInput
import typingsJapgolly.awsSdkClientDynamodbNode.typesScanOutputMod.ScanOutput
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsScanCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-node/commands/ScanCommand", "ScanCommand")
  @js.native
  open class ScanCommand protected ()
    extends StObject
       with Command[InputTypesUnion, ScanInput, OutputTypesUnion, ScanOutput, DynamoDBResolvedConfiguration] {
    def this(input: ScanInput) = this()
    
    /* CompleteClass */
    override val input: ScanInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ScanInput, ScanOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[ScanInput, ScanOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: DynamoDBResolvedConfiguration,
      options: Any
    ): Handler[ScanInput, ScanOutput] = js.native
  }
}
