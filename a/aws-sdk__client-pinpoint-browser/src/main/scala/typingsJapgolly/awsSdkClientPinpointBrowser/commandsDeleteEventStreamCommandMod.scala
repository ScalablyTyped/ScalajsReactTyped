package typingsJapgolly.awsSdkClientPinpointBrowser

import typingsJapgolly.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteEventStreamInputMod.DeleteEventStreamInput
import typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteEventStreamOutputMod.DeleteEventStreamOutput
import typingsJapgolly.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDeleteEventStreamCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteEventStreamCommand", "DeleteEventStreamCommand")
  @js.native
  open class DeleteEventStreamCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DeleteEventStreamInput, 
          OutputTypesUnion, 
          DeleteEventStreamOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: DeleteEventStreamInput) = this()
    
    /* CompleteClass */
    override val input: DeleteEventStreamInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DeleteEventStreamInput, DeleteEventStreamOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteEventStreamInput, DeleteEventStreamOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[DeleteEventStreamInput, DeleteEventStreamOutput] = js.native
  }
}
