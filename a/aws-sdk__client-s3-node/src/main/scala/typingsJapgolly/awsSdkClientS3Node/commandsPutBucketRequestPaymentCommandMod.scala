package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.typesPutBucketRequestPaymentInputMod.PutBucketRequestPaymentInput
import typingsJapgolly.awsSdkClientS3Node.typesPutBucketRequestPaymentOutputMod.PutBucketRequestPaymentOutput
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsPutBucketRequestPaymentCommandMod {
  
  @JSImport("@aws-sdk/client-s3-node/commands/PutBucketRequestPaymentCommand", "PutBucketRequestPaymentCommand")
  @js.native
  open class PutBucketRequestPaymentCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          PutBucketRequestPaymentInput, 
          OutputTypesUnion, 
          PutBucketRequestPaymentOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: PutBucketRequestPaymentInput) = this()
    
    /* CompleteClass */
    override val input: PutBucketRequestPaymentInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[PutBucketRequestPaymentInput, PutBucketRequestPaymentOutput] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketRequestPaymentInput, PutBucketRequestPaymentOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: Any
    ): Handler[PutBucketRequestPaymentInput, PutBucketRequestPaymentOutput] = js.native
  }
}
