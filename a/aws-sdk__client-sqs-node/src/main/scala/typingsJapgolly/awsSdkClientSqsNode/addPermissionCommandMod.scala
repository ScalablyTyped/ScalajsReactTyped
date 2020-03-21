package typingsJapgolly.awsSdkClientSqsNode

import typingsJapgolly.awsSdkClientSqsNode.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientSqsNode.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientSqsNode.sqsconfigurationMod.SQSResolvedConfiguration
import typingsJapgolly.awsSdkClientSqsNode.typesAddPermissionInputMod.AddPermissionInput
import typingsJapgolly.awsSdkClientSqsNode.typesAddPermissionOutputMod.AddPermissionOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-sqs-node/commands/AddPermissionCommand", JSImport.Namespace)
@js.native
object addPermissionCommandMod extends js.Object {
  @js.native
  class AddPermissionCommand protected () extends Command[
          InputTypesUnion, 
          AddPermissionInput, 
          OutputTypesUnion, 
          AddPermissionOutput, 
          SQSResolvedConfiguration, 
          Readable
        ] {
    def this(input: AddPermissionInput) = this()
    /* CompleteClass */
    override val input: AddPermissionInput = js.native
    val middlewareStack: MiddlewareStack[AddPermissionInput, AddPermissionOutput, Readable] = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[AddPermissionInput, AddPermissionOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: SQSResolvedConfiguration
    ): Handler[AddPermissionInput, AddPermissionOutput] = js.native
  }
  
}

