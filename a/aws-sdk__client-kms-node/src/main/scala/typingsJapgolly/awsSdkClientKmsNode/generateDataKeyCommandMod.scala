package typingsJapgolly.awsSdkClientKmsNode

import typingsJapgolly.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typingsJapgolly.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientKmsNode.typesGenerateDataKeyInputMod.GenerateDataKeyInput
import typingsJapgolly.awsSdkClientKmsNode.typesGenerateDataKeyOutputMod.GenerateDataKeyOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/GenerateDataKeyCommand", JSImport.Namespace)
@js.native
object generateDataKeyCommandMod extends js.Object {
  @js.native
  class GenerateDataKeyCommand protected () extends Command[
          InputTypesUnion, 
          GenerateDataKeyInput, 
          OutputTypesUnion, 
          GenerateDataKeyOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: GenerateDataKeyInput) = this()
    /* CompleteClass */
    override val input: GenerateDataKeyInput = js.native
    val middlewareStack: MiddlewareStack[GenerateDataKeyInput, GenerateDataKeyOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[GenerateDataKeyInput, GenerateDataKeyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[GenerateDataKeyInput, GenerateDataKeyOutput] = js.native
  }
  
}

