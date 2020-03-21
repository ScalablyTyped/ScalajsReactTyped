package typingsJapgolly.awsSdkClientCognitoIdentityBrowser

import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesMergeDeveloperIdentitiesInputMod.MergeDeveloperIdentitiesInput
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesMergeDeveloperIdentitiesOutputMod.MergeDeveloperIdentitiesOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/MergeDeveloperIdentitiesCommand", JSImport.Namespace)
@js.native
object mergeDeveloperIdentitiesCommandMod extends js.Object {
  @js.native
  class MergeDeveloperIdentitiesCommand protected () extends Command[
          InputTypesUnion, 
          MergeDeveloperIdentitiesInput, 
          OutputTypesUnion, 
          MergeDeveloperIdentitiesOutput, 
          CognitoIdentityResolvedConfiguration, 
          Blob
        ] {
    def this(input: MergeDeveloperIdentitiesInput) = this()
    /* CompleteClass */
    override val input: MergeDeveloperIdentitiesInput = js.native
    val middlewareStack: MiddlewareStack[
        MergeDeveloperIdentitiesInput, 
        MergeDeveloperIdentitiesOutput, 
        org.scalajs.dom.raw.Blob
      ] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[MergeDeveloperIdentitiesInput, MergeDeveloperIdentitiesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[MergeDeveloperIdentitiesInput, MergeDeveloperIdentitiesOutput] = js.native
  }
  
}

