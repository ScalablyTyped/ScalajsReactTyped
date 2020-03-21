package typingsJapgolly.awsSdkClientGlacierNode

import typingsJapgolly.awsSdkClientGlacierNode.glacierConfigurationMod.GlacierResolvedConfiguration
import typingsJapgolly.awsSdkClientGlacierNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientGlacierNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientGlacierNode.typesSetDataRetrievalPolicyInputMod.SetDataRetrievalPolicyInput
import typingsJapgolly.awsSdkClientGlacierNode.typesSetDataRetrievalPolicyOutputMod.SetDataRetrievalPolicyOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-glacier-node/commands/SetDataRetrievalPolicyCommand", JSImport.Namespace)
@js.native
object setDataRetrievalPolicyCommandMod extends js.Object {
  @js.native
  class SetDataRetrievalPolicyCommand protected () extends Command[
          InputTypesUnion, 
          SetDataRetrievalPolicyInput, 
          OutputTypesUnion, 
          SetDataRetrievalPolicyOutput, 
          GlacierResolvedConfiguration, 
          Readable
        ] {
    def this(input: SetDataRetrievalPolicyInput) = this()
    /* CompleteClass */
    override val input: SetDataRetrievalPolicyInput = js.native
    val middlewareStack: MiddlewareStack[SetDataRetrievalPolicyInput, SetDataRetrievalPolicyOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[SetDataRetrievalPolicyInput, SetDataRetrievalPolicyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: GlacierResolvedConfiguration
    ): Handler[SetDataRetrievalPolicyInput, SetDataRetrievalPolicyOutput] = js.native
  }
  
}

