package typingsJapgolly.awsSdkClientS3Browser

import typingsJapgolly.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typingsJapgolly.awsSdkClientS3Browser.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientS3Browser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Browser.typesPutBucketPolicyInputMod.PutBucketPolicyInput
import typingsJapgolly.awsSdkClientS3Browser.typesPutBucketPolicyOutputMod.PutBucketPolicyOutput
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsPutBucketPolicyCommandMod {
  
  @JSImport("@aws-sdk/client-s3-browser/commands/PutBucketPolicyCommand", "PutBucketPolicyCommand")
  @js.native
  open class PutBucketPolicyCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          PutBucketPolicyInput, 
          OutputTypesUnion, 
          PutBucketPolicyOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: PutBucketPolicyInput) = this()
    
    /* CompleteClass */
    override val input: PutBucketPolicyInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[PutBucketPolicyInput, PutBucketPolicyOutput] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketPolicyInput, PutBucketPolicyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: Any
    ): Handler[PutBucketPolicyInput, PutBucketPolicyOutput] = js.native
  }
}
