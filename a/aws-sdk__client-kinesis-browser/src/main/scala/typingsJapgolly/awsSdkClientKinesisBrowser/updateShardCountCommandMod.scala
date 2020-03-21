package typingsJapgolly.awsSdkClientKinesisBrowser

import typingsJapgolly.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsJapgolly.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.typesUpdateShardCountInputMod.UpdateShardCountInput
import typingsJapgolly.awsSdkClientKinesisBrowser.typesUpdateShardCountOutputMod.UpdateShardCountOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/UpdateShardCountCommand", JSImport.Namespace)
@js.native
object updateShardCountCommandMod extends js.Object {
  @js.native
  class UpdateShardCountCommand protected () extends Command[
          InputTypesUnion, 
          UpdateShardCountInput, 
          OutputTypesUnion, 
          UpdateShardCountOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: UpdateShardCountInput) = this()
    /* CompleteClass */
    override val input: UpdateShardCountInput = js.native
    val middlewareStack: MiddlewareStack[UpdateShardCountInput, UpdateShardCountOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[UpdateShardCountInput, UpdateShardCountOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[UpdateShardCountInput, UpdateShardCountOutput] = js.native
  }
  
}

