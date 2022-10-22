package typingsJapgolly.awsSdkClientDynamodbNode

import typingsJapgolly.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsJapgolly.awsSdkClientDynamodbNode.typesCreateTableInputMod.CreateTableInput
import typingsJapgolly.awsSdkClientDynamodbNode.typesCreateTableOutputMod.CreateTableOutput
import typingsJapgolly.awsSdkClientDynamodbNode.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsCreateTableCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-node/commands/CreateTableCommand", "CreateTableCommand")
  @js.native
  open class CreateTableCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          CreateTableInput, 
          OutputTypesUnion, 
          CreateTableOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: CreateTableInput) = this()
    
    /* CompleteClass */
    override val input: CreateTableInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[CreateTableInput, CreateTableOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[CreateTableInput, CreateTableOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: DynamoDBResolvedConfiguration,
      options: Any
    ): Handler[CreateTableInput, CreateTableOutput] = js.native
  }
}
