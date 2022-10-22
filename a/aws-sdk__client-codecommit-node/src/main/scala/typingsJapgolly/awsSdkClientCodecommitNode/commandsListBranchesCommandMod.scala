package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsJapgolly.awsSdkClientCodecommitNode.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesListBranchesInputMod.ListBranchesInput
import typingsJapgolly.awsSdkClientCodecommitNode.typesListBranchesOutputMod.ListBranchesOutput
import typingsJapgolly.awsSdkClientCodecommitNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsListBranchesCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/ListBranchesCommand", "ListBranchesCommand")
  @js.native
  open class ListBranchesCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ListBranchesInput, 
          OutputTypesUnion, 
          ListBranchesOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: ListBranchesInput) = this()
    
    /* CompleteClass */
    override val input: ListBranchesInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ListBranchesInput, ListBranchesOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[ListBranchesInput, ListBranchesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CodeCommitResolvedConfiguration,
      options: Any
    ): Handler[ListBranchesInput, ListBranchesOutput] = js.native
  }
}
