package typingsJapgolly.awsSdkClientKinesisBrowser

import typingsJapgolly.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsJapgolly.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.typesDisableEnhancedMonitoringInputMod.DisableEnhancedMonitoringInput
import typingsJapgolly.awsSdkClientKinesisBrowser.typesDisableEnhancedMonitoringOutputMod.DisableEnhancedMonitoringOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/DisableEnhancedMonitoringCommand", JSImport.Namespace)
@js.native
object disableEnhancedMonitoringCommandMod extends js.Object {
  @js.native
  class DisableEnhancedMonitoringCommand protected () extends Command[
          InputTypesUnion, 
          DisableEnhancedMonitoringInput, 
          OutputTypesUnion, 
          DisableEnhancedMonitoringOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: DisableEnhancedMonitoringInput) = this()
    /* CompleteClass */
    override val input: DisableEnhancedMonitoringInput = js.native
    val middlewareStack: MiddlewareStack[
        DisableEnhancedMonitoringInput, 
        DisableEnhancedMonitoringOutput, 
        org.scalajs.dom.raw.Blob
      ] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[DisableEnhancedMonitoringInput, DisableEnhancedMonitoringOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[DisableEnhancedMonitoringInput, DisableEnhancedMonitoringOutput] = js.native
  }
  
}

