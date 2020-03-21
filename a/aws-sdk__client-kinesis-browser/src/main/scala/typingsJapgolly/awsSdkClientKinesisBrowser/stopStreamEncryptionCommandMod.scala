package typingsJapgolly.awsSdkClientKinesisBrowser

import typingsJapgolly.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsJapgolly.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.typesStopStreamEncryptionInputMod.StopStreamEncryptionInput
import typingsJapgolly.awsSdkClientKinesisBrowser.typesStopStreamEncryptionOutputMod.StopStreamEncryptionOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/StopStreamEncryptionCommand", JSImport.Namespace)
@js.native
object stopStreamEncryptionCommandMod extends js.Object {
  @js.native
  class StopStreamEncryptionCommand protected () extends Command[
          InputTypesUnion, 
          StopStreamEncryptionInput, 
          OutputTypesUnion, 
          StopStreamEncryptionOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: StopStreamEncryptionInput) = this()
    /* CompleteClass */
    override val input: StopStreamEncryptionInput = js.native
    val middlewareStack: MiddlewareStack[StopStreamEncryptionInput, StopStreamEncryptionOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[StopStreamEncryptionInput, StopStreamEncryptionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[StopStreamEncryptionInput, StopStreamEncryptionOutput] = js.native
  }
  
}

