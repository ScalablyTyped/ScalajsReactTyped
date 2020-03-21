package typingsJapgolly.awsSdkClientLambdaNode

import typingsJapgolly.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsJapgolly.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientLambdaNode.typesGetFunctionConfigurationInputMod.GetFunctionConfigurationInput
import typingsJapgolly.awsSdkClientLambdaNode.typesGetFunctionConfigurationOutputMod.GetFunctionConfigurationOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/GetFunctionConfigurationCommand", JSImport.Namespace)
@js.native
object getFunctionConfigurationCommandMod extends js.Object {
  @js.native
  class GetFunctionConfigurationCommand protected () extends Command[
          InputTypesUnion, 
          GetFunctionConfigurationInput, 
          OutputTypesUnion, 
          GetFunctionConfigurationOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetFunctionConfigurationInput) = this()
    /* CompleteClass */
    override val input: GetFunctionConfigurationInput = js.native
    val middlewareStack: MiddlewareStack[GetFunctionConfigurationInput, GetFunctionConfigurationOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[GetFunctionConfigurationInput, GetFunctionConfigurationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[GetFunctionConfigurationInput, GetFunctionConfigurationOutput] = js.native
  }
  
}

