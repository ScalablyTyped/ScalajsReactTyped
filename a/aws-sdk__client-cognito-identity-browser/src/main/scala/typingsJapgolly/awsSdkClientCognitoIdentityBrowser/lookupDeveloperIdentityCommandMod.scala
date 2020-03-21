package typingsJapgolly.awsSdkClientCognitoIdentityBrowser

import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesLookupDeveloperIdentityInputMod.LookupDeveloperIdentityInput
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesLookupDeveloperIdentityOutputMod.LookupDeveloperIdentityOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/LookupDeveloperIdentityCommand", JSImport.Namespace)
@js.native
object lookupDeveloperIdentityCommandMod extends js.Object {
  @js.native
  class LookupDeveloperIdentityCommand protected () extends Command[
          InputTypesUnion, 
          LookupDeveloperIdentityInput, 
          OutputTypesUnion, 
          LookupDeveloperIdentityOutput, 
          CognitoIdentityResolvedConfiguration, 
          Blob
        ] {
    def this(input: LookupDeveloperIdentityInput) = this()
    /* CompleteClass */
    override val input: LookupDeveloperIdentityInput = js.native
    val middlewareStack: MiddlewareStack[
        LookupDeveloperIdentityInput, 
        LookupDeveloperIdentityOutput, 
        org.scalajs.dom.raw.Blob
      ] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[LookupDeveloperIdentityInput, LookupDeveloperIdentityOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[LookupDeveloperIdentityInput, LookupDeveloperIdentityOutput] = js.native
  }
  
}

