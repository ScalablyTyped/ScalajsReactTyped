package typingsJapgolly.awsSdkClientCognitoIdentityBrowser

import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesInputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesMergeDeveloperIdentitiesInputMod.MergeDeveloperIdentitiesInput
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesMergeDeveloperIdentitiesOutputMod.MergeDeveloperIdentitiesOutput
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesOutputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.Handler
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandsMergeDeveloperIdentitiesCommandMod {
  
  @JSImport("@aws-sdk/client-cognito-identity-browser/commands/MergeDeveloperIdentitiesCommand", "MergeDeveloperIdentitiesCommand")
  @js.native
  open class MergeDeveloperIdentitiesCommand protected ()
    extends StObject
       with Command[
          InputTypesUnion, 
          MergeDeveloperIdentitiesInput, 
          OutputTypesUnion, 
          MergeDeveloperIdentitiesOutput, 
          CognitoIdentityResolvedConfiguration
        ] {
    def this(input: MergeDeveloperIdentitiesInput) = this()
    
    /* CompleteClass */
    override val input: MergeDeveloperIdentitiesInput = js.native
    
    /* CompleteClass */
    override val middlewareStack: MiddlewareStack[MergeDeveloperIdentitiesInput, MergeDeveloperIdentitiesOutput] = js.native
    
    def resolveMiddleware(
      clientStack: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __aws_sdk_middleware_stack.MiddlewareStack<InputTypesUnion, OutputTypesUnion, Blob> */ Any,
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[MergeDeveloperIdentitiesInput, MergeDeveloperIdentitiesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: MiddlewareStack[InputTypesUnion, OutputTypesUnion],
      configuration: CognitoIdentityResolvedConfiguration,
      options: Any
    ): Handler[MergeDeveloperIdentitiesInput, MergeDeveloperIdentitiesOutput] = js.native
  }
}
