package typingsJapgolly.awsSdkClientKinesisBrowser

import typingsJapgolly.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsJapgolly.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.typesDecreaseStreamRetentionPeriodInputMod.DecreaseStreamRetentionPeriodInput
import typingsJapgolly.awsSdkClientKinesisBrowser.typesDecreaseStreamRetentionPeriodOutputMod.DecreaseStreamRetentionPeriodOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/DecreaseStreamRetentionPeriodCommand", JSImport.Namespace)
@js.native
object decreaseStreamRetentionPeriodCommandMod extends js.Object {
  @js.native
  class DecreaseStreamRetentionPeriodCommand protected () extends Command[
          InputTypesUnion, 
          DecreaseStreamRetentionPeriodInput, 
          OutputTypesUnion, 
          DecreaseStreamRetentionPeriodOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: DecreaseStreamRetentionPeriodInput) = this()
    /* CompleteClass */
    override val input: DecreaseStreamRetentionPeriodInput = js.native
    val middlewareStack: MiddlewareStack[
        DecreaseStreamRetentionPeriodInput, 
        DecreaseStreamRetentionPeriodOutput, 
        org.scalajs.dom.raw.Blob
      ] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[DecreaseStreamRetentionPeriodInput, DecreaseStreamRetentionPeriodOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[DecreaseStreamRetentionPeriodInput, DecreaseStreamRetentionPeriodOutput] = js.native
  }
  
}

