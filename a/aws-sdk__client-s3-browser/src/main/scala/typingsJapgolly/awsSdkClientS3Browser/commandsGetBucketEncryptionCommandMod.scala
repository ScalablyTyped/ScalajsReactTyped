package typingsJapgolly.awsSdkClientS3Browser

import typingsJapgolly.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typingsJapgolly.awsSdkClientS3Browser.typesGetBucketEncryptionInputMod.GetBucketEncryptionInput
import typingsJapgolly.awsSdkClientS3Browser.typesGetBucketEncryptionOutputMod.GetBucketEncryptionOutput
import typingsJapgolly.awsSdkClientS3Browser.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientS3Browser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetBucketEncryptionCommandMod {
  
  @JSImport("@aws-sdk/client-s3-browser/commands/GetBucketEncryptionCommand", "GetBucketEncryptionCommand")
  @js.native
  open class GetBucketEncryptionCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetBucketEncryptionInput, 
          OutputTypesUnion, 
          GetBucketEncryptionOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: GetBucketEncryptionInput) = this()
    
    /* CompleteClass */
    override val input: GetBucketEncryptionInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetBucketEncryptionInput, GetBucketEncryptionOutput] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketEncryptionInput, GetBucketEncryptionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: Any
    ): Handler[GetBucketEncryptionInput, GetBucketEncryptionOutput] = js.native
  }
}
