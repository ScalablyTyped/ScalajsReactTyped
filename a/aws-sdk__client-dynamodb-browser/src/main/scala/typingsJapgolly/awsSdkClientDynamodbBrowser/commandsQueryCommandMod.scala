package typingsJapgolly.awsSdkClientDynamodbBrowser

import typingsJapgolly.awsSdkClientDynamodbBrowser.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesQueryInputMod.QueryInput
import typingsJapgolly.awsSdkClientDynamodbBrowser.typesQueryOutputMod.QueryOutput
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsQueryCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-browser/commands/QueryCommand", "QueryCommand")
  @js.native
  open class QueryCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          QueryInput, 
          OutputTypesUnion, 
          QueryOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: QueryInput) = this()
    
    /* CompleteClass */
    override val input: QueryInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[QueryInput, QueryOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[QueryInput, QueryOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: DynamoDBResolvedConfiguration,
      options: Any
    ): Handler[QueryInput, QueryOutput] = js.native
  }
}
