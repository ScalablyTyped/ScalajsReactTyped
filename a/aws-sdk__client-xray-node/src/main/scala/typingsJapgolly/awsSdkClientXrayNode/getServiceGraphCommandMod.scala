package typingsJapgolly.awsSdkClientXrayNode

import typingsJapgolly.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientXrayNode.typesGetServiceGraphInputMod.GetServiceGraphInput
import typingsJapgolly.awsSdkClientXrayNode.typesGetServiceGraphOutputMod.GetServiceGraphOutput
import typingsJapgolly.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/commands/GetServiceGraphCommand", JSImport.Namespace)
@js.native
object getServiceGraphCommandMod extends js.Object {
  @js.native
  class GetServiceGraphCommand protected () extends Command[
          InputTypesUnion, 
          GetServiceGraphInput, 
          OutputTypesUnion, 
          GetServiceGraphOutput, 
          XRayResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetServiceGraphInput) = this()
    /* CompleteClass */
    override val input: GetServiceGraphInput = js.native
    val middlewareStack: MiddlewareStack[GetServiceGraphInput, GetServiceGraphOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[GetServiceGraphInput, GetServiceGraphOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[GetServiceGraphInput, GetServiceGraphOutput] = js.native
  }
  
}

