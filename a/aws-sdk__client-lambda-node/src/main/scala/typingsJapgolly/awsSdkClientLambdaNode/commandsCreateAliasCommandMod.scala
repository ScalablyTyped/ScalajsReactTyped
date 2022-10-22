package typingsJapgolly.awsSdkClientLambdaNode

import typingsJapgolly.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsJapgolly.awsSdkClientLambdaNode.typesCreateAliasInputMod.CreateAliasInput
import typingsJapgolly.awsSdkClientLambdaNode.typesCreateAliasOutputMod.CreateAliasOutput
import typingsJapgolly.awsSdkClientLambdaNode.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientLambdaNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsCreateAliasCommandMod {
  
  @JSImport("@aws-sdk/client-lambda-node/commands/CreateAliasCommand", "CreateAliasCommand")
  @js.native
  open class CreateAliasCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          CreateAliasInput, 
          OutputTypesUnion, 
          CreateAliasOutput, 
          LambdaResolvedConfiguration
        ] {
    def this(input: CreateAliasInput) = this()
    
    /* CompleteClass */
    override val input: CreateAliasInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[CreateAliasInput, CreateAliasOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: LambdaResolvedConfiguration
    ): Handler[CreateAliasInput, CreateAliasOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: LambdaResolvedConfiguration,
      options: Any
    ): Handler[CreateAliasInput, CreateAliasOutput] = js.native
  }
}
