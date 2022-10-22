package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsJapgolly.awsSdkClientCodecommitNode.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesListPullRequestsInputMod.ListPullRequestsInput
import typingsJapgolly.awsSdkClientCodecommitNode.typesListPullRequestsOutputMod.ListPullRequestsOutput
import typingsJapgolly.awsSdkClientCodecommitNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsListPullRequestsCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/ListPullRequestsCommand", "ListPullRequestsCommand")
  @js.native
  open class ListPullRequestsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ListPullRequestsInput, 
          OutputTypesUnion, 
          ListPullRequestsOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: ListPullRequestsInput) = this()
    
    /* CompleteClass */
    override val input: ListPullRequestsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ListPullRequestsInput, ListPullRequestsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[ListPullRequestsInput, ListPullRequestsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CodeCommitResolvedConfiguration,
      options: Any
    ): Handler[ListPullRequestsInput, ListPullRequestsOutput] = js.native
  }
}
