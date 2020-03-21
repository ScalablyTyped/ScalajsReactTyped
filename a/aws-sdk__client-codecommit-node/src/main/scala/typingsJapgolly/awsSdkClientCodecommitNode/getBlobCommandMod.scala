package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsJapgolly.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesGetBlobInputMod.GetBlobInput
import typingsJapgolly.awsSdkClientCodecommitNode.typesGetBlobOutputMod.GetBlobOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/GetBlobCommand", JSImport.Namespace)
@js.native
object getBlobCommandMod extends js.Object {
  @js.native
  class GetBlobCommand protected () extends Command[
          InputTypesUnion, 
          GetBlobInput, 
          OutputTypesUnion, 
          GetBlobOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetBlobInput) = this()
    /* CompleteClass */
    override val input: GetBlobInput = js.native
    val middlewareStack: MiddlewareStack[GetBlobInput, GetBlobOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetBlobInput, GetBlobOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetBlobInput, GetBlobOutput] = js.native
  }
  
}

