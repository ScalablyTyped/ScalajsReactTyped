package typingsJapgolly.awsSdkClientXrayNode

import typingsJapgolly.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientXrayNode.typesGetTraceGraphInputMod.GetTraceGraphInput
import typingsJapgolly.awsSdkClientXrayNode.typesGetTraceGraphOutputMod.GetTraceGraphOutput
import typingsJapgolly.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/commands/GetTraceGraphCommand", JSImport.Namespace)
@js.native
object getTraceGraphCommandMod extends js.Object {
  @js.native
  class GetTraceGraphCommand protected () extends Command[
          InputTypesUnion, 
          GetTraceGraphInput, 
          OutputTypesUnion, 
          GetTraceGraphOutput, 
          XRayResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetTraceGraphInput) = this()
    /* CompleteClass */
    override val input: GetTraceGraphInput = js.native
    val middlewareStack: MiddlewareStack[GetTraceGraphInput, GetTraceGraphOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[GetTraceGraphInput, GetTraceGraphOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[GetTraceGraphInput, GetTraceGraphOutput] = js.native
  }
  
}

