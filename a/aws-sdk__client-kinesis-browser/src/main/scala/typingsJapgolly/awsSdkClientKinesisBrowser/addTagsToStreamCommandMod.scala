package typingsJapgolly.awsSdkClientKinesisBrowser

import typingsJapgolly.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsJapgolly.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.typesAddTagsToStreamInputMod.AddTagsToStreamInput
import typingsJapgolly.awsSdkClientKinesisBrowser.typesAddTagsToStreamOutputMod.AddTagsToStreamOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/AddTagsToStreamCommand", JSImport.Namespace)
@js.native
object addTagsToStreamCommandMod extends js.Object {
  @js.native
  class AddTagsToStreamCommand protected () extends Command[
          InputTypesUnion, 
          AddTagsToStreamInput, 
          OutputTypesUnion, 
          AddTagsToStreamOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: AddTagsToStreamInput) = this()
    /* CompleteClass */
    override val input: AddTagsToStreamInput = js.native
    val middlewareStack: MiddlewareStack[AddTagsToStreamInput, AddTagsToStreamOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[AddTagsToStreamInput, AddTagsToStreamOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[AddTagsToStreamInput, AddTagsToStreamOutput] = js.native
  }
  
}

