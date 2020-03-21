package typingsJapgolly.awsSdkClientCognitoIdentityBrowser

import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesGetCredentialsForIdentityInputMod.GetCredentialsForIdentityInput
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesGetCredentialsForIdentityOutputMod.GetCredentialsForIdentityOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/GetCredentialsForIdentityCommand", JSImport.Namespace)
@js.native
object getCredentialsForIdentityCommandMod extends js.Object {
  @js.native
  class GetCredentialsForIdentityCommand protected () extends Command[
          InputTypesUnion, 
          GetCredentialsForIdentityInput, 
          OutputTypesUnion, 
          GetCredentialsForIdentityOutput, 
          CognitoIdentityResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetCredentialsForIdentityInput) = this()
    /* CompleteClass */
    override val input: GetCredentialsForIdentityInput = js.native
    val middlewareStack: MiddlewareStack[
        GetCredentialsForIdentityInput, 
        GetCredentialsForIdentityOutput, 
        org.scalajs.dom.raw.Blob
      ] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[GetCredentialsForIdentityInput, GetCredentialsForIdentityOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[GetCredentialsForIdentityInput, GetCredentialsForIdentityOutput] = js.native
  }
  
}

