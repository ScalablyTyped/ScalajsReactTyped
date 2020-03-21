package typingsJapgolly.awsSdkClientKinesisBrowser

import typingsJapgolly.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsJapgolly.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.typesIncreaseStreamRetentionPeriodInputMod.IncreaseStreamRetentionPeriodInput
import typingsJapgolly.awsSdkClientKinesisBrowser.typesIncreaseStreamRetentionPeriodOutputMod.IncreaseStreamRetentionPeriodOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/IncreaseStreamRetentionPeriodCommand", JSImport.Namespace)
@js.native
object increaseStreamRetentionPeriodCommandMod extends js.Object {
  @js.native
  class IncreaseStreamRetentionPeriodCommand protected () extends Command[
          InputTypesUnion, 
          IncreaseStreamRetentionPeriodInput, 
          OutputTypesUnion, 
          IncreaseStreamRetentionPeriodOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: IncreaseStreamRetentionPeriodInput) = this()
    /* CompleteClass */
    override val input: IncreaseStreamRetentionPeriodInput = js.native
    val middlewareStack: MiddlewareStack[
        IncreaseStreamRetentionPeriodInput, 
        IncreaseStreamRetentionPeriodOutput, 
        org.scalajs.dom.raw.Blob
      ] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[IncreaseStreamRetentionPeriodInput, IncreaseStreamRetentionPeriodOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[IncreaseStreamRetentionPeriodInput, IncreaseStreamRetentionPeriodOutput] = js.native
  }
  
}

