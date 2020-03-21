package typingsJapgolly.awsSdkClientXrayNode

import typingsJapgolly.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientXrayNode.typesGetSamplingTargetsInputMod.GetSamplingTargetsInput
import typingsJapgolly.awsSdkClientXrayNode.typesGetSamplingTargetsOutputMod.GetSamplingTargetsOutput
import typingsJapgolly.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/commands/GetSamplingTargetsCommand", JSImport.Namespace)
@js.native
object getSamplingTargetsCommandMod extends js.Object {
  @js.native
  class GetSamplingTargetsCommand protected () extends Command[
          InputTypesUnion, 
          GetSamplingTargetsInput, 
          OutputTypesUnion, 
          GetSamplingTargetsOutput, 
          XRayResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetSamplingTargetsInput) = this()
    /* CompleteClass */
    override val input: GetSamplingTargetsInput = js.native
    val middlewareStack: MiddlewareStack[GetSamplingTargetsInput, GetSamplingTargetsOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[GetSamplingTargetsInput, GetSamplingTargetsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[GetSamplingTargetsInput, GetSamplingTargetsOutput] = js.native
  }
  
}

