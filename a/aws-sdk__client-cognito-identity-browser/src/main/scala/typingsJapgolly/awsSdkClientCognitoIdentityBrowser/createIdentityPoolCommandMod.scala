package typingsJapgolly.awsSdkClientCognitoIdentityBrowser

import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesCreateIdentityPoolInputMod.CreateIdentityPoolInput
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesCreateIdentityPoolOutputMod.CreateIdentityPoolOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/CreateIdentityPoolCommand", JSImport.Namespace)
@js.native
object createIdentityPoolCommandMod extends js.Object {
  @js.native
  class CreateIdentityPoolCommand protected () extends Command[
          InputTypesUnion, 
          CreateIdentityPoolInput, 
          OutputTypesUnion, 
          CreateIdentityPoolOutput, 
          CognitoIdentityResolvedConfiguration, 
          Blob
        ] {
    def this(input: CreateIdentityPoolInput) = this()
    /* CompleteClass */
    override val input: CreateIdentityPoolInput = js.native
    val middlewareStack: MiddlewareStack[CreateIdentityPoolInput, CreateIdentityPoolOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[CreateIdentityPoolInput, CreateIdentityPoolOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[CreateIdentityPoolInput, CreateIdentityPoolOutput] = js.native
  }
  
}

