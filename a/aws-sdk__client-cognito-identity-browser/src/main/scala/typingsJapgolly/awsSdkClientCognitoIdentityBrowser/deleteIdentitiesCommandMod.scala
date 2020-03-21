package typingsJapgolly.awsSdkClientCognitoIdentityBrowser

import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentitiesInputMod.DeleteIdentitiesInput
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesDeleteIdentitiesOutputMod.DeleteIdentitiesOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/DeleteIdentitiesCommand", JSImport.Namespace)
@js.native
object deleteIdentitiesCommandMod extends js.Object {
  @js.native
  class DeleteIdentitiesCommand protected () extends Command[
          InputTypesUnion, 
          DeleteIdentitiesInput, 
          OutputTypesUnion, 
          DeleteIdentitiesOutput, 
          CognitoIdentityResolvedConfiguration, 
          Blob
        ] {
    def this(input: DeleteIdentitiesInput) = this()
    /* CompleteClass */
    override val input: DeleteIdentitiesInput = js.native
    val middlewareStack: MiddlewareStack[DeleteIdentitiesInput, DeleteIdentitiesOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[DeleteIdentitiesInput, DeleteIdentitiesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[DeleteIdentitiesInput, DeleteIdentitiesOutput] = js.native
  }
  
}

