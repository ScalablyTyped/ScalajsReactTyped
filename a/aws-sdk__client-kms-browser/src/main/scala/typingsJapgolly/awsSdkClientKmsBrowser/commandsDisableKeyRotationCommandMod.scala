package typingsJapgolly.awsSdkClientKmsBrowser

import typingsJapgolly.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typingsJapgolly.awsSdkClientKmsBrowser.typesDisableKeyRotationInputMod.DisableKeyRotationInput
import typingsJapgolly.awsSdkClientKmsBrowser.typesDisableKeyRotationOutputMod.DisableKeyRotationOutput
import typingsJapgolly.awsSdkClientKmsBrowser.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKmsBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsDisableKeyRotationCommandMod {
  
  @JSImport("@aws-sdk/client-kms-browser/commands/DisableKeyRotationCommand", "DisableKeyRotationCommand")
  @js.native
  open class DisableKeyRotationCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          DisableKeyRotationInput, 
          OutputTypesUnion, 
          DisableKeyRotationOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: DisableKeyRotationInput) = this()
    
    /* CompleteClass */
    override val input: DisableKeyRotationInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[DisableKeyRotationInput, DisableKeyRotationOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: KMSResolvedConfiguration
    ): Handler[DisableKeyRotationInput, DisableKeyRotationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: Any
    ): Handler[DisableKeyRotationInput, DisableKeyRotationOutput] = js.native
  }
}
