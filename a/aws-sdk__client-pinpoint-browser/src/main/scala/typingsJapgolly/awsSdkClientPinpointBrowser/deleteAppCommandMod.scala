package typingsJapgolly.awsSdkClientPinpointBrowser

import typingsJapgolly.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteAppInputMod.DeleteAppInput
import typingsJapgolly.awsSdkClientPinpointBrowser.typesDeleteAppOutputMod.DeleteAppOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/DeleteAppCommand", JSImport.Namespace)
@js.native
object deleteAppCommandMod extends js.Object {
  @js.native
  class DeleteAppCommand protected () extends Command[
          InputTypesUnion, 
          DeleteAppInput, 
          OutputTypesUnion, 
          DeleteAppOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteAppInput) = this()
    /* CompleteClass */
    override val input: DeleteAppInput = js.native
    val middlewareStack: MiddlewareStack[DeleteAppInput, DeleteAppOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteAppInput, DeleteAppOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[DeleteAppInput, DeleteAppOutput] = js.native
  }
  
}

