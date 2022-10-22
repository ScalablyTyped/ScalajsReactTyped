package typingsJapgolly.awsSdkClientXrayNode

import typingsJapgolly.awsSdkClientXrayNode.typesGetTraceGraphInputMod.GetTraceGraphInput
import typingsJapgolly.awsSdkClientXrayNode.typesGetTraceGraphOutputMod.GetTraceGraphOutput
import typingsJapgolly.awsSdkClientXrayNode.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientXrayNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetTraceGraphCommandMod {
  
  @JSImport("@aws-sdk/client-xray-node/commands/GetTraceGraphCommand", "GetTraceGraphCommand")
  @js.native
  open class GetTraceGraphCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetTraceGraphInput, 
          OutputTypesUnion, 
          GetTraceGraphOutput, 
          XRayResolvedConfiguration
        ] {
    def this(input: GetTraceGraphInput) = this()
    
    /* CompleteClass */
    override val input: GetTraceGraphInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetTraceGraphInput, GetTraceGraphOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: XRayResolvedConfiguration
    ): Handler[GetTraceGraphInput, GetTraceGraphOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: XRayResolvedConfiguration,
      options: Any
    ): Handler[GetTraceGraphInput, GetTraceGraphOutput] = js.native
  }
}
