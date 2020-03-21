package typingsJapgolly.awsSdkClientXrayNode

import typingsJapgolly.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientXrayNode.typesPutTraceSegmentsInputMod.PutTraceSegmentsInput
import typingsJapgolly.awsSdkClientXrayNode.typesPutTraceSegmentsOutputMod.PutTraceSegmentsOutput
import typingsJapgolly.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/commands/PutTraceSegmentsCommand", JSImport.Namespace)
@js.native
object putTraceSegmentsCommandMod extends js.Object {
  @js.native
  class PutTraceSegmentsCommand protected () extends Command[
          InputTypesUnion, 
          PutTraceSegmentsInput, 
          OutputTypesUnion, 
          PutTraceSegmentsOutput, 
          XRayResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutTraceSegmentsInput) = this()
    /* CompleteClass */
    override val input: PutTraceSegmentsInput = js.native
    val middlewareStack: MiddlewareStack[PutTraceSegmentsInput, PutTraceSegmentsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[PutTraceSegmentsInput, PutTraceSegmentsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[PutTraceSegmentsInput, PutTraceSegmentsOutput] = js.native
  }
  
}

