package typingsJapgolly.awsSdkClientKmsNode

import typingsJapgolly.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typingsJapgolly.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientKmsNode.typesCreateAliasInputMod.CreateAliasInput
import typingsJapgolly.awsSdkClientKmsNode.typesCreateAliasOutputMod.CreateAliasOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/CreateAliasCommand", JSImport.Namespace)
@js.native
object createAliasCommandMod extends js.Object {
  @js.native
  class CreateAliasCommand protected () extends Command[
          InputTypesUnion, 
          CreateAliasInput, 
          OutputTypesUnion, 
          CreateAliasOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: CreateAliasInput) = this()
    /* CompleteClass */
    override val input: CreateAliasInput = js.native
    val middlewareStack: MiddlewareStack[CreateAliasInput, CreateAliasOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[CreateAliasInput, CreateAliasOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[CreateAliasInput, CreateAliasOutput] = js.native
  }
  
}

