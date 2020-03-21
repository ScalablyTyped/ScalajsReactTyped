package typingsJapgolly.awsSdkClientPinpointBrowser

import typingsJapgolly.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsJapgolly.awsSdkClientPinpointBrowser.typesPutEventStreamInputMod.PutEventStreamInput
import typingsJapgolly.awsSdkClientPinpointBrowser.typesPutEventStreamOutputMod.PutEventStreamOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/PutEventStreamCommand", JSImport.Namespace)
@js.native
object putEventStreamCommandMod extends js.Object {
  @js.native
  class PutEventStreamCommand protected () extends Command[
          InputTypesUnion, 
          PutEventStreamInput, 
          OutputTypesUnion, 
          PutEventStreamOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: PutEventStreamInput) = this()
    /* CompleteClass */
    override val input: PutEventStreamInput = js.native
    val middlewareStack: MiddlewareStack[PutEventStreamInput, PutEventStreamOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[PutEventStreamInput, PutEventStreamOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[PutEventStreamInput, PutEventStreamOutput] = js.native
  }
  
}

