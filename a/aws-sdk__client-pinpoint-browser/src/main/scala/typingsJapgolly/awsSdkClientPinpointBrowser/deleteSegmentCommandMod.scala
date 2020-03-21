package typingsJapgolly.awsSdkClientPinpointBrowser

import typingsJapgolly.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteSegmentInputMod.DeleteSegmentInput
import typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteSegmentOutputMod.DeleteSegmentOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteSegmentCommand", JSImport.Namespace)
@js.native
object deleteSegmentCommandMod extends js.Object {
  @js.native
  class DeleteSegmentCommand protected () extends Command[
          InputTypesUnion, 
          DeleteSegmentInput, 
          OutputTypesUnion, 
          DeleteSegmentOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteSegmentInput) = this()
    /* CompleteClass */
    override val input: DeleteSegmentInput = js.native
    val middlewareStack: MiddlewareStack[DeleteSegmentInput, DeleteSegmentOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteSegmentInput, DeleteSegmentOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteSegmentInput, DeleteSegmentOutput] = js.native
  }
  
}

