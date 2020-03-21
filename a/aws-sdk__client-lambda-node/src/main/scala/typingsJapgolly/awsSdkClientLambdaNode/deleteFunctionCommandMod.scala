package typingsJapgolly.awsSdkClientLambdaNode

import typingsJapgolly.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsJapgolly.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientLambdaNode.typesDeleteFunctionInputMod.DeleteFunctionInput
import typingsJapgolly.awsSdkClientLambdaNode.typesDeleteFunctionOutputMod.DeleteFunctionOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/DeleteFunctionCommand", JSImport.Namespace)
@js.native
object deleteFunctionCommandMod extends js.Object {
  @js.native
  class DeleteFunctionCommand protected () extends Command[
          InputTypesUnion, 
          DeleteFunctionInput, 
          OutputTypesUnion, 
          DeleteFunctionOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteFunctionInput) = this()
    /* CompleteClass */
    override val input: DeleteFunctionInput = js.native
    val middlewareStack: MiddlewareStack[DeleteFunctionInput, DeleteFunctionOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[DeleteFunctionInput, DeleteFunctionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[DeleteFunctionInput, DeleteFunctionOutput] = js.native
  }
  
}

