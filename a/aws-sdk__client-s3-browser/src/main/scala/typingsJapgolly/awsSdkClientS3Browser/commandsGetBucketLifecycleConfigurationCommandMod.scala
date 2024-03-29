package typingsJapgolly.awsSdkClientS3Browser

import typingsJapgolly.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typingsJapgolly.awsSdkClientS3Browser.typesGetBucketLifecycleConfigurationInputMod.GetBucketLifecycleConfigurationInput
import typingsJapgolly.awsSdkClientS3Browser.typesGetBucketLifecycleConfigurationOutputMod.GetBucketLifecycleConfigurationOutput
import typingsJapgolly.awsSdkClientS3Browser.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientS3Browser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetBucketLifecycleConfigurationCommandMod {
  
  @JSImport("@aws-sdk/client-s3-browser/commands/GetBucketLifecycleConfigurationCommand", "GetBucketLifecycleConfigurationCommand")
  @js.native
  open class GetBucketLifecycleConfigurationCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetBucketLifecycleConfigurationInput, 
          OutputTypesUnion, 
          GetBucketLifecycleConfigurationOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: GetBucketLifecycleConfigurationInput) = this()
    
    /* CompleteClass */
    override val input: GetBucketLifecycleConfigurationInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetBucketLifecycleConfigurationInput, GetBucketLifecycleConfigurationOutput] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketLifecycleConfigurationInput, GetBucketLifecycleConfigurationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: Any
    ): Handler[GetBucketLifecycleConfigurationInput, GetBucketLifecycleConfigurationOutput] = js.native
  }
}
