package typingsJapgolly.awsSdkClientXrayNode

import typingsJapgolly.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientXrayNode.typesGetTraceSummariesInputMod.GetTraceSummariesInput
import typingsJapgolly.awsSdkClientXrayNode.typesGetTraceSummariesOutputMod.GetTraceSummariesOutput
import typingsJapgolly.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/commands/GetTraceSummariesCommand", JSImport.Namespace)
@js.native
object getTraceSummariesCommandMod extends js.Object {
  @js.native
  class GetTraceSummariesCommand protected () extends Command[
          InputTypesUnion, 
          GetTraceSummariesInput, 
          OutputTypesUnion, 
          GetTraceSummariesOutput, 
          XRayResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetTraceSummariesInput) = this()
    /* CompleteClass */
    override val input: GetTraceSummariesInput = js.native
    val middlewareStack: MiddlewareStack[GetTraceSummariesInput, GetTraceSummariesOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[GetTraceSummariesInput, GetTraceSummariesOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[GetTraceSummariesInput, GetTraceSummariesOutput] = js.native
  }
  
}

