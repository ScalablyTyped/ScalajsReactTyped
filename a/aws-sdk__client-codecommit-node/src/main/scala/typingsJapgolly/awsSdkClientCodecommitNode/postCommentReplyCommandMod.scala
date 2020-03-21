package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsJapgolly.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesPostCommentReplyInputMod.PostCommentReplyInput
import typingsJapgolly.awsSdkClientCodecommitNode.typesPostCommentReplyOutputMod.PostCommentReplyOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/PostCommentReplyCommand", JSImport.Namespace)
@js.native
object postCommentReplyCommandMod extends js.Object {
  @js.native
  class PostCommentReplyCommand protected () extends Command[
          InputTypesUnion, 
          PostCommentReplyInput, 
          OutputTypesUnion, 
          PostCommentReplyOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: PostCommentReplyInput) = this()
    /* CompleteClass */
    override val input: PostCommentReplyInput = js.native
    val middlewareStack: MiddlewareStack[PostCommentReplyInput, PostCommentReplyOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[PostCommentReplyInput, PostCommentReplyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[PostCommentReplyInput, PostCommentReplyOutput] = js.native
  }
  
}

