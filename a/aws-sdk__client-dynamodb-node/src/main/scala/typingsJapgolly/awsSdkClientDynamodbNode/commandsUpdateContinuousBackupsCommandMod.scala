package typingsJapgolly.awsSdkClientDynamodbNode

import typingsJapgolly.awsSdkClientDynamodbNode.dynamoDBConfigurationMod.DynamoDBResolvedConfiguration
import typingsJapgolly.awsSdkClientDynamodbNode.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientDynamodbNode.typesUpdateContinuousBackupsInputMod.UpdateContinuousBackupsInput
import typingsJapgolly.awsSdkClientDynamodbNode.typesUpdateContinuousBackupsOutputMod.UpdateContinuousBackupsOutput
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsUpdateContinuousBackupsCommandMod {
  
  @JSImport("@aws-sdk/client-dynamodb-node/commands/UpdateContinuousBackupsCommand", "UpdateContinuousBackupsCommand")
  @js.native
  open class UpdateContinuousBackupsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          UpdateContinuousBackupsInput, 
          OutputTypesUnion, 
          UpdateContinuousBackupsOutput, 
          DynamoDBResolvedConfiguration
        ] {
    def this(input: UpdateContinuousBackupsInput) = this()
    
    /* CompleteClass */
    override val input: UpdateContinuousBackupsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[UpdateContinuousBackupsInput, UpdateContinuousBackupsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: DynamoDBResolvedConfiguration
    ): Handler[UpdateContinuousBackupsInput, UpdateContinuousBackupsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: DynamoDBResolvedConfiguration,
      options: Any
    ): Handler[UpdateContinuousBackupsInput, UpdateContinuousBackupsOutput] = js.native
  }
}
