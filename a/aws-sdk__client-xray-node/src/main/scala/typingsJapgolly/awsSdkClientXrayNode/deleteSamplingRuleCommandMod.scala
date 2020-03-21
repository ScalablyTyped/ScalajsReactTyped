package typingsJapgolly.awsSdkClientXrayNode

import typingsJapgolly.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientXrayNode.typesDeleteSamplingRuleInputMod.DeleteSamplingRuleInput
import typingsJapgolly.awsSdkClientXrayNode.typesDeleteSamplingRuleOutputMod.DeleteSamplingRuleOutput
import typingsJapgolly.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/commands/DeleteSamplingRuleCommand", JSImport.Namespace)
@js.native
object deleteSamplingRuleCommandMod extends js.Object {
  @js.native
  class DeleteSamplingRuleCommand protected () extends Command[
          InputTypesUnion, 
          DeleteSamplingRuleInput, 
          OutputTypesUnion, 
          DeleteSamplingRuleOutput, 
          XRayResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteSamplingRuleInput) = this()
    /* CompleteClass */
    override val input: DeleteSamplingRuleInput = js.native
    val middlewareStack: MiddlewareStack[DeleteSamplingRuleInput, DeleteSamplingRuleOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[DeleteSamplingRuleInput, DeleteSamplingRuleOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[DeleteSamplingRuleInput, DeleteSamplingRuleOutput] = js.native
  }
  
}

