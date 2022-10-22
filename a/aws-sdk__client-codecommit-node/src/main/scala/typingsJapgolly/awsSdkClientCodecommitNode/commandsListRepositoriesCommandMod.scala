package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsJapgolly.awsSdkClientCodecommitNode.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesListRepositoriesInputMod.ListRepositoriesInput
import typingsJapgolly.awsSdkClientCodecommitNode.typesListRepositoriesOutputMod.ListRepositoriesOutput
import typingsJapgolly.awsSdkClientCodecommitNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsListRepositoriesCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/ListRepositoriesCommand", "ListRepositoriesCommand")
  @js.native
  open class ListRepositoriesCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ListRepositoriesInput, 
          OutputTypesUnion, 
          ListRepositoriesOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: ListRepositoriesInput) = this()
    
    /* CompleteClass */
    override val input: ListRepositoriesInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ListRepositoriesInput, ListRepositoriesOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[ListRepositoriesInput, ListRepositoriesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CodeCommitResolvedConfiguration,
      options: Any
    ): Handler[ListRepositoriesInput, ListRepositoriesOutput] = js.native
  }
}
