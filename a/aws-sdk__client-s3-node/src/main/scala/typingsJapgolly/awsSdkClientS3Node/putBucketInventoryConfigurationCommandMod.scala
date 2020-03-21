package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesPutBucketInventoryConfigurationInputMod.PutBucketInventoryConfigurationInput
import typingsJapgolly.awsSdkClientS3Node.typesPutBucketInventoryConfigurationOutputMod.PutBucketInventoryConfigurationOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.awsSdkTypes.protocolMod.OperationModel
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/PutBucketInventoryConfigurationCommand", JSImport.Namespace)
@js.native
object putBucketInventoryConfigurationCommandMod extends js.Object {
  @js.native
  class PutBucketInventoryConfigurationCommand protected () extends Command[
          InputTypesUnion, 
          PutBucketInventoryConfigurationInput, 
          OutputTypesUnion, 
          PutBucketInventoryConfigurationOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: PutBucketInventoryConfigurationInput) = this()
    /* CompleteClass */
    override val input: PutBucketInventoryConfigurationInput = js.native
    val middlewareStack: MiddlewareStack[
        PutBucketInventoryConfigurationInput, 
        PutBucketInventoryConfigurationOutput, 
        Readable
      ] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketInventoryConfigurationInput, PutBucketInventoryConfigurationOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[PutBucketInventoryConfigurationInput, PutBucketInventoryConfigurationOutput] = js.native
  }
  
}

