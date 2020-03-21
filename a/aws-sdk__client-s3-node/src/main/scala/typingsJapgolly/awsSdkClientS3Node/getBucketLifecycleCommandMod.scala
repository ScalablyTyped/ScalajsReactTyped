package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesGetBucketLifecycleInputMod.GetBucketLifecycleInput
import typingsJapgolly.awsSdkClientS3Node.typesGetBucketLifecycleOutputMod.GetBucketLifecycleOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.awsSdkTypes.protocolMod.OperationModel
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/GetBucketLifecycleCommand", JSImport.Namespace)
@js.native
object getBucketLifecycleCommandMod extends js.Object {
  @js.native
  class GetBucketLifecycleCommand protected () extends Command[
          InputTypesUnion, 
          GetBucketLifecycleInput, 
          OutputTypesUnion, 
          GetBucketLifecycleOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: GetBucketLifecycleInput) = this()
    /* CompleteClass */
    override val input: GetBucketLifecycleInput = js.native
    val middlewareStack: MiddlewareStack[GetBucketLifecycleInput, GetBucketLifecycleOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketLifecycleInput, GetBucketLifecycleOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[GetBucketLifecycleInput, GetBucketLifecycleOutput] = js.native
  }
  
}

