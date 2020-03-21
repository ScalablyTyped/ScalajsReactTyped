package typingsJapgolly.awsSdkClientKmsNode

import typingsJapgolly.awsSdkClientKmsNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientKmsNode.kmsconfigurationMod.KMSResolvedConfiguration
import typingsJapgolly.awsSdkClientKmsNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientKmsNode.typesGetKeyPolicyInputMod.GetKeyPolicyInput
import typingsJapgolly.awsSdkClientKmsNode.typesGetKeyPolicyOutputMod.GetKeyPolicyOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-kms-node/commands/GetKeyPolicyCommand", JSImport.Namespace)
@js.native
object getKeyPolicyCommandMod extends js.Object {
  @js.native
  class GetKeyPolicyCommand protected () extends Command[
          InputTypesUnion, 
          GetKeyPolicyInput, 
          OutputTypesUnion, 
          GetKeyPolicyOutput, 
          KMSResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetKeyPolicyInput) = this()
    /* CompleteClass */
    override val input: GetKeyPolicyInput = js.native
    val middlewareStack: MiddlewareStack[GetKeyPolicyInput, GetKeyPolicyOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[GetKeyPolicyInput, GetKeyPolicyOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: KMSResolvedConfiguration
    ): Handler[GetKeyPolicyInput, GetKeyPolicyOutput] = js.native
  }
  
}

