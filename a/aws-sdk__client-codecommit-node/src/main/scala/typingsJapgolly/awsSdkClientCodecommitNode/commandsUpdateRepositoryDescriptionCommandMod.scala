package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsJapgolly.awsSdkClientCodecommitNode.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesUpdateRepositoryDescriptionInputMod.UpdateRepositoryDescriptionInput
import typingsJapgolly.awsSdkClientCodecommitNode.typesUpdateRepositoryDescriptionOutputMod.UpdateRepositoryDescriptionOutput
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsUpdateRepositoryDescriptionCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/UpdateRepositoryDescriptionCommand", "UpdateRepositoryDescriptionCommand")
  @js.native
  open class UpdateRepositoryDescriptionCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          UpdateRepositoryDescriptionInput, 
          OutputTypesUnion, 
          UpdateRepositoryDescriptionOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: UpdateRepositoryDescriptionInput) = this()
    
    /* CompleteClass */
    override val input: UpdateRepositoryDescriptionInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[UpdateRepositoryDescriptionInput, UpdateRepositoryDescriptionOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[UpdateRepositoryDescriptionInput, UpdateRepositoryDescriptionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CodeCommitResolvedConfiguration,
      options: Any
    ): Handler[UpdateRepositoryDescriptionInput, UpdateRepositoryDescriptionOutput] = js.native
  }
}
