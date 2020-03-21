package typingsJapgolly.awsSdkClientCognitoIdentityBrowser

import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesSetIdentityPoolRolesInputMod.SetIdentityPoolRolesInput
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesSetIdentityPoolRolesOutputMod.SetIdentityPoolRolesOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/SetIdentityPoolRolesCommand", JSImport.Namespace)
@js.native
object setIdentityPoolRolesCommandMod extends js.Object {
  @js.native
  class SetIdentityPoolRolesCommand protected () extends Command[
          InputTypesUnion, 
          SetIdentityPoolRolesInput, 
          OutputTypesUnion, 
          SetIdentityPoolRolesOutput, 
          CognitoIdentityResolvedConfiguration, 
          Blob
        ] {
    def this(input: SetIdentityPoolRolesInput) = this()
    /* CompleteClass */
    override val input: SetIdentityPoolRolesInput = js.native
    val middlewareStack: MiddlewareStack[SetIdentityPoolRolesInput, SetIdentityPoolRolesOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[SetIdentityPoolRolesInput, SetIdentityPoolRolesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[SetIdentityPoolRolesInput, SetIdentityPoolRolesOutput] = js.native
  }
  
}

