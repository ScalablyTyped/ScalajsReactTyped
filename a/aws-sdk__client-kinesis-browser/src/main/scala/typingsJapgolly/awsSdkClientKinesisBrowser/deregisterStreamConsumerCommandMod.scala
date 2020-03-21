package typingsJapgolly.awsSdkClientKinesisBrowser

import typingsJapgolly.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsJapgolly.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.typesDeregisterStreamConsumerInputMod.DeregisterStreamConsumerInput
import typingsJapgolly.awsSdkClientKinesisBrowser.typesDeregisterStreamConsumerOutputMod.DeregisterStreamConsumerOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/DeregisterStreamConsumerCommand", JSImport.Namespace)
@js.native
object deregisterStreamConsumerCommandMod extends js.Object {
  @js.native
  class DeregisterStreamConsumerCommand protected () extends Command[
          InputTypesUnion, 
          DeregisterStreamConsumerInput, 
          OutputTypesUnion, 
          DeregisterStreamConsumerOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeregisterStreamConsumerInput) = this()
    /* CompleteClass */
    override val input: DeregisterStreamConsumerInput = js.native
    val middlewareStack: MiddlewareStack[
        DeregisterStreamConsumerInput, 
        DeregisterStreamConsumerOutput, 
        org.scalajs.dom.raw.Blob
      ] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[DeregisterStreamConsumerInput, DeregisterStreamConsumerOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[DeregisterStreamConsumerInput, DeregisterStreamConsumerOutput] = js.native
  }
  
}

