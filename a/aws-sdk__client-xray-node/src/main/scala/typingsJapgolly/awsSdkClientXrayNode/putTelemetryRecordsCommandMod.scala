package typingsJapgolly.awsSdkClientXrayNode

import typingsJapgolly.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientXrayNode.typesPutTelemetryRecordsInputMod.PutTelemetryRecordsInput
import typingsJapgolly.awsSdkClientXrayNode.typesPutTelemetryRecordsOutputMod.PutTelemetryRecordsOutput
import typingsJapgolly.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/commands/PutTelemetryRecordsCommand", JSImport.Namespace)
@js.native
object putTelemetryRecordsCommandMod extends js.Object {
  @js.native
  class PutTelemetryRecordsCommand protected () extends Command[
          InputTypesUnion, 
          PutTelemetryRecordsInput, 
          OutputTypesUnion, 
          PutTelemetryRecordsOutput, 
          XRayResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutTelemetryRecordsInput) = this()
    /* CompleteClass */
    override val input: PutTelemetryRecordsInput = js.native
    val middlewareStack: MiddlewareStack[PutTelemetryRecordsInput, PutTelemetryRecordsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[PutTelemetryRecordsInput, PutTelemetryRecordsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[PutTelemetryRecordsInput, PutTelemetryRecordsOutput] = js.native
  }
  
}

