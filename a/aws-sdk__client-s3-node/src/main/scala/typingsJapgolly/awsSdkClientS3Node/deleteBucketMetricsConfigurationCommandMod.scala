package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketMetricsConfigurationInputMod.DeleteBucketMetricsConfigurationInput
import typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketMetricsConfigurationOutputMod.DeleteBucketMetricsConfigurationOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.awsSdkTypes.protocolMod.OperationModel
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/DeleteBucketMetricsConfigurationCommand", JSImport.Namespace)
@js.native
object deleteBucketMetricsConfigurationCommandMod extends js.Object {
  @js.native
  class DeleteBucketMetricsConfigurationCommand protected () extends Command[
          InputTypesUnion, 
          DeleteBucketMetricsConfigurationInput, 
          OutputTypesUnion, 
          DeleteBucketMetricsConfigurationOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteBucketMetricsConfigurationInput) = this()
    /* CompleteClass */
    override val input: DeleteBucketMetricsConfigurationInput = js.native
    val middlewareStack: MiddlewareStack[
        DeleteBucketMetricsConfigurationInput, 
        DeleteBucketMetricsConfigurationOutput, 
        Readable
      ] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[DeleteBucketMetricsConfigurationInput, DeleteBucketMetricsConfigurationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[DeleteBucketMetricsConfigurationInput, DeleteBucketMetricsConfigurationOutput] = js.native
  }
  
}

