package typingsJapgolly.awsSdkClientKinesisBrowser

import typingsJapgolly.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsJapgolly.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.typesDescribeStreamSummaryInputMod.DescribeStreamSummaryInput
import typingsJapgolly.awsSdkClientKinesisBrowser.typesDescribeStreamSummaryOutputMod.DescribeStreamSummaryOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/DescribeStreamSummaryCommand", JSImport.Namespace)
@js.native
object describeStreamSummaryCommandMod extends js.Object {
  @js.native
  class DescribeStreamSummaryCommand protected () extends Command[
          InputTypesUnion, 
          DescribeStreamSummaryInput, 
          OutputTypesUnion, 
          DescribeStreamSummaryOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: DescribeStreamSummaryInput) = this()
    /* CompleteClass */
    override val input: DescribeStreamSummaryInput = js.native
    val middlewareStack: MiddlewareStack[DescribeStreamSummaryInput, DescribeStreamSummaryOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[DescribeStreamSummaryInput, DescribeStreamSummaryOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[DescribeStreamSummaryInput, DescribeStreamSummaryOutput] = js.native
  }
  
}

