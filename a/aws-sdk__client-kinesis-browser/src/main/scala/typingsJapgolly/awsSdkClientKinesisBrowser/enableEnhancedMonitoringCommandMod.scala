package typingsJapgolly.awsSdkClientKinesisBrowser

import typingsJapgolly.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsJapgolly.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.typesEnableEnhancedMonitoringInputMod.EnableEnhancedMonitoringInput
import typingsJapgolly.awsSdkClientKinesisBrowser.typesEnableEnhancedMonitoringOutputMod.EnableEnhancedMonitoringOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/EnableEnhancedMonitoringCommand", JSImport.Namespace)
@js.native
object enableEnhancedMonitoringCommandMod extends js.Object {
  @js.native
  class EnableEnhancedMonitoringCommand protected () extends Command[
          InputTypesUnion, 
          EnableEnhancedMonitoringInput, 
          OutputTypesUnion, 
          EnableEnhancedMonitoringOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: EnableEnhancedMonitoringInput) = this()
    /* CompleteClass */
    override val input: EnableEnhancedMonitoringInput = js.native
    val middlewareStack: MiddlewareStack[
        EnableEnhancedMonitoringInput, 
        EnableEnhancedMonitoringOutput, 
        org.scalajs.dom.raw.Blob
      ] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[EnableEnhancedMonitoringInput, EnableEnhancedMonitoringOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[EnableEnhancedMonitoringInput, EnableEnhancedMonitoringOutput] = js.native
  }
  
}

