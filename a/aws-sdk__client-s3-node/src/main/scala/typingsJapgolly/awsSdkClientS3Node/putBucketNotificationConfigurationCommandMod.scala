package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesPutBucketNotificationConfigurationInputMod.PutBucketNotificationConfigurationInput
import typingsJapgolly.awsSdkClientS3Node.typesPutBucketNotificationConfigurationOutputMod.PutBucketNotificationConfigurationOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.awsSdkTypes.protocolMod.OperationModel
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/PutBucketNotificationConfigurationCommand", JSImport.Namespace)
@js.native
object putBucketNotificationConfigurationCommandMod extends js.Object {
  @js.native
  class PutBucketNotificationConfigurationCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketNotificationConfigurationInput, 
          OutputTypesUnion, 
          PutBucketNotificationConfigurationOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutBucketNotificationConfigurationInput) = this()
    /* CompleteClass */
    override val input: PutBucketNotificationConfigurationInput = js.native
    val middlewareStack: MiddlewareStack[
        PutBucketNotificationConfigurationInput, 
        PutBucketNotificationConfigurationOutput, 
        Readable
      ] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketNotificationConfigurationInput, PutBucketNotificationConfigurationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketNotificationConfigurationInput, PutBucketNotificationConfigurationOutput] = js.native
  }
  
}

