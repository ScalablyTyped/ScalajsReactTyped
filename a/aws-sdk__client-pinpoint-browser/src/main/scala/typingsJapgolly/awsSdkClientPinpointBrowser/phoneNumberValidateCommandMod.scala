package typingsJapgolly.awsSdkClientPinpointBrowser

import typingsJapgolly.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsJapgolly.awsSdkClientPinpointBrowser.typesPhoneNumberValidateInputMod.PhoneNumberValidateInput
import typingsJapgolly.awsSdkClientPinpointBrowser.typesPhoneNumberValidateOutputMod.PhoneNumberValidateOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/PhoneNumberValidateCommand", JSImport.Namespace)
@js.native
object phoneNumberValidateCommandMod extends js.Object {
  @js.native
  class PhoneNumberValidateCommand protected () extends Command[
          InputTypesUnion, 
          PhoneNumberValidateInput, 
          OutputTypesUnion, 
          PhoneNumberValidateOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: PhoneNumberValidateInput) = this()
    /* CompleteClass */
    override val input: PhoneNumberValidateInput = js.native
    val middlewareStack: MiddlewareStack[PhoneNumberValidateInput, PhoneNumberValidateOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[PhoneNumberValidateInput, PhoneNumberValidateOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[PhoneNumberValidateInput, PhoneNumberValidateOutput] = js.native
  }
  
}

