package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesPutBucketCorsInputMod.PutBucketCorsInput
import typingsJapgolly.awsSdkClientS3Node.typesPutBucketCorsOutputMod.PutBucketCorsOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.awsSdkTypes.protocolMod.OperationModel
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/PutBucketCorsCommand", JSImport.Namespace)
@js.native
object putBucketCorsCommandMod extends js.Object {
  @js.native
  class PutBucketCorsCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketCorsInput, 
          OutputTypesUnion, 
          PutBucketCorsOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutBucketCorsInput) = this()
    /* CompleteClass */
    override val input: PutBucketCorsInput = js.native
    val middlewareStack: MiddlewareStack[PutBucketCorsInput, PutBucketCorsOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketCorsInput, PutBucketCorsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketCorsInput, PutBucketCorsOutput] = js.native
  }
  
}

