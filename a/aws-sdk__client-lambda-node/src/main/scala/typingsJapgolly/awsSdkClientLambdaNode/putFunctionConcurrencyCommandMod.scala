package typingsJapgolly.awsSdkClientLambdaNode

import typingsJapgolly.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsJapgolly.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientLambdaNode.typesPutFunctionConcurrencyInputMod.PutFunctionConcurrencyInput
import typingsJapgolly.awsSdkClientLambdaNode.typesPutFunctionConcurrencyOutputMod.PutFunctionConcurrencyOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/PutFunctionConcurrencyCommand", JSImport.Namespace)
@js.native
object putFunctionConcurrencyCommandMod extends js.Object {
  @js.native
  class PutFunctionConcurrencyCommand protected () extends Command[
          InputTypesUnion, 
          PutFunctionConcurrencyInput, 
          OutputTypesUnion, 
          PutFunctionConcurrencyOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutFunctionConcurrencyInput) = this()
    /* CompleteClass */
    override val input: PutFunctionConcurrencyInput = js.native
    val middlewareStack: MiddlewareStack[PutFunctionConcurrencyInput, PutFunctionConcurrencyOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[PutFunctionConcurrencyInput, PutFunctionConcurrencyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[PutFunctionConcurrencyInput, PutFunctionConcurrencyOutput] = js.native
  }
  
}

