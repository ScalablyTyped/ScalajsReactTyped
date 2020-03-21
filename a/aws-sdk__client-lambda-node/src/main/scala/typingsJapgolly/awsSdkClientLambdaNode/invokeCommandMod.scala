package typingsJapgolly.awsSdkClientLambdaNode

import typingsJapgolly.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsJapgolly.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientLambdaNode.typesInvokeInputMod.InvokeInput
import typingsJapgolly.awsSdkClientLambdaNode.typesInvokeOutputMod.InvokeOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/InvokeCommand", JSImport.Namespace)
@js.native
object invokeCommandMod extends js.Object {
  @js.native
  class InvokeCommand protected () extends Command[
          InputTypesUnion, 
          InvokeInput, 
          OutputTypesUnion, 
          InvokeOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: InvokeInput) = this()
    /* CompleteClass */
    override val input: InvokeInput = js.native
    val middlewareStack: MiddlewareStack[InvokeInput, InvokeOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[InvokeInput, InvokeOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[InvokeInput, InvokeOutput] = js.native
  }
  
}

