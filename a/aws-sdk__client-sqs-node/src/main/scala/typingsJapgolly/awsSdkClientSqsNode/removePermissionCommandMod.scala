package typingsJapgolly.awsSdkClientSqsNode

import typingsJapgolly.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typingsJapgolly.awsSdkClientSqsNode.typesRemovePermissionInputMod.RemovePermissionInput
import typingsJapgolly.awsSdkClientSqsNode.typesRemovePermissionOutputMod.RemovePermissionOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/RemovePermissionCommand", JSImport.Namespace)
@js.native
object removePermissionCommandMod extends js.Object {
  @js.native
  class RemovePermissionCommand protected () extends Command[
          InputTypesUnion, 
          RemovePermissionInput, 
          OutputTypesUnion, 
          RemovePermissionOutput, 
          SQSResolvedConfiguration, 
          Readable
        ] {
    def this(input: RemovePermissionInput) = this()
    /* CompleteClass */
    override val input: RemovePermissionInput = js.native
    val middlewareStack: MiddlewareStack[RemovePermissionInput, RemovePermissionOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[RemovePermissionInput, RemovePermissionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[RemovePermissionInput, RemovePermissionOutput] = js.native
  }
  
}

