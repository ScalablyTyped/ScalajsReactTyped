package typingsJapgolly.awsSdkClientCognitoIdentityBrowser

import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesUnlinkIdentityInputMod.UnlinkIdentityInput
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesUnlinkIdentityOutputMod.UnlinkIdentityOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/UnlinkIdentityCommand", JSImport.Namespace)
@js.native
object unlinkIdentityCommandMod extends js.Object {
  @js.native
  class UnlinkIdentityCommand protected () extends Command[
          InputTypesUnion, 
          UnlinkIdentityInput, 
          OutputTypesUnion, 
          UnlinkIdentityOutput, 
          CognitoIdentityResolvedConfiguration, 
          Blob
        ] {
    def this(input: UnlinkIdentityInput) = this()
    /* CompleteClass */
    override val input: UnlinkIdentityInput = js.native
    val middlewareStack: MiddlewareStack[UnlinkIdentityInput, UnlinkIdentityOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[UnlinkIdentityInput, UnlinkIdentityOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[UnlinkIdentityInput, UnlinkIdentityOutput] = js.native
  }
  
}

