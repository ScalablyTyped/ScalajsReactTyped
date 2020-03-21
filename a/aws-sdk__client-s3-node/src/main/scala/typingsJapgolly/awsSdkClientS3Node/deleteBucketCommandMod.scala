package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketInputMod.DeleteBucketInput
import typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketOutputMod.DeleteBucketOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.awsSdkTypes.protocolMod.OperationModel
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/DeleteBucketCommand", JSImport.Namespace)
@js.native
object deleteBucketCommandMod extends js.Object {
  @js.native
  class DeleteBucketCommand protected () extends Command[
          InputTypesUnion, 
          DeleteBucketInput, 
          OutputTypesUnion, 
          DeleteBucketOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteBucketInput) = this()
    /* CompleteClass */
    override val input: DeleteBucketInput = js.native
    val middlewareStack: MiddlewareStack[DeleteBucketInput, DeleteBucketOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[DeleteBucketInput, DeleteBucketOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[DeleteBucketInput, DeleteBucketOutput] = js.native
  }
  
}

