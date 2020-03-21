package typingsJapgolly.awsSdkClientKinesisBrowser

import typingsJapgolly.awsSdkClientKinesisBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.kinesisConfigurationMod.KinesisResolvedConfiguration
import typingsJapgolly.awsSdkClientKinesisBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientKinesisBrowser.typesRegisterStreamConsumerInputMod.RegisterStreamConsumerInput
import typingsJapgolly.awsSdkClientKinesisBrowser.typesRegisterStreamConsumerOutputMod.RegisterStreamConsumerOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kinesis-browser/commands/RegisterStreamConsumerCommand", JSImport.Namespace)
@js.native
object registerStreamConsumerCommandMod extends js.Object {
  @js.native
  class RegisterStreamConsumerCommand protected () extends Command[
          InputTypesUnion, 
          RegisterStreamConsumerInput, 
          OutputTypesUnion, 
          RegisterStreamConsumerOutput, 
          KinesisResolvedConfiguration, 
          Blob
        ] {
    def this(input: RegisterStreamConsumerInput) = this()
    /* CompleteClass */
    override val input: RegisterStreamConsumerInput = js.native
    val middlewareStack: MiddlewareStack[RegisterStreamConsumerInput, RegisterStreamConsumerOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[RegisterStreamConsumerInput, RegisterStreamConsumerOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: KinesisResolvedConfiguration
    ): Handler[RegisterStreamConsumerInput, RegisterStreamConsumerOutput] = js.native
  }
  
}

