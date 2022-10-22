package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.typesUploadPartInputMod.UploadPartInput
import typingsJapgolly.awsSdkClientS3Node.typesUploadPartOutputMod.UploadPartOutput
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import typingsJapgolly.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsUploadPartCommandMod {
  
  @JSImport("@aws-sdk/client-s3-node/commands/UploadPartCommand", "UploadPartCommand")
  @js.native
  open class UploadPartCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          UploadPartInput[Readable], 
          OutputTypesUnion, 
          UploadPartOutput, 
          S3ResolvedConfiguration
        ] {
    def this(input: UploadPartInput[Readable]) = this()
    
    /* CompleteClass */
    override val input: UploadPartInput[Readable] = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[UploadPartInput[Readable], UploadPartOutput] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: S3ResolvedConfiguration
    ): Handler[UploadPartInput[Readable], UploadPartOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: Any
    ): Handler[UploadPartInput[Readable], UploadPartOutput] = js.native
  }
}
