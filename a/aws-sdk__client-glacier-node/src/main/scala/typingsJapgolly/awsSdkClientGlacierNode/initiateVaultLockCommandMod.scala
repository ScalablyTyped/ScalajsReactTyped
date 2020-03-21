package typingsJapgolly.awsSdkClientGlacierNode

import typingsJapgolly.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsJapgolly.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientGlacierNode.typesInitiateVaultLockInputMod.InitiateVaultLockInput
import typingsJapgolly.awsSdkClientGlacierNode.typesInitiateVaultLockOutputMod.InitiateVaultLockOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/InitiateVaultLockCommand", JSImport.Namespace)
@js.native
object initiateVaultLockCommandMod extends js.Object {
  @js.native
  class InitiateVaultLockCommand protected () extends Command[
          InputTypesUnion, 
          InitiateVaultLockInput, 
          OutputTypesUnion, 
          InitiateVaultLockOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: InitiateVaultLockInput) = this()
    /* CompleteClass */
    override val input: InitiateVaultLockInput = js.native
    val middlewareStack: MiddlewareStack[InitiateVaultLockInput, InitiateVaultLockOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[InitiateVaultLockInput, InitiateVaultLockOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[InitiateVaultLockInput, InitiateVaultLockOutput] = js.native
  }
  
}

