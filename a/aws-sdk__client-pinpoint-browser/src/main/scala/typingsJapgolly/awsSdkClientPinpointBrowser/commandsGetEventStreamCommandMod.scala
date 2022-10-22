package typingsJapgolly.awsSdkClientPinpointBrowser

import typingsJapgolly.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsJapgolly.awsSdkClientPinpointBrowser.typesGetEventStreamInputMod.GetEventStreamInput
import typingsJapgolly.awsSdkClientPinpointBrowser.typesGetEventStreamOutputMod.GetEventStreamOutput
import typingsJapgolly.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetEventStreamCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/GetEventStreamCommand", "GetEventStreamCommand")
  @js.native
  open class GetEventStreamCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetEventStreamInput, 
          OutputTypesUnion, 
          GetEventStreamOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: GetEventStreamInput) = this()
    
    /* CompleteClass */
    override val input: GetEventStreamInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetEventStreamInput, GetEventStreamOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetEventStreamInput, GetEventStreamOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[GetEventStreamInput, GetEventStreamOutput] = js.native
  }
}
