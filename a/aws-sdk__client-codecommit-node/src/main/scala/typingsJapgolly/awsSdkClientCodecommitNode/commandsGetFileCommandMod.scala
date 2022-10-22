package typingsJapgolly.awsSdkClientCodecommitNode

import typingsJapgolly.awsSdkClientCodecommitNode.codeCommitConfigurationMod.CodeCommitResolvedConfiguration
import typingsJapgolly.awsSdkClientCodecommitNode.typesGetFileInputMod.GetFileInput
import typingsJapgolly.awsSdkClientCodecommitNode.typesGetFileOutputMod.GetFileOutput
import typingsJapgolly.awsSdkClientCodecommitNode.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCodecommitNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetFileCommandMod {
  
  @JSImport("@aws-sdk/client-codecommit-node/commands/GetFileCommand", "GetFileCommand")
  @js.native
  open class GetFileCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetFileInput, 
          OutputTypesUnion, 
          GetFileOutput, 
          CodeCommitResolvedConfiguration
        ] {
    def this(input: GetFileInput) = this()
    
    /* CompleteClass */
    override val input: GetFileInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetFileInput, GetFileOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: CodeCommitResolvedConfiguration
    ): Handler[GetFileInput, GetFileOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CodeCommitResolvedConfiguration,
      options: Any
    ): Handler[GetFileInput, GetFileOutput] = js.native
  }
}
