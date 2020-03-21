package typingsJapgolly.awsSdkClientCognitoIdentityBrowser

import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesUnlinkDeveloperIdentityInputMod.UnlinkDeveloperIdentityInput
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesUnlinkDeveloperIdentityOutputMod.UnlinkDeveloperIdentityOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/UnlinkDeveloperIdentityCommand", JSImport.Namespace)
@js.native
object unlinkDeveloperIdentityCommandMod extends js.Object {
  @js.native
  class UnlinkDeveloperIdentityCommand protected () extends Command[
          InputTypesUnion, 
          UnlinkDeveloperIdentityInput, 
          OutputTypesUnion, 
          UnlinkDeveloperIdentityOutput, 
          CognitoIdentityResolvedConfiguration, 
          Blob
        ] {
    def this(input: UnlinkDeveloperIdentityInput) = this()
    /* CompleteClass */
    override val input: UnlinkDeveloperIdentityInput = js.native
    val middlewareStack: MiddlewareStack[
        UnlinkDeveloperIdentityInput, 
        UnlinkDeveloperIdentityOutput, 
        org.scalajs.dom.raw.Blob
      ] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[UnlinkDeveloperIdentityInput, UnlinkDeveloperIdentityOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[UnlinkDeveloperIdentityInput, UnlinkDeveloperIdentityOutput] = js.native
  }
  
}

