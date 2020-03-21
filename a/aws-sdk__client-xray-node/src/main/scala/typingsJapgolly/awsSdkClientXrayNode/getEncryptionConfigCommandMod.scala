package typingsJapgolly.awsSdkClientXrayNode

import typingsJapgolly.awsSdkClientXrayNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientXrayNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientXrayNode.typesGetEncryptionConfigInputMod.GetEncryptionConfigInput
import typingsJapgolly.awsSdkClientXrayNode.typesGetEncryptionConfigOutputMod.GetEncryptionConfigOutput
import typingsJapgolly.awsSdkClientXrayNode.xrayconfigurationMod.XRayResolvedConfiguration
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-xray-node/commands/GetEncryptionConfigCommand", JSImport.Namespace)
@js.native
object getEncryptionConfigCommandMod extends js.Object {
  @js.native
  class GetEncryptionConfigCommand protected () extends Command[
          InputTypesUnion, 
          GetEncryptionConfigInput, 
          OutputTypesUnion, 
          GetEncryptionConfigOutput, 
          XRayResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetEncryptionConfigInput) = this()
    /* CompleteClass */
    override val input: GetEncryptionConfigInput = js.native
    val middlewareStack: MiddlewareStack[GetEncryptionConfigInput, GetEncryptionConfigOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[GetEncryptionConfigInput, GetEncryptionConfigOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: XRayResolvedConfiguration
    ): Handler[GetEncryptionConfigInput, GetEncryptionConfigOutput] = js.native
  }
  
}

