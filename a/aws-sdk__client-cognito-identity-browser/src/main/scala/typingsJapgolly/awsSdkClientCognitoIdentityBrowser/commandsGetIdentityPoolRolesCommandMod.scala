package typingsJapgolly.awsSdkClientCognitoIdentityBrowser

import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesGetIdentityPoolRolesInputMod.GetIdentityPoolRolesInput
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesGetIdentityPoolRolesOutputMod.GetIdentityPoolRolesOutput
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsGetIdentityPoolRolesCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity-browser/commands/GetIdentityPoolRolesCommand", "GetIdentityPoolRolesCommand")
  @js.native
  open class GetIdentityPoolRolesCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          GetIdentityPoolRolesInput, 
          OutputTypesUnion, 
          GetIdentityPoolRolesOutput, 
          CognitoIdentityResolvedConfiguration
        ] {
    def this(input: GetIdentityPoolRolesInput) = this()
    
    /* CompleteClass */
    override val input: GetIdentityPoolRolesInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[GetIdentityPoolRolesInput, GetIdentityPoolRolesOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[GetIdentityPoolRolesInput, GetIdentityPoolRolesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CognitoIdentityResolvedConfiguration,
      options: Any
    ): Handler[GetIdentityPoolRolesInput, GetIdentityPoolRolesOutput] = js.native
  }
}
