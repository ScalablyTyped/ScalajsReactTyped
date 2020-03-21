package typingsJapgolly.awsSdkClientPinpointBrowser

import typingsJapgolly.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateApnsSandboxChannelInputMod.UpdateApnsSandboxChannelInput
import typingsJapgolly.awsSdkClientPinpointBrowser.typesUpdateApnsSandboxChannelOutputMod.UpdateApnsSandboxChannelOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/UpdateApnsSandboxChannelCommand", JSImport.Namespace)
@js.native
object updateApnsSandboxChannelCommandMod extends js.Object {
  @js.native
  class UpdateApnsSandboxChannelCommand protected () extends Command[
          InputTypesUnion, 
          UpdateApnsSandboxChannelInput, 
          OutputTypesUnion, 
          UpdateApnsSandboxChannelOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: UpdateApnsSandboxChannelInput) = this()
    /* CompleteClass */
    override val input: UpdateApnsSandboxChannelInput = js.native
    val middlewareStack: MiddlewareStack[
        UpdateApnsSandboxChannelInput, 
        UpdateApnsSandboxChannelOutput, 
        org.scalajs.dom.raw.Blob
      ] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateApnsSandboxChannelInput, UpdateApnsSandboxChannelOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[UpdateApnsSandboxChannelInput, UpdateApnsSandboxChannelOutput] = js.native
  }
  
}

