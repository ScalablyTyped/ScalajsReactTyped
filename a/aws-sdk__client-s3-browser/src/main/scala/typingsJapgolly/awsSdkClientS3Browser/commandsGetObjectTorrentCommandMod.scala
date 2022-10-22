package typingsJapgolly.awsSdkClientS3Browser

import org.scalajs.dom.Blob
import typingsJapgolly.awsSdkClientS3Browser.s3ConfigurationMod.S3ResolvedConfiguration
import typingsJapgolly.awsSdkClientS3Browser.typesGetObjectTorrentInputMod.GetObjectTorrentInput
import typingsJapgolly.awsSdkClientS3Browser.typesGetObjectTorrentOutputMod.GetObjectTorrentOutput
import typingsJapgolly.awsSdkClientS3Browser.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientS3Browser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetObjectTorrentCommandMod {
  
  @JSImport("@aws-sdk/client-s3-browser/commands/GetObjectTorrentCommand", "GetObjectTorrentCommand")
  @js.native
  open class GetObjectTorrentCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetObjectTorrentInput, 
          OutputTypesUnion, 
          GetObjectTorrentOutput[Blob], 
          S3ResolvedConfiguration
        ] {
    def this(input: GetObjectTorrentInput) = this()
    
    /* CompleteClass */
    override val input: GetObjectTorrentInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetObjectTorrentInput, GetObjectTorrentOutput[Blob]] = js.native
    
    val model: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_types.OperationModel */ Any = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: S3ResolvedConfiguration
    ): Handler[GetObjectTorrentInput, GetObjectTorrentOutput[Blob]] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: S3ResolvedConfiguration,
      options: Any
    ): Handler[GetObjectTorrentInput, GetObjectTorrentOutput[Blob]] = js.native
  }
}
