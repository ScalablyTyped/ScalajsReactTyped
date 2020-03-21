package typingsJapgolly.awsSdkClientXrayNode

import typingsJapgolly.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientXrayNode.typesCreateSamplingRuleInputMod.CreateSamplingRuleInput
import typingsJapgolly.awsSdkClientXrayNode.typesCreateSamplingRuleOutputMod.CreateSamplingRuleOutput
import typingsJapgolly.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/commands/CreateSamplingRuleCommand", JSImport.Namespace)
@js.native
object createSamplingRuleCommandMod extends js.Object {
  @js.native
  class CreateSamplingRuleCommand protected () extends Command[
          InputTypesUnion, 
          CreateSamplingRuleInput, 
          OutputTypesUnion, 
          CreateSamplingRuleOutput, 
          XRayResolvedConfiguration, 
          Readable
        ] {
    def this(input: CreateSamplingRuleInput) = this()
    /* CompleteClass */
    override val input: CreateSamplingRuleInput = js.native
    val middlewareStack: MiddlewareStack[CreateSamplingRuleInput, CreateSamplingRuleOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[CreateSamplingRuleInput, CreateSamplingRuleOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[CreateSamplingRuleInput, CreateSamplingRuleOutput] = js.native
  }
  
}

