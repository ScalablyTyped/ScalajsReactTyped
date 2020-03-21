package typingsJapgolly.awsSdkClientKinesisBrowser

import typingsJapgolly.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsJapgolly.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.typesStartStreamEncryptionInputMod.StartStreamEncryptionInput
import typingsJapgolly.awsSdkClientKinesisBrowser.typesStartStreamEncryptionOutputMod.StartStreamEncryptionOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/StartStreamEncryptionCommand", JSImport.Namespace)
@js.native
object startStreamEncryptionCommandMod extends js.Object {
  @js.native
  class StartStreamEncryptionCommand protected () extends Command[
          InputTypesUnion, 
          StartStreamEncryptionInput, 
          OutputTypesUnion, 
          StartStreamEncryptionOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: StartStreamEncryptionInput) = this()
    /* CompleteClass */
    override val input: StartStreamEncryptionInput = js.native
    val middlewareStack: MiddlewareStack[StartStreamEncryptionInput, StartStreamEncryptionOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[StartStreamEncryptionInput, StartStreamEncryptionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[StartStreamEncryptionInput, StartStreamEncryptionOutput] = js.native
  }
  
}

