package typingsJapgolly.awsSdkClientPinpointBrowser

import typingsJapgolly.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsJapgolly.awsSdkClientPinpointBrowser.typesGetCampaignsInputMod.GetCampaignsInput
import typingsJapgolly.awsSdkClientPinpointBrowser.typesGetCampaignsOutputMod.GetCampaignsOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetCampaignsCommand", JSImport.Namespace)
@js.native
object getCampaignsCommandMod extends js.Object {
  @js.native
  class GetCampaignsCommand protected () extends Command[
          InputTypesUnion, 
          GetCampaignsInput, 
          OutputTypesUnion, 
          GetCampaignsOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetCampaignsInput) = this()
    /* CompleteClass */
    override val input: GetCampaignsInput = js.native
    val middlewareStack: MiddlewareStack[GetCampaignsInput, GetCampaignsOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetCampaignsInput, GetCampaignsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetCampaignsInput, GetCampaignsOutput] = js.native
  }
  
}

