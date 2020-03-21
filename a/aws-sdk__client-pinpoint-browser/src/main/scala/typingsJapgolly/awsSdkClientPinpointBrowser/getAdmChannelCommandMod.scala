package typingsJapgolly.awsSdkClientPinpointBrowser

import typingsJapgolly.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsJapgolly.awsSdkClientPinpointBrowser.typesGetAdmChannelInputMod.GetAdmChannelInput
import typingsJapgolly.awsSdkClientPinpointBrowser.typesGetAdmChannelOutputMod.GetAdmChannelOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetAdmChannelCommand", JSImport.Namespace)
@js.native
object getAdmChannelCommandMod extends js.Object {
  @js.native
  class GetAdmChannelCommand protected () extends Command[
          InputTypesUnion, 
          GetAdmChannelInput, 
          OutputTypesUnion, 
          GetAdmChannelOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetAdmChannelInput) = this()
    /* CompleteClass */
    override val input: GetAdmChannelInput = js.native
    val middlewareStack: MiddlewareStack[GetAdmChannelInput, GetAdmChannelOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetAdmChannelInput, GetAdmChannelOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetAdmChannelInput, GetAdmChannelOutput] = js.native
  }
  
}

