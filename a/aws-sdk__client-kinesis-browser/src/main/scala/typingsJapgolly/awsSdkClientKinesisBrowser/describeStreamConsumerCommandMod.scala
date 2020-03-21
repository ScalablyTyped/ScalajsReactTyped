package typingsJapgolly.awsSdkClientKinesisBrowser

import typingsJapgolly.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsJapgolly.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.typesDescribeStreamConsumerInputMod.DescribeStreamConsumerInput
import typingsJapgolly.awsSdkClientKinesisBrowser.typesDescribeStreamConsumerOutputMod.DescribeStreamConsumerOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/DescribeStreamConsumerCommand", JSImport.Namespace)
@js.native
object describeStreamConsumerCommandMod extends js.Object {
  @js.native
  class DescribeStreamConsumerCommand protected () extends Command[
          InputTypesUnion, 
          DescribeStreamConsumerInput, 
          OutputTypesUnion, 
          DescribeStreamConsumerOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: DescribeStreamConsumerInput) = this()
    /* CompleteClass */
    override val input: DescribeStreamConsumerInput = js.native
    val middlewareStack: MiddlewareStack[DescribeStreamConsumerInput, DescribeStreamConsumerOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[DescribeStreamConsumerInput, DescribeStreamConsumerOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[DescribeStreamConsumerInput, DescribeStreamConsumerOutput] = js.native
  }
  
}

