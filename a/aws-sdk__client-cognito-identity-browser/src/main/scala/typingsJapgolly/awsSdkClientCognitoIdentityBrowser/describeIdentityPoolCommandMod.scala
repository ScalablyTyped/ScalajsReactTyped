package typingsJapgolly.awsSdkClientCognitoIdentityBrowser

import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.cognitoIdentityConfigurationMod.CognitoIdentityResolvedConfiguration
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityPoolInputMod.DescribeIdentityPoolInput
import typingsJapgolly.awsSdkClientCognitoIdentityBrowser.typesDescribeIdentityPoolOutputMod.DescribeIdentityPoolOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-cognito-identity-browser/commands/DescribeIdentityPoolCommand", JSImport.Namespace)
@js.native
object describeIdentityPoolCommandMod extends js.Object {
  @js.native
  class DescribeIdentityPoolCommand protected () extends Command[
          InputTypesUnion, 
          DescribeIdentityPoolInput, 
          OutputTypesUnion, 
          DescribeIdentityPoolOutput, 
          CognitoIdentityResolvedConfiguration, 
          Blob
        ] {
    def this(input: DescribeIdentityPoolInput) = this()
    /* CompleteClass */
    override val input: DescribeIdentityPoolInput = js.native
    val middlewareStack: MiddlewareStack[DescribeIdentityPoolInput, DescribeIdentityPoolOutput, org.scalajs.dom.raw.Blob] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[DescribeIdentityPoolInput, DescribeIdentityPoolOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Blob],
      configuration: CognitoIdentityResolvedConfiguration
    ): Handler[DescribeIdentityPoolInput, DescribeIdentityPoolOutput] = js.native
  }
  
}

