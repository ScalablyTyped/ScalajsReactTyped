package typingsJapgolly.awsSdkClientXrayNode

import typingsJapgolly.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientXrayNode.typesBatchGetTracesInputMod.BatchGetTracesInput
import typingsJapgolly.awsSdkClientXrayNode.typesBatchGetTracesOutputMod.BatchGetTracesOutput
import typingsJapgolly.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/commands/BatchGetTracesCommand", JSImport.Namespace)
@js.native
object batchGetTracesCommandMod extends js.Object {
  @js.native
  class BatchGetTracesCommand protected () extends Command[
          InputTypesUnion, 
          BatchGetTracesInput, 
          OutputTypesUnion, 
          BatchGetTracesOutput, 
          XRayResolvedConfiguration, 
          Readable
        ] {
    def this(input: BatchGetTracesInput) = this()
    /* CompleteClass */
    override val input: BatchGetTracesInput = js.native
    val middlewareStack: MiddlewareStack[BatchGetTracesInput, BatchGetTracesOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[BatchGetTracesInput, BatchGetTracesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[BatchGetTracesInput, BatchGetTracesOutput] = js.native
  }
  
}

