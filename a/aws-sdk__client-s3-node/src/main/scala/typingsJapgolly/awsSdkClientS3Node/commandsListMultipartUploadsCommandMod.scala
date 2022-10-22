package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.typesListMultipartUploadsInputMod.ListMultipartUploadsInput
import typingsJapgolly.awsSdkClientS3Node.typesListMultipartUploadsOutputMod.ListMultipartUploadsOutput
import typingsJapgolly.awsSdkClientS3Node.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsListMultipartUploadsCommandMod {
  
  @JSImport("@aws-sdk/client-s3-node/commands/ListMultipartUploadsCommand", "ListMultipartUploadsCommand")
  @js.native
  open class ListMultipartUploadsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ListMultipartUploadsInput, 
          OutputTypesUnion, 
          ListMultipartUploadsOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: ListMultipartUploadsInput) = this()
    
    /* CompleteClass */
    override val input: ListMultipartUploadsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ListMultipartUploadsInput, ListMultipartUploadsOutput] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: S3ResolvedConfiguration
    ): Handler[ListMultipartUploadsInput, ListMultipartUploadsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: Any
    ): Handler[ListMultipartUploadsInput, ListMultipartUploadsOutput] = js.native
  }
}
