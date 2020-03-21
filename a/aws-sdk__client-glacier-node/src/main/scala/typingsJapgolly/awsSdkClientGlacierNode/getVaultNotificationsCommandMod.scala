package typingsJapgolly.awsSdkClientGlacierNode

import typingsJapgolly.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsJapgolly.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientGlacierNode.typesGetVaultNotificationsInputMod.GetVaultNotificationsInput
import typingsJapgolly.awsSdkClientGlacierNode.typesGetVaultNotificationsOutputMod.GetVaultNotificationsOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/GetVaultNotificationsCommand", JSImport.Namespace)
@js.native
object getVaultNotificationsCommandMod extends js.Object {
  @js.native
  class GetVaultNotificationsCommand protected () extends Command[
          InputTypesUnion, 
          GetVaultNotificationsInput, 
          OutputTypesUnion, 
          GetVaultNotificationsOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetVaultNotificationsInput) = this()
    /* CompleteClass */
    override val input: GetVaultNotificationsInput = js.native
    val middlewareStack: MiddlewareStack[GetVaultNotificationsInput, GetVaultNotificationsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[GetVaultNotificationsInput, GetVaultNotificationsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[GetVaultNotificationsInput, GetVaultNotificationsOutput] = js.native
  }
  
}

