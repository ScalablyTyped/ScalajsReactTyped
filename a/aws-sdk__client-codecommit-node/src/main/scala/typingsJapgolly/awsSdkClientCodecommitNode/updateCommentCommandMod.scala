package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsJapgolly.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesUpdateCommentInputMod.UpdateCommentInput
import typingsJapgolly.awsSdkClientCodecommitNode.typesUpdateCommentOutputMod.UpdateCommentOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/UpdateCommentCommand", JSImport.Namespace)
@js.native
object updateCommentCommandMod extends js.Object {
  @js.native
  class UpdateCommentCommand protected () extends Command[
          InputTypesUnion, 
          UpdateCommentInput, 
          OutputTypesUnion, 
          UpdateCommentOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: UpdateCommentInput) = this()
    /* CompleteClass */
    override val input: UpdateCommentInput = js.native
    val middlewareStack: MiddlewareStack[UpdateCommentInput, UpdateCommentOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[UpdateCommentInput, UpdateCommentOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[UpdateCommentInput, UpdateCommentOutput] = js.native
  }
  
}

