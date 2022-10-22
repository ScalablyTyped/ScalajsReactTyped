package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsJapgolly.awsSdkClientCodecommitNode.typesGetBranchInputMod.GetBranchInput
import typingsJapgolly.awsSdkClientCodecommitNode.typesGetBranchOutputMod.GetBranchOutput
import typingsJapgolly.awsSdkClientCodecommitNode.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetBranchCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/GetBranchCommand", "GetBranchCommand")
  @js.native
  open class GetBranchCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetBranchInput, 
          OutputTypesUnion, 
          GetBranchOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: GetBranchInput) = this()
    
    /* CompleteClass */
    override val input: GetBranchInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetBranchInput, GetBranchOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetBranchInput, GetBranchOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CodeCommitResolvedConfiguration,
      options: Any
    ): Handler[GetBranchInput, GetBranchOutput] = js.native
  }
}
