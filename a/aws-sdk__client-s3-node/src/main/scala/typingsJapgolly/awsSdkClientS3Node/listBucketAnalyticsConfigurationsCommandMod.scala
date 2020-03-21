package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesListBucketAnalyticsConfigurationsInputMod.ListBucketAnalyticsConfigurationsInput
import typingsJapgolly.awsSdkClientS3Node.typesListBucketAnalyticsConfigurationsOutputMod.ListBucketAnalyticsConfigurationsOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.awsSdkTypes.protocolMod.OperationModel
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/ListBucketAnalyticsConfigurationsCommand", JSImport.Namespace)
@js.native
object listBucketAnalyticsConfigurationsCommandMod extends js.Object {
  @js.native
  class ListBucketAnalyticsConfigurationsCommand protected () extends Command[
          InputTypesUnion, 
          ListBucketAnalyticsConfigurationsInput, 
          OutputTypesUnion, 
          ListBucketAnalyticsConfigurationsOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: ListBucketAnalyticsConfigurationsInput) = this()
    /* CompleteClass */
    override val input: ListBucketAnalyticsConfigurationsInput = js.native
    val middlewareStack: MiddlewareStack[
        ListBucketAnalyticsConfigurationsInput, 
        ListBucketAnalyticsConfigurationsOutput, 
        Readable
      ] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[ListBucketAnalyticsConfigurationsInput, ListBucketAnalyticsConfigurationsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[ListBucketAnalyticsConfigurationsInput, ListBucketAnalyticsConfigurationsOutput] = js.native
  }
  
}

