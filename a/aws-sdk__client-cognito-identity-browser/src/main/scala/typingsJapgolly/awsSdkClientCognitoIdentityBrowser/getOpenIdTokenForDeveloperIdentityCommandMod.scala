package typingsJapgolly.awsSdkClientCognitoIdentityBrowser

import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenForDeveloperIdentityInputMod.GetOpenIdTokenForDeveloperIdentityInput
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesGetOpenIdTokenForDeveloperIdentityOutputMod.GetOpenIdTokenForDeveloperIdentityOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/GetOpenIdTokenForDeveloperIdentityCommand", JSImport.Namespace)
@js.native
object getOpenIdTokenForDeveloperIdentityCommandMod extends js.Object {
  @js.native
  class GetOpenIdTokenForDeveloperIdentityCommand protected () extends Command[
          InputTypesUnion, 
          GetOpenIdTokenForDeveloperIdentityInput, 
          OutputTypesUnion, 
          GetOpenIdTokenForDeveloperIdentityOutput, 
          CognitoIdentityResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetOpenIdTokenForDeveloperIdentityInput) = this()
    /* CompleteClass */
    override val input: GetOpenIdTokenForDeveloperIdentityInput = js.native
    val middlewareStack: MiddlewareStack[
        GetOpenIdTokenForDeveloperIdentityInput, 
        GetOpenIdTokenForDeveloperIdentityOutput, 
        org.scalajs.dom.raw.Blob
      ] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[GetOpenIdTokenForDeveloperIdentityInput, GetOpenIdTokenForDeveloperIdentityOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[GetOpenIdTokenForDeveloperIdentityInput, GetOpenIdTokenForDeveloperIdentityOutput] = js.native
  }
  
}

