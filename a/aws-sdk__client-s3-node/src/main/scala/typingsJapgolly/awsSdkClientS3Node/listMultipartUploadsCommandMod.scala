package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesListMultipartUploadsInputMod.ListMultipartUploadsInput
import typingsJapgolly.awsSdkClientS3Node.typesListMultipartUploadsOutputMod.ListMultipartUploadsOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.awsSdkTypes.protocolMod.OperationModel
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/ListMultipartUploadsCommand", JSImport.Namespace)
@js.native
object listMultipartUploadsCommandMod extends js.Object {
  @js.native
  class ListMultipartUploadsCommand protected () extends Command[
          InputTypesUnion, 
          ListMultipartUploadsInput, 
          OutputTypesUnion, 
          ListMultipartUploadsOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListMultipartUploadsInput) = this()
    /* CompleteClass */
    override val input: ListMultipartUploadsInput = js.native
    val middlewareStack: MiddlewareStack[ListMultipartUploadsInput, ListMultipartUploadsOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[ListMultipartUploadsInput, ListMultipartUploadsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[ListMultipartUploadsInput, ListMultipartUploadsOutput] = js.native
  }
  
}

