package typingsJapgolly.awsSdkClientXrayNode

import typingsJapgolly.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientXrayNode.typesGetSamplingStatisticSummariesInputMod.GetSamplingStatisticSummariesInput
import typingsJapgolly.awsSdkClientXrayNode.typesGetSamplingStatisticSummariesOutputMod.GetSamplingStatisticSummariesOutput
import typingsJapgolly.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/commands/GetSamplingStatisticSummariesCommand", JSImport.Namespace)
@js.native
object getSamplingStatisticSummariesCommandMod extends js.Object {
  @js.native
  class GetSamplingStatisticSummariesCommand protected () extends Command[
          InputTypesUnion, 
          GetSamplingStatisticSummariesInput, 
          OutputTypesUnion, 
          GetSamplingStatisticSummariesOutput, 
          XRayResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetSamplingStatisticSummariesInput) = this()
    /* CompleteClass */
    override val input: GetSamplingStatisticSummariesInput = js.native
    val middlewareStack: MiddlewareStack[GetSamplingStatisticSummariesInput, GetSamplingStatisticSummariesOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[GetSamplingStatisticSummariesInput, GetSamplingStatisticSummariesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[GetSamplingStatisticSummariesInput, GetSamplingStatisticSummariesOutput] = js.native
  }
  
}

