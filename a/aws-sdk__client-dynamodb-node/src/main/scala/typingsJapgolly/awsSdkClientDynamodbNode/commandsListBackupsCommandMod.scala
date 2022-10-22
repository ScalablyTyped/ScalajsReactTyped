package typingsJapgolly.awsSdkClientDynamodbNode

import typingsJapgolly.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsJapgolly.awsSdkClientDynamodbNode.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbNode.typesListBackupsInputMod.ListBackupsInput
import typingsJapgolly.awsSdkClientDynamodbNode.typesListBackupsOutputMod.ListBackupsOutput
import typingsJapgolly.awsSdkClientDynamodbNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsListBackupsCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-node/commands/ListBackupsCommand", "ListBackupsCommand")
  @js.native
  open class ListBackupsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ListBackupsInput, 
          OutputTypesUnion, 
          ListBackupsOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: ListBackupsInput) = this()
    
    /* CompleteClass */
    override val input: ListBackupsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ListBackupsInput, ListBackupsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[ListBackupsInput, ListBackupsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: DynamoDBResolvedConfiguration,
      options: Any
    ): Handler[ListBackupsInput, ListBackupsOutput] = js.native
  }
}
