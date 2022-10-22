package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsJapgolly.awsSdkClientCodecommitNode.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesUpdateRepositoryNameInputMod.UpdateRepositoryNameInput
import typingsJapgolly.awsSdkClientCodecommitNode.typesUpdateRepositoryNameOutputMod.UpdateRepositoryNameOutput
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsUpdateRepositoryNameCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/UpdateRepositoryNameCommand", "UpdateRepositoryNameCommand")
  @js.native
  open class UpdateRepositoryNameCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          UpdateRepositoryNameInput, 
          OutputTypesUnion, 
          UpdateRepositoryNameOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: UpdateRepositoryNameInput) = this()
    
    /* CompleteClass */
    override val input: UpdateRepositoryNameInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[UpdateRepositoryNameInput, UpdateRepositoryNameOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[UpdateRepositoryNameInput, UpdateRepositoryNameOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CodeCommitResolvedConfiguration,
      options: Any
    ): Handler[UpdateRepositoryNameInput, UpdateRepositoryNameOutput] = js.native
  }
}
