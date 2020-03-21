package typingsJapgolly.awsSdkClientPinpointBrowser

import typingsJapgolly.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsJapgolly.awsSdkClientPinpointBrowser.typesGetChannelsInputMod.GetChannelsInput
import typingsJapgolly.awsSdkClientPinpointBrowser.typesGetChannelsOutputMod.GetChannelsOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetChannelsCommand", JSImport.Namespace)
@js.native
object getChannelsCommandMod extends js.Object {
  @js.native
  class GetChannelsCommand protected () extends Command[
          InputTypesUnion, 
          GetChannelsInput, 
          OutputTypesUnion, 
          GetChannelsOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetChannelsInput) = this()
    /* CompleteClass */
    override val input: GetChannelsInput = js.native
    val middlewareStack: MiddlewareStack[GetChannelsInput, GetChannelsOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetChannelsInput, GetChannelsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetChannelsInput, GetChannelsOutput] = js.native
  }
  
}

