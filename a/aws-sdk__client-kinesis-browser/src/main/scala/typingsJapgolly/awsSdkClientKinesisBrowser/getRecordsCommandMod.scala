package typingsJapgolly.awsSdkClientKinesisBrowser

import typingsJapgolly.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsJapgolly.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.typesGetRecordsInputMod.GetRecordsInput
import typingsJapgolly.awsSdkClientKinesisBrowser.typesGetRecordsOutputMod.GetRecordsOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/GetRecordsCommand", JSImport.Namespace)
@js.native
object getRecordsCommandMod extends js.Object {
  @js.native
  class GetRecordsCommand protected () extends Command[
          InputTypesUnion, 
          GetRecordsInput, 
          OutputTypesUnion, 
          GetRecordsOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetRecordsInput) = this()
    /* CompleteClass */
    override val input: GetRecordsInput = js.native
    val middlewareStack: MiddlewareStack[GetRecordsInput, GetRecordsOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[GetRecordsInput, GetRecordsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[GetRecordsInput, GetRecordsOutput] = js.native
  }
  
}

