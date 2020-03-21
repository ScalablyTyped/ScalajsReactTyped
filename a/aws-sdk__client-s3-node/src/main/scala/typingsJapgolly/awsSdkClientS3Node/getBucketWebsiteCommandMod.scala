package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesGetBucketWebsiteInputMod.GetBucketWebsiteInput
import typingsJapgolly.awsSdkClientS3Node.typesGetBucketWebsiteOutputMod.GetBucketWebsiteOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.awsSdkTypes.protocolMod.OperationModel
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/GetBucketWebsiteCommand", JSImport.Namespace)
@js.native
object getBucketWebsiteCommandMod extends js.Object {
  @js.native
  class GetBucketWebsiteCommand protected () extends Command[
          InputTypesUnion, 
          GetBucketWebsiteInput, 
          OutputTypesUnion, 
          GetBucketWebsiteOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetBucketWebsiteInput) = this()
    /* CompleteClass */
    override val input: GetBucketWebsiteInput = js.native
    val middlewareStack: MiddlewareStack[GetBucketWebsiteInput, GetBucketWebsiteOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketWebsiteInput, GetBucketWebsiteOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketWebsiteInput, GetBucketWebsiteOutput] = js.native
  }
  
}

