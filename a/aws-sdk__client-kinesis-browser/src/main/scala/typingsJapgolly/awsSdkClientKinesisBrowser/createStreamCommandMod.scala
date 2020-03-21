package typingsJapgolly.awsSdkClientKinesisBrowser

import typingsJapgolly.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsJapgolly.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.typesCreateStreamInputMod.CreateStreamInput
import typingsJapgolly.awsSdkClientKinesisBrowser.typesCreateStreamOutputMod.CreateStreamOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/CreateStreamCommand", JSImport.Namespace)
@js.native
object createStreamCommandMod extends js.Object {
  @js.native
  class CreateStreamCommand protected () extends Command[
          InputTypesUnion, 
          CreateStreamInput, 
          OutputTypesUnion, 
          CreateStreamOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: CreateStreamInput) = this()
    /* CompleteClass */
    override val input: CreateStreamInput = js.native
    val middlewareStack: MiddlewareStack[CreateStreamInput, CreateStreamOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[CreateStreamInput, CreateStreamOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[CreateStreamInput, CreateStreamOutput] = js.native
  }
  
}

