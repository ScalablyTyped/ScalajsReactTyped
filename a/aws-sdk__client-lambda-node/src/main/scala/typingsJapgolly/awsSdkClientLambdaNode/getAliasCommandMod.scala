package typingsJapgolly.awsSdkClientLambdaNode

import typingsJapgolly.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsJapgolly.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientLambdaNode.typesGetAliasInputMod.GetAliasInput
import typingsJapgolly.awsSdkClientLambdaNode.typesGetAliasOutputMod.GetAliasOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/GetAliasCommand", JSImport.Namespace)
@js.native
object getAliasCommandMod extends js.Object {
  @js.native
  class GetAliasCommand protected () extends Command[
          InputTypesUnion, 
          GetAliasInput, 
          OutputTypesUnion, 
          GetAliasOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetAliasInput) = this()
    /* CompleteClass */
    override val input: GetAliasInput = js.native
    val middlewareStack: MiddlewareStack[GetAliasInput, GetAliasOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[GetAliasInput, GetAliasOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[GetAliasInput, GetAliasOutput] = js.native
  }
  
}

