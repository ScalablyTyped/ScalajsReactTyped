package typingsJapgolly.awsSdkClientKmsNode

import typingsJapgolly.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typingsJapgolly.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientKmsNode.typesCreateKeyInputMod.CreateKeyInput
import typingsJapgolly.awsSdkClientKmsNode.typesCreateKeyOutputMod.CreateKeyOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/CreateKeyCommand", JSImport.Namespace)
@js.native
object createKeyCommandMod extends js.Object {
  @js.native
  class CreateKeyCommand protected () extends Command[
          InputTypesUnion, 
          CreateKeyInput, 
          OutputTypesUnion, 
          CreateKeyOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: CreateKeyInput) = this()
    /* CompleteClass */
    override val input: CreateKeyInput = js.native
    val middlewareStack: MiddlewareStack[CreateKeyInput, CreateKeyOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[CreateKeyInput, CreateKeyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[CreateKeyInput, CreateKeyOutput] = js.native
  }
  
}

