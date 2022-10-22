package typingsJapgolly.awsSdkClientLambdaNode

import typingsJapgolly.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsJapgolly.awsSdkClientLambdaNode.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientLambdaNode.typesInvokeAsyncInputMod.InvokeAsyncInput
import typingsJapgolly.awsSdkClientLambdaNode.typesInvokeAsyncOutputMod.InvokeAsyncOutput
import typingsJapgolly.awsSdkClientLambdaNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import typingsJapgolly.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsInvokeAsyncCommandMod {
  
  @JSImport("@aws-sdk/client-lambda-node/commands/InvokeAsyncCommand", "InvokeAsyncCommand")
  @js.native
  open class InvokeAsyncCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          InvokeAsyncInput[Readable], 
          OutputTypesUnion, 
          InvokeAsyncOutput, 
          LambdaResolvedConfiguration
        ] {
    def this(input: InvokeAsyncInput[Readable]) = this()
    
    /* CompleteClass */
    override val input: InvokeAsyncInput[Readable] = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[InvokeAsyncInput[Readable], InvokeAsyncOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: LambdaResolvedConfiguration
    ): Handler[InvokeAsyncInput[Readable], InvokeAsyncOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: LambdaResolvedConfiguration,
      options: Any
    ): Handler[InvokeAsyncInput[Readable], InvokeAsyncOutput] = js.native
  }
}
