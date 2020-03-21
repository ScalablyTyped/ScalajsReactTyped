package typingsJapgolly.awsSdkClientCognitoIdentityBrowser

import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesUpdateIdentityPoolInputMod.UpdateIdentityPoolInput
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesUpdateIdentityPoolOutputMod.UpdateIdentityPoolOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/UpdateIdentityPoolCommand", JSImport.Namespace)
@js.native
object updateIdentityPoolCommandMod extends js.Object {
  @js.native
  class UpdateIdentityPoolCommand protected () extends Command[
          InputTypesUnion, 
          UpdateIdentityPoolInput, 
          OutputTypesUnion, 
          UpdateIdentityPoolOutput, 
          CognitoIdentityResolvedConfiguration, 
          Blob
        ] {
    def this(input: UpdateIdentityPoolInput) = this()
    /* CompleteClass */
    override val input: UpdateIdentityPoolInput = js.native
    val middlewareStack: MiddlewareStack[UpdateIdentityPoolInput, UpdateIdentityPoolOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[UpdateIdentityPoolInput, UpdateIdentityPoolOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[UpdateIdentityPoolInput, UpdateIdentityPoolOutput] = js.native
  }
  
}

