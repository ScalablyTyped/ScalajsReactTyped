package typingsJapgolly.awsSdkClientGlacierNode

import typingsJapgolly.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsJapgolly.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientGlacierNode.typesDeleteVaultAccessPolicyInputMod.DeleteVaultAccessPolicyInput
import typingsJapgolly.awsSdkClientGlacierNode.typesDeleteVaultAccessPolicyOutputMod.DeleteVaultAccessPolicyOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/DeleteVaultAccessPolicyCommand", JSImport.Namespace)
@js.native
object deleteVaultAccessPolicyCommandMod extends js.Object {
  @js.native
  class DeleteVaultAccessPolicyCommand protected () extends Command[
          InputTypesUnion, 
          DeleteVaultAccessPolicyInput, 
          OutputTypesUnion, 
          DeleteVaultAccessPolicyOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteVaultAccessPolicyInput) = this()
    /* CompleteClass */
    override val input: DeleteVaultAccessPolicyInput = js.native
    val middlewareStack: MiddlewareStack[DeleteVaultAccessPolicyInput, DeleteVaultAccessPolicyOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[DeleteVaultAccessPolicyInput, DeleteVaultAccessPolicyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[DeleteVaultAccessPolicyInput, DeleteVaultAccessPolicyOutput] = js.native
  }
  
}

