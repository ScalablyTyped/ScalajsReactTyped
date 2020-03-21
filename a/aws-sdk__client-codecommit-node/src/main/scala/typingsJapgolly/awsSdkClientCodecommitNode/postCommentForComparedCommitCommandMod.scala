package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsJapgolly.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesPostCommentForComparedCommitInputMod.PostCommentForComparedCommitInput
import typingsJapgolly.awsSdkClientCodecommitNode.typesPostCommentForComparedCommitOutputMod.PostCommentForComparedCommitOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/PostCommentForComparedCommitCommand", JSImport.Namespace)
@js.native
object postCommentForComparedCommitCommandMod extends js.Object {
  @js.native
  class PostCommentForComparedCommitCommand protected () extends Command[
          InputTypesUnion, 
          PostCommentForComparedCommitInput, 
          OutputTypesUnion, 
          PostCommentForComparedCommitOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: PostCommentForComparedCommitInput) = this()
    /* CompleteClass */
    override val input: PostCommentForComparedCommitInput = js.native
    val middlewareStack: MiddlewareStack[PostCommentForComparedCommitInput, PostCommentForComparedCommitOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[PostCommentForComparedCommitInput, PostCommentForComparedCommitOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[PostCommentForComparedCommitInput, PostCommentForComparedCommitOutput] = js.native
  }
  
}

