package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesCreateMultipartUploadInputMod.CreateMultipartUploadInput
import typingsJapgolly.awsSdkClientS3Node.typesCreateMultipartUploadOutputMod.CreateMultipartUploadOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.awsSdkTypes.protocolMod.OperationModel
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/CreateMultipartUploadCommand", JSImport.Namespace)
@js.native
object createMultipartUploadCommandMod extends js.Object {
  @js.native
  class CreateMultipartUploadCommand protected () extends Command[
          InputTypesUnion, 
          CreateMultipartUploadInput, 
          OutputTypesUnion, 
          CreateMultipartUploadOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: CreateMultipartUploadInput) = this()
    /* CompleteClass */
    override val input: CreateMultipartUploadInput = js.native
    val middlewareStack: MiddlewareStack[CreateMultipartUploadInput, CreateMultipartUploadOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[CreateMultipartUploadInput, CreateMultipartUploadOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[CreateMultipartUploadInput, CreateMultipartUploadOutput] = js.native
  }
  
}

