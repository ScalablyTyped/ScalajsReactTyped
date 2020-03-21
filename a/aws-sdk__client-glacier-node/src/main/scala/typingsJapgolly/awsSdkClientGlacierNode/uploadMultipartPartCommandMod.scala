package typingsJapgolly.awsSdkClientGlacierNode

import typingsJapgolly.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsJapgolly.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientGlacierNode.typesUploadMultipartPartInputMod.UploadMultipartPartInput
import typingsJapgolly.awsSdkClientGlacierNode.typesUploadMultipartPartOutputMod.UploadMultipartPartOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/UploadMultipartPartCommand", JSImport.Namespace)
@js.native
object uploadMultipartPartCommandMod extends js.Object {
  @js.native
  class UploadMultipartPartCommand protected () extends Command[
          InputTypesUnion, 
          UploadMultipartPartInput[Readable], 
          OutputTypesUnion, 
          UploadMultipartPartOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: UploadMultipartPartInput[Readable]) = this()
    /* CompleteClass */
    override val input: UploadMultipartPartInput[Readable] = js.native
    val middlewareStack: MiddlewareStack[UploadMultipartPartInput[Readable], UploadMultipartPartOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[UploadMultipartPartInput[Readable], UploadMultipartPartOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[UploadMultipartPartInput[Readable], UploadMultipartPartOutput] = js.native
  }
  
}

