package typingsJapgolly.awsSdkClientGlacierNode

import typingsJapgolly.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsJapgolly.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientGlacierNode.typesAbortVaultLockInputMod.AbortVaultLockInput
import typingsJapgolly.awsSdkClientGlacierNode.typesAbortVaultLockOutputMod.AbortVaultLockOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/AbortVaultLockCommand", JSImport.Namespace)
@js.native
object abortVaultLockCommandMod extends js.Object {
  @js.native
  class AbortVaultLockCommand protected () extends Command[
          InputTypesUnion, 
          AbortVaultLockInput, 
          OutputTypesUnion, 
          AbortVaultLockOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: AbortVaultLockInput) = this()
    /* CompleteClass */
    override val input: AbortVaultLockInput = js.native
    val middlewareStack: MiddlewareStack[AbortVaultLockInput, AbortVaultLockOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[AbortVaultLockInput, AbortVaultLockOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[AbortVaultLockInput, AbortVaultLockOutput] = js.native
  }
  
}

