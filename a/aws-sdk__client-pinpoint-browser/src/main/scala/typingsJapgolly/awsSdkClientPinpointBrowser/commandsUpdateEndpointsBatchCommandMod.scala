package typingsJapgolly.awsSdkClientPinpointBrowser

import typingsJapgolly.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsJapgolly.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateEndpointsBatchInputMod.UpdateEndpointsBatchInput
import typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateEndpointsBatchOutputMod.UpdateEndpointsBatchOutput
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsUpdateEndpointsBatchCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateEndpointsBatchCommand", "UpdateEndpointsBatchCommand")
  @js.native
  open class UpdateEndpointsBatchCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          UpdateEndpointsBatchInput, 
          OutputTypesUnion, 
          UpdateEndpointsBatchOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: UpdateEndpointsBatchInput) = this()
    
    /* CompleteClass */
    override val input: UpdateEndpointsBatchInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[UpdateEndpointsBatchInput, UpdateEndpointsBatchOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateEndpointsBatchInput, UpdateEndpointsBatchOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[UpdateEndpointsBatchInput, UpdateEndpointsBatchOutput] = js.native
  }
}
