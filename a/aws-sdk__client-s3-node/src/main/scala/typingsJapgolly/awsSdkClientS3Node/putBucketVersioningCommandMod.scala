package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesPutBucketVersioningInputMod.PutBucketVersioningInput
import typingsJapgolly.awsSdkClientS3Node.typesPutBucketVersioningOutputMod.PutBucketVersioningOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.awsSdkTypes.protocolMod.OperationModel
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/PutBucketVersioningCommand", JSImport.Namespace)
@js.native
object putBucketVersioningCommandMod extends js.Object {
  @js.native
  class PutBucketVersioningCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketVersioningInput, 
          OutputTypesUnion, 
          PutBucketVersioningOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutBucketVersioningInput) = this()
    /* CompleteClass */
    override val input: PutBucketVersioningInput = js.native
    val middlewareStack: MiddlewareStack[PutBucketVersioningInput, PutBucketVersioningOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketVersioningInput, PutBucketVersioningOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketVersioningInput, PutBucketVersioningOutput] = js.native
  }
  
}

