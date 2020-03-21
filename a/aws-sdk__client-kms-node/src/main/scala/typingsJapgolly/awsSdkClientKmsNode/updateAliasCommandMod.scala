package typingsJapgolly.awsSdkClientKmsNode

import typingsJapgolly.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typingsJapgolly.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientKmsNode.typesUpdateAliasInputMod.UpdateAliasInput
import typingsJapgolly.awsSdkClientKmsNode.typesUpdateAliasOutputMod.UpdateAliasOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/UpdateAliasCommand", JSImport.Namespace)
@js.native
object updateAliasCommandMod extends js.Object {
  @js.native
  class UpdateAliasCommand protected () extends Command[
          InputTypesUnion, 
          UpdateAliasInput, 
          OutputTypesUnion, 
          UpdateAliasOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: UpdateAliasInput) = this()
    /* CompleteClass */
    override val input: UpdateAliasInput = js.native
    val middlewareStack: MiddlewareStack[UpdateAliasInput, UpdateAliasOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[UpdateAliasInput, UpdateAliasOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[UpdateAliasInput, UpdateAliasOutput] = js.native
  }
  
}

