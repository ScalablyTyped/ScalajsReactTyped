package typingsJapgolly.awsSdkClientKmsBrowser

import typingsJapgolly.awsSdkClientKmsBrowser.kmsconfigurationMod.KMSResolvedConfiguration
import typingsJapgolly.awsSdkClientKmsBrowser.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKmsBrowser.typesListKeyPoliciesInputMod.ListKeyPoliciesInput
import typingsJapgolly.awsSdkClientKmsBrowser.typesListKeyPoliciesOutputMod.ListKeyPoliciesOutput
import typingsJapgolly.awsSdkClientKmsBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsListKeyPoliciesCommandMod {
  
  @JSImport("@aws-sdk/client-kms-browser/commands/ListKeyPoliciesCommand", "ListKeyPoliciesCommand")
  @js.native
  open class ListKeyPoliciesCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          ListKeyPoliciesInput, 
          OutputTypesUnion, 
          ListKeyPoliciesOutput, 
          KMSResolvedConfiguration
        ] {
    def this(input: ListKeyPoliciesInput) = this()
    
    /* CompleteClass */
    override val input: ListKeyPoliciesInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[ListKeyPoliciesInput, ListKeyPoliciesOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: KMSResolvedConfiguration
    ): Handler[ListKeyPoliciesInput, ListKeyPoliciesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: KMSResolvedConfiguration,
      options: Any
    ): Handler[ListKeyPoliciesInput, ListKeyPoliciesOutput] = js.native
  }
}
