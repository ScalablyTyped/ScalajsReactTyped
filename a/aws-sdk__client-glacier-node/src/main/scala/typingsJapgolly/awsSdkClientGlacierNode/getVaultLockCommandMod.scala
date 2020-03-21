package typingsJapgolly.awsSdkClientGlacierNode

import typingsJapgolly.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsJapgolly.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientGlacierNode.typesGetVaultLockInputMod.GetVaultLockInput
import typingsJapgolly.awsSdkClientGlacierNode.typesGetVaultLockOutputMod.GetVaultLockOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/GetVaultLockCommand", JSImport.Namespace)
@js.native
object getVaultLockCommandMod extends js.Object {
  @js.native
  class GetVaultLockCommand protected () extends Command[
          InputTypesUnion, 
          GetVaultLockInput, 
          OutputTypesUnion, 
          GetVaultLockOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetVaultLockInput) = this()
    /* CompleteClass */
    override val input: GetVaultLockInput = js.native
    val middlewareStack: MiddlewareStack[GetVaultLockInput, GetVaultLockOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[GetVaultLockInput, GetVaultLockOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[GetVaultLockInput, GetVaultLockOutput] = js.native
  }
  
}

