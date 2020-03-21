package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesCreateBucketInputMod.CreateBucketInput
import typingsJapgolly.awsSdkClientS3Node.typesCreateBucketOutputMod.CreateBucketOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.awsSdkTypes.protocolMod.OperationModel
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/CreateBucketCommand", JSImport.Namespace)
@js.native
object createBucketCommandMod extends js.Object {
  @js.native
  class CreateBucketCommand protected () extends Command[
          InputTypesUnion, 
          CreateBucketInput, 
          OutputTypesUnion, 
          CreateBucketOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: CreateBucketInput) = this()
    /* CompleteClass */
    override val input: CreateBucketInput = js.native
    val middlewareStack: MiddlewareStack[CreateBucketInput, CreateBucketOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[CreateBucketInput, CreateBucketOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[CreateBucketInput, CreateBucketOutput] = js.native
  }
  
}

