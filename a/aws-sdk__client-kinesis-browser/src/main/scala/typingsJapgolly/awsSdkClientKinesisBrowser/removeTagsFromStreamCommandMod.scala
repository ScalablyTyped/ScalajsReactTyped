package typingsJapgolly.awsSdkClientKinesisBrowser

import typingsJapgolly.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsJapgolly.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.typesRemoveTagsFromStreamInputMod.RemoveTagsFromStreamInput
import typingsJapgolly.awsSdkClientKinesisBrowser.typesRemoveTagsFromStreamOutputMod.RemoveTagsFromStreamOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/RemoveTagsFromStreamCommand", JSImport.Namespace)
@js.native
object removeTagsFromStreamCommandMod extends js.Object {
  @js.native
  class RemoveTagsFromStreamCommand protected () extends Command[
          InputTypesUnion, 
          RemoveTagsFromStreamInput, 
          OutputTypesUnion, 
          RemoveTagsFromStreamOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: RemoveTagsFromStreamInput) = this()
    /* CompleteClass */
    override val input: RemoveTagsFromStreamInput = js.native
    val middlewareStack: MiddlewareStack[RemoveTagsFromStreamInput, RemoveTagsFromStreamOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[RemoveTagsFromStreamInput, RemoveTagsFromStreamOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[RemoveTagsFromStreamInput, RemoveTagsFromStreamOutput] = js.native
  }
  
}

