package typingsJapgolly.awsSdkClientCognitoIdentityBrowser

import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesListIdentityPoolsInputMod.ListIdentityPoolsInput
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesListIdentityPoolsOutputMod.ListIdentityPoolsOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/ListIdentityPoolsCommand", JSImport.Namespace)
@js.native
object listIdentityPoolsCommandMod extends js.Object {
  @js.native
  class ListIdentityPoolsCommand protected () extends Command[
          InputTypesUnion, 
          ListIdentityPoolsInput, 
          OutputTypesUnion, 
          ListIdentityPoolsOutput, 
          CognitoIdentityResolvedConfiguration, 
          Blob
        ] {
    def this(input: ListIdentityPoolsInput) = this()
    /* CompleteClass */
    override val input: ListIdentityPoolsInput = js.native
    val middlewareStack: MiddlewareStack[ListIdentityPoolsInput, ListIdentityPoolsOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[ListIdentityPoolsInput, ListIdentityPoolsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[ListIdentityPoolsInput, ListIdentityPoolsOutput] = js.native
  }
  
}

