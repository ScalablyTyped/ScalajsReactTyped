package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketLifecycleInputMod.DeleteBucketLifecycleInput
import typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketLifecycleOutputMod.DeleteBucketLifecycleOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.awsSdkTypes.protocolMod.OperationModel
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/DeleteBucketLifecycleCommand", JSImport.Namespace)
@js.native
object deleteBucketLifecycleCommandMod extends js.Object {
  @js.native
  class DeleteBucketLifecycleCommand protected () extends Command[
          InputTypesUnion, 
          DeleteBucketLifecycleInput, 
          OutputTypesUnion, 
          DeleteBucketLifecycleOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteBucketLifecycleInput) = this()
    /* CompleteClass */
    override val input: DeleteBucketLifecycleInput = js.native
    val middlewareStack: MiddlewareStack[DeleteBucketLifecycleInput, DeleteBucketLifecycleOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[DeleteBucketLifecycleInput, DeleteBucketLifecycleOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[DeleteBucketLifecycleInput, DeleteBucketLifecycleOutput] = js.native
  }
  
}

