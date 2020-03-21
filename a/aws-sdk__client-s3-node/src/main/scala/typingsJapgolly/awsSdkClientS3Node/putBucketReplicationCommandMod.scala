package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesPutBucketReplicationInputMod.PutBucketReplicationInput
import typingsJapgolly.awsSdkClientS3Node.typesPutBucketReplicationOutputMod.PutBucketReplicationOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.awsSdkTypes.protocolMod.OperationModel
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/PutBucketReplicationCommand", JSImport.Namespace)
@js.native
object putBucketReplicationCommandMod extends js.Object {
  @js.native
  class PutBucketReplicationCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketReplicationInput, 
          OutputTypesUnion, 
          PutBucketReplicationOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutBucketReplicationInput) = this()
    /* CompleteClass */
    override val input: PutBucketReplicationInput = js.native
    val middlewareStack: MiddlewareStack[PutBucketReplicationInput, PutBucketReplicationOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketReplicationInput, PutBucketReplicationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketReplicationInput, PutBucketReplicationOutput] = js.native
  }
  
}

