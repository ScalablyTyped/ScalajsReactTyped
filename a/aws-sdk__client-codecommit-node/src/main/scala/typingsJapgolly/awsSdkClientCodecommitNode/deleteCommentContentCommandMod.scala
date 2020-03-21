package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsJapgolly.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesDeleteCommentContentInputMod.DeleteCommentContentInput
import typingsJapgolly.awsSdkClientCodecommitNode.typesDeleteCommentContentOutputMod.DeleteCommentContentOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/DeleteCommentContentCommand", JSImport.Namespace)
@js.native
object deleteCommentContentCommandMod extends js.Object {
  @js.native
  class DeleteCommentContentCommand protected () extends Command[
          InputTypesUnion, 
          DeleteCommentContentInput, 
          OutputTypesUnion, 
          DeleteCommentContentOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteCommentContentInput) = this()
    /* CompleteClass */
    override val input: DeleteCommentContentInput = js.native
    val middlewareStack: MiddlewareStack[DeleteCommentContentInput, DeleteCommentContentOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[DeleteCommentContentInput, DeleteCommentContentOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[DeleteCommentContentInput, DeleteCommentContentOutput] = js.native
  }
  
}

