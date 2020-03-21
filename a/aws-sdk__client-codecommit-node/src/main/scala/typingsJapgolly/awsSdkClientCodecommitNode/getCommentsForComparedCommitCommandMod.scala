package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsJapgolly.awsSdkClientCodecommitNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesGetCommentsForComparedCommitInputMod.GetCommentsForComparedCommitInput
import typingsJapgolly.awsSdkClientCodecommitNode.typesGetCommentsForComparedCommitOutputMod.GetCommentsForComparedCommitOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-codecommit-node/commands/GetCommentsForComparedCommitCommand", JSImport.Namespace)
@js.native
object getCommentsForComparedCommitCommandMod extends js.Object {
  @js.native
  class GetCommentsForComparedCommitCommand protected () extends Command[
          InputTypesUnion, 
          GetCommentsForComparedCommitInput, 
          OutputTypesUnion, 
          GetCommentsForComparedCommitOutput, 
          CodeCommitResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetCommentsForComparedCommitInput) = this()
    /* CompleteClass */
    override val input: GetCommentsForComparedCommitInput = js.native
    val middlewareStack: MiddlewareStack[GetCommentsForComparedCommitInput, GetCommentsForComparedCommitOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetCommentsForComparedCommitInput, GetCommentsForComparedCommitOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetCommentsForComparedCommitInput, GetCommentsForComparedCommitOutput] = js.native
  }
  
}

