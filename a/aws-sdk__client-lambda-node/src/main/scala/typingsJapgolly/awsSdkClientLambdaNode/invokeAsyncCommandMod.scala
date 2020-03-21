package typingsJapgolly.awsSdkClientLambdaNode

import typingsJapgolly.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsJapgolly.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientLambdaNode.typesInvokeAsyncInputMod.InvokeAsyncInput
import typingsJapgolly.awsSdkClientLambdaNode.typesInvokeAsyncOutputMod.InvokeAsyncOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/InvokeAsyncCommand", JSImport.Namespace)
@js.native
object invokeAsyncCommandMod extends js.Object {
  @js.native
  class InvokeAsyncCommand protected () extends Command[
          InputTypesUnion, 
          InvokeAsyncInput[Readable], 
          OutputTypesUnion, 
          InvokeAsyncOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: InvokeAsyncInput[Readable]) = this()
    /* CompleteClass */
    override val input: InvokeAsyncInput[Readable] = js.native
    val middlewareStack: MiddlewareStack[InvokeAsyncInput[Readable], InvokeAsyncOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[InvokeAsyncInput[Readable], InvokeAsyncOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[InvokeAsyncInput[Readable], InvokeAsyncOutput] = js.native
  }
  
}

