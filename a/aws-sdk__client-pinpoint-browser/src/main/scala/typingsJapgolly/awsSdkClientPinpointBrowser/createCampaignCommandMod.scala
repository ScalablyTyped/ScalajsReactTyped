package typingsJapgolly.awsSdkClientPinpointBrowser

import typingsJapgolly.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsJapgolly.awsSdkClientPinpointBrowser.typesCreateCampaignInputMod.CreateCampaignInput
import typingsJapgolly.awsSdkClientPinpointBrowser.typesCreateCampaignOutputMod.CreateCampaignOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/CreateCampaignCommand", JSImport.Namespace)
@js.native
object createCampaignCommandMod extends js.Object {
  @js.native
  class CreateCampaignCommand protected () extends Command[
          InputTypesUnion, 
          CreateCampaignInput, 
          OutputTypesUnion, 
          CreateCampaignOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: CreateCampaignInput) = this()
    /* CompleteClass */
    override val input: CreateCampaignInput = js.native
    val middlewareStack: MiddlewareStack[CreateCampaignInput, CreateCampaignOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[CreateCampaignInput, CreateCampaignOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[CreateCampaignInput, CreateCampaignOutput] = js.native
  }
  
}

