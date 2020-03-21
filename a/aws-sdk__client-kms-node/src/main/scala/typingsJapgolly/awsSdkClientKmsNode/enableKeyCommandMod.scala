package typingsJapgolly.awsSdkClientKmsNode

import typingsJapgolly.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typingsJapgolly.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientKmsNode.typesEnableKeyInputMod.EnableKeyInput
import typingsJapgolly.awsSdkClientKmsNode.typesEnableKeyOutputMod.EnableKeyOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/EnableKeyCommand", JSImport.Namespace)
@js.native
object enableKeyCommandMod extends js.Object {
  @js.native
  class EnableKeyCommand protected () extends Command[
          InputTypesUnion, 
          EnableKeyInput, 
          OutputTypesUnion, 
          EnableKeyOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: EnableKeyInput) = this()
    /* CompleteClass */
    override val input: EnableKeyInput = js.native
    val middlewareStack: MiddlewareStack[EnableKeyInput, EnableKeyOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[EnableKeyInput, EnableKeyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[EnableKeyInput, EnableKeyOutput] = js.native
  }
  
}

