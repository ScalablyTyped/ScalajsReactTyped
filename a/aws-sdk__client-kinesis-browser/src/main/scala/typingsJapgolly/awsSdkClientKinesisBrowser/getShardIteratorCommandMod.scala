package typingsJapgolly.awsSdkClientKinesisBrowser

import typingsJapgolly.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsJapgolly.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.typesGetShardIteratorInputMod.GetShardIteratorInput
import typingsJapgolly.awsSdkClientKinesisBrowser.typesGetShardIteratorOutputMod.GetShardIteratorOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/GetShardIteratorCommand", JSImport.Namespace)
@js.native
object getShardIteratorCommandMod extends js.Object {
  @js.native
  class GetShardIteratorCommand protected () extends Command[
          InputTypesUnion, 
          GetShardIteratorInput, 
          OutputTypesUnion, 
          GetShardIteratorOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetShardIteratorInput) = this()
    /* CompleteClass */
    override val input: GetShardIteratorInput = js.native
    val middlewareStack: MiddlewareStack[GetShardIteratorInput, GetShardIteratorOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[GetShardIteratorInput, GetShardIteratorOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[GetShardIteratorInput, GetShardIteratorOutput] = js.native
  }
  
}

