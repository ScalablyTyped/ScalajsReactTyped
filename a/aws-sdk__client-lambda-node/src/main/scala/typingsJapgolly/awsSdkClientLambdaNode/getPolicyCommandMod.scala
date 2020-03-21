package typingsJapgolly.awsSdkClientLambdaNode

import typingsJapgolly.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsJapgolly.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientLambdaNode.typesGetPolicyInputMod.GetPolicyInput
import typingsJapgolly.awsSdkClientLambdaNode.typesGetPolicyOutputMod.GetPolicyOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/GetPolicyCommand", JSImport.Namespace)
@js.native
object getPolicyCommandMod extends js.Object {
  @js.native
  class GetPolicyCommand protected () extends Command[
          InputTypesUnion, 
          GetPolicyInput, 
          OutputTypesUnion, 
          GetPolicyOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetPolicyInput) = this()
    /* CompleteClass */
    override val input: GetPolicyInput = js.native
    val middlewareStack: MiddlewareStack[GetPolicyInput, GetPolicyOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[GetPolicyInput, GetPolicyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[GetPolicyInput, GetPolicyOutput] = js.native
  }
  
}

