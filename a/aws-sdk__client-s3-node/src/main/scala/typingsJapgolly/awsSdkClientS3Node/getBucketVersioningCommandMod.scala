package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesGetBucketVersioningInputMod.GetBucketVersioningInput
import typingsJapgolly.awsSdkClientS3Node.typesGetBucketVersioningOutputMod.GetBucketVersioningOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.awsSdkTypes.protocolMod.OperationModel
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/GetBucketVersioningCommand", JSImport.Namespace)
@js.native
object getBucketVersioningCommandMod extends js.Object {
  @js.native
  class GetBucketVersioningCommand protected () extends Command[
          InputTypesUnion, 
          GetBucketVersioningInput, 
          OutputTypesUnion, 
          GetBucketVersioningOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetBucketVersioningInput) = this()
    /* CompleteClass */
    override val input: GetBucketVersioningInput = js.native
    val middlewareStack: MiddlewareStack[GetBucketVersioningInput, GetBucketVersioningOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketVersioningInput, GetBucketVersioningOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketVersioningInput, GetBucketVersioningOutput] = js.native
  }
  
}

