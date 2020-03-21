package typingsJapgolly.awsSdkClientLambdaNode

import typingsJapgolly.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsJapgolly.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientLambdaNode.typesGetAccountSettingsInputMod.GetAccountSettingsInput
import typingsJapgolly.awsSdkClientLambdaNode.typesGetAccountSettingsOutputMod.GetAccountSettingsOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/GetAccountSettingsCommand", JSImport.Namespace)
@js.native
object getAccountSettingsCommandMod extends js.Object {
  @js.native
  class GetAccountSettingsCommand protected () extends Command[
          InputTypesUnion, 
          GetAccountSettingsInput, 
          OutputTypesUnion, 
          GetAccountSettingsOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetAccountSettingsInput) = this()
    /* CompleteClass */
    override val input: GetAccountSettingsInput = js.native
    val middlewareStack: MiddlewareStack[GetAccountSettingsInput, GetAccountSettingsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[GetAccountSettingsInput, GetAccountSettingsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[GetAccountSettingsInput, GetAccountSettingsOutput] = js.native
  }
  
}

