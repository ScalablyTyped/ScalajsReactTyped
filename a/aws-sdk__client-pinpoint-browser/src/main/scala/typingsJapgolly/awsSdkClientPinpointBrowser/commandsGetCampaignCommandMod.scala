package typingsJapgolly.awsSdkClientPinpointBrowser

import typingsJapgolly.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsJapgolly.awsSdkClientPinpointBrowser.typesGetCampaignInputMod.GetCampaignInput
import typingsJapgolly.awsSdkClientPinpointBrowser.typesGetCampaignOutputMod.GetCampaignOutput
import typingsJapgolly.awsSdkClientPinpointBrowser.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientPinpointBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetCampaignCommandMod {
  
  @JSImport("@aws-sdk/client-pinpoint-browser/commands/GetCampaignCommand", "GetCampaignCommand")
  @js.native
  open class GetCampaignCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetCampaignInput, 
          OutputTypesUnion, 
          GetCampaignOutput, 
          PinpointResolvedConfiguration
        ] {
    def this(input: GetCampaignInput) = this()
    
    /* CompleteClass */
    override val input: GetCampaignInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetCampaignInput, GetCampaignOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: PinpointResolvedConfiguration
    ): Handler[GetCampaignInput, GetCampaignOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: PinpointResolvedConfiguration,
      options: Any
    ): Handler[GetCampaignInput, GetCampaignOutput] = js.native
  }
}
