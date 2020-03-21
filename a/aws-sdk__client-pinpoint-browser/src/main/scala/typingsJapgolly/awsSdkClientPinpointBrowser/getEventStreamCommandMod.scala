package typingsJapgolly.awsSdkClientPinpointBrowser

import typingsJapgolly.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsJapgolly.awsSdkClientPinpointBrowser.typesGetEventStreamInputMod.GetEventStreamInput
import typingsJapgolly.awsSdkClientPinpointBrowser.typesGetEventStreamOutputMod.GetEventStreamOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetEventStreamCommand", JSImport.Namespace)
@js.native
object getEventStreamCommandMod extends js.Object {
  @js.native
  class GetEventStreamCommand protected () extends Command[
          InputTypesUnion, 
          GetEventStreamInput, 
          OutputTypesUnion, 
          GetEventStreamOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetEventStreamInput) = this()
    /* CompleteClass */
    override val input: GetEventStreamInput = js.native
    val middlewareStack: MiddlewareStack[GetEventStreamInput, GetEventStreamOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetEventStreamInput, GetEventStreamOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetEventStreamInput, GetEventStreamOutput] = js.native
  }
  
}

