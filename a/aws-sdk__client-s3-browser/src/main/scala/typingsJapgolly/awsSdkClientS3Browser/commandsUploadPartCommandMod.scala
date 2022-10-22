package typingsJapgolly.awsSdkClientS3Browser

import org.scalajs.dom.Blob
import typingsJapgolly.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typingsJapgolly.awsSdkClientS3Browser.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientS3Browser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Browser.typesUploadPartInputMod.UploadPartInput
import typingsJapgolly.awsSdkClientS3Browser.typesUploadPartOutputMod.UploadPartOutput
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsUploadPartCommandMod {
  
  @JSImport("@aws-sdk/client-s3-browser/commands/UploadPartCommand", "UploadPartCommand")
  @js.native
  open class UploadPartCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          UploadPartInput[Blob], 
          OutputTypesUnion, 
          UploadPartOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: UploadPartInput[Blob]) = this()
    
    /* CompleteClass */
    override val input: UploadPartInput[Blob] = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[UploadPartInput[Blob], UploadPartOutput] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: S3ResolvedConfiguration
    ): Handler[UploadPartInput[Blob], UploadPartOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: Any
    ): Handler[UploadPartInput[Blob], UploadPartOutput] = js.native
  }
}
