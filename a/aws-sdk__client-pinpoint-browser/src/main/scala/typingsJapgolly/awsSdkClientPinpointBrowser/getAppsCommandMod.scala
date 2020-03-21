package typingsJapgolly.awsSdkClientPinpointBrowser

import typingsJapgolly.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsJapgolly.awsSdkClientPinpointBrowser.typesGetAppsInputMod.GetAppsInput
import typingsJapgolly.awsSdkClientPinpointBrowser.typesGetAppsOutputMod.GetAppsOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/GetAppsCommand", JSImport.Namespace)
@js.native
object getAppsCommandMod extends js.Object {
  @js.native
  class GetAppsCommand protected () extends Command[
          InputTypesUnion, 
          GetAppsInput, 
          OutputTypesUnion, 
          GetAppsOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetAppsInput) = this()
    /* CompleteClass */
    override val input: GetAppsInput = js.native
    val middlewareStack: MiddlewareStack[GetAppsInput, GetAppsOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetAppsInput, GetAppsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[GetAppsInput, GetAppsOutput] = js.native
  }
  
}

