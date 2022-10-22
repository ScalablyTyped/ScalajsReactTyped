package typingsJapgolly.awsSdkClientGlacierNode

import typingsJapgolly.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsJapgolly.awsSdkClientGlacierNode.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientGlacierNode.typesListTagsForVaultInputMod.ListTagsForVaultInput
import typingsJapgolly.awsSdkClientGlacierNode.typesListTagsForVaultOutputMod.ListTagsForVaultOutput
import typingsJapgolly.awsSdkClientGlacierNode.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsListTagsForVaultCommandMod {
  
  @JSImport("@aws-sdk/client-glacier-node/commands/ListTagsForVaultCommand", "ListTagsForVaultCommand")
  @js.native
  open class ListTagsForVaultCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ListTagsForVaultInput, 
          OutputTypesUnion, 
          ListTagsForVaultOutput, 
          GlacierResolvedConfiguration
        ] {
    def this(input: ListTagsForVaultInput) = this()
    
    /* CompleteClass */
    override val input: ListTagsForVaultInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ListTagsForVaultInput, ListTagsForVaultOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, _stream.Readable> */ Any,
      configuration: GlacierResolvedConfiguration
    ): Handler[ListTagsForVaultInput, ListTagsForVaultOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: GlacierResolvedConfiguration,
      options: Any
    ): Handler[ListTagsForVaultInput, ListTagsForVaultOutput] = js.native
  }
}
