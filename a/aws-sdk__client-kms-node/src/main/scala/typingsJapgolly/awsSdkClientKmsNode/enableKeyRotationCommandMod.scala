package typingsJapgolly.awsSdkClientKmsNode

import typingsJapgolly.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typingsJapgolly.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientKmsNode.typesEnableKeyRotationInputMod.EnableKeyRotationInput
import typingsJapgolly.awsSdkClientKmsNode.typesEnableKeyRotationOutputMod.EnableKeyRotationOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/EnableKeyRotationCommand", JSImport.Namespace)
@js.native
object enableKeyRotationCommandMod extends js.Object {
  @js.native
  class EnableKeyRotationCommand protected () extends Command[
          InputTypesUnion, 
          EnableKeyRotationInput, 
          OutputTypesUnion, 
          EnableKeyRotationOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: EnableKeyRotationInput) = this()
    /* CompleteClass */
    override val input: EnableKeyRotationInput = js.native
    val middlewareStack: MiddlewareStack[EnableKeyRotationInput, EnableKeyRotationOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[EnableKeyRotationInput, EnableKeyRotationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[EnableKeyRotationInput, EnableKeyRotationOutput] = js.native
  }
  
}

