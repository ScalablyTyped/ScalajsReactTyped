package typingsJapgolly.awsSdkClientS3Browser

import typingsJapgolly.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typingsJapgolly.awsSdkClientS3Browser.typesGetBucketVersioningInputMod.GetBucketVersioningInput
import typingsJapgolly.awsSdkClientS3Browser.typesGetBucketVersioningOutputMod.GetBucketVersioningOutput
import typingsJapgolly.awsSdkClientS3Browser.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientS3Browser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetBucketVersioningCommandMod {
  
  @JSImport("@aws-sdk/client-s3-browser/commands/GetBucketVersioningCommand", "GetBucketVersioningCommand")
  @js.native
  open class GetBucketVersioningCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetBucketVersioningInput, 
          OutputTypesUnion, 
          GetBucketVersioningOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: GetBucketVersioningInput) = this()
    
    /* CompleteClass */
    override val input: GetBucketVersioningInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetBucketVersioningInput, GetBucketVersioningOutput] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketVersioningInput, GetBucketVersioningOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: Any
    ): Handler[GetBucketVersioningInput, GetBucketVersioningOutput] = js.native
  }
}
