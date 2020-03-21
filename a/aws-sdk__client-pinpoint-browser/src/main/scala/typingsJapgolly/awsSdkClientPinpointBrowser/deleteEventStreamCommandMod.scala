package typingsJapgolly.awsSdkClientPinpointBrowser

import typingsJapgolly.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteEventStreamInputMod.DeleteEventStreamInput
import typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteEventStreamOutputMod.DeleteEventStreamOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteEventStreamCommand", JSImport.Namespace)
@js.native
object deleteEventStreamCommandMod extends js.Object {
  @js.native
  class DeleteEventStreamCommand protected () extends Command[
          InputTypesUnion, 
          DeleteEventStreamInput, 
          OutputTypesUnion, 
          DeleteEventStreamOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteEventStreamInput) = this()
    /* CompleteClass */
    override val input: DeleteEventStreamInput = js.native
    val middlewareStack: MiddlewareStack[DeleteEventStreamInput, DeleteEventStreamOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteEventStreamInput, DeleteEventStreamOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteEventStreamInput, DeleteEventStreamOutput] = js.native
  }
  
}

