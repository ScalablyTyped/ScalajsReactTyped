package typingsJapgolly.awsSdkClientPinpointBrowser

import typingsJapgolly.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteApnsSandboxChannelInputMod.DeleteApnsSandboxChannelInput
import typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteApnsSandboxChannelOutputMod.DeleteApnsSandboxChannelOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteApnsSandboxChannelCommand", JSImport.Namespace)
@js.native
object deleteApnsSandboxChannelCommandMod extends js.Object {
  @js.native
  class DeleteApnsSandboxChannelCommand protected () extends Command[
          InputTypesUnion, 
          DeleteApnsSandboxChannelInput, 
          OutputTypesUnion, 
          DeleteApnsSandboxChannelOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteApnsSandboxChannelInput) = this()
    /* CompleteClass */
    override val input: DeleteApnsSandboxChannelInput = js.native
    val middlewareStack: MiddlewareStack[
        DeleteApnsSandboxChannelInput, 
        DeleteApnsSandboxChannelOutput, 
        org.scalajs.dom.raw.Blob
      ] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteApnsSandboxChannelInput, DeleteApnsSandboxChannelOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteApnsSandboxChannelInput, DeleteApnsSandboxChannelOutput] = js.native
  }
  
}

