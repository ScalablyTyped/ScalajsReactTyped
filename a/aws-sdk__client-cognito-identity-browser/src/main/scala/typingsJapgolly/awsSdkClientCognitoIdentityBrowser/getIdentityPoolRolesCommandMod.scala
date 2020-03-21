package typingsJapgolly.awsSdkClientCognitoIdentityBrowser

import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesGetIdentityPoolRolesInputMod.GetIdentityPoolRolesInput
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesGetIdentityPoolRolesOutputMod.GetIdentityPoolRolesOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/GetIdentityPoolRolesCommand", JSImport.Namespace)
@js.native
object getIdentityPoolRolesCommandMod extends js.Object {
  @js.native
  class GetIdentityPoolRolesCommand protected () extends Command[
          InputTypesUnion, 
          GetIdentityPoolRolesInput, 
          OutputTypesUnion, 
          GetIdentityPoolRolesOutput, 
          CognitoIdentityResolvedConfiguration, 
          Blob
        ] {
    def this(input: GetIdentityPoolRolesInput) = this()
    /* CompleteClass */
    override val input: GetIdentityPoolRolesInput = js.native
    val middlewareStack: MiddlewareStack[GetIdentityPoolRolesInput, GetIdentityPoolRolesOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[GetIdentityPoolRolesInput, GetIdentityPoolRolesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[GetIdentityPoolRolesInput, GetIdentityPoolRolesOutput] = js.native
  }
  
}

