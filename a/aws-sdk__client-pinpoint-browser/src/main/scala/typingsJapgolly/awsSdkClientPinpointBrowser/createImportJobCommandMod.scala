package typingsJapgolly.awsSdkClientPinpointBrowser

import typingsJapgolly.awsSdkClientPinpointBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientPinpointBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientPinpointBrowser.pinpointConfigurationMod.PinpointResolvedConfiguration
import typingsJapgolly.awsSdkClientPinpointBrowser.typesCreateImportJobInputMod.CreateImportJobInput
import typingsJapgolly.awsSdkClientPinpointBrowser.typesCreateImportJobOutputMod.CreateImportJobOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-pinpoint-browser/commands/CreateImportJobCommand", JSImport.Namespace)
@js.native
object createImportJobCommandMod extends js.Object {
  @js.native
  class CreateImportJobCommand protected () extends Command[
          InputTypesUnion, 
          CreateImportJobInput, 
          OutputTypesUnion, 
          CreateImportJobOutput, 
          PinpointResolvedConfiguration, 
          Blob
        ] {
    def this(input: CreateImportJobInput) = this()
    /* CompleteClass */
    override val input: CreateImportJobInput = js.native
    val middlewareStack: MiddlewareStack[CreateImportJobInput, CreateImportJobOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[CreateImportJobInput, CreateImportJobOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: PinpointResolvedConfiguration
    ): Handler[CreateImportJobInput, CreateImportJobOutput] = js.native
  }
  
}

