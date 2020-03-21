package typingsJapgolly.awsSdkClientKinesisBrowser

import typingsJapgolly.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsJapgolly.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.typesListStreamsInputMod.ListStreamsInput
import typingsJapgolly.awsSdkClientKinesisBrowser.typesListStreamsOutputMod.ListStreamsOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/ListStreamsCommand", JSImport.Namespace)
@js.native
object listStreamsCommandMod extends js.Object {
  @js.native
  class ListStreamsCommand protected () extends Command[
          InputTypesUnion, 
          ListStreamsInput, 
          OutputTypesUnion, 
          ListStreamsOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: ListStreamsInput) = this()
    /* CompleteClass */
    override val input: ListStreamsInput = js.native
    val middlewareStack: MiddlewareStack[ListStreamsInput, ListStreamsOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[ListStreamsInput, ListStreamsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[ListStreamsInput, ListStreamsOutput] = js.native
  }
  
}

