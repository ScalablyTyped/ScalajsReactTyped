package typingsJapgolly.awsSdkClientGlacierNode

import typingsJapgolly.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsJapgolly.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientGlacierNode.typesSetVaultAccessPolicyInputMod.SetVaultAccessPolicyInput
import typingsJapgolly.awsSdkClientGlacierNode.typesSetVaultAccessPolicyOutputMod.SetVaultAccessPolicyOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/SetVaultAccessPolicyCommand", JSImport.Namespace)
@js.native
object setVaultAccessPolicyCommandMod extends js.Object {
  @js.native
  class SetVaultAccessPolicyCommand protected () extends Command[
          InputTypesUnion, 
          SetVaultAccessPolicyInput, 
          OutputTypesUnion, 
          SetVaultAccessPolicyOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: SetVaultAccessPolicyInput) = this()
    /* CompleteClass */
    override val input: SetVaultAccessPolicyInput = js.native
    val middlewareStack: MiddlewareStack[SetVaultAccessPolicyInput, SetVaultAccessPolicyOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[SetVaultAccessPolicyInput, SetVaultAccessPolicyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[SetVaultAccessPolicyInput, SetVaultAccessPolicyOutput] = js.native
  }
  
}

