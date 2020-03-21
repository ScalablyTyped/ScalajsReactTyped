package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesGetBucketNotificationInputMod.GetBucketNotificationInput
import typingsJapgolly.awsSdkClientS3Node.typesGetBucketNotificationOutputMod.GetBucketNotificationOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.awsSdkTypes.protocolMod.OperationModel
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/GetBucketNotificationCommand", JSImport.Namespace)
@js.native
object getBucketNotificationCommandMod extends js.Object {
  @js.native
  class GetBucketNotificationCommand protected () extends Command[
          InputTypesUnion, 
          GetBucketNotificationInput, 
          OutputTypesUnion, 
          GetBucketNotificationOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetBucketNotificationInput) = this()
    /* CompleteClass */
    override val input: GetBucketNotificationInput = js.native
    val middlewareStack: MiddlewareStack[GetBucketNotificationInput, GetBucketNotificationOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketNotificationInput, GetBucketNotificationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketNotificationInput, GetBucketNotificationOutput] = js.native
  }
  
}

