package typingsJapgolly.awsSdkClientS3Node

import typingsJapgolly.awsSdkClientS3Node.inputTypesUnionMod.InputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.outputTypesUnionMod.OutputTypesUnion
import typingsJapgolly.awsSdkClientS3Node.s3ConfigurationMod.S3ResolvedConfiguration
import typingsJapgolly.awsSdkClientS3Node.typesDeleteObjectsInputMod.DeleteObjectsInput
import typingsJapgolly.awsSdkClientS3Node.typesDeleteObjectsOutputMod.DeleteObjectsOutput
import typingsJapgolly.awsSdkMiddlewareStack.mod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.commandMod.Command
import typingsJapgolly.awsSdkTypes.middlewareMod.Handler
import typingsJapgolly.awsSdkTypes.protocolMod.OperationModel
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/client-s3-node/commands/DeleteObjectsCommand", JSImport.Namespace)
@js.native
object deleteObjectsCommandMod extends js.Object {
  @js.native
  class DeleteObjectsCommand protected () extends Command[
          InputTypesUnion, 
          DeleteObjectsInput, 
          OutputTypesUnion, 
          DeleteObjectsOutput, 
          S3ResolvedConfiguration, 
          Readable
        ] {
    def this(input: DeleteObjectsInput) = this()
    /* CompleteClass */
    override val input: DeleteObjectsInput = js.native
    val middlewareStack: MiddlewareStack[DeleteObjectsInput, DeleteObjectsOutput, Readable] = js.native
    val model: OperationModel = js.native
    def resolveMiddleware(
      clientStack: MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[DeleteObjectsInput, DeleteObjectsOutput] = js.native
    /* CompleteClass */
    override def resolveMiddleware(
      stack: typingsJapgolly.awsSdkTypes.middlewareMod.MiddlewareStack[InputTypesUnion, OutputTypesUnion, Readable],
      configuration: S3ResolvedConfiguration
    ): Handler[DeleteObjectsInput, DeleteObjectsOutput] = js.native
  }
  
}

