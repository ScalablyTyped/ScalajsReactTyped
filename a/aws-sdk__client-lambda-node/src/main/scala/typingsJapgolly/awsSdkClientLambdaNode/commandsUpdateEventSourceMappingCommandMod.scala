package typingsJapgolly.awsSdkClientLambdaNode

import typingsJapgolly.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsJapgolly.awsSdkClientLambdaNode.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientLambdaNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientLambdaNode.typesUpdateEventSourceMappingInputMod.UpdateEventSourceMappingInput
import typingsJapgolly.awsSdkClientLambdaNode.typesUpdateEventSourceMappingOutputMod.UpdateEventSourceMappingOutput
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsUpdateEventSourceMappingCommandMod {
  
  @JSImport("@aws-sdk/client-lambda-node/commands/UpdateEventSourceMappingCommand", "UpdateEventSourceMappingCommand")
  @js.native
  open class UpdateEventSourceMappingCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          UpdateEventSourceMappingInput, 
          OutputTypesUnion, 
          UpdateEventSourceMappingOutput, 
          LambdaResolvedConfiguration
        ] {
    def this(input: UpdateEventSourceMappingInput) = this()
    
    /* CompleteClass */
    override val input: UpdateEventSourceMappingInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[UpdateEventSourceMappingInput, UpdateEventSourceMappingOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: LambdaResolvedConfiguration
    ): Handler[UpdateEventSourceMappingInput, UpdateEventSourceMappingOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: LambdaResolvedConfiguration,
      options: Any
    ): Handler[UpdateEventSourceMappingInput, UpdateEventSourceMappingOutput] = js.native
  }
}
