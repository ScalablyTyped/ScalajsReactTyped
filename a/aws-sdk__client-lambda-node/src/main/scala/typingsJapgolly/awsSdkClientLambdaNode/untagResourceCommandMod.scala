package typingsJapgolly.awsSdkClientLambdaNode

import typingsJapgolly.awsSdkClientLambdaNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientLambdaNode.lambdaConfigurationMod.LambdaResolvedConfiguration
import typingsJapgolly.awsSdkClientLambdaNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientLambdaNode.typesUntagResourceInputMod.UntagResourceInput
import typingsJapgolly.awsSdkClientLambdaNode.typesUntagResourceOutputMod.UntagResourceOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-lambda-node/commands/UntagResourceCommand", JSImport.Namespace)
@js.native
object untagResourceCommandMod extends js.Object {
  @js.native
  class UntagResourceCommand protected () extends Command[
          InputTypesUnion, 
          UntagResourceInput, 
          OutputTypesUnion, 
          UntagResourceOutput, 
          LambdaResolvedConfiguration, 
          Readable
        ] {
    def this(input: UntagResourceInput) = this()
    /* CompleteClass */
    override val input: UntagResourceInput = js.native
    val middlewareStack: MiddlewareStack[UntagResourceInput, UntagResourceOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[UntagResourceInput, UntagResourceOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: LambdaResolvedConfiguration
    ): Handler[UntagResourceInput, UntagResourceOutput] = js.native
  }
  
}

