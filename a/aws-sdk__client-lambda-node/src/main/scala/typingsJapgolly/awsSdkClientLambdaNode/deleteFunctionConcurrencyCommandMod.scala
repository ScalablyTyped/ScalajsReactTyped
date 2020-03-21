package typingsJapgolly.awsSdkClientLambdaNode

import typingsJapgolly.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsJapgolly.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientLambdaNode.typesDeleteFunctionConcurrencyInputMod.DeleteFunctionConcurrencyInput
import typingsJapgolly.awsSdkClientLambdaNode.typesDeleteFunctionConcurrencyOutputMod.DeleteFunctionConcurrencyOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/DeleteFunctionConcurrencyCommand", JSImport.Namespace)
@js.native
object deleteFunctionConcurrencyCommandMod extends js.Object {
  @js.native
  class DeleteFunctionConcurrencyCommand protected () extends Command[
          InputTypesUnion, 
          DeleteFunctionConcurrencyInput, 
          OutputTypesUnion, 
          DeleteFunctionConcurrencyOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteFunctionConcurrencyInput) = this()
    /* CompleteClass */
    override val input: DeleteFunctionConcurrencyInput = js.native
    val middlewareStack: MiddlewareStack[DeleteFunctionConcurrencyInput, DeleteFunctionConcurrencyOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[DeleteFunctionConcurrencyInput, DeleteFunctionConcurrencyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[DeleteFunctionConcurrencyInput, DeleteFunctionConcurrencyOutput] = js.native
  }
  
}

