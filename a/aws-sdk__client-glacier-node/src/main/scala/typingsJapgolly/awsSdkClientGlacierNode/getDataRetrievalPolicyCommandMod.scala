package typingsJapgolly.awsSdkClientGlacierNode

import typingsJapgolly.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsJapgolly.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientGlacierNode.typesGetDataRetrievalPolicyInputMod.GetDataRetrievalPolicyInput
import typingsJapgolly.awsSdkClientGlacierNode.typesGetDataRetrievalPolicyOutputMod.GetDataRetrievalPolicyOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/GetDataRetrievalPolicyCommand", JSImport.Namespace)
@js.native
object getDataRetrievalPolicyCommandMod extends js.Object {
  @js.native
  class GetDataRetrievalPolicyCommand protected () extends Command[
          InputTypesUnion, 
          GetDataRetrievalPolicyInput, 
          OutputTypesUnion, 
          GetDataRetrievalPolicyOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetDataRetrievalPolicyInput) = this()
    /* CompleteClass */
    override val input: GetDataRetrievalPolicyInput = js.native
    val middlewareStack: MiddlewareStack[GetDataRetrievalPolicyInput, GetDataRetrievalPolicyOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[GetDataRetrievalPolicyInput, GetDataRetrievalPolicyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[GetDataRetrievalPolicyInput, GetDataRetrievalPolicyOutput] = js.native
  }
  
}

