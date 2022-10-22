package typingsJapgolly.awsSdkClientGlacierNode

import typingsJapgolly.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsJapgolly.awsSdkClientGlacierNode.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientGlacierNode.typesListMultipartUploadsInputMod.ListMultipartUploadsInput
import typingsJapgolly.awsSdkClientGlacierNode.typesListMultipartUploadsOutputMod.ListMultipartUploadsOutput
import typingsJapgolly.awsSdkClientGlacierNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsListMultipartUploadsCommandMod {
  
  @JSImport("@aws-sdk/client-glacier-node/commands/ListMultipartUploadsCommand", "ListMultipartUploadsCommand")
  @js.native
  open class ListMultipartUploadsCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ListMultipartUploadsInput, 
          OutputTypesUnion, 
          ListMultipartUploadsOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: ListMultipartUploadsInput) = this()
    
    /* CompleteClass */
    override val input: ListMultipartUploadsInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ListMultipartUploadsInput, ListMultipartUploadsOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[ListMultipartUploadsInput, ListMultipartUploadsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: GlacierResolvedConfiguration,
      options: Any
    ): Handler[ListMultipartUploadsInput, ListMultipartUploadsOutput] = js.native
  }
}
