package typingsJapgolly.awsSdkClientS3Browser

import typingsJapgolly.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketInventoryConfigurationInputMod.DeleteBucketInventoryConfigurationInput
import typingsJapgolly.awsSdkClientS3Browser.typesDeleteBucketInventoryConfigurationOutputMod.DeleteBucketInventoryConfigurationOutput
import typingsJapgolly.awsSdkClientS3Browser.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientS3Browser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDeleteBucketInventoryConfigurationCommandMod {
  
  @JSImport("@aws-sdk/client-s3-browser/commands/DeleteBucketInventoryConfigurationCommand", "DeleteBucketInventoryConfigurationCommand")
  @js.native
  open class DeleteBucketInventoryConfigurationCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DeleteBucketInventoryConfigurationInput, 
          OutputTypesUnion, 
          DeleteBucketInventoryConfigurationOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: DeleteBucketInventoryConfigurationInput) = this()
    
    /* CompleteClass */
    override val input: DeleteBucketInventoryConfigurationInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DeleteBucketInventoryConfigurationInput, DeleteBucketInventoryConfigurationOutput] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: S3ResolvedConfiguration
    ): Handler[DeleteBucketInventoryConfigurationInput, DeleteBucketInventoryConfigurationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: Any
    ): Handler[DeleteBucketInventoryConfigurationInput, DeleteBucketInventoryConfigurationOutput] = js.native
  }
}
