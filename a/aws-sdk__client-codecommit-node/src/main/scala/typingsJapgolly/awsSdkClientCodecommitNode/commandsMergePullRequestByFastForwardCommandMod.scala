package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsJapgolly.awsSdkClientCodecommitNode.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesMergePullRequestByFastForwardInputMod.MergePullRequestByFastForwardInput
import typingsJapgolly.awsSdkClientCodecommitNode.typesMergePullRequestByFastForwardOutputMod.MergePullRequestByFastForwardOutput
import typingsJapgolly.awsSdkClientCodecommitNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsMergePullRequestByFastForwardCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/MergePullRequestByFastForwardCommand", "MergePullRequestByFastForwardCommand")
  @js.native
  open class MergePullRequestByFastForwardCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          MergePullRequestByFastForwardInput, 
          OutputTypesUnion, 
          MergePullRequestByFastForwardOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: MergePullRequestByFastForwardInput) = this()
    
    /* CompleteClass */
    override val input: MergePullRequestByFastForwardInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[MergePullRequestByFastForwardInput, MergePullRequestByFastForwardOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[MergePullRequestByFastForwardInput, MergePullRequestByFastForwardOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CodeCommitResolvedConfiguration,
      options: Any
    ): Handler[MergePullRequestByFastForwardInput, MergePullRequestByFastForwardOutput] = js.native
  }
}
