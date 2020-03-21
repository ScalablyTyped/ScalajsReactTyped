package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesPutBucketWebsiteInputMod.PutBucketWebsiteInput
import typingsJapgolly.awsSdkClientS3Node.typesPutBucketWebsiteOutputMod.PutBucketWebsiteOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.awsSdkTypes.protocolMod.OperationModel
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/PutBucketWebsiteCommand", JSImport.Namespace)
@js.native
object putBucketWebsiteCommandMod extends js.Object {
  @js.native
  class PutBucketWebsiteCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketWebsiteInput, 
          OutputTypesUnion, 
          PutBucketWebsiteOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutBucketWebsiteInput) = this()
    /* CompleteClass */
    override val input: PutBucketWebsiteInput = js.native
    val middlewareStack: MiddlewareStack[PutBucketWebsiteInput, PutBucketWebsiteOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketWebsiteInput, PutBucketWebsiteOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketWebsiteInput, PutBucketWebsiteOutput] = js.native
  }
  
}

