package typingsJapgolly.awsSdkClientKinesisBrowser

import typingsJapgolly.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsJapgolly.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.typesListStreamConsumersInputMod.ListStreamConsumersInput
import typingsJapgolly.awsSdkClientKinesisBrowser.typesListStreamConsumersOutputMod.ListStreamConsumersOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/ListStreamConsumersCommand", JSImport.Namespace)
@js.native
object listStreamConsumersCommandMod extends js.Object {
  @js.native
  class ListStreamConsumersCommand protected () extends Command[
          InputTypesUnion, 
          ListStreamConsumersInput, 
          OutputTypesUnion, 
          ListStreamConsumersOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: ListStreamConsumersInput) = this()
    /* CompleteClass */
    override val input: ListStreamConsumersInput = js.native
    val middlewareStack: MiddlewareStack[ListStreamConsumersInput, ListStreamConsumersOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[ListStreamConsumersInput, ListStreamConsumersOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[ListStreamConsumersInput, ListStreamConsumersOutput] = js.native
  }
  
}

