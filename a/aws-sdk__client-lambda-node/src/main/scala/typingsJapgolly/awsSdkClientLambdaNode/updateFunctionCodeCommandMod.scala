package typingsJapgolly.awsSdkClientLambdaNode

import typingsJapgolly.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsJapgolly.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientLambdaNode.typesUpdateFunctionCodeInputMod.UpdateFunctionCodeInput
import typingsJapgolly.awsSdkClientLambdaNode.typesUpdateFunctionCodeOutputMod.UpdateFunctionCodeOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/UpdateFunctionCodeCommand", JSImport.Namespace)
@js.native
object updateFunctionCodeCommandMod extends js.Object {
  @js.native
  class UpdateFunctionCodeCommand protected () extends Command[
          InputTypesUnion, 
          UpdateFunctionCodeInput, 
          OutputTypesUnion, 
          UpdateFunctionCodeOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: UpdateFunctionCodeInput) = this()
    /* CompleteClass */
    override val input: UpdateFunctionCodeInput = js.native
    val middlewareStack: MiddlewareStack[UpdateFunctionCodeInput, UpdateFunctionCodeOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[UpdateFunctionCodeInput, UpdateFunctionCodeOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[UpdateFunctionCodeInput, UpdateFunctionCodeOutput] = js.native
  }
  
}

