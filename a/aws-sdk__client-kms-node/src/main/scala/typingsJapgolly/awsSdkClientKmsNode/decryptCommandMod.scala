package typingsJapgolly.awsSdkClientKmsNode

import typingsJapgolly.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typingsJapgolly.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientKmsNode.typesDecryptInputMod.DecryptInput
import typingsJapgolly.awsSdkClientKmsNode.typesDecryptOutputMod.DecryptOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/DecryptCommand", JSImport.Namespace)
@js.native
object decryptCommandMod extends js.Object {
  @js.native
  class DecryptCommand protected () extends Command[
          InputTypesUnion, 
          DecryptInput, 
          OutputTypesUnion, 
          DecryptOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: DecryptInput) = this()
    /* CompleteClass */
    override val input: DecryptInput = js.native
    val middlewareStack: MiddlewareStack[DecryptInput, DecryptOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[DecryptInput, DecryptOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[DecryptInput, DecryptOutput] = js.native
  }
  
}

