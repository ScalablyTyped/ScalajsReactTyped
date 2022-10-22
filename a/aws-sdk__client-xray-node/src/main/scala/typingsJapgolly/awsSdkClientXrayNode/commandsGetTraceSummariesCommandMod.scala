package typingsJapgolly.awsSdkClientXrayNode

import typingsJapgolly.awsSdkClientXrayNode.typesGetTraceSummariesInputMod.GetTraceSummariesInput
import typingsJapgolly.awsSdkClientXrayNode.typesGetTraceSummariesOutputMod.GetTraceSummariesOutput
import typingsJapgolly.awsSdkClientXrayNode.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientXrayNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetTraceSummariesCommandMod {
  
  @JSImport("@aws-sdk/client-xray-node/commands/GetTraceSummariesCommand", "GetTraceSummariesCommand")
  @js.native
  open class GetTraceSummariesCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetTraceSummariesInput, 
          OutputTypesUnion, 
          GetTraceSummariesOutput, 
          XRayResolvedConfiguration
        ] {
    def this(input: GetTraceSummariesInput) = this()
    
    /* CompleteClass */
    override val input: GetTraceSummariesInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetTraceSummariesInput, GetTraceSummariesOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: XRayResolvedConfiguration
    ): Handler[GetTraceSummariesInput, GetTraceSummariesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: XRayResolvedConfiguration,
      options: Any
    ): Handler[GetTraceSummariesInput, GetTraceSummariesOutput] = js.native
  }
}
