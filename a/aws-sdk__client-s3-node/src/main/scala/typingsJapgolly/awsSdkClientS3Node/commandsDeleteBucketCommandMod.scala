package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketInputMod.DeleteBucketInput
import typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketOutputMod.DeleteBucketOutput
import typingsJapgolly.awsSdkClientS3Node.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDeleteBucketCommandMod {
  
  @JSImport("@aws-sdk/client-s3-node/commands/DeleteBucketCommand", "DeleteBucketCommand")
  @js.native
  open class DeleteBucketCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DeleteBucketInput, 
          OutputTypesUnion, 
          DeleteBucketOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: DeleteBucketInput) = this()
    
    /* CompleteClass */
    override val input: DeleteBucketInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DeleteBucketInput, DeleteBucketOutput] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: S3ResolvedConfiguration
    ): Handler[DeleteBucketInput, DeleteBucketOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: Any
    ): Handler[DeleteBucketInput, DeleteBucketOutput] = js.native
  }
}
