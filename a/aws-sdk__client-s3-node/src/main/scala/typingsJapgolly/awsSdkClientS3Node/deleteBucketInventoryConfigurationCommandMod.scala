package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketInventoryConfigurationInputMod.DeleteBucketInventoryConfigurationInput
import typingsJapgolly.awsSdkClientS3Node.typesDeleteBucketInventoryConfigurationOutputMod.DeleteBucketInventoryConfigurationOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.awsSdkTypes.protocolMod.OperationModel
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/DeleteBucketInventoryConfigurationCommand", JSImport.Namespace)
@js.native
object deleteBucketInventoryConfigurationCommandMod extends js.Object {
  @js.native
  class DeleteBucketInventoryConfigurationCommand protected () extends Command[
          InputTypesUnion, 
          DeleteBucketInventoryConfigurationInput, 
          OutputTypesUnion, 
          DeleteBucketInventoryConfigurationOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteBucketInventoryConfigurationInput) = this()
    /* CompleteClass */
    override val input: DeleteBucketInventoryConfigurationInput = js.native
    val middlewareStack: MiddlewareStack[
        DeleteBucketInventoryConfigurationInput, 
        DeleteBucketInventoryConfigurationOutput, 
        Readable
      ] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[DeleteBucketInventoryConfigurationInput, DeleteBucketInventoryConfigurationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[DeleteBucketInventoryConfigurationInput, DeleteBucketInventoryConfigurationOutput] = js.native
  }
  
}

