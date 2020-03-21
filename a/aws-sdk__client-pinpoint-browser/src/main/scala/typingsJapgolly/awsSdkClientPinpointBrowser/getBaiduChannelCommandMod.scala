package typingsJapgolly.awsSdkClientPinpointBrowser

import typingsJapgolly.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsJapgolly.awsSdkClientPinpointBrowser.typesGetBaiduChannelInputMod.GetBaiduChannelInput
import typingsJapgolly.awsSdkClientPinpointBrowser.typesGetBaiduChannelOutputMod.GetBaiduChannelOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetBaiduChannelCommand", JSImport.Namespace)
@js.native
object getBaiduChannelCommandMod extends js.Object {
  @js.native
  class GetBaiduChannelCommand protected () extends Command[
          InputTypesUnion, 
          GetBaiduChannelInput, 
          OutputTypesUnion, 
          GetBaiduChannelOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetBaiduChannelInput) = this()
    /* CompleteClass */
    override val input: GetBaiduChannelInput = js.native
    val middlewareStack: MiddlewareStack[GetBaiduChannelInput, GetBaiduChannelOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetBaiduChannelInput, GetBaiduChannelOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetBaiduChannelInput, GetBaiduChannelOutput] = js.native
  }
  
}

