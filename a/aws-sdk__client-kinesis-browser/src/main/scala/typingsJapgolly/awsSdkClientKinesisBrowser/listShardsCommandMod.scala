package typingsJapgolly.awsSdkClientKinesisBrowser

import typingsJapgolly.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsJapgolly.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.typesListShardsInputMod.ListShardsInput
import typingsJapgolly.awsSdkClientKinesisBrowser.typesListShardsOutputMod.ListShardsOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/ListShardsCommand", JSImport.Namespace)
@js.native
object listShardsCommandMod extends js.Object {
  @js.native
  class ListShardsCommand protected () extends Command[
          InputTypesUnion, 
          ListShardsInput, 
          OutputTypesUnion, 
          ListShardsOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: ListShardsInput) = this()
    /* CompleteClass */
    override val input: ListShardsInput = js.native
    val middlewareStack: MiddlewareStack[ListShardsInput, ListShardsOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[ListShardsInput, ListShardsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[ListShardsInput, ListShardsOutput] = js.native
  }
  
}

