package typingsJapgolly.awsSdkClientKmsBrowser

import typingsJapgolly.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typingsJapgolly.awsSdkClientKmsBrowser.typesEncryptInputMod.EncryptInput
import typingsJapgolly.awsSdkClientKmsBrowser.typesEncryptOutputMod.EncryptOutput
import typingsJapgolly.awsSdkClientKmsBrowser.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKmsBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsEncryptCommandMod {
  
  @JSImport("@aws-sdk/client-kms-browser/commands/EncryptCommand", "EncryptCommand")
  @js.native
  open class EncryptCommand protected ()
    extends StObject
       with Command[InputTypesUnion, EncryptInput, OutputTypesUnion, EncryptOutput, KMSResolvedConfiguration] {
    def this(input: EncryptInput) = this()
    
    /* CompleteClass */
    override val input: EncryptInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[EncryptInput, EncryptOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: KMSResolvedConfiguration
    ): Handler[EncryptInput, EncryptOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: Any
    ): Handler[EncryptInput, EncryptOutput] = js.native
  }
}
