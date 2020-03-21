package typingsJapgolly.awsSdkClientPinpointBrowser

import typingsJapgolly.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsJapgolly.awsSdkClientPinpointBrowser.typesCreateAppInputMod.CreateAppInput
import typingsJapgolly.awsSdkClientPinpointBrowser.typesCreateAppOutputMod.CreateAppOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/CreateAppCommand", JSImport.Namespace)
@js.native
object createAppCommandMod extends js.Object {
  @js.native
  class CreateAppCommand protected () extends Command[
          InputTypesUnion, 
          CreateAppInput, 
          OutputTypesUnion, 
          CreateAppOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: CreateAppInput) = this()
    /* CompleteClass */
    override val input: CreateAppInput = js.native
    val middlewareStack: MiddlewareStack[CreateAppInput, CreateAppOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[CreateAppInput, CreateAppOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[CreateAppInput, CreateAppOutput] = js.native
  }
  
}

