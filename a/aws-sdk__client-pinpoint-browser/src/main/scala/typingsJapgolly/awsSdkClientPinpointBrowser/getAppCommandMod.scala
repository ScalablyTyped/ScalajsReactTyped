package typingsJapgolly.awsSdkClientPinpointBrowser

import typingsJapgolly.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsJapgolly.awsSdkClientPinpointBrowser.typesGetAppInputMod.GetAppInput
import typingsJapgolly.awsSdkClientPinpointBrowser.typesGetAppOutputMod.GetAppOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetAppCommand", JSImport.Namespace)
@js.native
object getAppCommandMod extends js.Object {
  @js.native
  class GetAppCommand protected () extends Command[
          InputTypesUnion, 
          GetAppInput, 
          OutputTypesUnion, 
          GetAppOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetAppInput) = this()
    /* CompleteClass */
    override val input: GetAppInput = js.native
    val middlewareStack: MiddlewareStack[GetAppInput, GetAppOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetAppInput, GetAppOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetAppInput, GetAppOutput] = js.native
  }
  
}

