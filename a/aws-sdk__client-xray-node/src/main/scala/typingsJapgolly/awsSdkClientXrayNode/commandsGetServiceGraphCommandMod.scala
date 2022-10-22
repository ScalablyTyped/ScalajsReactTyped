package typingsJapgolly.awsSdkClientXrayNode

import typingsJapgolly.awsSdkClientXrayNode.typesGetServiceGraphInputMod.GetServiceGraphInput
import typingsJapgolly.awsSdkClientXrayNode.typesGetServiceGraphOutputMod.GetServiceGraphOutput
import typingsJapgolly.awsSdkClientXrayNode.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientXrayNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetServiceGraphCommandMod {
  
  @JSImport("@aws-sdk/client-xray-node/commands/GetServiceGraphCommand", "GetServiceGraphCommand")
  @js.native
  open class GetServiceGraphCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetServiceGraphInput, 
          OutputTypesUnion, 
          GetServiceGraphOutput, 
          XRayResolvedConfiguration
        ] {
    def this(input: GetServiceGraphInput) = this()
    
    /* CompleteClass */
    override val input: GetServiceGraphInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetServiceGraphInput, GetServiceGraphOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: XRayResolvedConfiguration
    ): Handler[GetServiceGraphInput, GetServiceGraphOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: XRayResolvedConfiguration,
      options: Any
    ): Handler[GetServiceGraphInput, GetServiceGraphOutput] = js.native
  }
}
