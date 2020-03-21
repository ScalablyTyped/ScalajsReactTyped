package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesGetBucketMetricsConfigurationInputMod.GetBucketMetricsConfigurationInput
import typingsJapgolly.awsSdkClientS3Node.typesGetBucketMetricsConfigurationOutputMod.GetBucketMetricsConfigurationOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.awsSdkTypes.protocolMod.OperationModel
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/GetBucketMetricsConfigurationCommand", JSImport.Namespace)
@js.native
object getBucketMetricsConfigurationCommandMod extends js.Object {
  @js.native
  class GetBucketMetricsConfigurationCommand protected () extends Command[
          InputTypesUnion, 
          GetBucketMetricsConfigurationInput, 
          OutputTypesUnion, 
          GetBucketMetricsConfigurationOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetBucketMetricsConfigurationInput) = this()
    /* CompleteClass */
    override val input: GetBucketMetricsConfigurationInput = js.native
    val middlewareStack: MiddlewareStack[GetBucketMetricsConfigurationInput, GetBucketMetricsConfigurationOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketMetricsConfigurationInput, GetBucketMetricsConfigurationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketMetricsConfigurationInput, GetBucketMetricsConfigurationOutput] = js.native
  }
  
}

