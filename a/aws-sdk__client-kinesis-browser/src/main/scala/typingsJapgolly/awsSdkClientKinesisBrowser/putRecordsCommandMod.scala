package typingsJapgolly.awsSdkClientKinesisBrowser

import typingsJapgolly.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsJapgolly.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.typesPutRecordsInputMod.PutRecordsInput
import typingsJapgolly.awsSdkClientKinesisBrowser.typesPutRecordsOutputMod.PutRecordsOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/PutRecordsCommand", JSImport.Namespace)
@js.native
object putRecordsCommandMod extends js.Object {
  @js.native
  class PutRecordsCommand protected () extends Command[
          InputTypesUnion, 
          PutRecordsInput, 
          OutputTypesUnion, 
          PutRecordsOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: PutRecordsInput) = this()
    /* CompleteClass */
    override val input: PutRecordsInput = js.native
    val middlewareStack: MiddlewareStack[PutRecordsInput, PutRecordsOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[PutRecordsInput, PutRecordsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[PutRecordsInput, PutRecordsOutput] = js.native
  }
  
}

